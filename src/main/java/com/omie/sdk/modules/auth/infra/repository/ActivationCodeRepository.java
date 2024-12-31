package com.omie.sdk.modules.auth.infra.repository;


import com.omie.sdk.modules.auth.infra.entity.ActivationCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ActivationCodeRepository extends JpaRepository<ActivationCode, Long> {
    Optional<ActivationCode> findActivationCodeByKey(String key);
    Optional<ActivationCode> findActivationCodeByAccount_Email(String email);
    ActivationCode save(ActivationCode activationCode);
}
