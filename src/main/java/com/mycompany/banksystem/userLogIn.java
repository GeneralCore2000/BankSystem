package com.mycompany.banksystem;

import javax.swing.JOptionPane;

public class userLogIn extends ReadUserData {

    boolean hideMain;

    public userLogIn(String accountName, int pin) {
        if (checkCredentials(accountName, pin)) {
            UserDashboard ud = new UserDashboard();
            ud.setNameLabel(accountName);

            ud.setBalLabel(getBalance(accountName) + "");
            ud.setAccNumLabel(accountNumber);
            JOptionPane.showMessageDialog(null, "Login successful!");
            ud.setVisible(true);
            hideMain(ud.isVisible());
        } else {
            JOptionPane.showMessageDialog(null, accountName + " " + pin + " "
                    + "Invalid username or password. Please try again.",
                    "Wrong Credentials!",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void hideMain(boolean isVisible) {
        hideMain = isVisible;
    }
}
