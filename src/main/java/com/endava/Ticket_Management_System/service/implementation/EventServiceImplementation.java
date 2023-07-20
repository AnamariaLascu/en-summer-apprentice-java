package com.endava.Ticket_Management_System.service.implementation;

import com.endava.Ticket_Management_System.model.Event;
import com.endava.Ticket_Management_System.repository.EventRepository;
import com.endava.Ticket_Management_System.service.DTO.EventDTO;
import com.endava.Ticket_Management_System.service.EventService;
import com.endava.Ticket_Management_System.service.mapper.EventMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;

//import com.endava.Ticket_Management_System.model.Event;
//import com.endava.Ticket_Management_System.model.EventType;
//import com.endava.Ticket_Management_System.repository.EventRepository;
////import com.endava.Ticket_Management_System.service.DTO.EventDTO;
//import com.endava.Ticket_Management_System.service.EventService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//@Service
//public class EventServiceImplementation implements EventService {
//    @Autowired
//    private EventRepository eventRepository;
////    @Autowired
////    private LocationService locationService;
//
//    @Override
//    public List<Event> getEventsByLocationIDAndEventType(int locationID, String eventType){
//
//        return eventRepository.findAllByLocationAndByEventType(locationID, eventType);
//    }
//
//    /**
//     * @return
//     */
//    @Override
//    public List<Event> getAll() {
//        return eventRepository.findAll();
//    }
//    private final EventRepository eventRepository;
//
//    @Autowired
//    public EventServiceImplementation(EventRepository eventRepository) {
//        this.eventRepository = eventRepository;
//    }
//
//    @Override
//    public List<Event> getAllEvents() {
//        return eventRepository.findAll();
//    }
//
//    @Override
//    public Event getEventById(int id) {
//        return eventRepository.findById(id).orElse(null);
//    }
//@Service
//public class EventServiceImplementation implements EventService {
//
//    private final EventRepository eventRepository;
//
//    @Autowired
//    public EventServiceImplementation(EventRepository eventRepository) {
//        this.eventRepository = eventRepository;
//    }
//
//    @Override
//    public List<Event> getEventsByVenueIdAndEventTypeName(int venueID, String eventTypeName) {
//        return eventRepository.findByVenueIdAndEventTypeName(venueID, eventTypeName);
//    }
//}

@Service
public class EventServiceImplementation implements EventService{

    private EventRepository eventRepository;
    @Autowired
    public EventServiceImplementation(EventRepository eventRepository){
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
}