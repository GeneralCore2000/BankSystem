package com.mycompany.banksystem;

import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CLIMain {

    private static final String USER_FILE = "useraccounts.txt";
    private static final String RECEIPT_FILE = "receipts.txt";
    private static final String TRANSACTIONS_FILE = "transactionhistory.txt";
    private String currentUser;
    private double currentBalance = 0.0;

    public static void main(String[] args) {
        CLIMain bankingSystem = new CLIMain();
        bankingSystem.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (currentUser == null) {
                System.out.println("1. Log in");
                System.out.println("2. Create account");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                int authChoice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                switch (authChoice) {
                    case 1:
                        login(scanner);
                        break;
                    case 2:
                        createAccount(scanner);
                        break;

                    case 3:
                        System.out.println("Exiting program.");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } else {
                System.out.println("1. Check balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Transfer money");
                System.out.println("5. Log out");
                System.out.print("Enter your choice: ");
                int actionChoice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                switch (actionChoice) {
                    case 1:
                        checkBalance();
                        break;
                    case 2:
                        deposit(scanner);
                        break;
                    case 3:
                        withdraw(scanner);
                        break;
                    case 4:
                        transferMoney(scanner);
                        break;
                    case 5:
                        logout();
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }

        }
    }

    private void login(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        if (checkCredentials(username, password)) {
            currentUser = username;
            currentBalance = getBalance(username);
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }

    private void createAccount(Scanner scanner) {
        System.out.print("Enter new username: ");
        String newUsername = scanner.nextLine();
        if (userExists(newUsername)) {
            System.out.println("Username already exists. Please choose a different one.");
            return;
        }
        System.out.print("Enter password: ");
        String newPassword = scanner.nextLine();

        System.out.print("Initial deposit: ");
        double initialDeposit = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        saveUser(newUsername, newPassword, initialDeposit);
        System.out.println("Account created successfully!");
    }

    private void checkBalance() {
        System.out.printf("Your current balance is: %.2f%n", currentBalance);
        // Generate receipt
        generateReceipt("Check Balance", 0.0, "Current Balance: " + currentBalance);
    }

    private void deposit(Scanner scanner) {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
            return;
        }
        currentBalance += amount;
        updateBalance(currentUser, currentBalance);
        System.out.printf("Successfully deposited %.2f. New balance: %.2f%n", amount,
                currentBalance);
        // Generate receipt
        generateReceipt("Deposit", amount, "New Balance: " + currentBalance);
    }

    private void withdraw(Scanner scanner) {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
        } else if (amount > currentBalance) {
            System.out.println("Insufficient balance.");
        } else {

            currentBalance -= amount;
            updateBalance(currentUser, currentBalance);
            System.out.printf("Successfully withdrew %.2f. New balance: %.2f%n", amount,
                    currentBalance);
            // Generate receipt
            generateReceipt("Withdraw", amount, "New Balance: " + currentBalance);
        }
    }

    private void transferMoney(Scanner scanner) {
        System.out.print("Enter recipient username: ");
        String recipient = scanner.nextLine();
        if (!userExists(recipient)) {
            System.out.println("Recipient does not exist.");
            return;
        }
        System.out.print("Enter amount to transfer: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        if (amount <= 0) {
            System.out.println("Transfer amount must be greater than zero.");
        } else if (amount > currentBalance) {
            System.out.println("Insufficient balance.");
        } else {
            currentBalance -= amount;
            double recipientBalance = getBalance(recipient) + amount;
            updateBalance(currentUser, currentBalance);
            updateBalance(recipient, recipientBalance);
            System.out.printf("Successfully transferred %.2f to %s.%n", amount, recipient);
        }
    }

    private void logout() {
        currentUser = null;
        currentBalance = 0.0;
        System.out.println("Logged out successfully!");
    }

    private boolean checkCredentials(String username, String password) {
        List<String[]> userList = readUserData();
        for (String[] user : userList) {
            if (user[0].equals(username) && user[1].equals(password)) {
                return true;
            }
        }
        return false;
    }

    private boolean userExists(String username) {
        List<String[]> userList = readUserData();
        for (String[] user : userList) {
            if (user[0].equals(username)) {
                return true;
            }
        }
        return false;
    }

    private double getBalance(String username) {
        List<String[]> userList = readUserData();
        for (String[] user : userList) {
            if (user[0].equals(username)) {
                return Double.parseDouble(user[2]);
            }
        }
        return 0.0;
    }

    private void saveUser(String username, String password, double initialDeposit) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USER_FILE, true))) {
            writer.write(username + "," + password + "," + initialDeposit);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error saving user data.");
        }
    }

    private void updateBalance(String username, double newBalance) {
        List<String[]> userList = readUserData();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RECEIPT_FILE, true))) {
            for (String[] user : userList) {
                if (user[0].equals(username)) {
                    writer.write(user[0] + "," + user[1] + "," + newBalance);
                } else {
                    writer.write(String.join(",", user));
                }
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error updating balance.");
        }
    }

    private List<String[]> readUserData() {
        List<String[]> userList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(USER_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                userList.add(line.split(","));
            }
        } catch (IOException e) {
            System.out.println("Error reading user data.");
        }
        return userList;
    }

    private void generateReceipt(String transactionType, double amount, String details) {
        System.out.println("\n==== TRANSACTION RECEIPT ====");

        System.out.println("Transaction: " + transactionType);
        if (amount > 0) {
            System.out.printf("Amount: %.2f%n", amount);
        }
        System.out.println(details);
        System.out.println("Date: " + new Date());
        System.out.println("============================\n");
        // Optionally save to a receipt file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("receipts.txt", true))) {
            writer.write("Transaction: " + transactionType);
            writer.newLine();
            if (amount > 0) {
                writer.write(String.format("Amount: %.2f", amount));
                writer.newLine();
            }
            writer.write(details);
            writer.newLine();
            writer.write("Date: " + new Date());
            writer.newLine();
            writer.write("============================");
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error saving receipt.");
        }
    }
}
