package com.ho_backend.effect_service.infrastructure.persistence.repository;

import com.ho_backend.effect_service.infrastructure.models.EffectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EffectRepository extends JpaRepository<EffectEntity, Long> {
}
