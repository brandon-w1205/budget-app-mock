package org.example.javaback.Expense;

import java.util.List;

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

}
