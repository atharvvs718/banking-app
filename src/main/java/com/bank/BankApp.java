package com.bank;

public class BankApp {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Atharv", 1000);
        System.out.println("Account holder: " + account.getHolderName());
        System.out.println("Opening balance: " + account.getBalance());

        account.deposit(500);
        System.out.println("After depositing 500: " + account.getBalance());

        account.withdraw(200);
        System.out.println("After withdrawing 200: " + account.getBalance());

        try {
            account.withdraw(5000);
        } catch (IllegalArgumentException e) {
            System.out.println("Withdraw 5000 failed: " + e.getMessage());
        }

        System.out.println("Final balance: " + account.getBalance());
    }
}