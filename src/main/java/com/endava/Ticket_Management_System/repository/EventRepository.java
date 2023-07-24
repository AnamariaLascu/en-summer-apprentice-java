package com.endava.Ticket_Management_System.repository;

import com.endava.Ticket_Management_System.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
    public interface EventRepository extends JpaRepository<Event,Integer> {
    Event findByEventName(String name);

    @Query("SELECT e FROM Event e WHERE e.venueID.id = :venueId AND e.eventTypeID.eventTypeName = :eventType")
    List<Event> findByVenueNameAndEventType(@Param("venueId") int venueId, @Param("eventType") String eventType);


}

