package org.example.javaback.Account;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

//    GET method for all accounts
    public List<Account> getAllAccounts() {
        List<Account> accounts = new ArrayList<>();
        accountRepository.findAll().forEach(accounts::add);
//        List<Course> courses = new ArrayList<>(courseRepository.findByTopicId(topic_id));
        return accounts;
    }

//    GET ONE method for one account
    public Account getAccount(String username) {
        Account anAccount = new Account();
        for(Account account : getAllAccounts()) {
            if(username.equals(account.getUsername())) {
                anAccount = account;
            }
        }
        return anAccount;
    }

//    POST method to create a new account
    public void addAccount(Account account) {
        accountRepository.save(account);
    }

//    PUT method to edit an account
    public void updateAccount(Account account) {
        accountRepository.save(account);
    }

//    DELETE method to delete an account
    public void deleteAccount(String username) {
        getAllAccounts().removeIf(account -> account.getUsername().equals(username));
    }
}
