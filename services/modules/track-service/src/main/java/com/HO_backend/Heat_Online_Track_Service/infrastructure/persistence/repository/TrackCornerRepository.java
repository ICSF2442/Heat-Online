package com.HO_backend.Heat_Online_Track_Service.infrastructure.persistence.repository;

import com.HO_backend.Heat_Online_Track_Service.infrastructure.models.TrackCorner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrackCornerRepository extends JpaRepository<TrackCorner, Long> { }
