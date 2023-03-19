package org.example.javaback.Budget;

import jakarta.persistence.*;
import org.example.javaback.Expense.Expense;

import java.util.ArrayList;
import java.util.Set;

@Entity
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer amount;


    @OneToMany
    private Set<Expense> expenses;

    public Set<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(Set<Expense> expenses) {
        this.expenses = expenses;
    }

//    Time Class import
//    @ManyToOne
//    @JoinColumn(name = "time_id")
//    private Time time;


//    private ArrayList<Expense> expenses = new ArrayList<Expense>();

    public Budget() {

    }

//    public Budget(String name, Integer time_id, Integer amount) {
    public Budget(Integer id, String name, Integer amount) {
        super();
        this.id = id;
        this.name = name;
//        this.time = new Time(time_id, "", "");
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }



}
