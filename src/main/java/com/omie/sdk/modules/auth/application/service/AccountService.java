package com.omie.sdk.modules.auth.application.service;

import com.omie.sdk.modules.auth.infra.entity.Account;

public interface AccountService {
    Account createAccount(String email, String password, boolean isEnabled);
    void enableAccount(Account account);
    boolean isAccountExists(String email);
    boolean updatePassword(Account email, String newPassword);
}
