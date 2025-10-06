package com.HO_backend.Heat_Online.repository;


import com.HO_backend.Heat_Online.entity.Track;
import com.HO_backend.Heat_Online.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface TrackRepository extends JpaRepository<Track, Long> { }

