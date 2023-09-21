package com.example.eventmanagement.service;

import java.util.List;

import com.example.eventmanagement.model.Event;
import com.example.eventmanagement.model.EventRegistration;
import com.example.eventmanagement.model.User;

public interface EventRegistrationService {
    
    public EventRegistration addEventRegistration(Long eventId, Long userId) throws Exception;
    
    public List<EventRegistration> getAllEventRegistrations() throws Exception;
    
    public EventRegistration updateEventRegistration(Long id, EventRegistration er) throws Exception;
    
    public String deleteEventRegistration(Long id) throws Exception;

    public void addUserToEvent(Long userId, Long eventId) throws Exception;

    public void removeUserFromEvent(Long userId, Long eventId) throws Exception;

    public List<User> getAllUsersOfEvent(Long eventId) throws Exception;

    public List<Event> getAllEventsOfUser(Long userId) throws Exception;

    public void removeAllUsersFromEvent(Long eventId) throws Exception;

    public void removeAllEventsOfUser(Long userId) throws Exception;
}
