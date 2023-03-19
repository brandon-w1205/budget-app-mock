package org.example.javaback.Expense;

import java.util.List;

import org.example.javaback.Budget.Budget;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @RequestMapping("/budgets/{budget_id}/expenses")
    public List<Expense> getAllExpenses(@PathVariable Integer budget_id) {
        return expenseService.getAllExpenses(budget_id);
    }

    @RequestMapping(value = "/budgets/{budget_id}/expenses", method = RequestMethod.POST)
    public void addExpense(@RequestBody Expense expense, @PathVariable Integer budget_id) {
        expense.setBudget(new Budget(budget_id, "", 0));
        expenseService.addExpense(expense);
    }

}
