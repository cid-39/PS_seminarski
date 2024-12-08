/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.forms;

import controller.Controller;
import domain.Dobavljac;
import domain.Roba;
import java.util.LinkedList;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author cid
 */
public class LoginForm extends javax.swing.JFrame {
    Controller controller;
    /**
     * Creates new form login
     */
    public LoginForm() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        controller = Controller.getInstance();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jLabelPass = new javax.swing.JLabel();
        jButtnoRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 242, 225));

        jPanel1.setBackground(new java.awt.Color(255, 242, 225));

        jLabelEmail.setForeground(new java.awt.Color(84, 51, 16));
        jLabelEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelEmail.setText("Email:");

        jTextFieldEmail.setBackground(new java.awt.Color(167, 146, 119));
        jTextFieldEmail.setForeground(new java.awt.Color(84, 51, 16));
        jTextFieldEmail.setToolTipText("example@email.com");
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jPasswordField.setBackground(new java.awt.Color(167, 146, 119));
        jPasswordField.setForeground(new java.awt.Color(84, 51, 16));

        jButtonLogin.setBackground(new java.awt.Color(209, 187, 158));
        jButtonLogin.setForeground(new java.awt.Color(84, 51, 16));
        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jLabelPass.setForeground(new java.awt.Color(84, 51, 16));
        jLabelPass.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPass.setText("Password:");

        jButtnoRegister.setBackground(new java.awt.Color(209, 187, 158));
        jButtnoRegister.setForeground(new java.awt.Color(84, 51, 16));
        jButtnoRegister.setText("Register");
        jButtnoRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtnoRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtnoRegister)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLogin))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldEmail)
                            .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLogin)
                    .addComponent(jButtnoRegister))
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        String email = jTextFieldEmail.getText();
        String pass = String.copyValueOf(jPasswordField.getPassword());
        Dobavljac dobavljac = controller.loginDobavljac(email, pass);
        if (dobavljac==null)
            JOptionPane.showMessageDialog(this, "Incorrect email or password!", "Error", JOptionPane.ERROR_MESSAGE);
        else {
            JOptionPane.showMessageDialog(this, "Welcome "+dobavljac.getNaziv());
            JFrame next = new MainForm(dobavljac);
            this.setVisible(false);
            next.setVisible(true);
        }
        
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtnoRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtnoRegisterActionPerformed
        JDialog register = new RegisterForm(this, true);
        register.setVisible(true);
    }//GEN-LAST:event_jButtnoRegisterActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtnoRegister;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelPass;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldEmail;
    // End of variables declaration//GEN-END:variables
}
