package com.example.eventmanagement.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EventTest {
    
    // Write test cases for getters and setters of id, name, description and dateTime fields.

    @Test
    public void testSetIdAndGetId() {
        // Write code here that verifies if the getId() method returns the id field value.
        Event event = new Event("Event Name", "Event Description", new Date());
        event.setId(1L);

        assertNotNull(event.getId());
    }

    @Test
    public void testSetNameAndGetName() {
        // Write code here that verifies if the getId() method returns the id field value.
        Event event = new Event("Event Name", "Event Description", new Date());
        event.setId(1L);

        assertEquals("Event Name", event.getName());

        event.setName("Event Name (Updated)");
        assertEquals("Event Name (Updated)", event.getName());
    }

    @Test
    public void testSetDescriptionAndGetDescription() {
        // Write code here that verifies if the getId() method returns the id field value.
        Event event = new Event("Event Name", "Event Description", new Date());
        event.setId(1L);

        assertEquals("Event Description", event.getDescription());

        event.setDescription("Event Description (Updated)");
        assertEquals("Event Description (Updated)", event.getDescription());
    }

    @Test
    public void testSetDateAndGetDate() {
        // Write code here that verifies if the getId() method returns the id field value.
        Date date = new Date();
        Event event = new Event("Event Name", "Event Description", date);

        assertEquals(date, event.getDateTime());

        Date updatedDate = new Date();
        event.setDateTime(updatedDate);
        assertEquals(updatedDate, event.getDateTime());
    }

    // test constructor with 3 parameters
    @Test
    public void testConstructorWith3Parameters() {
        // Write code here that verifies if the getId() method returns the id field value.
        Date date = new Date();
        Event event = new Event("Event Name", "Event Description", date);

        assertEquals("Event Name", event.getName());
        assertEquals("Event Description", event.getDescription());
        assertEquals(date, event.getDateTime());
    }
}
