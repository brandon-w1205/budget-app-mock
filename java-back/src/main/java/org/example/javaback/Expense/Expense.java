package org.example.javaback.Expense;

import jakarta.persistence.*;
import org.example.javaback.Budget.Budget;

// import java.util.ArrayList;
// import java.util.Set;

@Entity
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String format;
    private int amountNum;

    @ManyToOne
    @JoinColumn(name = "budget_id")
    private Budget budget;

    public Budget getBudget() { return budget; }

    public void setBudget(Budget budget) { this.budget = budget; }

    public Expense() {

    }

    public Expense(Integer id, String name, String format, int amountNum, Budget budget) {
        super();
        this.id = id;
        this.name = name;
        this.format = format;
        this.amountNum = amountNum;
        this.budget = budget;
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

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getAmountNum() {
        return amountNum;
    }

    public void setAmountNum(int amountNum) {
        this.amountNum = amountNum;
    }



}
