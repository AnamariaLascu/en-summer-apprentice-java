package com.endava.Ticket_Management_System.service.implementation;

import com.endava.Ticket_Management_System.repository.EventRepository;
import com.endava.Ticket_Management_System.service.DTO.EventDTO;
import com.endava.Ticket_Management_System.service.EventService;
import com.endava.Ticket_Management_System.service.mapper.EventMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventServiceImplementation implements EventService {

    private EventRepository eventRepository;

    @Autowired
    public EventServiceImplementation(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public EventDTO findByEventName(String eventName) {
        return EventMapper.converter(eventRepository.findByEventName(eventName));
    }


    @Override
    public List<EventDTO> findAll() {
        return eventRepository.findAll().stream().map(EventMapper::converter).collect(Collectors.toList());
    }

    @Override
    public List<EventDTO> findByVenueNameAndEventType(int venueId, String eventType) {
        return eventRepository.findByVenueNameAndEventType(venueId, eventType).stream().map(EventMapper::converter).collect(Collectors.toList());
    }
}
