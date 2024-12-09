package com.mycompany.banksystem;

public class DepositMoney extends javax.swing.JFrame {

    private String userName;
    private static DepositMoney instance;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public DepositMoney() {
        initComponents();
        instance = this;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        depositPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        depoButton = new javax.swing.JLabel();
        depoField = new javax.swing.JTextField();
        backButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Group 3 Bank System");
        setAutoRequestFocus(false);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        depositPanel.setBackground(new java.awt.Color(54, 75, 104));
        depositPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/Deposit/Logo 2 1.png"))); // NOI18N
        depositPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        depoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/Deposit/Deposit Button.png"))); // NOI18N
        depoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depoButtonMouseClicked(evt);
            }
        });
        depositPanel.add(depoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        depoField.setBackground(new java.awt.Color(255, 255, 255));
        depoField.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        depoField.setForeground(new java.awt.Color(145, 117, 67));
        depoField.setText("Amount: 100,000.00");
        depoField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(51, 51, 51)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));
        depoField.setMargin(new java.awt.Insets(2, 6, 2, 9));
        depoField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                depoFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                depoFieldFocusLost(evt);
            }
        });
        depositPanel.add(depoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 280, 40));

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/back button.png"))); // NOI18N
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });
        depositPanel.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        getContentPane().add(depositPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void depoFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_depoFieldFocusGained
        if ("Amount: 100,000.00".equals(depoField.getText())) {
            depoField.setText("");
        }
    }//GEN-LAST:event_depoFieldFocusGained

    private void depoFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_depoFieldFocusLost
        if ("".equals(depoField.getText())) {
            depoField.setText("Amount: 100,000.00");
        }
    }//GEN-LAST:event_depoFieldFocusLost

    private void depoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depoButtonMouseClicked
        MoneyConfirmation mc;

        mc = new MoneyConfirmation(rootPane, "Deposit", depoField, userName);
        ReadUpdateData rud = new ReadUpdateData();
        double newBalance = Double.parseDouble(depoField.getText()) + rud.getBalance(userName);
        mc = new MoneyConfirmation(rootPane, userName, newBalance, depoField, "Deposit");
        if (mc.confirmed == 0) {
            dispose();
        }
    }//GEN-LAST:event_depoButtonMouseClicked

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        // TODO add your handling code here:
        ReadUpdateData rud = new ReadUpdateData();
        rud.updateLabel(userName);
        dispose();
    }//GEN-LAST:event_backButtonMouseClicked

    public static DepositMoney getInstance() {
        return instance;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backButton;
    private javax.swing.JLabel depoButton;
    private javax.swing.JTextField depoField;
    private javax.swing.JPanel depositPanel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
