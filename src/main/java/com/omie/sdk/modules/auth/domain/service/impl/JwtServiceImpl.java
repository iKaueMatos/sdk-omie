package com.omie.sdk.modules.auth.domain.service.impl;

import com.omie.sdk.modules.auth.application.service.JwtService;
import com.omie.sdk.modules.auth.infra.entity.Account;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.function.Function;

@Service
public class JwtServiceImpl implements JwtService {
    public static final String JWT_PREFIX = "Bearer ";

    @Value("${jwt.secret.key}")
    public String secretKey;

    public String generateJwt(Account account) {
        return Jwts.builder()
                .setClaims(new HashMap<>())
                .setSubject(account.getEmail())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24))
                .signWith(getSignInKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    public boolean isJwtValid(String jwt, UserDetails userDetails) {
        String username = extractEmail(jwt);
        return username.equals(userDetails.getUsername()) && !isJwtExpired(jwt);
    }

    public Key getSignInKey() {
        byte[] keyBytes;
        try {
            keyBytes = Decoders.BASE64.decode(secretKey);
        } catch (IllegalArgumentException e) {
            keyBytes = secretKey.getBytes();
        }
        return Keys.hmacShaKeyFor(keyBytes);
    }

    public String extractEmail(String jwt) {
        return extractClaim(jwt, Claims::getSubject);
    }

    public <T> T extractClaim(String jwt, Function<Claims, T> claimsResolver) {
        Claims claims = extractAllClaims(jwt);
        return claimsResolver.apply(claims);
    }

    public Claims extractAllClaims(String jwt) {
        return Jwts.parserBuilder()
                .setSigningKey(getSignInKey())
                .build()
                .parseClaimsJws(jwt)
                .getBody();
    }

    public boolean isJwtExpired(String jwt) {
        return extractClaim(jwt, Claims::getExpiration).before(new Date());
    }

    public String extractJwt(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");
        if (authHeader != null && authHeader.startsWith(JWT_PREFIX)) {
            return authHeader.substring(JWT_PREFIX.length());
        }
        return null;
    }
}
