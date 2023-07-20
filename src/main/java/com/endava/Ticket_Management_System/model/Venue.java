package com.endava.Ticket_Management_System.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Venue")
public class Venue implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int venueID;

    @Column(name = "location")
    private String location;

    @Column(name = "type")
    private String type;

    @Column(name = "capacity")
    private int capacity;

    public Venue() {
    }

    public Venue(int venue_id, String location, String type, int capacity) {
        this.venueID = venue_id;
        this.location = location;
        this.type = type;
        this.capacity = capacity;
    }

    public int getVenue_id() {
        return venueID;
    }

    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setVenue_id(int venueID) {
        this.venueID = venueID;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
