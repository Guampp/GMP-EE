/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package comps.buttonfield;

import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author kaciano
 */
public class GMPButtonField extends JPanel {

    /**
     * Creates new form GMPButtonField
     */
    public GMPButtonField() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBorder(new JTextField().getBorder());
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        jTextField1.setText("jTextField1");
        jTextField1.setBorder(null);
        jTextField1.setMinimumSize(new java.awt.Dimension(4, 25));
        jTextField1.setPreferredSize(new java.awt.Dimension(100, 25));
        add(jTextField1);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/menuitem/16/code.png"))); // NOI18N
        jButton1.setMaximumSize(new java.awt.Dimension(50, 25));
        jButton1.setMinimumSize(new java.awt.Dimension(50, 25));
        jButton1.setPreferredSize(new java.awt.Dimension(50, 25));
        add(jButton1);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}