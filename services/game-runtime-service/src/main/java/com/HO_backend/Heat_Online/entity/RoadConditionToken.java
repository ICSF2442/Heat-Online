package com.HO_backend.Heat_Online.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "road_condition_tokens")
public class RoadConditionToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @Enumerated(EnumType.STRING)
    private RoadConditionScope scope; // SECTOR or CORNER

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "effect_id", nullable = false)
    private Effect effect;

    private String image;

    // getters and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RoadConditionScope getScope() {
        return scope;
    }

    public void setScope(RoadConditionScope scope) {
        this.scope = scope;
    }

    public Effect getEffect() {
        return effect;
    }

    public void setEffect(Effect effect) {
        this.effect = effect;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}