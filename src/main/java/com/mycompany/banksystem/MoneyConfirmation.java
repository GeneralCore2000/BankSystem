package com.mycompany.banksystem;

import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MoneyConfirmation {

    ReadUpdateData rud = new ReadUpdateData();
    int confirmed = 1;

    public MoneyConfirmation(Component parentComponent, String transactionType, JTextField textField, String userName) {
        if (Double.parseDouble(textField.getText()) <= 0) {
            JOptionPane.showMessageDialog(parentComponent, transactionType + " amount must be greater than zero.", transactionType + " Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public MoneyConfirmation(Component parentComponent, String userName, double newBalance, JTextField textField, String transactionType) {
        int confirm = JOptionPane.showConfirmDialog(parentComponent, "Confirm " + transactionType + ": " + textField.getText() + "\nNew Balance: " + newBalance);
        if (confirm == JOptionPane.OK_OPTION) {
            rud.updateBalance(userName, newBalance);
            if (transactionType.equals("transfer")) {
                rud.updateBalance(textField.getText(), rud.getBalance(textField.getText()) + Double.parseDouble(textField.getText()));
            }
            rud.updateLabel(userName);
            GenerateReceipt gr = new GenerateReceipt(
                    transactionType,
                    Double.parseDouble(textField.getText()),
                    "New Balance: " + newBalance,
                    textField.getText(), userName);
            confirmed = 0;
        }
    }

    public int confirmed() {
        return confirmed;
    }
}
