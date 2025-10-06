package com.HO_backend.Heat_Online.controller;

import com.HO_backend.Heat_Online.entity.RoadConditionToken;
import com.HO_backend.Heat_Online.repository.RoadConditionTokenRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/road-tokens")
public class RoadConditionTokenController {

    private final RoadConditionTokenRepository repository;

    public RoadConditionTokenController(RoadConditionTokenRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<RoadConditionToken> getAllTokens() {
        return repository.findAll();
    }
}