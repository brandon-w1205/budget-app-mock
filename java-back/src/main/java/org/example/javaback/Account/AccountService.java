package org.example.javaback.Account;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public List<Account> getAllAccounts() {
        List<Account> accounts = new ArrayList<>();
        accountRepository.findAll().forEach(accounts::add);
//        List<Course> courses = new ArrayList<>(courseRepository.findByTopicId(topic_id));
        return accounts;
    }

    public void addAccount(Account account) {
        accountRepository.save(account);
    }
}
