package org.example.javaback.Account;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;


//    GET method for all accounts
    @RequestMapping("/accounts")
    public List<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }

//    GET ONE method for one account by username
    @RequestMapping("/accounts/{username}")
    public Account getAccount(@PathVariable String username) {
       return accountService.getAccount(username);
    }

//    POST method to create one account
    @RequestMapping(method = RequestMethod.POST, value = "/accounts")
    public void addAccount(@RequestBody Account account) {
        accountService.addAccount(account);
    }

//    PUT method to edit an account's details
    @RequestMapping(method = RequestMethod.PUT, value = "/accounts")
    public void updateAccount(@RequestBody Account account) {
        accountService.updateAccount(account);
    }

//    DELETE method to delete an account by username. Can later change from front-end to request username and password before deletion
    @RequestMapping(method = RequestMethod.DELETE, value = "/accounts/{username}")
    public void deleteAccount(@PathVariable String username) {
        accountService.deleteAccount(username);
    }
}
