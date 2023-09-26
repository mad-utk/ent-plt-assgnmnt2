package com.example.eventmanagement.model;

import java.util.Date;

public class EventRegistration {

    // add new field named id
    private Long id;
    private Long eventId;
    private Long userId;
    
    public EventRegistration(Long eventId, Long userId) {
        this.eventId = eventId;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long id) {
        this.eventId = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long id) {
        this.userId = id;
    }

    // write toString method for all fields of EventRegistration class
    @Override
    public String toString() {
        return "EventRegistration{" +
                "regstrationId=" + id +
                ", eventId='" + eventId + '\'' +
                ", userId=" + userId +
                '}';
    }
}
