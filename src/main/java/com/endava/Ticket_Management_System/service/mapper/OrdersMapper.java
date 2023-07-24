package com.endava.Ticket_Management_System.service.mapper;

import com.endava.Ticket_Management_System.model.Orders;
import com.endava.Ticket_Management_System.service.DTO.OrdersDTO;

public class OrdersMapper {
public static OrdersDTO converter(Orders order){
        OrdersDTO ordersDTO = new OrdersDTO();
        ordersDTO.setOrderID(order.getOrderID());
        ordersDTO.setOrderedAt(order.getOrderedAt());
        ordersDTO.setNumberOfTickets(order.getNumberOfTickets());
        ordersDTO.setTotalPrice(order.getTotalPrice());
        ordersDTO.setCustomer(order.getCustomerID());
        ordersDTO.setTicketCategory(order.getTicketCategoryID());
        return ordersDTO;
        }
}
