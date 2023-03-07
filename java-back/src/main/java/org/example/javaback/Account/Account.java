package org.example.javaback.Account;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.ArrayList;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private int startingBalance;
    private int goal;
    private int expensesTotal;
//    Planned expenses class
//    private ArrayList<Expense> expenses = new ArrayList<Expense>();

    public Account() {

    }

    public Account(String username, int startingBalance, int goal, int expensesTotal) {
        super();
        this.username = username;
        this.startingBalance = startingBalance;
        this.goal = goal;
        this.expensesTotal = expensesTotal;
        this.id = id;
    }

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public int getStartingBalance() { return startingBalance; }

    public void setStartingBalance(int startingBalance) { this.startingBalance = startingBalance; }

    public int getGoal() { return goal; }

    public void setGoal(int goal) { this.goal = goal; }

    public int getExpensesTotal() { return expensesTotal; }

    public void setExpensesTotal(int expensesTotal) { this.expensesTotal = expensesTotal; }

}
