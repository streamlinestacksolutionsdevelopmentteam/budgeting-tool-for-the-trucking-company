package com.trucking.expense_traking.repository;

import com.trucking.expense_traking.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
