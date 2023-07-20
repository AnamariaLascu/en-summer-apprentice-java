package com.endava.Ticket_Management_System.service.mapper;

import com.endava.Ticket_Management_System.model.Event;
import com.endava.Ticket_Management_System.service.DTO.EventDTO;

public class EventMapper {
     public static EventDTO converter(Event event){
        EventDTO eventDTO = new EventDTO();
        eventDTO.setEventDTOID(event.getEventID());
        eventDTO.setEventDescription(event.getEventDescription());
        eventDTO.setEventName(event.getEventName());
        eventDTO.setEventStartDate(event.getStartDate());
        eventDTO.setGetEventEndDate(event.getEndDate());
        eventDTO.setVenue(event.getVenueID());
        eventDTO.setEventType(event.getEventTypeID());
        return eventDTO;
    }
    }

