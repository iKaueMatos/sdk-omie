package com.omie.sdk.modules.auth.domain.service.impl;

import com.omie.sdk.infra.exception.ActivationCodeExpiredException;
import com.omie.sdk.infra.exception.ActivationCodeNotFoundException;
import com.omie.sdk.infra.exception.EmailSendingException;
import com.omie.sdk.modules.auth.application.service.ActivationCodeService;
import com.omie.sdk.modules.auth.infra.entity.Account;
import com.omie.sdk.modules.auth.infra.entity.ActivationCode;
import com.omie.sdk.modules.auth.infra.repository.AccountRepository;
import com.omie.sdk.modules.auth.infra.repository.ActivationCodeRepository;
import com.omie.sdk.infra.email.service.EmailService;
import com.omie.sdk.infra.email.strategy.AccountActivationCodeEmailTemplateStrategy;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class ActivationCodeServiceImpl implements ActivationCodeService{
    private final ActivationCodeRepository activationCodeRepository;
    private final EmailService emailService;
    private final MessageSourceServiceImpl messageService;
    private final AccountRepository accountRepository;

    public ActivationCode findActivationCodeByKey(String key) {
        log.info("Buscando código de ativação para a chave: {}", key);
        return activationCodeRepository.findActivationCodeByKey(key)
                .orElseThrow(() -> new ActivationCodeNotFoundException(
                        messageService.generateMessage("error.activation_code.not_found", key)
                ));
    }

    public void deleteActivationCodeById(Long id) {
        activationCodeRepository.deleteById(id);
    }

    public void checkActivationCodeExpiration(ActivationCode activationCode) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime expirationTime = activationCode.getExpirationTime();
        if (expirationTime.isBefore(now)) {
            deleteActivationCodeById(activationCode.getId());
            sendNewActivationCode(activationCode.getAccount());
            long minutes = ChronoUnit.MINUTES.between(expirationTime, now);

            throw new ActivationCodeExpiredException(
                    messageService.generateMessage("error.activation_code.expired",
                            activationCode.getKey(),
                            minutes,
                            activationCode.getAccount().getEmail()
                    )
            );
        }
    }

    public void resendActivationEmail(String email) throws UsernameNotFoundException, EmailSendingException {
        Account account = accountRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado."));

        Optional<ActivationCode> existingActivationCode = activationCodeRepository.findActivationCodeByAccount_Email(email);
        if (existingActivationCode.isPresent()) {
            updateActivationCode(existingActivationCode.get(), account);
        } else {
            sendNewActivationCode(account);
        }
    }

    public void updateActivationCode(ActivationCode existingActivationCode, Account account) {
        prepareAndSendActivationCode(existingActivationCode, account);
    }

    public void sendNewActivationCode(Account account) {
        ActivationCode activationCode = ActivationCode.builder()
                .account(account)
                .build();
        prepareAndSendActivationCode(activationCode, account);
    }

    public void prepareAndSendActivationCode(ActivationCode activationCode, Account account) {
        activationCode.setKey(UUID.randomUUID().toString());
        activationCode.setExpirationTime(LocalDateTime.now().plusHours(2L));
        activationCode.setAccount(account);

        Map<String, Object> emailData = Map.of(
                "name", account.getUsername(),
                "code", activationCode.getKey()
        );

        emailService.sendEmail(
                account.getEmail(),
                new AccountActivationCodeEmailTemplateStrategy(),
                emailData
        );

        activationCodeRepository.save(activationCode);
    }
}
