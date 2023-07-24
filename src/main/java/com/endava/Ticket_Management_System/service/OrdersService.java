package com.endava.Ticket_Management_System.service;

import com.endava.Ticket_Management_System.model.Orders;
import com.endava.Ticket_Management_System.service.DTO.OrdersDTO;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface OrdersService {
public List<OrdersDTO> findByNumberOfTickets(int numberOfTickets);
public List<OrdersDTO> findAll();
public  OrdersDTO create(OrdersDTO ordersDTO);

}
