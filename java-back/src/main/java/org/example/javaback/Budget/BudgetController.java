package org.example.javaback.Budget;

import java.util.List;

import org.example.javaback.Expense.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class BudgetController {

    @Autowired
    private BudgetService budgetService;


//    GET method for all accounts

    @GetMapping("/budgets")
    public List<Budget> getAllBudgets() {
        return budgetService.getAllBudgets();
    }

//    GET ONE method for one account by name
    @RequestMapping("/budgets/{name}")
    public Budget getBudget(@PathVariable String name) {
       return budgetService.getBudget(name);
    }

//  GET ONE method for budget by id
    @RequestMapping("/budgets/{budget_id}")
    public Budget getBudgetById(@PathVariable Integer budget_id) {
        return budgetService.getBudgetById(budget_id);
    }

//    POST method to create one account
    @RequestMapping(method = RequestMethod.POST, value = "/budget")
    public void addBudget(@RequestBody Budget budget) {
        budgetService.addBudget(budget);
    }

//    PUT method to edit an account's details
    @RequestMapping(method = RequestMethod.PUT, value = "/budget")
    public void updateBudget(@RequestBody Budget budget) {
        budgetService.updateBudget(budget);
    }

//    DELETE method to delete an account by username. Can later change from front-end to request username and password before deletion
    @RequestMapping(method = RequestMethod.DELETE, value = "/budgets/{name}")
    public void deleteBudget(@PathVariable String name) {
        budgetService.deleteBudget(name);
    }


// TESTING

    @RequestMapping("/budgets/{name}/theExpenses")
    public List<Expense> getBudgetExpenses(@PathVariable String name) {
        Budget budget = budgetService.getBudget(name);
        return budget.getExpenses();
    }
}
