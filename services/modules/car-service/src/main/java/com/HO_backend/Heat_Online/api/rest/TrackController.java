package com.HO_backend.Heat_Online.api.rest;

import com.HO_backend.Heat_Online.infrastructure.models.Track;
import com.HO_backend.Heat_Online.domain.repository.TrackRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.HO_backend.Heat_Online.service.TrackService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/tracks")
public class TrackController {

    private final TrackService trackService;
    private final TrackRepository trackRepository;

    public TrackController(TrackService trackService, TrackRepository trackRepository) {
        this.trackService = trackService;
        this.trackRepository = trackRepository;
    }

    @GetMapping
    public List<Track> getAllTracks() {
        return trackRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getTrackById(@PathVariable Long id) {
        return trackRepository.findById(id)
                .<ResponseEntity<?>>map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body(Map.of("error", "Track not found")));
    }


    @PostMapping
    public ResponseEntity<?> createTrack(@RequestBody Track track) {
        try {
            Track savedTrack = trackService.createTrack(track);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedTrack);
        } catch (IllegalArgumentException ex) {
            return ResponseEntity.badRequest().body(Map.of("error", ex.getMessage()));
        }
    }
}
