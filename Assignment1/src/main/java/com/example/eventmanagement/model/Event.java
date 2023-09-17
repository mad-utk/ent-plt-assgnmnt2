package com.example.eventmanagement.model;

import java.util.Date;

public class Event {

    // add new field named id
    private Long id;
    private String name;
    private String description;
    private Date dateTime;

    public Event(String name, String description, Date dateTime) {
        this.name = name;
        this.description = description;
        this.dateTime = dateTime;
    }

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

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    // write toString method for all fields of Event class 
    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description=" + description +
                ", dateTime=" + dateTime +
                '}';
    }

}
