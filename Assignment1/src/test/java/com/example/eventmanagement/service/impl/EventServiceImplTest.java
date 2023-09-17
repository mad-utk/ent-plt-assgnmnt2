package com.example.eventmanagement.service.impl;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.eventmanagement.model.Event;
import com.example.eventmanagement.repository.EventRepository;

@RunWith(MockitoJUnitRunner.class)
public class EventServiceImplTest {
    
    @InjectMocks
    private EventServiceImpl eventServiceImpl;

    @Spy
    private EventRepository eventRepository = new EventRepository();

    // write a test cases to verify that the event is added successfully
    @Test
    public void testAddEvent() throws Exception {
        // create dummy event
        Event expectedEvent = new Event("Event Name", "Event Description", new Date());
        Event actualEvent = eventServiceImpl.addEvent(expectedEvent);
        assertEquals(expectedEvent, actualEvent);
    }

    // write a test cases to verify if exception occurs while adding event
    @Test
    public void testAddEventThrowsException() throws Exception {
        try {
            // create dummy event
            Event expectedEvent = new Event("Event Name", "Event Description", new Date());
            doThrow(new RuntimeException()).when(eventRepository).addEvent(expectedEvent);
            Event actualEvent = eventServiceImpl.addEvent(expectedEvent);
            assertNull(actualEvent);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            assertTrue(true);
        }
    }

    // write a test cases to verify that the all events are fetched successfully
    @Test
    public void testGetAllEvents() throws Exception {
        // create list of dummy event
        // add dummy events to the list
        List<Event> expectedEvents = new ArrayList<>();
        {
            Event expectedEvent = new Event("Event Name", "Event Description", new Date());
            expectedEvents.add(expectedEvent);
        }
        doReturn(expectedEvents).when(eventRepository).getAllEvents();
        List<Event> actualEvents = eventServiceImpl.getAllEvents();
        assertNotNull(actualEvents);
        assertEquals(expectedEvents.size(), actualEvents.size());
    }

    // write a test cases to verify that exception occurs while fetching all events
    @Test
    public void testGetAllEventsThrowsException() throws Exception {
        // create list of dummy event
        // add dummy events to the list
        // enclose the code in try catch block
        try {
            List<Event> expectedEvents = new ArrayList<>();
            {
                Event expectedEvent = new Event("Event Name", "Event Description", new Date());
                expectedEvents.add(expectedEvent);
            }
            doThrow(new RuntimeException()).when(eventRepository).getAllEvents();
            List<Event> actualEvents = eventServiceImpl.getAllEvents();
            assertNull(actualEvents);
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    // write a test cases to verify that the event is updated successfully
    @Test
    public void testUpdateEvent() throws Exception {
        // add event to the repository
        Event event = new Event("Event Name", "Event Description", new Date());
        eventServiceImpl.addEvent(event);

        // update the event
        Event updatedEvent = new Event("Event Name (Updated)", "Event Description (Updated)", new Date());
        Event actualEvent = eventServiceImpl.updateEvent(1L, updatedEvent);
        assertEquals("Event Name (Updated)", actualEvent.getName());
    }

    // write a test cases to verify that exception occurs while updating event
    @Test
    public void testUpdateEventThrowsException() throws Exception {
        try {
            // add event to the repository
            Event event = new Event("Event Name", "Event Description", new Date());
            eventServiceImpl.addEvent(event);

            // update the event
            Event updatedEvent = new Event("Event Name (Updated)", "Event Description (Updated)", new Date());
            doThrow(new RuntimeException()).when(eventRepository).updateEvent(1L, updatedEvent);
            Event actualEvent = eventServiceImpl.updateEvent(1L, updatedEvent);
            assertNull(actualEvent);
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    // write a test cases to verify that the event is deleted successfully
    @Test
    public void testDeleteEvent() throws Exception {
        // add event to the repository
        Event event = new Event("Event Name", "Event Description", new Date());
        eventServiceImpl.addEvent(event);

        // delete the event
        eventServiceImpl.deleteEvent(1L);
        List<Event> actualEvents = eventServiceImpl.getAllEvents();
        assertEquals(0, actualEvents.size());
    }

    // write a test cases to verify that exception occurs while deleting event
    @Test
    public void testDeleteEventThrowsException() throws Exception {
        try {
            // add event to the repository
            Event event = new Event("Event Name", "Event Description", new Date());
            eventServiceImpl.addEvent(event);

            // delete the event
            doThrow(new RuntimeException()).when(eventRepository).deleteEvent(1L);
            eventServiceImpl.deleteEvent(1L);
            List<Event> actualEvents = eventServiceImpl.getAllEvents();
            assertNull(actualEvents);
        } catch (Exception e) {
            assertTrue(true);
        }
    }
}
