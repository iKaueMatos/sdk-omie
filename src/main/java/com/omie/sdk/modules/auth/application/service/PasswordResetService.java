package com.omie.sdk.modules.auth.application.service;

import com.omie.sdk.modules.auth.infra.entity.Account;

public interface PasswordResetService {
    boolean generateResetToken(String email);
    String generateSixDigitToken();
    Account getAccountByToken(String token);
}
