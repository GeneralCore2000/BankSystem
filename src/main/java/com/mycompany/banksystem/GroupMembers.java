package com.mycompany.banksystem;

public class GroupMembers extends javax.swing.JFrame {

    public GroupMembers() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        vargasName = new javax.swing.JLabel();
        leader = new javax.swing.JLabel();
        members = new javax.swing.JLabel();
        censonName = new javax.swing.JLabel();
        telishaName = new javax.swing.JLabel();
        sideRibbon = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        githubLink = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Group 3 Bank System");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(45, 62, 87));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vargasName.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        vargasName.setForeground(new java.awt.Color(255, 255, 255));
        vargasName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vargasName.setText("VARGAS, John Lloyd E.");
        jPanel1.add(vargasName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 170, 30));

        leader.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        leader.setForeground(new java.awt.Color(255, 229, 166));
        leader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        leader.setText("LEADER");
        jPanel1.add(leader, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 50, 30));

        members.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        members.setForeground(new java.awt.Color(255, 229, 166));
        members.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        members.setText("MEMBERS");
        jPanel1.add(members, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 70, 20));

        censonName.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        censonName.setForeground(new java.awt.Color(255, 255, 255));
        censonName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        censonName.setText("CENSON, Azzy Rain V.");
        jPanel1.add(censonName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 170, 20));

        telishaName.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        telishaName.setForeground(new java.awt.Color(255, 255, 255));
        telishaName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        telishaName.setText("DELA CRUZ, Telisha Simone N.");
        jPanel1.add(telishaName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 230, 33));

        sideRibbon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/MemberPanel/Frame 5.png"))); // NOI18N
        jPanel1.add(sideRibbon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/MemberPanel/Logo 2 1.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 190, 130));

        x.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        x.setForeground(new java.awt.Color(255, 233, 180));
        x.setText("X");
        x.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xMouseClicked(evt);
            }
        });
        jPanel1.add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, 20));

        githubLink.setBackground(new java.awt.Color(0, 0, 0));
        githubLink.setForeground(new java.awt.Color(255, 255, 255));
        githubLink.setText("https://github.com/GeneralCore2000/BankSystem");
        jPanel1.add(githubLink, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_xMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel censonName;
    private javax.swing.JLabel githubLink;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel leader;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel members;
    private javax.swing.JLabel sideRibbon;
    private javax.swing.JLabel telishaName;
    private javax.swing.JLabel vargasName;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}
