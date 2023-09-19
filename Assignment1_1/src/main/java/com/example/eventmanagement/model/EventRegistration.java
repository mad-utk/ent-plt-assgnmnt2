package com.example.eventmanagement.model;

import java.util.Date;

public class EventRegistration {

    // add new field named id
    private Long regstrationId;
    private Long eventId;
    private Long userId;
    
    public Event(Long eventId, Long userId) {
        this.eventId = eventId;
        this.userId = userId;
    }

    public Long getRegstrationId() {
        return regstrationId;
    }

    public void setRegstrationId(Long regstrationId) {
        this.regstrationId = regstrationId;
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
                "regstrationId=" + regstrationId +
                ", eventId='" + eventId + '\'' +
                ", userId=" + userId +
                '}';
    }
}
