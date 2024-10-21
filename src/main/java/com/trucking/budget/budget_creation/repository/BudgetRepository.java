package com.trucking.budget.budget_creation.repository;

//package com.trucking.budget.creation.repository;

import com.trucking.budget.budget_creation.model.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<Budget, Long> {
    // Custom queries (if needed) can be added here
}

