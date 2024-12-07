package com.mycompany.banksystem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import javax.swing.JOptionPane;

public class GenerateReceipt {

    public GenerateReceipt(String transactionType, double amount, String details, String sentTo, String userName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(userName + "_receipts.txt", true))) {
            writer.write("Transaction: " + transactionType);
            writer.newLine();
            if (transactionType.equals("Transfer Money")) {
                writer.write("Sent to: " + sentTo);
            }
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
            JOptionPane.showMessageDialog(null, "Error saving receipt." + e, "IOException", JOptionPane.ERROR_MESSAGE);
        }
    }
}
