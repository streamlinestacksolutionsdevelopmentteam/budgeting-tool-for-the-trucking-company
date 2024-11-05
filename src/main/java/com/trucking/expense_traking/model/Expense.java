package com.trucking.expense_traking.model;

import jakarta.persistence.*;

/***
 * Entity class representing an Expense.
 * This class is mapped to the "expenses" table in the database.
 */
@Entity
@Table(name = "expenses") //*** Specifies the table name in the database ***
public class Expense {

    @Id //*** Indicates that this field is the primary key ***
    @GeneratedValue(strategy = GenerationType.IDENTITY) //*** Auto-generates the ID value ***
    private Long id;

    private String description; //*** Description of the expense ***
    private Double amount; //*** Amount of the expense ***

    /***
     * Gets the ID of the expense.
     *
     * @return the ID of the expense.
     */
    public Long getId() {
        return id; //*** Returns the ID of the expense ***
    }

    /***
     * Sets the ID of the expense.
     *
     * @param id the ID to set.
     */
    public void setId(Long id) {
        this.id = id; //*** Sets the ID of the expense ***
    }

    /***
     * Gets the description of the expense.
     *
     * @return the description of the expense.
     */
    public String getDescription() {
        return description; //*** Returns the description of the expense ***
    }

    /***
     * Sets the description of the expense.
     *
     * @param description the description to set.
     */
    public void setDescription(String description) {
        this.description = description; //*** Sets the description of the expense ***
    }

    /***
     * Gets the amount of the expense.
     *
     * @return the amount of the expense.
     */
    public Double getAmount() {
        return amount; //*** Returns the amount of the expense ***
    }

    /***
     * Sets the amount of the expense.
     *
     * @param amount the amount to set.
     */
    public void setAmount(Double amount) {
        this.amount = amount; //*** Sets the amount of the expense ***
    }
}
