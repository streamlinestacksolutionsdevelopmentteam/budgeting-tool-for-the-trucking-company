package com.trucking.budget.budget_creation.controller;

import com.trucking.budget.budget_creation.dto.BudgetDTO;
import com.trucking.budget.budget_creation.model.Budget;
import com.trucking.budget.budget_creation.service.BudgetService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;

@RestController
@RequestMapping("/api/budgets")
@CrossOrigin(origins = "http://localhost:3000")
public class BudgetController {

    private final BudgetService budgetService;

    public BudgetController(BudgetService budgetService) {
        this.budgetService = budgetService;
    }

    @PostMapping
    public ResponseEntity<Budget> createBudget(@RequestBody BudgetDTO budgetDTO) {
        Budget createdBudget = budgetService.createBudget(budgetDTO);
        return new ResponseEntity<>(createdBudget, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Budget>> getAllBudgets() {
        List<Budget> budgets = budgetService.getAllBudgets();
        return new ResponseEntity<>(budgets, HttpStatus.OK);
    }

    // Add other CRUD endpoints if needed
}

