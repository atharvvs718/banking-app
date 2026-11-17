package com.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    @Test
    public void testDeposit() {
        BankAccount account = new BankAccount("Test", 1000);
        account.deposit(500);
        assertEquals(1500, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        BankAccount account = new BankAccount("Test", 1000);
        account.withdraw(300);
        assertEquals(700, account.getBalance());
    }

    @Test
    public void testInsufficientBalance() {
        BankAccount account = new BankAccount("Test", 1000);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(5000));
    }

    @Test
    public void testInvalidDeposit() {
        BankAccount account = new BankAccount("Test", 1000);
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-100));
    }
}