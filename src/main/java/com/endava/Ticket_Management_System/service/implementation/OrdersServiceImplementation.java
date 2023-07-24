package com.endava.Ticket_Management_System.service.implementation;

import com.endava.Ticket_Management_System.model.Orders;
import com.endava.Ticket_Management_System.repository.OrdersRepository;
import com.endava.Ticket_Management_System.service.DTO.OrdersDTO;
import com.endava.Ticket_Management_System.service.OrdersService;
import com.endava.Ticket_Management_System.service.mapper.OrdersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class OrdersServiceImplementation implements OrdersService {
    private OrdersRepository ordersRepository;

    @Autowired
    public OrdersServiceImplementation(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    public List<OrdersDTO> findByNumberOfTickets(int numberOfTickets) {
        return ordersRepository.findByNumberOfTickets(numberOfTickets).stream().map(OrdersMapper::converter).collect(Collectors.toList());
    }

    public List<OrdersDTO> findAll() {
        return ordersRepository.findAll().stream().map(OrdersMapper::converter).collect(Collectors.toList());
    }
//    @Override
//    public List<Orders> DisplayOrders(int custumerID){
//        return ordersRepository.findByCustomerID(custumerID);
//    }

//    @Override
//    public Orders registerOrder(OrdersRequest ordersRequest){
//        TicketCategory ticketCategory = ticketCategoryRepository.findByTicketCategoryID(ordersRequest.getTicketCategoryID());
//        BigDecimal intToBigDecimalNumberOfTickets = BigDecimal.valueOf(ordersRequest.getNumberOfTickets());
//        BigDecimal totalPrice = ticketCategory.getPrice().multiply(intToBigDecimalNumberOfTickets);
//        Orders order = new Orders(customerRepository.findCustomerByCustomerID(5),ticketCategory,new Date(),ordersRequest.getNumberOfTickets(),totalPrice);
//        return ordersRepository.save(order);
//    }


    public OrdersDTO create(OrdersDTO ordersDTO) {
        Orders order = new Orders();
        order.setNumberOfTickets(ordersDTO.getNumberOfTickets());
        order.setTicketCategoryID(ordersDTO.getTicketCategory());
        return OrdersMapper.converter(order);

    }
}