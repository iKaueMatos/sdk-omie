package com.omie.sdk.modules.auth.infra.repository;

import com.omie.sdk.modules.auth.infra.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TokenRepository extends JpaRepository<Token, Long> {
    Optional<Token> findByAccount_Id(Long id);
    Optional<Token> findByJwt(String jwt);
}
