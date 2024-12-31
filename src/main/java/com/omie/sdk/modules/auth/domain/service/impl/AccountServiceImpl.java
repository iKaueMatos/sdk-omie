package com.omie.sdk.modules.auth.domain.service.impl;

import com.omie.sdk.infra.email.service.EmailService;
import com.omie.sdk.infra.email.strategy.AccountActivationCodeSucessStrategy;
import com.omie.sdk.infra.email.strategy.PasswordResetEmailSucessStrategy;
import com.omie.sdk.modules.auth.application.service.AccountService;
import com.omie.sdk.modules.auth.infra.entity.Account;
import com.omie.sdk.modules.auth.infra.repository.AccountRepository;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import static com.omie.sdk.modules.auth.domain.model.Role.USER;

import java.util.Map;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {
    private PasswordEncoder passwordEncoder;
    private AccountRepository accountRepository;
    private EmailService emailService;

    public AccountServiceImpl(PasswordEncoder passwordEncoder, AccountRepository accountRepository, EmailService emailService) {
        this.passwordEncoder = passwordEncoder;
        this.accountRepository = accountRepository;
        this.emailService = emailService;
    }

    public Account createAccount(String email, String password, boolean isEnabled) {
        Account account = accountRepository.saveAndFlush(
                Account.builder()
                        .email(email)
                        .password(passwordEncoder.encode(password))
                        .isAccountNonLocked(true)
                        .isAccountNonExpired(true)
                        .isCredentialsNonExpired(true)
                        .isEnabled(isEnabled)
                        .role(USER)
                        .build());

        return account;
    }

    public void enableAccount(Account account) {
        account.setEnabled(true);
        accountRepository.saveAndFlush(account);

         Map<String, Object> emailData = Map.of(
                "name", account.getUsername()
        );

        emailService.sendEmail(
                account.getEmail(),
                new AccountActivationCodeSucessStrategy(),
                emailData
        );
    }

    public boolean isAccountExists(String email) {
        return accountRepository.findByEmail(email)
                .isPresent();
    }

    public boolean updatePassword(Account account, String newPassword) {
        if (Optional.ofNullable(account).isEmpty()) {
            return false;
        }

        account.setPassword(passwordEncoder.encode(newPassword));
        accountRepository.save(account);
    
        Map<String, Object> emailData = Map.of(
                "name", account.getUsername()
        );
    
        emailService.sendEmail(
                account.getEmail(),
                new PasswordResetEmailSucessStrategy(),
                emailData
        );
    
        return true;
    }
}
