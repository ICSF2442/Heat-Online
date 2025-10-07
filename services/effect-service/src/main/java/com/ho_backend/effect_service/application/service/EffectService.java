package com.ho_backend.effect_service.application.service;

import com.ho_backend.effect_service.infrastructure.models.EffectEntity;
import com.ho_backend.effect_service.infrastructure.persistence.repository.EffectRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EffectService {
    private final EffectRepository repository;

    public EffectService(EffectRepository repository) {
        this.repository = repository;
    }

    public List<EffectEntity> getAllEffects() {
        return repository.findAll();
    }

    public Optional<EffectEntity> getEffectById(Long id) {
        return repository.findById(id);
    }

    public EffectEntity createEffect(EffectEntity effect) {
        return repository.save(effect);
    }
}
