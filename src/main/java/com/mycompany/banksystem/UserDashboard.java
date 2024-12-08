package com.mycompany.banksystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class UserDashboard extends javax.swing.JFrame {

    public UserDashboard() {
        initComponents();
    }

    public void setTranHisTextArea() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(getNameLabel() + "_receipts.txt"));
            String reader;
            while ((reader = br.readLine()) != null) {
                tranHisTextArea.append(reader + "\n");
                System.out.println(reader + "\n");
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void setAccNumLabel(String accNumLabel) {
        this.accNumLabel.setText("Account No.: " + accNumLabel);
    }

    public void setNameLabel(String nameLabel) {
        this.nameLabel.setText(nameLabel);
    }

    public String getNameLabel() {
        return nameLabel.getText();
    }

    public void setBalLabel(String balLabel) {
        this.balLabel.setText(balLabel);
    }

    public double getBalLabel() {
        return Double.parseDouble(balLabel.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashboardPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tranHisTextArea = new javax.swing.JTextArea();
        accNumLabel = new javax.swing.JLabel();
        balLabel = new javax.swing.JLabel();
        phpLabel = new javax.swing.JLabel();
        availBalLabel = new javax.swing.JLabel();
        accBgBalLabel = new javax.swing.JLabel();
        withdrawLogoLabel = new javax.swing.JLabel();
        transferLogoLabel = new javax.swing.JLabel();
        depositLogoLabel = new javax.swing.JLabel();
        optBgLabel = new javax.swing.JLabel();
        bgLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboardPanel.setBackground(new java.awt.Color(255, 229, 166));
        dashboardPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(54, 75, 104));
        jLabel1.setForeground(new java.awt.Color(54, 75, 104));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/dashboard/Logout.png"))); // NOI18N
        jLabel1.setText("Log Out");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        dashboardPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, -1, -1));

        nameLabel.setBackground(new java.awt.Color(54, 75, 104));
        nameLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(54, 75, 104));
        nameLabel.setText("{First Name} {Last Name}");
        dashboardPanel.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 23)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(54, 75, 104));
        jLabel2.setText("TRANSACTION HISTORY");
        dashboardPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tranHisTextArea.setEditable(false);
        tranHisTextArea.setBackground(new java.awt.Color(255, 255, 255));
        tranHisTextArea.setColumns(20);
        tranHisTextArea.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tranHisTextArea.setRows(5);
        tranHisTextArea.setFocusable(false);
        jScrollPane1.setViewportView(tranHisTextArea);

        dashboardPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 290, 350));

        accNumLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        accNumLabel.setForeground(new java.awt.Color(54, 75, 104));
        accNumLabel.setText("Account No.: {10-Digits account number}");
        dashboardPanel.add(accNumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        balLabel.setFont(new java.awt.Font("SansSerif", 1, 43)); // NOI18N
        balLabel.setForeground(new java.awt.Color(255, 255, 255));
        balLabel.setText("{balance}");
        dashboardPanel.add(balLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        phpLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phpLabel.setForeground(new java.awt.Color(255, 255, 255));
        phpLabel.setText("PHP");
        dashboardPanel.add(phpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        availBalLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        availBalLabel.setForeground(new java.awt.Color(255, 255, 255));
        availBalLabel.setText("Available Balance");
        dashboardPanel.add(availBalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        accBgBalLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/dashboard/Frame 1.png"))); // NOI18N
        dashboardPanel.add(accBgBalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        withdrawLogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/dashboard/Add Deposit Logo.png"))); // NOI18N
        withdrawLogoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                withdrawLogoLabelMouseClicked(evt);
            }
        });
        dashboardPanel.add(withdrawLogoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));

        transferLogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/dashboard/Transfer money logo.png"))); // NOI18N
        transferLogoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transferLogoLabelMouseClicked(evt);
            }
        });
        dashboardPanel.add(transferLogoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));

        depositLogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/dashboard/Send money logo.png"))); // NOI18N
        depositLogoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depositLogoLabelMouseClicked(evt);
            }
        });
        dashboardPanel.add(depositLogoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        optBgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/dashboard/Options to do.png"))); // NOI18N
        dashboardPanel.add(optBgLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        bgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/dashboard/Logo 2 2.png"))); // NOI18N
        dashboardPanel.add(bgLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        getContentPane().add(dashboardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void depositLogoLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositLogoLabelMouseClicked
        DepositMoney dm = new DepositMoney();
        dm.setVisible(true);
        dispose();
        dm.setUserName(getNameLabel());
    }//GEN-LAST:event_depositLogoLabelMouseClicked

    private void transferLogoLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transferLogoLabelMouseClicked
        TransferMoney tm = new TransferMoney();
        tm.setVisible(true);
        dispose();
        tm.setUserName(getNameLabel());
    }//GEN-LAST:event_transferLogoLabelMouseClicked

    private void withdrawLogoLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawLogoLabelMouseClicked
        WithdrawMoney wm = new WithdrawMoney();
        wm.setVisible(true);
        dispose();
        wm.setUserName(getNameLabel());
    }//GEN-LAST:event_withdrawLogoLabelMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        int logout = JOptionPane.showConfirmDialog(rootPane,
                "Log Out now?",
                "Logging Out",
                JOptionPane.OK_CANCEL_OPTION);
        if (logout == JOptionPane.OK_OPTION) {
            dispose();
            Main m = new Main();
            m.setVisible(true);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accBgBalLabel;
    private javax.swing.JLabel accNumLabel;
    private javax.swing.JLabel availBalLabel;
    private javax.swing.JLabel balLabel;
    private javax.swing.JLabel bgLogo;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JLabel depositLogoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel optBgLabel;
    private javax.swing.JLabel phpLabel;
    private javax.swing.JTextArea tranHisTextArea;
    private javax.swing.JLabel transferLogoLabel;
    private javax.swing.JLabel withdrawLogoLabel;
    // End of variables declaration//GEN-END:variables
}
