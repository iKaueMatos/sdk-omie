package com.omie.sdk.modules.auth.infra.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class JWTService {

    @Value("${jwt.secret.key}")
    private String secretKey;

    private final CustomUserDetailsService customUserDetailsService;

    public JWTService(CustomUserDetailsService customUserDetailsService) {
        this.customUserDetailsService = customUserDetailsService;
    }

    public String validateToken(String token) {
        try {
            token = token.replace("Bearer ", "").trim();
            Claims claims = Jwts.parser()
                    .setSigningKey(secretKey)
                    .parseClaimsJws(token)
                    .getBody();
            return claims.getSubject();
        } catch (ExpiredJwtException e) {
            throw new RuntimeException("Token expirado: " + e.getMessage());
        } catch (UnsupportedJwtException e) {
            throw new RuntimeException("Token não suportado: " + e.getMessage());
        } catch (MalformedJwtException e) {
            throw new RuntimeException("Token malformado: " + e.getMessage());
        } catch (SignatureException e) {
            throw new RuntimeException("Assinatura do token inválida: " + e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("Erro ao validar o token JWT: " + e.getMessage());
        }
    }

    public void validateTokenWithUser(String token, UserDetails userDetails) {
        String username = validateToken(token);
        if (!userDetails.getUsername().equals(username)) {
            throw new RuntimeException("O token não corresponde ao usuário fornecido.");
        }
    }

    public UsernamePasswordAuthenticationToken getAuthentication(String token) {
        String username = validateToken(token);
        if (username == null) {
            return null;
        }
        UserDetails userDetails = customUserDetailsService.loadUserByUsername(username);

        validateTokenWithUser(token, userDetails);
        return new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
    }

    public String resolveToken(HttpServletRequest request) {
        String bearerToken = request.getHeader("Authorization");
        if (bearerToken != null && bearerToken.startsWith("Bearer ")) {
            return bearerToken.substring(7); // Remove o prefixo "Bearer ".
        }
        return null;
    }

    public String getUsername(String token) {
        this.validateToken(token);
        Claims claims = Jwts.parser()
                .setSigningKey(secretKey)
                .parseClaimsJws(token)
                .getBody();
        return claims.getSubject();
    }
}
