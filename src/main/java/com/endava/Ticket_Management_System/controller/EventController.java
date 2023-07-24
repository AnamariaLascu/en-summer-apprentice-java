package com.endava.Ticket_Management_System.controller;
import com.endava.Ticket_Management_System.model.Event;
import com.endava.Ticket_Management_System.model.Venue;
import com.endava.Ticket_Management_System.service.DTO.EventDTO;
import com.endava.Ticket_Management_System.service.EventService;
import com.endava.Ticket_Management_System.service.implementation.EventServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {
    private EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

//    @RequestMapping(value = "/find/{eventName}", method = RequestMethod.GET)
//    public EventDTO findByEventName(@PathVariable String eventName) {
//        return eventService.findByEventName(eventName);
//    }

//    @RequestMapping(value = "/all", method = RequestMethod.GET)
//    public List<EventDTO> findAll() {
//        return eventService.findAll();
//    }
@GetMapping()
public ResponseEntity<List<EventDTO>> getEventsByVenueIdAndEventTypeName(
        @RequestParam("venueId") int venueId,
        @RequestParam("eventType") String eventType) {
    List<EventDTO> events = eventService.findByVenueNameAndEventType(venueId, eventType);
    if (events.isEmpty()) {
        return ResponseEntity.noContent().build();
    } else {
        return ResponseEntity.ok(events);
    }
}
    }


//    @GetMapping("/events")
//    public ResponseEntity<List<EventDTO>> getEventsByVenueIdAndEventTypeName(
//            @RequestParam("venueId") int venueId,
//            @RequestParam("eventType") String eventType) {
//        List<EventDTO> events = eventService.findByVenueNameAndEventType(venueId, eventType);
//        if (events.isEmpty()) {
//            return ResponseEntity.noContent().build();
//        } else {
//            return ResponseEntity.ok(events);
//        }
//    }


