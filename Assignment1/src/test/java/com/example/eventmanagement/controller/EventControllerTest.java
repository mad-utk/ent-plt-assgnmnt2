package com.example.eventmanagement.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.doReturn;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.eventmanagement.model.Event;
import com.example.eventmanagement.service.EventService;

@RunWith(MockitoJUnitRunner.class)
public class EventControllerTest {

    @InjectMocks
    private EventController eventController;

    @Mock
    private EventService eventService;

    // Write test cases for addEvent() method of EventController class.
    @Test
    public void testAddEvent() throws Exception {
        Event event = new Event("Event Name", "Event Description", new Date());
        doReturn(event).when(eventService).addEvent(event);
        Event result = eventController.addEvent(event);
        assertNotNull(result);
    }

    // Write test cases for getAllEvents() method of EventController class.
    @Test
    public void testGetAllEvents() throws Exception {
        Event event = new Event("Event Name", "Event Description", new Date());
        List<Event> events = new ArrayList<>();
        events.add(event);

        doReturn(events).when(eventService).getAllEvents();
        List<Event> result = eventController.getAllEvents();
        assertNotNull(result);
    }

    // Write test cases for updateEvent() method of EventController class.
    @Test
    public void testUpdateEvent() throws Exception {
        Event event = new Event("Event Name", "Event Description", new Date());

        doReturn(event).when(eventService).updateEvent(1L, event);
        Event result = eventController.updateEvent(1L, event);
        assertNotNull(result);
    }

    // Write test cases for deleteEvent() method of EventController class.
    @Test
    public void testDeleteEvent() throws Exception {
        doReturn("Event Deleted Successfully").when(eventService).deleteEvent(1L);
        String result = eventController.deleteEvent(1L);
        assertNotNull(result);
    }
}
