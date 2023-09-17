package com.example.eventmanagement.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.eventmanagement.model.Event;

@RunWith(MockitoJUnitRunner.class)
public class EventRepositoryTest {
    
    @InjectMocks
    private EventRepository eventRepository;

    // Write test cases for addEvent() method of EventRepository class.
    @Test
    public void testAddEvent() {
        // Write code here that verifies if the addEvent() method adds the event to the events list.
        Event expectedEvent = new Event("Event Name", "Event Description", new Date());
        Event actualEvent = eventRepository.addEvent(expectedEvent);
        assertNotNull(actualEvent);
        assertEquals(expectedEvent, actualEvent);
        assertEquals(1, eventRepository.getAllEvents().size());
    }

    // Write test cases for getAllEvents() method of EventRepository class.
    @Test
    public void testGetAllEvents(){
        // Write code here that verifies if the getAllEvents() method returns the list of events.
        Event expectedEvent = new Event("Event Name", "Event Description", new Date());
        eventRepository.addEvent(expectedEvent);
        List<Event> eventList = eventRepository.getAllEvents();
        assertEquals(1, eventList.size());
    }

    // Write test cases for updateEvent() method of EventRepository class.
    @Test
    public void testUpdateEvent(){
        // Write code here that verifies if the updateEvent() method updates the event based on given id.
        Event expectedEvent = new Event("Event Name", "Event Description", new Date());
        eventRepository.addEvent(expectedEvent);

        expectedEvent.setName("Event Name (Updated)");
        Event actualEvent = eventRepository.updateEvent(1L, expectedEvent);
        assertNotNull(actualEvent);
        assertEquals(expectedEvent.getName(), "Event Name (Updated)");
    }

    // write test cases for deleteEvent() method of EventRepository class.
    @Test
    public void testDeleteEvent(){
        // Write code here that verifies if the deleteEvent() method deletes the event based on given id.
        Event expectedEvent = new Event("Event Name", "Event Description", new Date());
        eventRepository.addEvent(expectedEvent);
        eventRepository.deleteEvent(1L);
        assertEquals(0, eventRepository.getAllEvents().size());
    }
}
