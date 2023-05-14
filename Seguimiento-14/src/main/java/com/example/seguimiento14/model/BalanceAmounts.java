package com.example.seguimiento14.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class BalanceAmounts {

    private boolean earning;

    private double amount;

    private String description;

    private LocalTime date;

    public BalanceAmounts(boolean earning, double amount, String description, LocalTime date) {
        this.earning = earning;
        this.amount = amount;
        this.description = description;
        this.date = date;
    }

    public boolean isEarning() {
        return earning;
    }

    public void setEarning(boolean earning) {
        this.earning = earning;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalTime getDate() {
        return date;
    }

    public void setDate(LocalTime date) {
        this.date = date;
    }
}
