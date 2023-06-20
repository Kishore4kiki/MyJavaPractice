package DepositMachine;

import java.util.Scanner;

public class DepositMain {
    public static void main(String[] args) {
        //To create constructor called deposit(double amt) to store amount in array, 
        //to retrieve amount from array to compare elements in an array.
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the amount to deposit: ");
        double amount = scan.nextInt();

        Deposit user = new Deposit(amount);
    
    }
    
}
