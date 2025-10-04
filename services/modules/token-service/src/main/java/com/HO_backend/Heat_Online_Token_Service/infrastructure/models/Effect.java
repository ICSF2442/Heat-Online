package com.HO_backend.Heat_Online_Token_Service.infrastructure.models;

import com.HO_backend.Heat_Online_Token_Service.domain.model.EffectScope;
import jakarta.persistence.*;

@Entity
@Table(name = "effects")
public class Effect {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @Enumerated(EnumType.STRING)
    private EffectScope scope; // SECTOR, CORNER, SEGMENT, GLOBAL

    private Integer value; // always int

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

    public EffectScope getScope() {
        return scope;
    }

    public void setScope(EffectScope scope) {
        this.scope = scope;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}