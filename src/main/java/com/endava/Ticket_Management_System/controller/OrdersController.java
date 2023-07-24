package com.endava.Ticket_Management_System.controller;

import com.endava.Ticket_Management_System.service.DTO.OrdersDTO;
import com.endava.Ticket_Management_System.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;
    @Autowired
    OrdersController(OrdersService ordersService){
        this.ordersService = ordersService;
    }

    @RequestMapping(value = "/find/{numberOfTickets}",method = RequestMethod.GET)
    public List<OrdersDTO> findByNumberOfTickets(@PathVariable int numberOfTickets)
    {return ordersService.findByNumberOfTickets(numberOfTickets);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<OrdersDTO> findAll()
    {return ordersService.findAll();
    }

    @PostMapping("/create")
    public ResponseEntity<OrdersDTO> create(@RequestBody OrdersDTO ordersDTO){
        OrdersDTO savedOrdersDTO = ordersService.create(ordersDTO);
        return ResponseEntity.ok(savedOrdersDTO);
    }
 }
