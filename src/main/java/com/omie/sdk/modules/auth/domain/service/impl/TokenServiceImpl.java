package com.omie.sdk.modules.auth.domain.service.impl;

import com.omie.sdk.infra.exception.InvalidTokenException;
import com.omie.sdk.modules.auth.application.service.TokenService;
import com.omie.sdk.modules.auth.infra.entity.Account;
import com.omie.sdk.modules.auth.infra.entity.Token;
import com.omie.sdk.modules.auth.infra.repository.TokenRepository;
import com.omie.sdk.modules.auth.infra.security.CustomUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static com.omie.sdk.modules.auth.domain.model.TokenType.BEARER;

@Service
public class TokenServiceImpl implements TokenService {
    private TokenRepository tokenRepository;
    private JwtServiceImpl jwtService;
    private CustomUserDetailsService customUserDetailsService;

    public TokenServiceImpl(TokenRepository tokenRepository, JwtServiceImpl jwtService, CustomUserDetailsService customUserDetailsService) {
        this.tokenRepository = tokenRepository;
        this.jwtService = jwtService;
        this.customUserDetailsService = customUserDetailsService;
    }

    public void createToken(Account account, String jwt) {
        tokenRepository.save(
                Token.builder()
                        .account(account)
                        .jwt(jwt)
                        .tokenType(BEARER)
                        .expired(false)
                        .revoked(false)
                        .build()
        );
    }

    public void deleteTokenByAccount(Account account) {
        tokenRepository.findByAccount_Id(account.getId())
                .ifPresent(tokenRepository::delete);
    }

    public String isTokenValid(String jwt) {
        UserDetails userDetails = extractUserDetails(jwt);
        boolean isTokenValid = tokenRepository.findByJwt(jwt)
                .map(token -> !token.isExpired() && !token.isRevoked())
                .orElse(false);

        if (isTokenValid && jwtService.isJwtValid(jwt, userDetails)) {
            return userDetails.getUsername();
        } else {
            throw new InvalidTokenException("Authentication token is invalid!");
        }
    }

    public UserDetails extractUserDetails(String jwt) {
        String email = jwtService.extractEmail(jwt);
        return customUserDetailsService.loadUserByUsername(email);
    }

    public Instant creationDate() {
        return ZonedDateTime.now(ZoneId.of("America/São Paulo")).toInstant();
    }

    public Instant expirationDate() {
        return ZonedDateTime.now(ZoneId.of("America/São Paulo")).plusHours(4).toInstant();
    }
}
