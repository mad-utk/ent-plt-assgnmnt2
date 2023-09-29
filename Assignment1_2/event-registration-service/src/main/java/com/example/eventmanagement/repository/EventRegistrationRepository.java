package com.example.eventmanagement.repository;

import com.example.eventmanagement.model.EventRegistration;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EventRegistrationRepository {
    
    // I want to keep auto increment id for every registration
    private Long id = 0L;
    private List<EventRegistration> eventRegistrations = new ArrayList<>();

    public EventRegistration addEventRegistration(EventRegistration eventRegistration) {
        eventRegistration.setId(++id);
        eventRegistrations.add(eventRegistration);
        return eventRegistration;
    }

    public List<EventRegistration> getAllEventRegistrations() {
        return eventRegistrations;
    }

    public EventRegistration updateEventRegistration(Long id, EventRegistration eventRegistration) {
        eventRegistration.setId(id);
        for (int i = 0; i < eventRegistrations.size(); i++) {
            if (eventRegistrations.get(i).getId().equals(id)) {
                eventRegistrations.set(i, eventRegistration);
                return eventRegistration;
            }
        }
        return null;
    }

    public void deleteEventRegistration(Long id) {
        // find eventRegistration based on given id and delete it
        for (int i = 0; i < eventRegistrations.size(); i++) {
            if (eventRegistrations.get(i).getId().equals(id)) {
                eventRegistrations.remove(i);
                break;
            }
        }
    }

}
