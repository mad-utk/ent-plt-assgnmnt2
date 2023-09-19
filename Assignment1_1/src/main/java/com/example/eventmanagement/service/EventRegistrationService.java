package com.example.eventmanagement.service;

import java.util.List;

import com.example.eventmanagement.model.Event;
import com.example.eventmanagement.model.User;

public interface EvenRegistrationtService {
    public void addUserToEvent(User user, Event event) throws Exception;

    public void removeUserFromEvent(User user, Event event) throws Exception;

    public List<User> getAllUsersOfEvent(Event event) throws Exception;

    public List<Event> getAllEventsOfUser(User user) throws Exception;

    public void removeAllUsersFromEvent(Event event) throws Exception;

    public void removeAllEventsOfUser(User user) throws Exception;
}
