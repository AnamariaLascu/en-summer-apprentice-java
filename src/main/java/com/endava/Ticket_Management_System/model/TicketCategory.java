package com.endava.Ticket_Management_System.model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "TicketCategory")
public class TicketCategory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticketCategoryID;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "eventID")
    private Event event;

//    @OneToMany(mappedBy = "TicketCategory",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private List<Orders> ordersList;

    public TicketCategory() {
    }

    public TicketCategory(int ticketCategoryID, String description, BigDecimal price, Event event) {
        this.ticketCategoryID = ticketCategoryID;
        this.description = description;
        this.price = price;
        this.event = event;
    }

    public int getTicketCategoryID() {
        return ticketCategoryID;
    }

    public void setTicketCategoryID(int ticketCategoryID) {
        this.ticketCategoryID = ticketCategoryID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
