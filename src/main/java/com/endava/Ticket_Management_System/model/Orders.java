package com.endava.Ticket_Management_System.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "Orders")
public class Orders implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderID;

    @ManyToOne
    @JoinColumn(name = "customerID")
    private Customer customerID;

    @ManyToOne
    @JoinColumn(name = "ticketCategoryID")
    private TicketCategory ticketCategoryID;

    @Column(name = "orderedAt")
    private LocalDateTime orderedAt;

    @Column(name = "numberOfTickets")
    private int numberOfTickets;

    @Column(name = "totalPrice")
    private BigDecimal totalPrice;

    public Orders() {
    }

    public Orders(int orderID, Customer customerID, TicketCategory ticketCategoryID, LocalDateTime orderedAt, int numberOfTickets, BigDecimal totalPrice) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.ticketCategoryID = ticketCategoryID;
        this.orderedAt = orderedAt;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }

    public int getOrderID() {
        return orderID;
    }

    public Customer getCustomerID() {
        return customerID;
    }

    public TicketCategory getTicketCategoryID() {
        return ticketCategoryID;
    }

    public LocalDateTime getOrderedAt() {
        return orderedAt;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public void setCustomerID(Customer customerID) {
        this.customerID = customerID;
    }

    public void setTicketCategoryID(TicketCategory ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public void setOrderedAt(LocalDateTime orderedAt) {
        this.orderedAt = orderedAt;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
}