package curs0;

import java.util.Scanner;

public class BankAccountTest {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();

        savingsAccount.deposit(200.0);
        savingsAccount.withdraw(50.0);
        savingsAccount.withdraw(150.0); // This withdrawal should not be allowed due to insufficient funds
    }
}
