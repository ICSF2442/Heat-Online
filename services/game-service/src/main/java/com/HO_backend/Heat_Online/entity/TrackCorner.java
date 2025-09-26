package com.HO_backend.Heat_Online.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "track_corners")
public class TrackCorner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int cornerNumber;  // order inside the sector
    private String difficulty; // e.g., "Easy", "Medium", "Hard"

    @ManyToOne
    @JoinColumn(name = "sector_id")
    private TrackSector sector;

    // getters & setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCornerNumber() {
        return cornerNumber;
    }

    public void setCornerNumber(int cornerNumber) {
        this.cornerNumber = cornerNumber;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public TrackSector getSector() {
        return sector;
    }

    public void setSector(TrackSector sector) {
        this.sector = sector;
    }
}
