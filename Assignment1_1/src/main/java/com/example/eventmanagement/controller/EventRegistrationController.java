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

//    @PostMapping("/eventRegistration")
//    public EventRegistration addEventRegistration(@RequestBody EventRegistration er) throws Exception {
//        return erService.
//    }
//
//    @GetMapping("/eventRegistrations")
//    public List<EventRegistration> getAllEventRegistrations() throws Exception {
//        return erService.getAllEventRegistrations();
//    }
//
//    // endpoint for updating eventRegistration by id
//    @PutMapping("/eventRegistration/{id}")
//    public EventRegistration updateEventRegistration(@PathVariable Long id, @RequestBody EventRegistration er) throws Exception {
//        return erService.updateEventRegistration(id, er);
//    }
//
//    // endpoint for deleting eventRegistration by id
//    @DeleteMapping("/eventRegistration/{id}")
//    public String deleteEventRegistration(@PathVariable Long id) throws Exception {
//        return erService.deleteEventRegistration(id);
//    }
//
//    // endpoint for adding user to an event
//    @PostMapping("/eventRegistration/addUserToEvent/{eventId}/{userId}")
//    public String addUserToEvent(@PathVariable Long eventId, @PathVariable Long userId) throws Exception {
//        return erService.addUserToEvent(eventId, userId);
//    }
//
//    // endpoint for removing user from an event
//    @PostMapping("/eventRegistration/removeUserFromEvent/{eventId}/{userId}")
//    public String removeUserFromEvent(@PathVariable Long eventId, @PathVariable Long userId) throws Exception {
//        return erService.removeUserFromEvent(eventId, userId);
//    }
//
//    // endpoint for getting all users of an event
//    @GetMapping("/eventRegistration/getAllUsersOfEvent/{eventId}")
//    public List<User> getAllUsersOfEvent(@PathVariable Long eventId) throws Exception {
//        return erService.getAllUsersOfEvent(eventId);
//    }
//
//    // endpoint for getting all events of a user
//    @GetMapping("/eventRegistration/getAllEventsOfUser/{userId}")
//    public List<Event> getAllEventsOfUser(@PathVariable Long userId) throws Exception {
//        return erService.getAllEventsOfUser(userId);
//    }
//
//    // endpoint for removing all users from an event
//    @PostMapping("/eventRegistration/removeAllUsersFromEvent/{eventId}")
//    public String removeAllUsersFromEvent(@PathVariable Long eventId) throws Exception {
//        return erService.removeAllUsersFromEvent(eventId);
//    }
//
//    // endpoint for removing all events of a user
//    @PostMapping("/eventRegistration/removeAllEventsOfUser/{userId}")
//    public String removeAllEventsOfUser(@PathVariable Long userId) throws Exception {
//        return erService.removeAllEventsOfUser(userId);
//    }
}
