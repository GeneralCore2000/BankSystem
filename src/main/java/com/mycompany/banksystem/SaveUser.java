package com.mycompany.banksystem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SaveUser {

    public SaveUser(String fName, String lName, String accNum, double initDep, int pin) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("useraccount.txt", true))) {
            writer.write(
                    fName + " " + lName + ","
                    + accNum + ","
                    + pin + ","
                    + initDep);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error saving user data.");
        }
    }
}
