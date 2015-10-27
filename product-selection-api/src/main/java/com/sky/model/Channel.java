package com.sky.model;

import javax.persistence.*;

@Entity
public class Channel {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {

        if (object != null && object instanceof Channel) {
            Channel channel = (Channel) object;

            if (channel != null &&
                channel.getName() == this.getName() &&
                channel.getCategory() == this.getCategory()) {
                return true;
            }
        }
        return false;
    }
}
