package com.omie.sdk.modules.auth.infra.entity;

import com.omie.sdk.core.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
@Entity
@Table(name = "activation_codes")
public class ActivationCode implements BaseEntity<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne
    @JoinColumn(name = "account_id")
    private Account account;
    private String key;
    private LocalDateTime expirationTime;

    public ActivationCode() {}

    public ActivationCode(Long id, Account account, String key, LocalDateTime expirationTime) {
        this.id = id;
        this.account = account;
        this.key = key;
        this.expirationTime = expirationTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public LocalDateTime getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(LocalDateTime expirationTime) {
        this.expirationTime = expirationTime;
    }
}
