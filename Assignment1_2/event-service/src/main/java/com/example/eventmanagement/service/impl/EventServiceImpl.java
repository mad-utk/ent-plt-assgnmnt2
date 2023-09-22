package com.example.eventmanagement.service.impl;

import com.example.eventmanagement.model.Event;
import com.example.eventmanagement.repository.EventRepository;
import com.example.eventmanagement.service.EventService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository eventRepository;

    public Event addEvent(Event event) throws Exception {
        // handle exception if any exception occurs
        try {
            return eventRepository.addEvent(event);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // throws exception
            throw e;
        }
    }

    public List<Event> getAllEvents() throws Exception {
        // handle exception if any exception occurs
        try {
            return eventRepository.getAllEvents();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // throws exception
            throw e;
        }
    }

    public Event updateEvent(Long id, Event event) throws Exception {
        // handle exception if any exception occurs
        try {
            return eventRepository.updateEvent(id, event);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // throws exception
            throw e;
        }
    }

    public String deleteEvent(Long id) throws Exception {
        // handle exception if any exception occurs
        // return string "Event deleted successfully" if event is deleted successfully
        try {
            eventRepository.deleteEvent(id);
            return "Event deleted successfully";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // throws exception
            throw e;
        }
    }
}
