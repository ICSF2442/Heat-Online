package com.HO_backend.Heat_Online.controller;

import com.HO_backend.Heat_Online.entity.Effect;
import com.HO_backend.Heat_Online.repository.EffectRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/effects")
public class EffectController {

    private final EffectRepository effectRepository;

    public EffectController(EffectRepository effectRepository) {
        this.effectRepository = effectRepository;
    }

    @GetMapping
    public List<Effect> getAllEffects() {
        return effectRepository.findAll();
    }

    @PostMapping
    public Effect createEffect(@RequestBody Effect effect) {
        return effectRepository.save(effect);
    }
}