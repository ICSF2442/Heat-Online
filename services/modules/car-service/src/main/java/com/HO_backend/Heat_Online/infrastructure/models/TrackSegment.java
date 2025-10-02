package com.HO_backend.Heat_Online.infrastructure.models;

import jakarta.persistence.*;


@Entity
@Table(name = "track_segments")
public class TrackSegment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sector_id", nullable = false)
    private TrackSector sector;

    private Integer orderIndex;

    @Enumerated(EnumType.STRING)
    private SegmentType type; // WATER, TUNNEL, SPECIAL_ZONE

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "effect_id")
    private Effect effect;

    private String notes;

    // getters and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TrackSector getSector() {
        return sector;
    }

    public void setSector(TrackSector sector) {
        this.sector = sector;
    }

    public Integer getOrderIndex() {
        return orderIndex;
    }

    public void setOrderIndex(Integer orderIndex) {
        this.orderIndex = orderIndex;
    }

    public SegmentType getType() {
        return type;
    }

    public void setType(SegmentType type) {
        this.type = type;
    }

    public Effect getEffect() {
        return effect;
    }

    public void setEffect(Effect effect) {
        this.effect = effect;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
