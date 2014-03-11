package br.com.gmp.comps.table.dual;

import br.com.gmp.comps.objects.TableObject;
import br.com.gmp.comps.table.dual.models.DestinationModel;
import br.com.gmp.comps.table.dual.models.SourceModel;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 * Painel de tabelas duplas
 *
 * @author kaciano
 * @version 1.0
 */
public class GMPDualTable extends JPanel {

    private Class<?> objectClass;
    private String sourceText;
    private String destText;
    private SourceModel sourceModel;
    private DestinationModel destModel;

    /**
     * Cria nova instancia de GMPDualTable
     */
    public GMPDualTable() {
        this.objectClass = TableObject.class;
        initialize();
    }

    /**
     * Cria nova instancia de GMPDualTable
     *
     * @param objectClass <code>Class<?></code> Classe dos objetos
     */
    public GMPDualTable(Class<?> objectClass) {
        this.objectClass = objectClass;
        initialize();
    }

    /**
     * Método de inicialização
     */
    private void initialize() {
        this.sourceModel = new SourceModel(objectClass);
        this.destModel = new DestinationModel(objectClass);
        initComponents();
    }

    /**
     * Adiciona os objetos à fonte
     *
     * @param objects <code>Object[]</code> Objetos a serem adicionados
     */
    public void addSource(Object... objects) {
        for (Object object : objects) {
            gTableSource.getGmpModel().add(object);
        }
    }

    /**
     * Adiciona os objetos ao destino
     *
     * @param objects <code>Object[]</code> Objetos a serem adicionados
     */
    public void addDest(Object... objects) {
        for (Object object : objects) {
            gTableDest.getGmpModel().add(object);
        }
    }

    /**
     * Retorna os objetos selecionados na tabela fonte
     *
     * @return <code>Object[]</code> Objetos selecionados
     */
    public Object[] getSourceSelected() {
        int[] selectedRows = gTableSource.getSelectedRows();
        List<Object> objs = new ArrayList<>();
        for (int i : selectedRows) {
            objs.add(gTableSource.getGmpModel().getObject(i));
        }
        return objs.toArray();
    }

    /**
     * Retorna os objetos selecionados na tabela destino
     *
     * @return <code>Object[]</code> Objetos selecionados
     */
    public Object[] getDestSelected() {
        int[] selectedRows = gTableDest.getSelectedRows();
        List<Object> objs = new ArrayList<>();
        for (int i : selectedRows) {
            objs.add(gTableDest.getGmpModel().getObject(i));
        }
        return objs.toArray();
    }

    /**
     * Método de movementação de itens da tabela de fonte para a destino
     */
    private void addToDest(ActionEvent evt) {
        if (getSourceSelected() != null) {
            Object[] source = getSourceSelected();
            for (Object object : source) {
                gTableDest.getGmpModel().add(object);
                gTableSource.getGmpModel().remove(object);
            }
        }
    }

    /**
     * Método de movementação de todos os itens da tabela de fonte para a
     * destino
     */
    private void addAllToDest(ActionEvent evt) {
        if (getSourceSelected() != null) {
            Object[] source = sourceModel.getList().toArray();
            for (Object object : source) {
                gTableDest.getGmpModel().add(object);                
            }
            gTableSource.getGmpModel().clear();
        }
    }

    /**
     * Método de movementação de itens da tabela de destino para a fonte
     */
    private void removeFromDest(ActionEvent evt) {
        if (getDestSelected() != null) {
            Object[] dest = getDestSelected();
            for (Object object : dest) {
                gTableSource.getGmpModel().add(object);
                gTableDest.getGmpModel().remove(object);
            }
        }
    }

    /**
     * Método de movementação de todos os itens da tabela de destino para a
     * fonte
     */
    private void removeAllFromDest(ActionEvent evt) {
        if (getDestSelected() != null) {
            Object[] dest = gTableDest.getGmpModel().getList().toArray();
            for (Object object : dest) {
                gTableSource.getGmpModel().add(object);                
            }
            gTableDest.getGmpModel().clear();
        }
    }
    //<editor-fold desc="Get's & Set's" defaultstate="collapsed">
    /**
     *
     * @return
     */
    public String getSourceText() {
        return sourceText;
    }

    /**
     *
     * @param sourceText
     */
    public void setSourceText(String sourceText) {
        this.sourceText = sourceText;
        this.jLSource.setText(sourceText);
    }

    /**
     *
     * @return
     */
    public String getDestText() {
        return destText;
    }

    /**
     *
     * @param destText
     */
    public void setDestText(String destText) {
        this.destText = destText;
        this.jLDest.setText(destText);
    }

    /**
     *
     * @return
     */
    public Class<?> getObjectClass() {
        return objectClass;
    }

    /**
     *
     * @param objectClass
     */
    public void setObjectClass(Class<?> objectClass) {
        this.objectClass = objectClass;
    }

    /**
     *
     * @return
     */
    public SourceModel getSourceModel() {
        return sourceModel;
    }

