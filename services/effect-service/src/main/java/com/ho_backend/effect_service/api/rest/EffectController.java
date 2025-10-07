package com.ho_backend.effect_service.api.rest;

import com.ho_backend.effect_service.application.service.EffectService;
import com.ho_backend.effect_service.infrastructure.models.EffectEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/effects")
public class EffectController {

    private final EffectService service;

    public EffectController(EffectService service) {
        this.service = service;
    }

    @GetMapping
    public List<EffectEntity> getAll() {
        return service.getAllEffects();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        return service.getEffectById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public EffectEntity create(@RequestBody EffectEntity effect) {
        return service.createEffect(effect);
    }
}
