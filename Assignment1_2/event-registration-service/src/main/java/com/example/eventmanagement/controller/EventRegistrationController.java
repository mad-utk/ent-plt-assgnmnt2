package com.example.eventmanagement.controller;

import com.example.eventmanagement.model.Event;
import com.example.eventmanagement.model.User;
import com.example.eventmanagement.model.EventRegistration;
import com.example.eventmanagement.service.EventRegistrationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventRegistrationController {

    @Autowired
    private EventRegistrationService erService;

    @PostMapping("/eventRegistration")
    public EventRegistration addEventRegistration(@RequestBody EventRegistration er) throws Exception {
        return erService.addEventRegistration(er.getEventId(), er.getUserId());
    }

    @GetMapping("/eventRegistrations")
    public List<EventRegistration> getAllEventRegistrations() throws Exception {
        return erService.getAllEventRegistrations();
    }

    @PutMapping("/eventRegistration/{id}")
    public EventRegistration updateEventRegistration(@PathVariable Long id, @RequestBody EventRegistration er) throws Exception {
        return erService.updateEventRegistration(id, er);
    }

    @DeleteMapping("/eventRegistration/{id}")
    public String deleteEventRegistration(@PathVariable Long id) throws Exception {
        return erService.deleteEventRegistration(id);
    }

    @PostMapping("/eventRegistration/addUserToEvent/{eventId}/{userId}")
    public void addUserToEvent(@PathVariable Long eventId, @PathVariable Long userId) throws Exception {
        erService.addUserToEvent(userId, eventId);
    }

    @PostMapping("/eventRegistration/removeUserFromEvent/{eventId}/{userId}")
    public void removeUserFromEvent(@PathVariable Long eventId, @PathVariable Long userId) throws Exception {
        erService.removeUserFromEvent(eventId, userId);
    }

    @GetMapping("/eventRegistration/getAllUsersOfEvent/{eventId}")
    public List<User> getAllUsersOfEvent(@PathVariable Long eventId) throws Exception {
        return erService.getAllUsersOfEvent(eventId);
    }

    @GetMapping("/eventRegistration/getAllEventsOfUser/{userId}")
    public List<Event> getAllEventsOfUser(@PathVariable Long userId) throws Exception {
        return erService.getAllEventsOfUser(userId);
    }

    @PostMapping("/eventRegistration/removeAllUsersFromEvent/{eventId}")
    public void removeAllUsersFromEvent(@PathVariable Long eventId) throws Exception {
        erService.removeAllUsersFromEvent(eventId);
    }

    @PostMapping("/eventRegistration/removeAllEventsOfUser/{userId}")
    public void removeAllEventsOfUser(@PathVariable Long userId) throws Exception {
        erService.removeAllEventsOfUser(userId);
    }
}
