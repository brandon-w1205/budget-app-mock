package org.example.javaback.Expense;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {
    @Autowired
    private ExpenseRepository expenseRepository;

//    GET all expenses
    public List<Expense> getAllExpenses(Integer budget_id) {
        List<Expense> expenses = new ArrayList<>();
        expenses.addAll(expenseRepository.findByBudgetId(budget_id));
        return expenses;
    }

//    GET a single expense
    public Optional<Expense> getExpense(Integer id) {
        return expenseRepository.findById(id);
    }

//    CREATE a single topic
    public void addExpense(Expense expense) {
        expenseRepository.save(expense);
    }

//    UPDATE expense
    public void updateExpense(Expense expense) {
        expenseRepository.save(expense);
    }

//    DELETE expense
    public void deleteExpense(Integer id) {
        expenseRepository.deleteById(id);
    }
}
