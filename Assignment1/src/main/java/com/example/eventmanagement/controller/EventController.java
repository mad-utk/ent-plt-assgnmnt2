package com.example.eventmanagement.controller;

import com.example.eventmanagement.model.Event;
import com.example.eventmanagement.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping("/event")
    public Event addEvent(@RequestBody Event event) throws Exception {
        return eventService.addEvent(event);
    }

    @GetMapping("/event")
    public List<Event> getAllEvents() throws Exception {
        return eventService.getAllEvents();
    }

    // endpoint for updating event by id
    @PutMapping("/event/{id}")
    public Event updateEvent(@PathVariable Long id, @RequestBody Event event) throws Exception {
        return eventService.updateEvent(id, event);
    }

    // endpoint for deleting event by id
    @DeleteMapping("/event/{id}")
    public String deleteEvent(@PathVariable Long id) throws Exception {
        return eventService.deleteEvent(id);
    }
}
