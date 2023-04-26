package org.example.javaback.Budget;

import java.util.List;
// import java.util.Optional;
import java.util.ArrayList;

// import org.example.javaback.Expense.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BudgetService {

    @Autowired
    private BudgetRepository budgetRepository;

//    GET method for all budgets
    public List<Budget> getAllBudgets() {
        List<Budget> budgets = new ArrayList<>();
        budgetRepository.findAll().forEach(budgets::add);
        return budgets;
    }

//    GET ONE method for one account
    public Budget getBudget(String name) {
        Budget aBudget = new Budget();
        for(Budget budget : getAllBudgets()) {
            if(name.equals(budget.getName())) {
                aBudget = budget;
            }
        }
        return aBudget;
    }

// GET ONE method by id
    public Budget getBudgetById(Integer id) {
        Budget aBudget = new Budget();
        aBudget = budgetRepository.findById(id).get();
        return aBudget;
    }

//    POST method to create a new account
    public void addBudget(Budget budget) {
        budgetRepository.save(budget);
    }

//    PUT method to edit an account
    // public void updateBudget(Budget budget, Integer id) {
    //     Budget aBudget = budgetRepository.findById(id).get();
    //     aBudget.setName(budget.getName());
    //     aBudget.setAmount(budget.getAmount());
    //     budgetRepository.save(aBudget);
    // }
    public void updateBudget(Budget budget) {
        budgetRepository.save(budget);
    }

//    DELETE method to delete an account
    public void deleteBudget(Integer id) {
        // if (budgetRepository.existsById(id)) {
        //     budgetRepository.deleteById(id);
        // } else {
        //     System.out.println("Budget does not exist by id: " + id);
        // }
        try {
            budgetRepository.deleteById(id);
        } catch (Exception e) {
            if (!budgetRepository.existsById(id)) {
                System.out.println("Budget does not exist by id: " + id);
            } else {
                System.out.println("Something went wrong.");
            }
        }
    }
}
