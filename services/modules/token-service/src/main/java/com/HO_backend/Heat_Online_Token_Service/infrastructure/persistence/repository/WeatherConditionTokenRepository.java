package com.HO_backend.Heat_Online_Token_Service.infrastructure.persistence.repository;

import com.HO_backend.Heat_Online_Token_Service.infrastructure.models.WeatherConditionToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherConditionTokenRepository extends JpaRepository<WeatherConditionToken, Long> {}
