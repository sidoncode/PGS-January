package org.example;


import java.util.Scanner;

public class Main {

    /// driver function //
    public static void main(String[] args) {


        //how to take input from user;

        Scanner scanner = new Scanner(System.in);

        // at the time of - creating a object, we are passing a parameter to the class // -> Parameterized Constructor

        //  Scanner scanner = new Scanner(); -> non parametrized / default


        int input1, input2;
        System.out.println("Enter the 1st number");
        input1 = scanner.nextInt();

        System.out.println("Enter the 2nd number");
        input2 = scanner.nextInt();

        scanner.close();
        int sum;
        sum = input1 + input2;
        System.out.println("the sum is ->" + sum);

    }


}