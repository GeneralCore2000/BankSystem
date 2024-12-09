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
        nameLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tranHisTextArea = new javax.swing.JTextArea();
        accNumLabel = new javax.swing.JLabel();
        balLabel = new javax.swing.JLabel();
        phpLabel = new javax.swing.JLabel();
        availBalLabel = new javax.swing.JLabel();
        accBgBalLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        withdrawLogoLabel = new javax.swing.JLabel();
        transferLogoLabel = new javax.swing.JLabel();
        depositLogoLabel = new javax.swing.JLabel();
        sidePanelFooter = new javax.swing.JPanel();
        groupMembersLabel = new javax.swing.JLabel();
        logOutButton = new javax.swing.JLabel();
        bgLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Group 3 Bank System");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboardPanel.setBackground(new java.awt.Color(255, 229, 166));
        dashboardPanel.setMinimumSize(new java.awt.Dimension(850, 570));
        dashboardPanel.setPreferredSize(new java.awt.Dimension(850, 570));
        dashboardPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameLabel.setBackground(new java.awt.Color(54, 75, 104));
        nameLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(54, 75, 104));
        nameLabel.setText("{First Name} {Last Name}");
        dashboardPanel.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 23)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(54, 75, 104));
        jLabel2.setText("TRANSACTION HISTORY");
        dashboardPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tranHisTextArea.setEditable(false);
        tranHisTextArea.setBackground(new java.awt.Color(255, 255, 255));
        tranHisTextArea.setColumns(20);
        tranHisTextArea.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tranHisTextArea.setRows(5);
        tranHisTextArea.setFocusable(false);
        jScrollPane1.setViewportView(tranHisTextArea);

        dashboardPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 470, 220));

        accNumLabel.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        accNumLabel.setForeground(new java.awt.Color(54, 75, 104));
        accNumLabel.setText("Account No.: {10-Digits account number}");
        dashboardPanel.add(accNumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        balLabel.setFont(new java.awt.Font("SansSerif", 1, 43)); // NOI18N
        balLabel.setForeground(new java.awt.Color(255, 255, 255));
        balLabel.setText("{balance}");
        dashboardPanel.add(balLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));

        phpLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phpLabel.setForeground(new java.awt.Color(255, 255, 255));
        phpLabel.setText("PHP");
        dashboardPanel.add(phpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));

        availBalLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        availBalLabel.setForeground(new java.awt.Color(255, 255, 255));
        availBalLabel.setText("Available Balance");
        dashboardPanel.add(availBalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        accBgBalLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/dashboard/Frame 1.png"))); // NOI18N
        dashboardPanel.add(accBgBalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        jPanel1.setBackground(new java.awt.Color(54, 75, 104));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        withdrawLogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/dashboard V2/Add Deposit Logo (1).png"))); // NOI18N
        withdrawLogoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                withdrawLogoLabelMouseClicked(evt);
            }
        });
        jPanel1.add(withdrawLogoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        transferLogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/dashboard V2/Transfer money logo.png"))); // NOI18N
        transferLogoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transferLogoLabelMouseClicked(evt);
            }
        });
        jPanel1.add(transferLogoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        depositLogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/dashboard V2/Add Deposit Logo.png"))); // NOI18N
        depositLogoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depositLogoLabelMouseClicked(evt);
            }
        });
        jPanel1.add(depositLogoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        sidePanelFooter.setBackground(new java.awt.Color(23, 40, 64));
        sidePanelFooter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        groupMembersLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/dashboard V2/groupmembers logo.png"))); // NOI18N
        groupMembersLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                groupMembersLabelMouseClicked(evt);
            }
        });
        sidePanelFooter.add(groupMembersLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jPanel1.add(sidePanelFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 240, 50));

        logOutButton.setBackground(new java.awt.Color(54, 75, 104));
        logOutButton.setForeground(new java.awt.Color(255, 255, 255));
        logOutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/dashboard V2/logOutButton.png"))); // NOI18N
        logOutButton.setText("Log Out");
        logOutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutButtonMouseClicked(evt);
            }
        });
        jPanel1.add(logOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        dashboardPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 570));

        bgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/dashboard V2/Logo 2 2.png"))); // NOI18N
        dashboardPanel.add(bgLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, -1));

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

    private void logOutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseClicked
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
    }//GEN-LAST:event_logOutButtonMouseClicked

    private void groupMembersLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_groupMembersLabelMouseClicked
        // TODO add your handling code here:
        GroupMembers gm = new GroupMembers();
        gm.setVisible(true);
    }//GEN-LAST:event_groupMembersLabelMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accBgBalLabel;
    private javax.swing.JLabel accNumLabel;
    private javax.swing.JLabel availBalLabel;
    private javax.swing.JLabel balLabel;
    private javax.swing.JLabel bgLogo;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JLabel depositLogoLabel;
    private javax.swing.JLabel groupMembersLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logOutButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel phpLabel;
    private javax.swing.JPanel sidePanelFooter;
    private javax.swing.JTextArea tranHisTextArea;
    private javax.swing.JLabel transferLogoLabel;
    private javax.swing.JLabel withdrawLogoLabel;
    // End of variables declaration//GEN-END:variables
}
