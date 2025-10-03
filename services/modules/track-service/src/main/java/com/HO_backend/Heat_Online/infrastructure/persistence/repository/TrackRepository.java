package com.HO_backend.Heat_Online.infrastructure.persistence.repository;


import com.HO_backend.Heat_Online.infrastructure.models.Track;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TrackRepository extends JpaRepository<Track, Long> { }

