package com.HO_backend.Heat_Online_Token_Service.infrastructure.persistence.repository;

import com.HO_backend.Heat_Online_Token_Service.infrastructure.models.RoadConditionToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoadConditionTokenRepository extends JpaRepository<RoadConditionToken, Long> {}
