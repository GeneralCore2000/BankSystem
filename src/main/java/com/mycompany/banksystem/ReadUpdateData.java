package com.mycompany.banksystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadUpdateData {

    public String accountNumber;

    public double getBalance(String username) {
        List<String[]> userList = readUserData();
        for (String[] user : userList) {
            if (user[0].equals(username)) {
                return Double.parseDouble(user[3]);
            }
        }
        return 0.0;
    }

    public void updateBalance(String username, double newBalance) {
        List<String[]> userList = readUserData();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("useraccount.txt"))) {
            for (String[] user : userList) {
                if (user[0].equals(username)) {
                    writer.write(user[0] + "," + user[1] + "," + user[2] + "," + newBalance);
                } else {
                    writer.write(String.join(",", user));
                }
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error updating balance.");
        }
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

    public boolean checkCredentials(String accountName, int pin) {
        List<String[]> userList;
        userList = readUserData();
        for (String[] user : userList) {
            if (accountName.equals(user[0]) && Integer.parseInt(user[1]) == (pin)) {
                accountNumber = user[2];
                return true;
            }
        }
        return false;
    }

}
