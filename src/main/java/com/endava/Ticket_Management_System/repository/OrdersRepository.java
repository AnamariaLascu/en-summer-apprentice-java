package com.endava.Ticket_Management_System.repository;

import com.endava.Ticket_Management_System.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository <Orders, Integer>{
   @Query("SELECT o FROM Orders o WHERE o.numberOfTickets = :numberOfTickets")
   List<Orders> findByNumberOfTickets(@Param("numberOfTickets") int numberOfTickets);
}
