package com.HO_backend.Heat_Online.domain.repository;

import com.HO_backend.Heat_Online.infrastructure.models.WeatherConditionToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherConditionTokenRepository extends JpaRepository<WeatherConditionToken, Long> {}
