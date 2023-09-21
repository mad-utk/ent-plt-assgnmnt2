package com.example.eventmanagement.service;

import java.util.List;

import com.example.eventmanagement.model.Event;
import com.example.eventmanagement.model.EventRegistration;
import com.example.eventmanagement.model.User;

public interface EventRegistrationService {
    
    public void addEventRegistration(Long eventId, Long userId) throws Exception;
    
    public List<EventRegistration> getAllEventRegistrations() throws Exception;
    
    public EventRegistration updateEventRegistration(Long id, EventRegistration er) throws Exception;
    
    public String deleteEventRegistration(Long id) throws Exception;

    public void addUserToEvent(User user, Event event) throws Exception;

    public void removeUserFromEvent(User user, Event event) throws Exception;

    public List<User> getAllUsersOfEvent(Event event) throws Exception;

    public List<Event> getAllEventsOfUser(User user) throws Exception;

    public void removeAllUsersFromEvent(Event event) throws Exception;

    public void removeAllEventsOfUser(User user) throws Exception;
}
