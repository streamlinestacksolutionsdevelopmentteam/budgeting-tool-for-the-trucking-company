package com.trucking.expense_traking.repository;

import com.trucking.expense_traking.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

/***
 * Repository interface for accessing Expense data.
 * This interface extends JpaRepository to provide CRUD operations on Expense entities.
 */
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    //*** JpaRepository provides methods for standard CRUD operations and query methods for the Expense entity. ***
    //*** Custom query methods can be defined here if needed. ***
}
