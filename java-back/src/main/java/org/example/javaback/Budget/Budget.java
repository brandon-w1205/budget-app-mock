package org.example.javaback.Budget;

import jakarta.persistence.*;
// import org.example.javaback.Expense.Expense;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Set;

@Entity
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer amount;


    // @OneToMany(mappedBy="budget")
    // @OneToMany
    // private List<Expense> expenses = new ArrayList<>();

    // public List<Expense> getExpenses() {
    //     return expenses;
    // }

    // public void setExpenses(List<Expense> expenses) {
    //     this.expenses = expenses;
    // }

//    Time Class import
//    @ManyToOne
//    @JoinColumn(name = "time_id")
//    private Time time;


//    private ArrayList<Expense> expenses = new ArrayList<Expense>();

    public Budget() {

    }

   public Budget(Integer id, String name, Integer amount) {
    // public Budget(Integer id, String name, Integer amount, List<Expense> expenses) {
        super();
        this.id = id;
        this.name = name;
//        this.time = new Time(time_id, "", "");
        this.amount = amount;
        // this.expenses = expenses;
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
