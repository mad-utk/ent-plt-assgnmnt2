package com.example.eventmanagement.service;

import java.util.List;

import com.example.eventmanagement.model.EventRegistration;

public interface EventRegistrationService {
    
    public EventRegistration addEventRegistration(EventRegistration eventRegistration) throws Exception;
    
    public List<EventRegistration> getAllEventRegistrations() throws Exception;
    
    public EventRegistration updateEventRegistration(Long id, EventRegistration er) throws Exception;
    
    public String deleteEventRegistration(Long id) throws Exception;

}
