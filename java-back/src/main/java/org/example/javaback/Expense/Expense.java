package org.example.javaback.Expense;

import jakarta.persistence.*;
import org.example.javaback.Budget.Budget;

import java.util.ArrayList;

@Entity
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private ArrayList<String> format = new ArrayList<String>();
    private int amountNum;

    @ManyToOne
    @JoinColumn(name = "budget_id")
    private Budget budget;

    public Budget getBudget() { return budget; }

    public void setBudget(Budget budget) { this.budget = budget; }

    public Expense() {

    }

    public Expense(Integer id, String name, ArrayList<String> format, int amountNum, Integer budget_id) {
        super();
        this.id = id;
        this.name = name;
        this.format = format;
        this.amountNum = amountNum;
        this.budget = new Budget(budget_id, "", 0);
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

    public ArrayList<String> getFormat() {
        return format;
    }

    public void setFormat(ArrayList<String> format) {
        this.format = format;
    }

    public int getAmountNum() {
        return amountNum;
    }

    public void setAmountNum(int amountNum) {
        this.amountNum = amountNum;
    }



}
