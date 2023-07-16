package org.ironman.entity;

import java.time.LocalDateTime;

public class Profile {
    // Attributes
    private Long id;
    private String name;
    private String description;

    // Constructors

    public Profile() {
    }

    public Profile(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    //Encapsulation

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
}
