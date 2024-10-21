package com.trucking.budget.budget_creation.dto;

import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

public class BudgetDTO {

    @NotNull(message = "Category is required")
    private String category;

    @NotNull(message = "Amount is required")
    private Double amount;

    @NotNull(message = "Start date is required")
    private LocalDate startDate;

    @NotNull(message = "End date is required")
    private LocalDate endDate;

    public @NotNull(message = "Category is required") String getCategory() {
        return category;
    }

    public void setCategory(@NotNull(message = "Category is required") String category) {
        this.category = category;
    }

    public @NotNull(message = "Amount is required") Double getAmount() {
        return amount;
    }

    public void setAmount(@NotNull(message = "Amount is required") Double amount) {
        this.amount = amount;
    }

    public @NotNull(message = "Start date is required") LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(@NotNull(message = "Start date is required") LocalDate startDate) {
        this.startDate = startDate;
    }

    public @NotNull(message = "End date is required") LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(@NotNull(message = "End date is required") LocalDate endDate) {
        this.endDate = endDate;
    }
// Constructor, Getters, Setters
}
