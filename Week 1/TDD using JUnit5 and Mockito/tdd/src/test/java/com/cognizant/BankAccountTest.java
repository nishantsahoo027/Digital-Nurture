package com.cognizant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    void testDeposit() {

        // Arrange
        BankAccount account = new BankAccount(1000);

        // Act
        account.deposit(500);

        // Assert
        assertEquals(1500, account.getBalance());

    }

    @Test
    void testWithdraw() {

        // Arrange
        BankAccount account = new BankAccount(1000);

        // Act
        account.withdraw(300);

        // Assert
        assertEquals(700, account.getBalance());

    }
}