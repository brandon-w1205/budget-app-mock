package org.example.javaback.Account;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int startingBalance;
    private int goal;
    private int expenses;

    public Account(int startingBalance, int goal, int expenses) {

    }

}
