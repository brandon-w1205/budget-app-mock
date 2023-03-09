package org.example.javaback.Expense;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.ArrayList;

@Entity
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private ArrayList<String> format = new ArrayList<String>();
    private int amountNum;

    public Expense() {

    }

    public Expense(Integer id, String name, ArrayList<String> format, int amountNum) {
        super();
        this.id = id;
        this.name = name;
        this.format = format;
        this.amountNum = amountNum;
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
