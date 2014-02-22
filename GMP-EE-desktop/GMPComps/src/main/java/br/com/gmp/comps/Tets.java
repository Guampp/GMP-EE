/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmp.comps;

import br.com.gmp.comps.model.GMPTableModel;
import java.util.Objects;
import javax.swing.JTable;

/**
 *
 * @author kaciano
 */
public class Tets extends javax.swing.JFrame {

    /**
     * Creates new form Tets
     */
    public Tets() {
        initComponents();
        try {
            jTable.setModel(new DefaultModel());
            gTable.setModel(new DefaultModel());
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
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

        gMPTextField1 = new br.com.gmp.comps.textfield.GMPTextField();
        gMPButton1 = new br.com.gmp.comps.button.GMPButton();
        gMPDateField1 = new br.com.gmp.comps.datefield.GMPDateField();
        gMPButton2 = new br.com.gmp.comps.button.GMPButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        gMPJTabbedPane1 = new br.com.gmp.comps.tabbedpane.GMPJTabbedPane();
        gMPButton3 = new br.com.gmp.comps.button.GMPButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        gMPTable1 = new br.com.gmp.comps.table.GMPTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        gMPTable2 = new br.com.gmp.comps.table.GMPTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        gTable = new br.com.gmp.comps.table.GMPTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gMPTextField1.setName("gMPTextField1"); // NOI18N

        gMPButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/arrow_2.png"))); // NOI18N
        gMPButton1.setName("gMPButton1"); // NOI18N
        gMPButton1.setText("Validar");
        gMPButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gMPButton1ActionPerformed(evt);
            }
        });

        gMPDateField1.setName("gMPDateField1"); // NOI18N

        gMPButton2.setName("gMPButton2"); // NOI18N
        gMPButton2.setText("Validar");
        gMPButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gMPButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Add");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        gMPJTabbedPane1.setName("gMPJTabbedPane1"); // NOI18N

        gMPButton3.setName("gMPButton3"); // NOI18N
        gMPButton3.setText("gMPButton3");
        gMPButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gMPButton3ActionPerformed(evt);
            }
        });
        gMPJTabbedPane1.addTab("tab1", gMPButton3);

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        gMPTable1.setName("gMPTable1"); // NOI18N
        jScrollPane2.setViewportView(gMPTable1);

        gMPJTabbedPane1.addTab("tab2", jScrollPane2);

        jScrollPane4.setName("jScrollPane4"); // NOI18N

        gMPTable2.setName("gMPTable2"); // NOI18N
        jScrollPane4.setViewportView(gMPTable2);

        gMPJTabbedPane1.addTab("tab3", jScrollPane4);

        jScrollPane3.setName("jScrollPane3"); // NOI18N

        gTable.setName("gTable"); // NOI18N
        jScrollPane3.setViewportView(gTable);

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable.setName("jTable"); // NOI18N
        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(gMPDateField1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(gMPButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(gMPTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(gMPButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(gMPJTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gMPDateField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gMPButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gMPTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gMPButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gMPJTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gMPButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gMPButton1ActionPerformed
        gMPTextField1.validateComponent();
    }//GEN-LAST:event_gMPButton1ActionPerformed

    private void gMPButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gMPButton2ActionPerformed
        gMPDateField1.validateComponent();
    }//GEN-LAST:event_gMPButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GMPTableModel model = (GMPTableModel) jTable.getModel();
        GMPTableModel gmpModel = (GMPTableModel) gTable.getModel();
        model.add(new DefaultModelObject("Kaciano", 22, true));
        gmpModel.add(new DefaultModelObject("Kaciano", 22, true));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            int row = jTable.getSelectedRow();
            GMPTableModel model = (GMPTableModel) jTable.getModel();
            model.remove(row);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void gMPButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gMPButton3ActionPerformed
        gMPJTabbedPane1.addClosableTab("1236548", new JTable());
    }//GEN-LAST:event_gMPButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Tets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.gmp.comps.button.GMPButton gMPButton1;
    private br.com.gmp.comps.button.GMPButton gMPButton2;
    private br.com.gmp.comps.button.GMPButton gMPButton3;
    private br.com.gmp.comps.datefield.GMPDateField gMPDateField1;
    private br.com.gmp.comps.tabbedpane.GMPJTabbedPane gMPJTabbedPane1;
    private br.com.gmp.comps.table.GMPTable gMPTable1;
    private br.com.gmp.comps.table.GMPTable gMPTable2;
    private br.com.gmp.comps.textfield.GMPTextField gMPTextField1;
    private br.com.gmp.comps.table.GMPTable gTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}

class DefaultModel extends GMPTableModel<DefaultModelObject> {

    public DefaultModel() {
        super(DefaultModelObject.class);
    }

}

/**
 * Objeto utilizado na construção do GMPTableModel quando o mesmo está sem
 * nenhum parametro
 *
 * @author kaciano
 */
class DefaultModelObject {

    private String name;
    private int age;
    private boolean alive;

    /**
     * Cria novo DefaultModelObject
     */
    public DefaultModelObject() {
    }

    /**
     * Cria novo DefaultModelObject
     *
     * @param name
     * @param age
     * @param alive
     */
    public DefaultModelObject(String name, int age, boolean alive) {
        this.name = name;
        this.age = age;
        this.alive = alive;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + this.age;
        hash = 41 * hash + (this.alive ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DefaultModelObject other = (DefaultModelObject) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        return this.alive == other.alive;
    }

    @Override
    public String toString() {
        return "DefaultModelObject{" + "name=" + name + ", age=" + age + ", alive=" + alive + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

}
