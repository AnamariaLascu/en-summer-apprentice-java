package com.endava.Ticket_Management_System.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Customer")
public class Customer implements Serializable {

    @Id
    @Column(name = "customerID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customer_id;

    @Column(name = "customerName", length = 70)
    private String customer_name;

    @Column(name = "email", length = 70)
    private String email;

    public Customer() {
    }

    public Customer(int customer_id, String customer_name, String email) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.email = email;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public String getEmail() {
        return email;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

