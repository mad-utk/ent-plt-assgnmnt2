package com.example.eventmanagement.controller;

import com.example.eventmanagement.model.EventRegistration;
import com.example.eventmanagement.service.EventRegistrationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventRegistrationController {

    @Autowired
    private EventRegistrationService eventRegistrationService;

    @PostMapping("/eventRegistration")
    public EventRegistration addEventRegistration(@RequestBody EventRegistration eventRegistration) throws Exception {
        return eventRegistrationService.addEventRegistration(eventRegistration);
    }

    @GetMapping("/eventRegistrations")
    public List<EventRegistration> getAllEventRegistrations() throws Exception {
        return eventRegistrationService.getAllEventRegistrations();
    }

    @PutMapping("/eventRegistration/{id}")
    public EventRegistration updateEventRegistration(@PathVariable Long id, @RequestBody EventRegistration eventRegistration) throws Exception {
        return eventRegistrationService.updateEventRegistration(id, eventRegistration);
    }

    @DeleteMapping("/eventRegistration/{id}")
    public String deleteEventRegistration(@PathVariable Long id) throws Exception {
        return eventRegistrationService.deleteEventRegistration(id);
    }

}
