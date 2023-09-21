package com.example.eventmanagement.repository;

import com.example.eventmanagement.model.EventRegistration;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Repository
public class EventRegistrationRepository {
    
    // I want to keep auto increment id for every registration
    private Long id = 0L;
    private List<EventRegistration> eventRegistrations = new ArrayList<>();
    private Map<String, List> registrations = new HashMap<>();

    public EventRegistration addEventRegistration(EventRegistration er) {
        er.setId(++id);
        eventRegistrations.add(er);
        return er;
    }

    public List<EventRegistration> getAllEventRegistrations() {
        return eventRegistrations;
    }

    public EventRegistration updateEventRegistration(Long id, EventRegistration er) {
        // find eventRegistration based on given id and replace it with new eventRegistration. Also, set id for new eventRegistration.
        er.setId(id);
        for (int i = 0; i < eventRegistrations.size(); i++) {
            if (eventRegistrations.get(i).getId().equals(id)) {
                eventRegistrations.set(i, er);
                return er;
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

    public List<EventRegistration> getEventRegistrationByEventId(Long eventId) {
        // find eventRegistration based on given eventId and return list of eventRegistration
        List<EventRegistration> eventRegistrations = new ArrayList<>();
        for (int i = 0; i < eventRegistrations.size(); i++) {
            if (eventRegistrations.get(i).getEventId().equals(eventId)) {
                eventRegistrations.add(EventRegistrations.get(i));
            }
        }
        return eventRegistrations;
    }
}
