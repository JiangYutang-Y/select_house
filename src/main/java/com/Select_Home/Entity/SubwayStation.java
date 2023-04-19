package com.Select_Home.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SubwayStation {
    @Id
    @GeneratedValue
    private Long id;
    private Long subwayId;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSubwayId() {
        return subwayId;
    }

    public void setSubwayId(Long subwayId) {
        this.subwayId = subwayId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
