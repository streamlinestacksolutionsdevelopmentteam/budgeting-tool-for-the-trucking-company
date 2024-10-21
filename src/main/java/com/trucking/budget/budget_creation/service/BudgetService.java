package com.trucking.budget.budget_creation.service;

//import com.trucking.budget.budget_creation.dto.BudgetDTO;
import com.trucking.budget.budget_creation.dto.BudgetDTO;
import com.trucking.budget.budget_creation.model.Budget;
import com.trucking.budget.budget_creation.repository.BudgetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BudgetService {

    private final BudgetRepository budgetRepository;

    public BudgetService(BudgetRepository budgetRepository) {
        this.budgetRepository = budgetRepository;
    }

    public Budget createBudget(BudgetDTO budgetDTO) {
        Budget budget = new Budget();
        budget.setCategory(budgetDTO.getCategory());
        budget.setAmount(budgetDTO.getAmount());
        budget.setStartDate(budgetDTO.getStartDate());
        budget.setEndDate(budgetDTO.getEndDate());
        return budgetRepository.save(budget);
    }

    public List<Budget> getAllBudgets() {
        return budgetRepository.findAll();
    }

    // Add other CRUD methods if needed
}
