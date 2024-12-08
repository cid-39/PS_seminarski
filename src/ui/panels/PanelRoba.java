/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.panels;

import controller.Controller;
import domain.Dobavljac;
import domain.Roba;
import java.util.LinkedList;

/**
 *
 * @author cid
 */
public class PanelRoba extends javax.swing.JPanel {

    /**
     * Creates new form PanelSvaRoba
     */
    public PanelRoba() {
        initComponents();
        Controller controller = Controller.getInstance();
        LinkedList<Roba> sveRobe = controller.getAllRoba();
        for (Roba r: sveRobe) {
            jPanel2.add(new PanelProizvod(r));
        }
    }
    
    public PanelRoba(Dobavljac dobavljac) {
        initComponents();
        Controller controller = Controller.getInstance();
        LinkedList<Roba> sveRobe = controller.getRobaForDobavljac(dobavljac.getIdDobavljac());
        for (Roba r: sveRobe) {
            jPanel2.add(new PanelProizvod(r));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(234, 216, 192));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(234, 216, 192));
        jPanel1.setForeground(new java.awt.Color(204, 0, 153));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setMinimumSize(new java.awt.Dimension(1, 10));
        jSeparator1.setPreferredSize(new java.awt.Dimension(10, 10));
        jPanel1.add(jSeparator1, java.awt.BorderLayout.LINE_END);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setMinimumSize(new java.awt.Dimension(1, 10));
        jSeparator2.setPreferredSize(new java.awt.Dimension(10, 10));
        jPanel1.add(jSeparator2, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(new java.awt.Color(234, 216, 192));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.PAGE_AXIS));
        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        jScrollPane1.setViewportView(jPanel1);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
