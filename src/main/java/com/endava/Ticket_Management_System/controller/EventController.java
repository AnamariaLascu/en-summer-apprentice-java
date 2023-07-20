package com.endava.Ticket_Management_System.controller;


import com.endava.Ticket_Management_System.service.DTO.EventDTO;
import com.endava.Ticket_Management_System.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {
    private EventService eventService;
    @Autowired
    public EventController(EventService eventService){
        this.eventService = eventService;
    }

    @RequestMapping(value = "/find/{eventTypeName}", method = RequestMethod.GET)
    public EventDTO findByEventName(@PathVariable String eventTypeName){
        return eventService.findByEventName(eventTypeName);
    }

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<EventDTO> findAll(){
        return eventService.findAll();
    }
}