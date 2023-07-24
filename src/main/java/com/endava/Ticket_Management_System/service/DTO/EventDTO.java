package com.endava.Ticket_Management_System.service.DTO;
import com.endava.Ticket_Management_System.model.EventType;
import com.endava.Ticket_Management_System.model.Venue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;
@JsonSerialize
public class EventDTO {
    public EventDTO(){}
    private int eventDTOID;
    private String eventDescription;
    private String eventName;
    private Date eventStartDate;
    private Date eventEndDate;
    private Venue venue;
    private EventType eventType;

    public EventDTO(int eventDTOID, String eventDescription, String eventName, Date eventStartDate, Date eventEndDate, Venue venue, EventType eventType) {
        this.eventDTOID = eventDTOID;
        this.eventDescription = eventDescription;
        this.eventName = eventName;
        this.eventStartDate = eventStartDate;
        this.eventEndDate = eventEndDate;
        this.venue = venue;
        this.eventType = eventType;
    }

    public int getEventDTOID() {
        return eventDTOID;
    }

    public void setEventDTOID(int eventDTOID) {
        this.eventDTOID = eventDTOID;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getEventStartDate() {
        return eventStartDate;
    }

    public void setEventStartDate(Date eventStartDate) {
        this.eventStartDate = eventStartDate;
    }

    public Date getEventEndDate() {
        return eventEndDate;
    }

    public void setEventEndDate(Date eventEndDate) {
        this.eventEndDate = eventEndDate;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }
}
