package com.omie.sdk.modules.auth.infra.entity;

import com.omie.sdk.modules.auth.domain.model.TokenType;
import com.omie.sdk.core.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.Builder;

@Builder
@Entity
@Table(name = "tokens")
public class Token implements BaseEntity<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public Long id;

    @OneToOne
    @JoinColumn(name = "account_id")
    public Account account;

    @Enumerated(EnumType.STRING)
    public TokenType tokenType = TokenType.BEARER;

    @Column(unique = true)
    public String jwt;

    public boolean revoked;
    public boolean expired;

    public Token(Long id, Account account, TokenType tokenType, String jwt, boolean revoked, boolean expired) {
        this.id = id;
        this.account = account;
        this.tokenType = tokenType;
        this.jwt = jwt;
        this.revoked = revoked;
        this.expired = expired;
    }

    public Token() {}

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public TokenType getTokenType() {
        return tokenType;
    }

    public void setTokenType(TokenType tokenType) {
        this.tokenType = tokenType;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }

    public boolean isRevoked() {
        return revoked;
    }

    public void setRevoked(boolean revoked) {
        this.revoked = revoked;
    }

    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }
}
