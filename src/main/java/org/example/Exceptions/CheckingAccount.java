package org.example.Exceptions;

public class CheckingAccount {

    private double balance;
    private int number;

    public CheckingAccount(int number){
        this.number = number;
    }

    public void deposite(double amount){
        balance = balance + amount;
    }

    public void withDraw(double amount) throws InsufficientFunds{
        if(amount <= balance){
            balance = balance - amount;
        }
        else {
            double needs = amount - balance;
            throw new InsufficientFunds(needs);
        }
    }

    public double getBalance(){
        return balance;
    }

    public double getNumber(){
        return number;
    }

}
