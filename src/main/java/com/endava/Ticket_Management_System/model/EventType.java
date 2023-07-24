package com.endava.Ticket_Management_System.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "EventType")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EventType implements Serializable {
    @Id
    @Column(name = "eventTypeID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eventTypeID;

    @Column(name = "eventTypeName")
    private String eventTypeName;

}
