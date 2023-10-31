package com.example.familytree.repositories;

import com.example.familytree.entities.VerificationCodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationCodeRepository extends JpaRepository<VerificationCodeEntity, Integer> {
    VerificationCodeEntity findFirstByVerificationCode(String code);
    VerificationCodeEntity findFirstByEmail(String email);
    boolean existsByEmail(String email);

}
