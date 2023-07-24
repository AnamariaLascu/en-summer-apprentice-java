package com.endava.Ticket_Management_System.service.DTO;

import com.endava.Ticket_Management_System.model.Customer;
import com.endava.Ticket_Management_System.model.TicketCategory;

import java.math.BigDecimal;
import java.util.Date;

public class OrdersDTO {
    private int orderID;
    private Date orderedAt;
    private int numberOfTickets;
    private BigDecimal totalPrice;
    private Customer customer;
    private TicketCategory ticketCategory;

    public OrdersDTO(int orderID, Date orderedAt, int numberOfTickets, BigDecimal totalPrice, Customer customer, TicketCategory ticketCategory) {
        this.orderID = orderID;
        this.orderedAt = orderedAt;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
        this.customer = customer;
        this.ticketCategory = ticketCategory;
    }

    public OrdersDTO() {
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Date getOrderedAt() {
        return orderedAt;
    }

    public void setOrderedAt(Date orderedAt) {
        this.orderedAt = orderedAt;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public TicketCategory getTicketCategory() {
        return ticketCategory;
    }

    public void setTicketCategory(TicketCategory ticketCategory) {
        this.ticketCategory = ticketCategory;
    }
}
