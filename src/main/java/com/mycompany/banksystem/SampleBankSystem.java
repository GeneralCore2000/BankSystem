package com.mycompany.banksystem;

import java.util.Scanner;

public class SampleBankSystem {

    double balance = 0.0;

    public SampleBankSystem() {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while (option != 4) {
            System.out.println("1. Check Balance\n2. Deposit\n3. Withdraw\n 4. Exit");
            System.out.print("Enter an option >>: ");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> checkBalance();
                case 2 -> deposit(scanner);
                case 3 -> withdraw(scanner);
                case 4 -> exit();
                default -> System.out.println("Invalid option. Try again.");
            }
        }
        scanner.close();
    }

    private void checkBalance() {
        System.out.println("Your current balance is ₱" + balance);
    }

    private void deposit(Scanner scanner) {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("₱" + amount + " has been deposited to your account.");
            checkBalance();
        } else {
            System.out.println("Invalid amount. Deposit amount must be positive.");
        }
    }

    private void withdraw(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₱" + amount + " has been withdrawn from your account.");
            checkBalance();
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Invalid amount. Withdrawal amount must be positive.");
        }
    }

    private void exit() {
        System.out.println("Thank you for banking with us. Have a great day!");
    }

}
