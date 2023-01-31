package org.example.Exceptions;

public class JavaExceptionExample {

    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(101);

        System.out.println("Depsiting - 600 INR");

        checkingAccount.deposite(600);

        try{
            System.out.println("Withdrawing - 500 INR");
            checkingAccount.withDraw(500);


            System.out.println("Withdrawing - 200 INR");
            checkingAccount.withDraw(200);

        }catch (InsufficientFunds Exception){

            Exception.printStackTrace();
            Exception.getMessage();

            System.out.println("We have got an Error");
        }
    }

}
