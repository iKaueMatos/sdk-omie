package com.omie.sdk.modules.auth.application.service;

import com.omie.sdk.modules.auth.infra.entity.Account;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public interface TokenService {
    void createToken(Account account, String jwt);
    void deleteTokenByAccount(Account account);
    String isTokenValid(String jwt);
    UserDetails extractUserDetails(String jwt);
    Instant creationDate();
    Instant expirationDate();
}
