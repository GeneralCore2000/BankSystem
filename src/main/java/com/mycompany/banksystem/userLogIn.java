package com.mycompany.banksystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public final class userLogIn extends ReadUpdateData {
    
    boolean hideMain;
    
    public userLogIn(String accountName, int pin) {
        if (checkCredentials(accountName, pin)) {
            UserDashboard ud = new UserDashboard();
            ud.setNameLabel(accountName);
            ud.setBalLabel(getBalance(accountName) + "");
            ud.setAccNumLabel(accountNumber);
            ud.setTranHisTextArea();
            JOptionPane.showMessageDialog(null, "Login successfully!");
            ud.setVisible(true);
            hideMain(ud.isVisible());
            
        } else {
            JOptionPane.showMessageDialog(null,
                    "Invalid username or password. Please try again.",
                    "Wrong Credentials!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void setTransactionHistory(String userName) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(userName + "_receipts.txt"));
            String reader;
            while ((reader = br.readLine()) != null) {
                System.out.println(reader);
            }
        } catch (IOException e) {
        }
    }
    
    public void hideMain(boolean isVisible) {
        hideMain = isVisible;
    }
}
