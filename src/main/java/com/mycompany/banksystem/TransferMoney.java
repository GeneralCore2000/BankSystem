package com.mycompany.banksystem;

import javax.swing.JOptionPane;

public class TransferMoney extends javax.swing.JFrame {

    private String userName;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public TransferMoney() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        transPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        transField = new javax.swing.JTextField();
        transButton = new javax.swing.JLabel();
        reciField = new javax.swing.JTextField();
        backButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Group 3 Bank System");
        setMaximumSize(new java.awt.Dimension(469, 399));
        setMinimumSize(new java.awt.Dimension(469, 399));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        transPanel.setBackground(new java.awt.Color(54, 75, 104));
        transPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/Deposit/Logo 2 1.png"))); // NOI18N
        transPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        transField.setBackground(new java.awt.Color(255, 255, 255));
        transField.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        transField.setForeground(new java.awt.Color(145, 117, 67));
        transField.setText("Amount: 100,000.00");
        transField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(51, 51, 51)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));
        transField.setMargin(new java.awt.Insets(2, 6, 2, 9));
        transField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                transFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                transFieldFocusLost(evt);
            }
        });
        transPanel.add(transField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 280, 40));

        transButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/Transfer/Transfer Button.png"))); // NOI18N
        transButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transButtonMouseClicked(evt);
            }
        });
        transPanel.add(transButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        reciField.setBackground(new java.awt.Color(255, 255, 255));
        reciField.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        reciField.setForeground(new java.awt.Color(145, 117, 67));
        reciField.setText("Recipient's Account Number");
        reciField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(51, 51, 51)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));
        reciField.setMargin(new java.awt.Insets(2, 6, 2, 9));
        reciField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                reciFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                reciFieldFocusLost(evt);
            }
        });
        transPanel.add(reciField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 280, 40));

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/back button.png"))); // NOI18N
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });
        transPanel.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        getContentPane().add(transPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void transFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_transFieldFocusGained
        // TODO add your handling code here:
        if ("Amount: 100,000.00".equals(transField.getText())) {
            transField.setText("");
        }
    }//GEN-LAST:event_transFieldFocusGained

    private void transFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_transFieldFocusLost
        // TODO add your handling code here:
        if ("".equals(transField.getText())) {
            transField.setText("Amount: 100,000.00");
        }
    }//GEN-LAST:event_transFieldFocusLost

    private void transButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transButtonMouseClicked
        ReadUpdateData rud = new ReadUpdateData();
        if (Integer.parseInt(transField.getText()) <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Deposit amount must be greater than zero.", "Transfer Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (!rud.userExists(reciField.getText())) {
            JOptionPane.showMessageDialog(rootPane,
                    "Recipient does not exist.",
                    "Withdraw Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (rud.getBalance(userName) < Double.parseDouble(transField.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Insufficient balance.", "Transfer Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double newBalance = rud.getBalance(userName) - Double.parseDouble(transField.getText());
        MoneyConfirmation mc = new MoneyConfirmation(rootPane, userName, newBalance, transField, "Transfer Money");
        if (mc.confirmed == 0) {
            dispose();
        }
    }//GEN-LAST:event_transButtonMouseClicked

    private void reciFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_reciFieldFocusGained
        // TODO add your handling code here:
        if ("Recipient's Account Number".equals(reciField.getText())) {
            reciField.setText("");
        }
    }//GEN-LAST:event_reciFieldFocusGained

    private void reciFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_reciFieldFocusLost
        // TODO add your handling code here:
        if ("".equals(reciField.getText())) {
            reciField.setText("Recipient's Account Number");
        }
    }//GEN-LAST:event_reciFieldFocusLost

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        // TODO add your handling code here:
        ReadUpdateData rud = new ReadUpdateData();
        rud.updateLabel(userName);
        dispose();
    }//GEN-LAST:event_backButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField reciField;
    private javax.swing.JLabel transButton;
    private javax.swing.JTextField transField;
    private javax.swing.JPanel transPanel;
    // End of variables declaration//GEN-END:variables
}
