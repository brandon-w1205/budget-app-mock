package org.example.javaback.Budget;

import jakarta.persistence.*;
import org.example.javaback.Expense.Expense;

import java.util.ArrayList;

@Entity
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer amount;


//    Time Class import
//    @ManyToOne
//    @JoinColumn(name = "time_id")
//    private Time time;

//    Expense class import
    @ManyToOne
    @JoinColumn(name = "expense_id")
    private Expense expense;

    public Expense getExpense() { return expense; }

    public void setExpense(Expense expense) { this.expense = expense; }


//    private ArrayList<Expense> expenses = new ArrayList<Expense>();

    public Budget() {

    }

    public Budget(String name, Integer time_id, Integer amount, Integer expense_id) {
        super();
        this.id = id;
        this.name = name;
//        this.time = new Time(time_id, "", "");
        this.amount = amount;
        this.expense = new Expense(expense_id, "", new ArrayList<>(), 0);

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
