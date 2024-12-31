package com.omie.sdk.modules.auth.domain.service.impl;

import com.omie.sdk.modules.auth.application.service.PasswordResetService;
import com.omie.sdk.modules.auth.infra.entity.Account;
import com.omie.sdk.modules.auth.infra.entity.PasswordResetToken;
import com.omie.sdk.modules.auth.infra.repository.AccountRepository;
import com.omie.sdk.modules.auth.infra.repository.PasswordResetTokenRepository;
import com.omie.sdk.infra.email.service.EmailService;
import com.omie.sdk.infra.email.strategy.PasswordResetEmailStrategy;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Optional;
import java.util.Random;

@Service
public class PasswordResetServiceImpl implements PasswordResetService {
    private final PasswordResetTokenRepository passwordResetTokenRepository;
    private final AccountRepository accountRepository;
    private final EmailService emailService;

    public PasswordResetServiceImpl(AccountRepository accountRepository, PasswordResetTokenRepository passwordResetTokenRepository, EmailService emailService) {
        this.accountRepository = accountRepository;
        this.passwordResetTokenRepository = passwordResetTokenRepository;
        this.emailService = emailService;
    }

    public boolean generateResetToken(String email) {
        Optional<Account> accountOptional = accountRepository.findByEmail(email);
        if (accountOptional.isEmpty()) {
            return false;
        }

        Account account = accountOptional.get();
        String token = generateSixDigitToken();
        LocalDateTime expirationTime = LocalDateTime.now().plusMinutes(15);
        PasswordResetToken resetToken = PasswordResetToken.builder()
                .token(token)
                .expirationTime(expirationTime)
                .account(account)
                .build();

        Map<String, Object> emailData = Map.of(
            "name", account.getUsername(),
            "code", token
        );

        emailService.sendEmail(
                account.getEmail(),
                new PasswordResetEmailStrategy(),
                emailData
        );

        passwordResetTokenRepository.save(resetToken);
        return true;
    }

    public String generateSixDigitToken() {
        Random random = new Random();
        int token = 100000 + random.nextInt(900000);
        return String.valueOf(token);
    }

    public Account getAccountByToken(String token) {
        PasswordResetToken resetToken = passwordResetTokenRepository.findByToken(token)
                .orElseThrow(() -> new RuntimeException("Token não encontrado ou inválido."));

        if (resetToken.getExpirationTime().isBefore(java.time.LocalDateTime.now())) {
            throw new RuntimeException("Token expirado.");
        }

        return resetToken.getAccount();
    }
}
