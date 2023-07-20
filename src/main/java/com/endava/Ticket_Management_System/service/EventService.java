package com.endava.Ticket_Management_System.service;

import com.endava.Ticket_Management_System.model.Event;
import com.endava.Ticket_Management_System.service.DTO.EventDTO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public interface EventService {
    public EventDTO findByEventName(String name);
    public List<EventDTO> findAll();
}

