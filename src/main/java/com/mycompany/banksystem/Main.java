package com.mycompany.banksystem;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        System.out.println("hello");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logInPanel = new javax.swing.JPanel();
        pinField = new javax.swing.JTextField();
        accNameNumField1 = new javax.swing.JTextField();
        logInButton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        signUpLabel = new javax.swing.JLabel();
        loginBackground = new javax.swing.JLabel();
        logoPanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Group 3 Bank System");
        setAutoRequestFocus(false);
        setMaximumSize(new java.awt.Dimension(843, 562));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logInPanel.setBackground(new java.awt.Color(255, 229, 166));
        logInPanel.setMaximumSize(new java.awt.Dimension(843, 562));
        logInPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pinField.setBackground(new java.awt.Color(255, 255, 255));
        pinField.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        pinField.setForeground(new java.awt.Color(145, 117, 67));
        pinField.setText("PIN");
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
        logInPanel.add(pinField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 280, 40));

        accNameNumField1.setBackground(new java.awt.Color(255, 255, 255));
        accNameNumField1.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        accNameNumField1.setForeground(new java.awt.Color(145, 117, 67));
        accNameNumField1.setText("Account Name");
        accNameNumField1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(51, 51, 51)), javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1)));
        accNameNumField1.setMargin(new java.awt.Insets(2, 6, 2, 9));
        accNameNumField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                accNameNumField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                accNameNumField1FocusLost(evt);
            }
        });
        logInPanel.add(accNameNumField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 280, 40));

        logInButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/log_in_button.png"))); // NOI18N
        logInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logInButtonMouseClicked(evt);
            }
        });
        logInPanel.add(logInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SIGN IN");
        logInPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        signUpLabel.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        signUpLabel.setForeground(new java.awt.Color(255, 233, 180));
        signUpLabel.setText("DON’T HAVE AN ACCOUNT YET? SIGN UP HERE");
        signUpLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpLabelMouseClicked(evt);
            }
        });
        logInPanel.add(signUpLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, -1));

        loginBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/login_background.png"))); // NOI18N
        logInPanel.add(loginBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(logInPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        logoPanel.setBackground(new java.awt.Color(255, 229, 166));
        logoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/login_logo.png"))); // NOI18N
        logoPanel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        getContentPane().add(logoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 490, 562));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pinFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pinFieldFocusLost
        // TODO add your handling code here:
        if ("".equals(pinField.getText())) {
            pinField.setText("PIN");
        }
    }//GEN-LAST:event_pinFieldFocusLost

    private void accNameNumField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_accNameNumField1FocusGained
        // TODO add your handling code here:
        if ("Account Name".equals(accNameNumField1.getText())) {
            accNameNumField1.setText("");
        }
    }//GEN-LAST:event_accNameNumField1FocusGained

    private void accNameNumField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_accNameNumField1FocusLost
        // TODO add your handling code here:
        if ("".equals(accNameNumField1.getText())) {
            accNameNumField1.setText("Account Name");
        }

    }//GEN-LAST:event_accNameNumField1FocusLost

    private void pinFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pinFieldFocusGained
        // TODO add your handling code here:
        if ("PIN".equals(pinField.getText())) {
            pinField.setText("");
        }
    }//GEN-LAST:event_pinFieldFocusGained

    private void signUpLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpLabelMouseClicked
        // TODO add your handling code here:
        SignUpForm signUpForm = new SignUpForm();
        signUpForm.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_signUpLabelMouseClicked

    private void logInButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logInButtonMouseClicked
        // TODO add your handling code here:
        UserLogIn uli = new UserLogIn(
                accNameNumField1.getText(),
                Integer.parseInt(pinField.getText()));
        if (uli.hideMain) {
            accNameNumField1.setText("");
            pinField.setText("");
            setVisible(false);
        }
    }//GEN-LAST:event_logInButtonMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accNameNumField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logInButton;
    private javax.swing.JPanel logInPanel;
    private javax.swing.JLabel loginBackground;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JTextField pinField;
    private javax.swing.JLabel signUpLabel;
    // End of variables declaration//GEN-END:variables
}
