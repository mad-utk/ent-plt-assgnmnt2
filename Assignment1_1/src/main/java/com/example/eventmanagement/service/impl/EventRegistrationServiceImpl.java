package com.example.eventmanagement.service.impl;

import com.example.eventmanagement.model.Event;
import com.example.eventmanagement.model.EventRegistration;
import com.example.eventmanagement.model.User;

import com.example.eventmanagement.repository.EventRegistrationRepository;
import com.example.eventmanagement.service.EventRegistrationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventRegistrationServiceImpl implements EventRegistrationService {

    @Autowired
    private EventRegistrationRepository erRepository;

    public EventRegistration addEventRegistration(EventRegistration er) throws Exception {
        // handle exception if any exception occurs
        try {
            return erRepository.addEventRegistration(er);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // throws exception
            throw e;
        }
    }

    @Override
    public List<EventRegistration> getAllEventRegistrations() throws Exception {
        // handle exception if any exception occurs
        try {
            return erRepository.getAllEventRegistrations();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // throws exception
            throw e;
        }
    }

    @Override
    public EventRegistration updateEventRegistration(Long id, EventRegistration er) throws Exception {
        // handle exception if any exception occurs
        try {
            return erRepository.updateEventRegistration(id, er);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // throws exception
            throw e;
        }
    }

    @Override
    public String deleteEventRegistration(Long id) throws Exception {
        // handle exception if any exception occurs
        // return string "EventRegistration deleted successfully" if eventRegistration is deleted successfully
        try {
            erRepository.deleteEventRegistration(id);
            return "EventRegistration deleted successfully";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // throws exception
            throw e;
        }
    }

    @Override
    public void addUserToEvent(User user, Event event) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeUserFromEvent(User user, Event event) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> getAllUsersOfEvent(Event event) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Event> getAllEventsOfUser(User user) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeAllUsersFromEvent(Event event) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeAllEventsOfUser(User user) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addEventRegistration(Long eventId, Long userId) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
