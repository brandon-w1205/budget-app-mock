package org.example.javaback.Expense;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExpenseService {
    @Autowired
    private ExpenseRepository expenseRepository;

    // GET all expenses
    public List<Expense> getAllExpenses(Integer budget_id) {
        List<Expense> expenses = new ArrayList<>();
        expenses.addAll(expenseRepository.findByBudgetId(budget_id));
        return expenses;
    }

    // public List<Expense> getAllExpenses(String name) {
    // List<Expense> expenses = new ArrayList<>();
    // expenses.addAll(expenseRepository.findByName(name));
    // return expenses;
    // }

    // GET ONE method for one account
    public Expense getExpense(Integer budget_id, Integer id) {
        Expense anExpense = new Expense();
        for (Expense expense : getAllExpenses(budget_id)) {
            if (id.equals(expense.getId())) {
                anExpense = expense;
            }
        }
        return anExpense;
    }

    // CREATE a single topic
    public void addExpense(Expense expense) {
        expenseRepository.save(expense);
    }

    // UPDATE expense
    public void updateExpense(Expense expense) {
        expenseRepository.save(expense);
    }

    // DELETE expense
    public void deleteExpense(Integer id) {
        expenseRepository.deleteById(id);
    }
}
