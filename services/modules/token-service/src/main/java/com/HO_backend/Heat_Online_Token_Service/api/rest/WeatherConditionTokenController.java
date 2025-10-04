package com.HO_backend.Heat_Online_Token_Service.api.rest;

import com.HO_backend.Heat_Online_Token_Service.infrastructure.models.WeatherConditionToken;
import com.HO_backend.Heat_Online_Token_Service.infrastructure.persistence.repository.WeatherConditionTokenRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/weather-tokens")
public class WeatherConditionTokenController {

    private final WeatherConditionTokenRepository repository;

    public WeatherConditionTokenController(WeatherConditionTokenRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<WeatherConditionToken> getAllTokens() {
        return repository.findAll();
    }
}