    /**
     *
     * @param sourceModel
     */
    public void setSourceModel(SourceModel sourceModel) {
        this.sourceModel = sourceModel;
    }

    public DestinationModel getDestModel() {
        return destModel;
    }

    public void setDestModel(DestinationModel destModel) {
        this.destModel = destModel;
    }

    //</editor-fold>
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSPDest = new javax.swing.JScrollPane();
        gTableDest = new br.com.gmp.comps.table.GMPTable();
        jTBControls = new javax.swing.JToolBar();
        jBAddToDest = new javax.swing.JButton();
        jBAddToSource = new javax.swing.JButton();
        jBAddAllSource = new javax.swing.JButton();
        jBRemoveAllDest = new javax.swing.JButton();
        jSPSource = new javax.swing.JScrollPane();
        gTableSource = new br.com.gmp.comps.table.GMPTable();
        jPLabels = new javax.swing.JPanel();
        jLSource = new javax.swing.JLabel();
        jLDest = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSPDest.setName("jSPDest"); // NOI18N

        gTableDest.setName("gTableDest"); // NOI18N
        jSPDest.setViewportView(gTableDest);

        jTBControls.setFloatable(false);
        jTBControls.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jTBControls.setRollover(true);
        jTBControls.setName("jTBControls"); // NOI18N

        jBAddToDest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/comps/icons/16/Navigate_right.png"))); // NOI18N
        jBAddToDest.setFocusable(false);
        jBAddToDest.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBAddToDest.setName("jBAddToDest"); // NOI18N
        jBAddToDest.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBAddToDest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddToDestActionPerformed(evt);
            }
        });
        jTBControls.add(jBAddToDest);

        jBAddToSource.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/comps/icons/16/Navigate_left.png"))); // NOI18N
        jBAddToSource.setFocusable(false);
        jBAddToSource.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBAddToSource.setName("jBAddToSource"); // NOI18N
        jBAddToSource.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBAddToSource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddToSourceActionPerformed(evt);
            }
        });
        jTBControls.add(jBAddToSource);

        jBAddAllSource.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/comps/icons/16/Hide_right.png"))); // NOI18N
        jBAddAllSource.setFocusable(false);
        jBAddAllSource.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBAddAllSource.setName("jBAddAllSource"); // NOI18N
        jBAddAllSource.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBAddAllSource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddAllSourceActionPerformed(evt);
            }
        });
        jTBControls.add(jBAddAllSource);

        jBRemoveAllDest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/comps/icons/16/Hide_left.png"))); // NOI18N
        jBRemoveAllDest.setFocusable(false);
        jBRemoveAllDest.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBRemoveAllDest.setName("jBRemoveAllDest"); // NOI18N
        jBRemoveAllDest.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBRemoveAllDest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRemoveAllDestActionPerformed(evt);
            }
        });
        jTBControls.add(jBRemoveAllDest);

        jSPSource.setName("jSPSource"); // NOI18N

        gTableSource.setName("gTableSource"); // NOI18N
        jSPSource.setViewportView(gTableSource);

        jPLabels.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPLabels.setName("jPLabels"); // NOI18N
        jPLabels.setLayout(new java.awt.GridLayout());

        jLSource.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLSource.setText("Source");
        jLSource.setName("jLSource"); // NOI18N
        jPLabels.add(jLSource);

        jLDest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLDest.setText("Destination");
        jLDest.setName("jLDest"); // NOI18N
        jPLabels.add(jLDest);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSPSource, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTBControls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSPDest, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPLabels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPLabels, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTBControls, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSPSource, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addComponent(jSPDest, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBAddToDestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddToDestActionPerformed
        addToDest(evt);
    }//GEN-LAST:event_jBAddToDestActionPerformed

    private void jBAddToSourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddToSourceActionPerformed
        removeFromDest(evt);
    }//GEN-LAST:event_jBAddToSourceActionPerformed

    private void jBAddAllSourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddAllSourceActionPerformed
        addAllToDest(evt);
    }//GEN-LAST:event_jBAddAllSourceActionPerformed

    private void jBRemoveAllDestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRemoveAllDestActionPerformed
        removeAllFromDest(evt);
    }//GEN-LAST:event_jBRemoveAllDestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.gmp.comps.table.GMPTable gTableDest;
    private br.com.gmp.comps.table.GMPTable gTableSource;
    private javax.swing.JButton jBAddAllSource;
    private javax.swing.JButton jBAddToDest;
    private javax.swing.JButton jBAddToSource;
    private javax.swing.JButton jBRemoveAllDest;
    private javax.swing.JLabel jLDest;
    private javax.swing.JLabel jLSource;
    private javax.swing.JPanel jPLabels;
    private javax.swing.JScrollPane jSPDest;
    private javax.swing.JScrollPane jSPSource;
    private javax.swing.JToolBar jTBControls;
    // End of variables declaration//GEN-END:variables
}
