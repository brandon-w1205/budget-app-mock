package org.example.javaback.Expense;

import java.util.List;

import org.example.javaback.Budget.Budget;
import org.example.javaback.Budget.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @Autowired
    private BudgetService budgetService;

    @RequestMapping("/budgets/{budget_id}/expenses")
    public List<Expense> getAllExpenses(@PathVariable Integer budget_id) {
        return expenseService.getAllExpenses(budget_id);
    }

    // @RequestMapping("/budgets/{name}/expenses")
    // public List<Expense> getAllExpenses(@PathVariable String name) {
    //     return expenseService.getAllExpenses(name);
    // }

    @RequestMapping(value = "/budgets/{budget_id}/expenses", method = RequestMethod.POST)
    public void addExpense(@RequestBody Expense expense, @PathVariable Integer budget_id) {
        Budget budget = budgetService.getBudgetById(budget_id);
        expense.setBudget(budget);
        expenseService.addExpense(expense);
        budget.getExpenses().add(expense);
        budgetService.updateBudget(budget);
    }

    @RequestMapping(value = "/budgets/{budget_id}/expenses/{id}", method = RequestMethod.PUT)
    public void updateExpense(@RequestBody Expense expense, @PathVariable Integer id, @PathVariable Integer budget_id) {
        Budget budget = budgetService.getBudgetById(budget_id);
        expense.setBudget(budget);
        expenseService.updateExpense(expense);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/budgets/{budget_id}/expenses/{id}")
    public void deleteExpense(@PathVariable Integer budget_id, @PathVariable Integer id) {
        expenseService.deleteExpense(id);
    }
}
