package com.example.eventmanagement.service.impl;

import com.example.eventmanagement.model.Event;
import com.example.eventmanagement.model.EventRegistration;
import com.example.eventmanagement.model.User;

import com.example.eventmanagement.repository.EventRegistrationRepository;
import com.example.eventmanagement.repository.UserRepository;
import com.example.eventmanagement.repository.EventRepository;
import com.example.eventmanagement.service.EventRegistrationService;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventRegistrationServiceImpl implements EventRegistrationService {

    @Autowired
    private EventRegistrationRepository erRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EventRepository eventRepository;

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
    public void addUserToEvent(Long userId, Long eventId) throws Exception {
        EventRegistration er = new EventRegistration(userId, eventId);
        this.addEventRegistration(er);
    }

    @Override
    public void removeUserFromEvent(Long userId, Long eventId) throws Exception {
        List<EventRegistration> allRegs = erRepository.getAllEventRegistrations();
        for (EventRegistration allReg : allRegs) {
            if (allReg.getUserId().equals(userId)
                    && allReg.getEventId().equals(eventId)) {
                erRepository.deleteEventRegistration(allReg.getId());
                break;
            }
        }
    }

    @Override
    public List<User> getAllUsersOfEvent(Long eventId) throws Exception {
        //Implementation to get user list of an event
        List<User> users = new ArrayList<>();
        List<EventRegistration> allRegs = erRepository.getAllEventRegistrations();
        for (EventRegistration reg : allRegs) {
            if (reg.getEventId().equals(eventId)) {
                User user = userRepository.getUser(reg.getUserId());
                users.add(user);
            }
        }
        return users;
    }

    @Override
    public List<Event> getAllEventsOfUser(Long userId) throws Exception {
        // Implementation to get event list of a user
        List<Event> events = new ArrayList<>();
        List<EventRegistration> allRegs = erRepository.getAllEventRegistrations();
        for (EventRegistration reg : allRegs) {
            if (reg.getUserId().equals(userId)) {
                Event event = eventRepository.getEvent(reg.getEventId());
                events.add(event);
            }
        }
        return events;
    }

    @Override
    public void removeAllUsersFromEvent(Long eventId) throws Exception {
        // Implementation to remove all users from an event
        List<EventRegistration> allRegs = erRepository.getAllEventRegistrations();
        for (EventRegistration reg : allRegs) {
            if (reg.getEventId().equals(eventId)) {
                erRepository.deleteEventRegistration(reg.getId());
            }
        }
    }

    @Override
    public void removeAllEventsOfUser(Long userId) throws Exception {
        // Implementation to remove all events of a user
        List<EventRegistration> allRegs = erRepository.getAllEventRegistrations();
        for (EventRegistration reg : allRegs) {
            if (reg.getUserId().equals(userId)) {
                erRepository.deleteEventRegistration(reg.getId());
            }
        }
    }

    @Override
    public EventRegistration addEventRegistration(Long eventId, Long userId) throws Exception {
        // handle exception if any exception occurs
        try {
            EventRegistration er = new EventRegistration(eventId, userId);
            return er;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // throws exception
            throw e;
        }
    }
}
