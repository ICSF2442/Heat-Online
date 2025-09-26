package com.HO_backend.Heat_Online.controller;

import com.HO_backend.Heat_Online.entity.Track;
import com.HO_backend.Heat_Online.repository.TrackRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tracks")
public class TrackController {

    private final TrackRepository trackRepository;

    public TrackController(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    @GetMapping
    public List<Track> getAllTracks() {
        return trackRepository.findAll();
    }

    @PostMapping
    public Track createTrack(@RequestBody Track track) {
        return trackRepository.save(track);
    }
}
