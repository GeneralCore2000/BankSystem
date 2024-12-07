package com.mycompany.banksystem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class UserBalance extends ReadUserData{

    private void deposit() {
        double amount;
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
            return;
        }

        currentBalance += amount;
        updateBalance(currentUser, currentBalance);
        System.out.printf("Successfully deposited %.2f. New balance: %.2f%n", amount, currentBalance);
    }

    private void updateBalance(String username, double newBalance) {
        List<String[]> userList = readUserData();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("useraccount.txt"))) {
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
}
