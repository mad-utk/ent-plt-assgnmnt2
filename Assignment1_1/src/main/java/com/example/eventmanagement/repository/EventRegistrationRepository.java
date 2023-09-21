package com.example.eventmanagement.repository;

import com.example.eventmanagement.model.EventRegistration;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public EventRegistration getEventRegistrationByEventId(Long eventId) {
        // find eventRegistration based on given eventId and return it
        for (int i = 0; i < eventRegistrations.size(); i++) {
            if (eventRegistrations.get(i).getEventId().equals(eventId)) {
                return eventRegistrations.get(i);
            }
        }
        return null;
    }
}
