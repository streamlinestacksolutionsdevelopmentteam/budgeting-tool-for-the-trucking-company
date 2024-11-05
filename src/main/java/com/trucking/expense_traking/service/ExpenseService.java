package com.trucking.expense_traking.service;

import com.trucking.expense_traking.model.Expense;
import com.trucking.expense_traking.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/***
 * Service class for managing expenses.
 * This class provides methods to perform operations related to Expense entities,
 * such as retrieving, saving, and deleting expenses.
 */
@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    /***
     * Retrieves all expenses from the database.
     *
     * @return a list of all expenses
     */
    public List<Expense> findAll() {
        return expenseRepository.findAll(); //*** Fetches all Expense entities from the repository. ***
    }

    /***
     * Retrieves an expense by its ID.
     *
     * @param id the ID of the expense to retrieve
     * @return an Optional containing the found Expense, or empty if not found
     */
    public Optional<Expense> findById(Long id) {
        return expenseRepository.findById(id); //*** Searches for an Expense by its ID. ***
    }

    /***
     * Saves a new or updated expense to the database.
     *
     * @param expense the Expense entity to save
     * @return the saved Expense entity
     */
    public Expense save(Expense expense) {
        return expenseRepository.save(expense); //*** Saves the Expense entity and returns the saved instance. ***
    }

    /***
     * Deletes an expense by its ID.
     *
     * @param id the ID of the expense to delete
     */
    public void deleteById(Long id) {
        expenseRepository.deleteById(id); //*** Deletes the Expense entity with the specified ID from the repository. ***
    }
}
