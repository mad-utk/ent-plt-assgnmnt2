package com.example.eventmanagement.service;

import java.util.List;

import com.example.eventmanagement.model.Event;

public interface EventService {
    public Event addEvent(Event event) throws Exception;

    public List<Event> getAllEvents() throws Exception;

    public Event updateEvent(Long id, Event event) throws Exception;

    public String deleteEvent(Long id) throws Exception;
}
