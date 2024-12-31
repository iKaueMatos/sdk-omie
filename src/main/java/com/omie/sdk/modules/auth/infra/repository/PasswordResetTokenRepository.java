package com.omie.sdk.modules.auth.infra.repository;

import com.omie.sdk.modules.auth.infra.entity.PasswordResetToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Long> {
    List<PasswordResetToken> findByAccountId(Long accountId);
    Optional<PasswordResetToken> findByToken(String token);
}
