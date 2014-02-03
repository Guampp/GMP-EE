/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmp.desktop.views;

import br.com.gmp.desktop.app.VisualAppBean;
import br.com.gmp.desktop.beans.ViewBean;

/**
 *
 * @author kaciano
 */
public class UserView extends GMPJInternalFrame {

    /**
     *
     * @param appBean
     * @param viewBean
     */
    public UserView(VisualAppBean appBean, ViewBean viewBean) {
        super(appBean, viewBean);
        
    }

    /**
     *
     * @param appBean
     * @param viewBean
     * @param canConfirm
     * @param canDiscard
     * @param canProcess
     */
    public UserView(VisualAppBean appBean, ViewBean viewBean, boolean canConfirm, boolean canDiscard, boolean canProcess) {
        super(appBean, viewBean, canConfirm, canDiscard, canProcess);
    }

    /**
     *
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
