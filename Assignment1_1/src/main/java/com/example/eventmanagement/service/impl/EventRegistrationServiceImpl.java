package com.example.eventmanagement.service.impl;

import com.example.eventmanagement.service.EvenRegistrationtService;
import com.example.eventmanagement.repository.EventRepository;
import com.example.eventmanagement.repository.UserRepository;
import com.example.eventmanagement.model.Event;
import com.example.eventmanagement.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventRegistrationServiceImpl implements EvenRegistrationtService {

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
}
