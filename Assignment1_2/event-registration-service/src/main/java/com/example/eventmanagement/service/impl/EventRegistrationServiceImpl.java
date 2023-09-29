package com.example.eventmanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eventmanagement.model.EventRegistration;
import com.example.eventmanagement.repository.EventRegistrationRepository;
import com.example.eventmanagement.service.EventRegistrationService;

@Service
public class EventRegistrationServiceImpl implements EventRegistrationService {

    @Autowired
    private EventRegistrationRepository eventRegistrationRepository;

    public EventRegistration addEventRegistration(EventRegistration eventRegistration) throws Exception {
        // handle exception if any exception occurs
        try {
            return eventRegistrationRepository.addEventRegistration(eventRegistration);
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
            return eventRegistrationRepository.getAllEventRegistrations();
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
            return eventRegistrationRepository.updateEventRegistration(id, er);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // throws exception
            throw e;
        }
    }

    @Override
    public String deleteEventRegistration(Long id) throws Exception {
        try {
            eventRegistrationRepository.deleteEventRegistration(id);
            return "EventRegistration deleted successfully";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // throws exception
            throw e;
        }
    }

}
