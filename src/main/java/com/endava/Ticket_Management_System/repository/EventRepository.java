package com.endava.Ticket_Management_System.repository;

import com.endava.Ticket_Management_System.model.Event;
import com.endava.Ticket_Management_System.model.EventType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
    public interface EventRepository extends JpaRepository<Event,Long> {
        public Event findByEventName(String name);
    }

