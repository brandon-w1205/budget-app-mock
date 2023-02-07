package org.example.javaback.Account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;



    @RequestMapping("/accounts")
    public List<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/accounts")
    public void addAccount(@RequestBody Account account) {
        accountService.addAccount(account);
    }
}
