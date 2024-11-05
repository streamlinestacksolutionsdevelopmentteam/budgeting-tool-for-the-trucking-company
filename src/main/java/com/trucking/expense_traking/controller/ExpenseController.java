package com.trucking.expense_traking.controller;

import com.trucking.expense_traking.model.Expense;
import com.trucking.expense_traking.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/***
 * Controller class for handling requests related to expenses.
 * It provides endpoints for CRUD operations on expense resources.
 */
@CrossOrigin(origins = "http://localhost:3000") //*** Allow CORS for frontend at localhost:3000 ***
@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {

    @Autowired
    private ExpenseRepository expenseRepository; //*** Repository for accessing expense data ***

    /***
     * Retrieves all expenses.
     *
     * @return List of all expenses.
     */
    @GetMapping
    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll(); //*** Fetches all expense records from the database ***
    }

    /***
     * Retrieves an expense by its ID.
     *
     * @param id the ID of the expense to retrieve.
     * @return ResponseEntity containing the expense if found, otherwise not found status.
     */
    @GetMapping("/{id}")
    public ResponseEntity<Expense> getExpenseById(@PathVariable Long id) {
        Optional<Expense> expense = expenseRepository.findById(id);
        return expense.map(ResponseEntity::ok) //*** Return expense with OK status if found ***
                .orElseGet(() -> ResponseEntity.notFound().build()); //*** Return NOT FOUND status if not found ***
    }

    /***
     * Creates a new expense.
     *
     * @param expense the expense object to create.
     * @return The created expense object.
     */
    @PostMapping
    public Expense createExpense(@RequestBody Expense expense) {
        return expenseRepository.save(expense); //*** Save the new expense to the database ***
    }

    /***
     * Updates an existing expense by its ID.
     *
     * @param id the ID of the expense to update.
     * @param expenseDetails the new expense details to apply.
     * @return ResponseEntity containing the updated expense if successful, otherwise NOT FOUND status.
     */
    @PutMapping("/{id}")
    public ResponseEntity<Expense> updateExpense(@PathVariable Long id, @RequestBody Expense expenseDetails) {
        Optional<Expense> optionalExpense = expenseRepository.findById(id);
        if (optionalExpense.isPresent()) {
            Expense expense = optionalExpense.get();
            expense.setDescription(expenseDetails.getDescription()); //*** Update expense description ***
            expense.setAmount(expenseDetails.getAmount()); //*** Update expense amount ***
            Expense updatedExpense = expenseRepository.save(expense); //*** Save the updated expense ***
            return ResponseEntity.ok(updatedExpense); //*** Return updated expense with OK status ***
        } else {
            return ResponseEntity.notFound().build(); //*** Return NOT FOUND status if expense does not exist ***
        }
    }

    /***
     * Deletes an expense by its ID.
     *
     * @param id the ID of the expense to delete.
     * @return ResponseEntity with NO CONTENT status if deleted, otherwise NOT FOUND status.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteExpense(@PathVariable Long id) {
        if (expenseRepository.existsById(id)) {
            expenseRepository.deleteById(id); //*** Delete expense from the database ***
            return ResponseEntity.noContent().build(); //*** Return NO CONTENT status if deletion is successful ***
        } else {
            return ResponseEntity.notFound().build(); //*** Return NOT FOUND status if expense does not exist ***
        }
    }
}
