package com.HO_backend.Heat_Online_Token_Service.api.rest;

import com.HO_backend.Heat_Online_Token_Service.infrastructure.models.RoadConditionToken;
import com.HO_backend.Heat_Online_Token_Service.infrastructure.persistence.repository.RoadConditionTokenRepository;
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