package com.omie.sdk.modules.auth.domain.service.impl;

import java.util.Optional;

import com.omie.sdk.infra.exception.AccountNotActivatedException;
import com.omie.sdk.infra.exception.InvalidCredentialsException;
import com.omie.sdk.infra.exception.UserAlreadyExistsException;
import com.omie.sdk.modules.auth.application.dto.request.AuthenticationRequest;
import com.omie.sdk.modules.auth.application.dto.request.RegisterRequest;
import com.omie.sdk.modules.auth.application.dto.response.ActivationCodeResponse;
import com.omie.sdk.modules.auth.application.dto.response.AuthenticationResponse;
import com.omie.sdk.modules.auth.application.service.AuthenticationService;
import com.omie.sdk.modules.auth.infra.entity.Account;
import com.omie.sdk.modules.auth.infra.entity.ActivationCode;
import com.omie.sdk.modules.auth.infra.repository.AccountRepository;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private JwtServiceImpl jwtService;
    private ActivationCodeServiceImpl activationCodeService;
    private AccountServiceImpl accountService;
    private TokenServiceImpl tokenService;
    private MessageSourceServiceImpl messageService;
    private AuthenticationManager authenticationManager;
    private AccountRepository accountRepository;
    private PasswordEncoder passwordEncoder;

    public AuthenticationServiceImpl(JwtServiceImpl jwtService, ActivationCodeServiceImpl activationCodeService, AccountServiceImpl accountService, TokenServiceImpl tokenService, MessageSourceServiceImpl messageService, AuthenticationManager authenticationManager, AccountRepository accountRepository, PasswordEncoder passwordEncoder) {
        this.jwtService = jwtService;
        this.activationCodeService = activationCodeService;
        this.accountService = accountService;
        this.tokenService = tokenService;
        this.messageService = messageService;
        this.authenticationManager = authenticationManager;
        this.accountRepository = accountRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public ActivationCodeResponse register(RegisterRequest request) {
        if (accountService.isAccountExists(request.email())) {
            throw new UserAlreadyExistsException(
                    messageService.generateMessage("error.account.already_exists", request.email())
            );
        }

        Account newAccount = accountService.createAccount(request.email(), request.password(),false);
        log.info("Conta {} foi criada", newAccount.getId());

        activationCodeService.sendNewActivationCode(newAccount);
        log.info("Código de ativação enviado para {}", newAccount.getEmail());

        return ActivationCodeResponse.builder()
                .message(messageService.generateMessage("activation.send.success"))
                .build();
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        Optional<Account> optionalAccount = accountRepository.findByEmail(request.email());
        if (optionalAccount.isEmpty()) {
            log.error("Falha na autenticação: conta com email {} não encontrada", request.email());
            throw new InvalidCredentialsException(
                    messageService.generateMessage("error.account.credentials_invalid")
            );
        }

        Account account = optionalAccount.get();
        if (!account.isEnabled()) {
            log.error("Falha na autenticação: conta com email {} não está ativada", account.getEmail());
            throw new AccountNotActivatedException(
                    messageService.generateMessage("error.account.not_activated", account.getEmail())
            );
        }

        if (!passwordEncoder.matches(request.password(), account.getPassword())) {
            log.error("Falha na autenticação: senha inválida para a conta {}", request.email());
            throw new InvalidCredentialsException(
                    messageService.generateMessage("error.account.credentials_invalid")
            );
        }

        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            request.email(),
                            request.password()
                    )
            );
        } catch (BadCredentialsException e) {
            log.error("Falha na autenticação: credenciais inválidas para a conta {}", request.email());
            throw new InvalidCredentialsException(
                    messageService.generateMessage("error.account.credentials_invalid")
            );
        } catch (DisabledException e) {
            log.error("Falha na autenticação: conta com email {} está desativada", request.email());
            throw new AccountNotActivatedException(
                    messageService.generateMessage("error.account.not_activated".toString(), request.email())
            );
        }

        String jwt = jwtService.generateJwt(account);
        log.info("JWT gerado com sucesso para a conta {}", account.getEmail());
        tokenService.deleteTokenByAccount(account);
        tokenService.createToken(account, jwt);

        return AuthenticationResponse.builder()
                .token(jwt)
                .build();
    }
    
    public ActivationCodeResponse activate(String key) {
        ActivationCode activationCode = activationCodeService.findActivationCodeByKey(key);
        activationCodeService.checkActivationCodeExpiration(activationCode);
        accountService.enableAccount(activationCode.getAccount());
        activationCodeService.deleteActivationCodeById(activationCode.getId());

        log.info("Conta com email {} foi ativada com sucesso", activationCode.getAccount().getEmail());
        return ActivationCodeResponse.builder()
                .message(messageService.generateMessage("account.activation.success").toString())
                .build();
    }

    public ActivationCodeResponse reactive(String email) {
        activationCodeService.resendActivationEmail(email);
        log.info("Email reenviado com sucesso!", email);
        return ActivationCodeResponse.builder()
                .message(messageService.generateMessage("account.reactivation.success").toString())
                .build();
    }
}
