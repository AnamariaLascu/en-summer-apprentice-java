package com.endava.Ticket_Management_System.service;

import com.endava.Ticket_Management_System.model.Account;
import com.endava.Ticket_Management_System.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    //    @Autowired
    /*
    Field injection is discouraged since it makes the code harder to test and maintain
     */
    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
        System.out.println(accountRepository);
        System.out.println("Creating Account Service");
    }

    public String getAccount(String accountId){
        if(accountId.equals("0")){
            return "No information for this account";
        }
        Account account  = accountRepository.getAccount(accountId);
        if(account!= null){
            return account.toString();
        } else{
            return  "Account does not exist";
        }

    }

    public List<Account> getAccounts(){
        return accountRepository.getAccounts();
    }
}