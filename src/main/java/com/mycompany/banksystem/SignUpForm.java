package com.mycompany.banksystem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class SignUpForm extends javax.swing.JFrame {

    public SignUpForm() {
        initComponents();
        generateAccountNumber();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signUpPanel = new javax.swing.JPanel();
        fNameField = new javax.swing.JTextField();
        lNameField = new javax.swing.JTextField();
        initDepField = new javax.swing.JTextField();
        pinField = new javax.swing.JTextField();
        registerButtonLabel = new javax.swing.JLabel();
        signInLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        signUpForm = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Group 3 Bank System");
        setAutoRequestFocus(false);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signUpPanel.setBackground(new java.awt.Color(255, 229, 166));
        signUpPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fNameField.setBackground(new java.awt.Color(255, 255, 255));
        fNameField.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        fNameField.setForeground(new java.awt.Color(145, 117, 67));
        fNameField.setText("First Name");
        fNameField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(51, 51, 51)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));
        fNameField.setMargin(new java.awt.Insets(2, 6, 2, 9));
        fNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fNameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fNameFieldFocusLost(evt);
            }
        });
        signUpPanel.add(fNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 280, 40));

        lNameField.setBackground(new java.awt.Color(255, 255, 255));
        lNameField.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        lNameField.setForeground(new java.awt.Color(145, 117, 67));
        lNameField.setText("Last Name");
        lNameField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(51, 51, 51)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));
        lNameField.setMargin(new java.awt.Insets(2, 6, 2, 9));
        lNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lNameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lNameFieldFocusLost(evt);
            }
        });
        signUpPanel.add(lNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 280, 40));

        initDepField.setBackground(new java.awt.Color(255, 255, 255));
        initDepField.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        initDepField.setForeground(new java.awt.Color(145, 117, 67));
        initDepField.setText("Initial Deposit: 100,000");
        initDepField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(51, 51, 51)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));
        initDepField.setMargin(new java.awt.Insets(2, 6, 2, 9));
        initDepField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                initDepFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                initDepFieldFocusLost(evt);
            }
        });
        signUpPanel.add(initDepField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 280, 40));

        pinField.setBackground(new java.awt.Color(255, 255, 255));
        pinField.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        pinField.setForeground(new java.awt.Color(145, 117, 67));
        pinField.setText("Create PIN");
        pinField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(51, 51, 51)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));
        pinField.setMargin(new java.awt.Insets(2, 6, 2, 9));
        pinField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pinFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pinFieldFocusLost(evt);
            }
        });
        signUpPanel.add(pinField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 280, 40));

        registerButtonLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/signup/register_button_v2.png"))); // NOI18N
        registerButtonLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                registerButtonLabelMousePressed(evt);
            }
        });
        signUpPanel.add(registerButtonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, -1, -1));

        signInLabel.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        signInLabel.setForeground(new java.awt.Color(255, 233, 180));
        signInLabel.setText("ALREADY HAVE AN ACCOUNT? SIGN IN HERE");
        signInLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInLabelMouseClicked(evt);
            }
        });
        signUpPanel.add(signInLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/signup/signup_logo.png"))); // NOI18N
        signUpPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        signUpForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/signup/signup_form.png"))); // NOI18N
        signUpPanel.add(signUpForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/signUpForm_bg_logo.png"))); // NOI18N
        signUpPanel.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(signUpPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fNameFieldFocusGained
        // TODO add your handling code here:
        if ("First Name".equals(fNameField.getText())) {
            fNameField.setText("");
        }
    }//GEN-LAST:event_fNameFieldFocusGained

    private void fNameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fNameFieldFocusLost
        // TODO add your handling code here:
        if ("".equals(fNameField.getText())) {
            fNameField.setText("First Name");
        }
    }//GEN-LAST:event_fNameFieldFocusLost

    private void lNameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lNameFieldFocusGained
        // TODO add your handling code here:
        if ("Last Name".equals(lNameField.getText())) {
            lNameField.setText("");
        }
    }//GEN-LAST:event_lNameFieldFocusGained

    private void lNameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lNameFieldFocusLost
        // TODO add your handling code here:
        if ("".equals(lNameField.getText())) {
            lNameField.setText("Last Name");
        }
    }//GEN-LAST:event_lNameFieldFocusLost

    private void initDepFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_initDepFieldFocusGained
        // TODO add your handling code here
        if ("Initial Deposit: 100,000".equals(initDepField.getText())) {
            initDepField.setText("");
        }
    }//GEN-LAST:event_initDepFieldFocusGained

    private void initDepFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_initDepFieldFocusLost
        // TODO add your handling code here:
        if ("".equals(initDepField.getText())) {
            initDepField.setText("Initial Deposit: 100,000");
        }
    }//GEN-LAST:event_initDepFieldFocusLost

    private void pinFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pinFieldFocusGained
        // TODO add your handling code here:
        if ("Create PIN".equals(pinField.getText())) {
            pinField.setText("");
        }
    }//GEN-LAST:event_pinFieldFocusGained

    private void pinFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pinFieldFocusLost
        // TODO add your handling code here:
        if ("".equals(pinField.getText())) {
            pinField.setText("Create PIN");
        }
    }//GEN-LAST:event_pinFieldFocusLost

    private void signInLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInLabelMouseClicked
        // TODO add your handling code here:
        Main main = new Main();
        main.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_signInLabelMouseClicked

    private void registerButtonLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonLabelMousePressed
        // TODO add your handling code here:
        SaveUser(
                lNameField.getText(),
                fNameField.getText(),
                generateAccountNumber(),
                Integer.parseInt(pinField.getText()),
                Double.parseDouble(initDepField.getText())
        );
        lNameField.setText("");
        fNameField.setText("");
        pinField.setText("");
        initDepField.setText("");
        JOptionPane.showMessageDialog(null, "Successfully Registered!");
        Main main = new Main();
        main.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_registerButtonLabelMousePressed
    
    public void SaveUser(String fName, String lName, String accNum, int pin, double initDep) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("useraccount.txt", true))) {
            writer.write(
                    fName + " " + lName + ","
                    + pin + ","
                    + accNum + ","
                    + initDep);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error saving user data.");
        }
    }

    public String generateAccountNumber() {
        long accNum = (long) (1_000_000_000L + Math.random() * 9_000_000_000L);
        return accNum + "";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JTextField fNameField;
    private javax.swing.JTextField initDepField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField lNameField;
    private javax.swing.JTextField pinField;
    private javax.swing.JLabel registerButtonLabel;
    private javax.swing.JLabel signInLabel;
    private javax.swing.JLabel signUpForm;
    private javax.swing.JPanel signUpPanel;
    // End of variables declaration//GEN-END:variables
}
