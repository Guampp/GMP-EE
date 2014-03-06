package br.com.gmp.comps.table.bar;

import br.com.gmp.comps.table.GMPTable;

/**
 * Barra de controles padronizados para GMPTables
 *
 * @author kaciano
 * @version 1.0
 */
public class GMPTableBar extends javax.swing.JPanel {

    private GMPTable gTable;

    /**
     * Cria nova instancia da barra de controle para tabelas
     */
    public GMPTableBar() {
    }

    /**
     * Cria nova instancia da barra de controle para tabelas
     *
     * @param gTable <code>GMPTable</code> Tabela
     */
    public GMPTableBar(GMPTable gTable) {
        initComponents();
        this.gTable = gTable;
    }

    //<editor-fold desc="Get's & Set's" defaultstate="collapsed">
    /**
     * Retorna a tabela que está sendo utilizada
     *
     * @return <code>GMPTable</code> Tabela
     */
    public GMPTable getTable() {
        return gTable;
    }

    /**
     * Modifica a tabela que está sendo utilizada
     *
     * @param table <code>GMPTable</code> Tabela
     */
    public void setTable(GMPTable table) {
        this.gTable = table;
    }
    //</editor-fold>

    /**
     * Modifica o rotulo das páginas
     *
     * @param pages <code>Integer</code> Total de páginas
     * @param actualpage <code>Integer</code> Página atual
     */
    public void setPages(int pages, int actualpage) {
        this.nTPage.setText(String.format("%s/%d", pages, actualpage));
    }

    /**
     * Código gerado automaticamente
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTBPrevious = new javax.swing.JToolBar();
        jBFirst = new javax.swing.JButton();
        jBPrevious = new javax.swing.JButton();
        jTBPage = new javax.swing.JToolBar();
        nTPage = new br.com.gmp.comps.textfield.NumericTextField();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jLPages = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jBRefresh = new javax.swing.JButton();
        jTBNext = new javax.swing.JToolBar();
        jBNext = new javax.swing.JButton();
        jBLast = new javax.swing.JButton();

        jTBPrevious.setFloatable(false);
        jTBPrevious.setRollover(true);

        jBFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/comps/icons/16/Hide_left.png"))); // NOI18N
        jBFirst.setToolTipText("Voltar para a primeira página");
        jBFirst.setFocusable(false);
        jBFirst.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBFirst.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFirstActionPerformed(evt);
            }
        });
        jTBPrevious.add(jBFirst);

        jBPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/comps/icons/16/Navigate_left.png"))); // NOI18N
        jBPrevious.setToolTipText("Voltar para a página anterior");
        jBPrevious.setFocusable(false);
        jBPrevious.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBPrevious.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPreviousActionPerformed(evt);
            }
        });
        jTBPrevious.add(jBPrevious);

        jTBPage.setFloatable(false);
        jTBPage.setRollover(true);

        nTPage.setMaximumSize(new java.awt.Dimension(100, 25));
        nTPage.setMinimumSize(new java.awt.Dimension(100, 25));
        nTPage.setToolTipText("<html>Para trocar de página, <b>insira o número</b> da mesma e tecle <b>[ENTER]</b></html>");
        nTPage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nTPageKeyReleased(evt);
            }
        });
        jTBPage.add(nTPage);
        jTBPage.add(jSeparator1);

        jLPages.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLPages.setText("1/1");
        jLPages.setMaximumSize(new java.awt.Dimension(50, 15));
        jTBPage.add(jLPages);
        jTBPage.add(jSeparator2);

        jBRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/comps/icons/16/Refresh.png"))); // NOI18N
        jBRefresh.setToolTipText("Atualizar a tabela");
        jBRefresh.setFocusable(false);
        jBRefresh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBRefresh.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRefreshActionPerformed(evt);
            }
        });
        jTBPage.add(jBRefresh);

        jTBNext.setFloatable(false);
        jTBNext.setRollover(true);

        jBNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/comps/icons/16/Navigate_right.png"))); // NOI18N
        jBNext.setToolTipText("Ir para a próxima página");
        jBNext.setFocusable(false);
        jBNext.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBNext.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNextActionPerformed(evt);
            }
        });
        jTBNext.add(jBNext);

        jBLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/comps/icons/16/Hide_right.png"))); // NOI18N
        jBLast.setToolTipText("Ir para a ultima página");
        jBLast.setFocusable(false);
        jBLast.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBLast.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLastActionPerformed(evt);
            }
        });
        jTBNext.add(jBLast);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTBPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTBPage, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jTBNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTBPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jTBNext, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jTBPage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPreviousActionPerformed
        this.gTable.previousPage();
    }//GEN-LAST:event_jBPreviousActionPerformed

    private void jBFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFirstActionPerformed
        this.gTable.gotoFirst();
    }//GEN-LAST:event_jBFirstActionPerformed

    private void jBNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNextActionPerformed
        this.gTable.nextPage();
    }//GEN-LAST:event_jBNextActionPerformed

    private void jBLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLastActionPerformed
        this.gTable.gotoLast();
    }//GEN-LAST:event_jBLastActionPerformed

    private void jBRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRefreshActionPerformed
        this.gTable.refresh();
    }//GEN-LAST:event_jBRefreshActionPerformed

    private void nTPageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nTPageKeyReleased
        this.gTable.setActualPage(Integer.parseInt(nTPage.getText()));
    }//GEN-LAST:event_nTPageKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBFirst;
    private javax.swing.JButton jBLast;
    private javax.swing.JButton jBNext;
    private javax.swing.JButton jBPrevious;
    private javax.swing.JButton jBRefresh;
    private javax.swing.JLabel jLPages;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jTBNext;
    private javax.swing.JToolBar jTBPage;
    private javax.swing.JToolBar jTBPrevious;
    private br.com.gmp.comps.textfield.NumericTextField nTPage;
    // End of variables declaration//GEN-END:variables
}
