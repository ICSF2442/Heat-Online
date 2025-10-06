package com.HO_backend.Heat_Online.service;

import com.HO_backend.Heat_Online.entity.SectorType;
import com.HO_backend.Heat_Online.entity.Track;
import com.HO_backend.Heat_Online.entity.TrackSector;
import com.HO_backend.Heat_Online.repository.TrackRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackService {

    private final TrackRepository trackRepository;

    public TrackService(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    public Track createTrack(Track track) {
        validateTrack(track);
        return trackRepository.save(track);
    }

    private void validateTrack(Track track) {
        List<TrackSector> sectors = track.getSectors();

        if (sectors == null || sectors.isEmpty()) {
            throw new IllegalArgumentException("Track must have at least one sector");
        }

        for (int i = 0; i < sectors.size(); i++) {
            TrackSector current = sectors.get(i);
            TrackSector next = sectors.get((i + 1) % sectors.size()); // loop closure

            // Rule: Corner must have odd length
            if (current.getType() == SectorType.CORNER) {
                if (current.getLength() % 2 == 0) {
                    throw new IllegalArgumentException("Corner length must be an odd number");
                }
            }

            // Rule: Two straights not allowed unless last+first
            if (current.getType() == SectorType.STRAIGHT && next.getType() == SectorType.STRAIGHT) {
                if (i != sectors.size() - 1) {
                    throw new IllegalArgumentException("Two consecutive straights are not allowed");
                }
            }

            // Rule: Two corners → must form a chicane
            if (current.getType() == SectorType.CORNER && next.getType() == SectorType.CORNER) {
                if (!current.getSpeedLimit().equals(next.getSpeedLimit())) {
                    throw new IllegalArgumentException("Consecutive corners must form a chicane with same speed limit");
                }
            }
        }
    }

    public int getLapLength(Track track) {
        return track.getSectors().stream()
                .mapToInt(TrackSector::getLength)
                .sum();
    }

    public TrackSector getStartSector(Track track) {
        return track.getSectors().getFirst(); // defined as first straight
    }
}
