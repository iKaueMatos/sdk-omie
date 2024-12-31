package com.omie.sdk.modules.auth.infra.entity;

import jakarta.persistence.*;
import lombok.Builder;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;

@Entity
@Builder
@Table(name = "password_reset")
public class PasswordResetToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Length(max = 6)
    private String token;
    private LocalDateTime expirationTime;

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    public String getResetPasswordToken() {
        return token;
    }

    public void setResetPasswordToken(String token) {
        this.token = token;
    }

    public LocalDateTime getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(LocalDateTime expirationTime) {
        this.expirationTime = expirationTime;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
