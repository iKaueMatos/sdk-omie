package com.omie.sdk.modules.auth.application.service;

import com.omie.sdk.modules.auth.infra.entity.Account;
import io.jsonwebtoken.Claims;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.core.userdetails.UserDetails;

import java.security.Key;
import java.util.function.Function;

public interface JwtService {
    String generateJwt(Account account);
    boolean isJwtValid(String jwt, UserDetails userDetails);
    Key getSignInKey();
    String extractEmail(String jwt);
    <T> T extractClaim(String jwt, Function<Claims, T> claimsResolver);
    Claims extractAllClaims(String jwt);
    boolean isJwtExpired(String jwt);
    String extractJwt(HttpServletRequest request);
}
