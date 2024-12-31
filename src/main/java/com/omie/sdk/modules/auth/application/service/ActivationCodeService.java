package com.omie.sdk.modules.auth.application.service;

import com.omie.sdk.infra.exception.EmailSendingException;
import com.omie.sdk.modules.auth.infra.entity.Account;
import com.omie.sdk.modules.auth.infra.entity.ActivationCode;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface ActivationCodeService {
    ActivationCode findActivationCodeByKey(String key);
    void deleteActivationCodeById(Long id);
    void checkActivationCodeExpiration(ActivationCode activationCode);
    void resendActivationEmail(String email) throws UsernameNotFoundException, EmailSendingException;
    void updateActivationCode(ActivationCode existingActivationCode, Account account);
    void sendNewActivationCode(Account account);
    void prepareAndSendActivationCode(ActivationCode activationCode, Account account);
}
