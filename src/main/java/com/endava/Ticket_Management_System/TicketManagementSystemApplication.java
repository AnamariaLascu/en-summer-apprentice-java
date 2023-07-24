package com.endava.Ticket_Management_System;

//import com.endava.Ticket_Management_System.model.Account;
//import com.endava.Ticket_Management_System.service.AccountService;
import com.endava.Ticket_Management_System.model.Account;
import com.endava.Ticket_Management_System.service.AccountService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TicketManagementSystemApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(TicketManagementSystemApplication.class, args);
		//Not a bean, I need to instantiate myself with new
		Account account = new Account("012");
		System.out.println(account);

		//a bean, so I just get it from the context
		AccountService as1 = context.getBean(AccountService.class);
		AccountService as2 = context.getBean(AccountService.class);
		System.out.println(as1.toString());
		System.out.println(as2.toString());
	}

}
