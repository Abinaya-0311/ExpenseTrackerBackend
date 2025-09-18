package com.fullStack.expenseTracker.dto.requests;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@Data
public class TransactionRequestDto {

    @NotNull(message = "User email is required!")
    private String userEmail;

    @NotNull(message = "Category id is required!")
    private int categoryId;

    @NotNull(message = "Description is required!")
    @Size(max = 50, message = "Description can have atmost 50 characters!")
    private String description;

    @NotNull(message = "Amount is required!")
    private Double amount;

    @NotNull(message = "Date is required!")
    private LocalDate date;

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
