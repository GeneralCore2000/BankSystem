package com.mycompany.banksystem;

import javax.swing.JOptionPane;

public class WithdrawMoney extends javax.swing.JFrame {

    public WithdrawMoney() {
        initComponents();
    }
    private String userName;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        withdrawButton = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        withdrawField = new javax.swing.JTextField();
        backButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(54, 75, 104));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        withdrawButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/Withdraw/Withdraw Button.png"))); // NOI18N
        withdrawButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                withdrawButtonMouseClicked(evt);
            }
        });
        jPanel1.add(withdrawButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/Deposit/Logo 2 1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        withdrawField.setBackground(new java.awt.Color(255, 255, 255));
        withdrawField.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        withdrawField.setForeground(new java.awt.Color(145, 117, 67));
        withdrawField.setText("Amount: 100,000.00");
        withdrawField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(51, 51, 51)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));
        withdrawField.setMargin(new java.awt.Insets(2, 6, 2, 9));
        withdrawField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                withdrawFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                withdrawFieldFocusLost(evt);
            }
        });
        jPanel1.add(withdrawField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 280, 40));

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/back button.png"))); // NOI18N
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void withdrawFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_withdrawFieldFocusGained
        // TODO add your handling code here:
        if ("Amount: 100,000.00".equals(withdrawField.getText())) {
            withdrawField.setText("");
        }
    }//GEN-LAST:event_withdrawFieldFocusGained

    private void withdrawFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_withdrawFieldFocusLost
        // TODO add your handling code here:
        if ("".equals(withdrawField.getText())) {
            withdrawField.setText("Amount: 100,000.00");
        }
    }//GEN-LAST:event_withdrawFieldFocusLost

    private void withdrawButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawButtonMouseClicked
        MoneyConfirmation mc;

        ReadUpdateData rud = new ReadUpdateData();
        mc = new MoneyConfirmation(rootPane, "Withdraw", withdrawField, userName);
        if (rud.getBalance(userName) < Double.parseDouble(withdrawField.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Insufficient balance.", "Withdraw Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        double newBalance = rud.getBalance(userName) - Double.parseDouble(withdrawField.getText());
        mc = new MoneyConfirmation(rootPane, userName, newBalance, withdrawField, "Withdraw");
        if (mc.confirmed == 0) {
            dispose();
        }
    }//GEN-LAST:event_withdrawButtonMouseClicked

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        // TODO add your handling code here:
       ReadUpdateData rud = new ReadUpdateData();
       rud.updateLabel(userName);
       dispose();
    }//GEN-LAST:event_backButtonMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel withdrawButton;
    private javax.swing.JTextField withdrawField;
    // End of variables declaration//GEN-END:variables
}
