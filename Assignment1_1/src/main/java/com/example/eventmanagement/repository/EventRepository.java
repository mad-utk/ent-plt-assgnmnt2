package com.example.eventmanagement.repository;

import com.example.eventmanagement.model.Event;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Repository
public class EventRepository {
    
    // I want to keep auto increment id for every event
    private Long id = 0L;
    private List<Event> events = new ArrayList<>();

    public Event addEvent(Event event) {
        event.setId(++id);
        events.add(event);
        events.sort(Comparator.comparing(Event::getName));
        return event;
    }

    public List<Event> getAllEvents() {
        return events;
    }

    public Event updateEvent(Long id, Event event) {
        // find event based on given id and replace it with new event. Also, set id for new event.
        event.setId(id);
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getId().equals(id)) {
                events.set(i, event);
                return event;
            }
        }
        return null;
    }

    public void deleteEvent(Long id) {
        // find event based on given id and delete it
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getId().equals(id)) {
                events.remove(i);
                break;
            }
        }
    }
}
