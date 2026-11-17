package com.bank;

import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();
        BankAccount account = new BankAccount(name, 0);
        System.out.println("Account created for " + name + " with balance 0.0");

        while (true) {
            System.out.println("\n1. Deposit  2. Withdraw  3. Check Balance  4. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            try {
                if (choice == 1) {
                    System.out.print("Enter amount to deposit: ");
                    account.deposit(sc.nextDouble());
                    System.out.println("Deposited. Balance: " + account.getBalance());
                } else if (choice == 2) {
                    System.out.print("Enter amount to withdraw: ");
                    account.withdraw(sc.nextDouble());
                    System.out.println("Withdrawn. Balance: " + account.getBalance());
                } else if (choice == 3) {
                    System.out.println("Balance: " + account.getBalance());
                } else if (choice == 4) {
                    System.out.println("Thank you for banking with us!");
                    break;
                } else {
                    System.out.println("Invalid option");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        sc.close();
    }
}