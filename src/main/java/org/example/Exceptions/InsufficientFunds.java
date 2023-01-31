package org.example.Exceptions;

public class InsufficientFunds extends Exception{

    private double amount;

    public InsufficientFunds(double amount){
        this.amount = amount;
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
