package org.example.javaback.Expense;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ExpenseRepository extends CrudRepository<Expense, Integer> {
    public List<Expense> findByBudgetId(Integer budget_id);

}
