package com.mycompany.banksystem;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class userLogIn {

    public userLogIn(String accountName, int pin) {
        System.out.println(checkCredentials(accountName, pin));
        if (checkCredentials(accountName, pin)) {
            UserDashboard ud = new UserDashboard();
            ud.setNameLabel(accountName);
            ud.setBalLabel(getBalance(accountName) + "");
            JOptionPane.showMessageDialog(null, "Login successful!");
            Main m = new Main();
            m.setVisible(false);
            ud.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, accountName + " " + pin + " " +
                    "Invalid username or password. Please try again.",
                    "Wrong Credentials!",
                    JOptionPane.ERROR_MESSAGE);
            System.out.println("Invalid username or password. Please try again.");
        }
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

    private boolean checkCredentials(String accountName, int pin) {
        List<String[]> userList;
        userList = readUserData();
        for (String[] user : userList) {
            System.out.println(user[0] + "//" + accountName);
            System.out.println(user[1] + "//" + pin);
            if (accountName.equals(user[0]) && Integer.parseInt(user[1]) == (pin)) {
                return true;
            }
        }
        return false;
    }

    public List<String[]> readUserData() {
        List<String[]> userList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("useraccount.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                userList.add(line.split(","));
            }
        } catch (IOException e) {
            System.out.println("Error reading user data.");
        }
        return userList;
    }

}
