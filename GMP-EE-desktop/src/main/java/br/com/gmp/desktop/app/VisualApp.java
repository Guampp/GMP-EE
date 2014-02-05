package br.com.gmp.desktop.app;

import br.com.gmp.desktop.beans.ViewBean;
import br.com.gmp.desktop.views.GMPJInternalFrame;
import javax.swing.JTabbedPane;

/**
 *
 * @author kaciano
 */
public class VisualApp extends javax.swing.JFrame {

    VisualAppBean appBean;

    /**
     * Creates new form VisualApp
     */
    public VisualApp() {
        initComponents();
        appBean = new VisualAppBean(this);
        GMPJInternalFrame frame = new GMPJInternalFrame(appBean, new ViewBean());
        frame.setName("Teste");
        frame.setSize(200, 250);
        frame.setVisible(true);
        GMPJInternalFrame frame2 = new GMPJInternalFrame(appBean, new ViewBean());
        frame2.setName("Teste2");
        frame2.setSize(200, 250);
        frame2.setVisible(true);
        desktop.add(frame);
        desktop.add(frame2);
        desktop.setSelectedFrame(frame);
    }

    /**
     *
     * @param laf
     */
    private void changeLAF(String laf) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (laf.equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    System.out.println(laf);
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        this.getContentPane().repaint();
        this.getContentPane().revalidate();
    }

    /**
     *
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        desktop = new javax.swing.JDesktopPane();
        jPopDesktop = new javax.swing.JPopupMenu();
        jMIAdd = new javax.swing.JMenuItem();
        jMICloseAll = new javax.swing.JMenuItem();
        TaskContainer = new org.jdesktop.swingx.JXTaskPaneContainer();
        jTBFunctions = new javax.swing.JToolBar();
        gBConfirm = new comps.button.GMPButton();
        gBDiscard = new comps.button.GMPButton();
        gBProcess = new comps.button.GMPButton();
        jTBSearch = new javax.swing.JToolBar();
        jTSearchField = new javax.swing.JTextField();
        gBSearch = new comps.button.GMPButton();
        jTBMsg = new javax.swing.JToolBar();
        jLMsg = new javax.swing.JLabel();
        jTBUser = new javax.swing.JToolBar();
        gBLogout = new comps.button.GMPButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jLUser = new javax.swing.JLabel();
        jTBSystem = new javax.swing.JToolBar();
        jLWeb = new javax.swing.JLabel();
        jLSystem = new javax.swing.JLabel();
        gTPDesktops = new comps.tabbedpane.GMPJTabbedPane();
        jMenuBar = new javax.swing.JMenuBar();
        jMOption = new javax.swing.JMenu();
        jMILogoff = new javax.swing.JMenuItem();
        jMIExit = new javax.swing.JMenuItem();
        jMLookAndFeel = new javax.swing.JMenu();
        jMIMetal = new javax.swing.JRadioButtonMenuItem();
        jMIMotif = new javax.swing.JRadioButtonMenuItem();

        desktop.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );

        jMIAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/browser_add.png"))); // NOI18N
        jMIAdd.setText("Adicionar área");
        jMIAdd.setToolTipText("Adiciona nova área de trabalho");
        jPopDesktop.add(jMIAdd);

        jMICloseAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/browser_delete.png"))); // NOI18N
        jMICloseAll.setText("Remover todas");
        jMICloseAll.setToolTipText("Remove todas as áreas de trabalho");
        jPopDesktop.add(jMICloseAll);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Guampp 1.0");
        setMinimumSize(new java.awt.Dimension(750, 475));

        TaskContainer.setBackground(new java.awt.Color(51, 102, 255));
        TaskContainer.setMinimumSize(new java.awt.Dimension(200, 10));
        org.jdesktop.swingx.VerticalLayout verticalLayout1 = new org.jdesktop.swingx.VerticalLayout();
        verticalLayout1.setGap(14);
        TaskContainer.setLayout(verticalLayout1);

        jTBFunctions.setFloatable(false);
        jTBFunctions.setMaximumSize(new java.awt.Dimension(88, 40));
        jTBFunctions.setMinimumSize(new java.awt.Dimension(88, 40));
        jTBFunctions.setPreferredSize(new java.awt.Dimension(88, 40));

        gBConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/invert/circle_ok.png"))); // NOI18N
        gBConfirm.setEndColor(new java.awt.Color(51, 153, 255));
        gBConfirm.setHorizontalTextPosition(0);
        gBConfirm.setPressedIcon(new javax.swing.ImageIcon("/home/kaciano/NetBeansProjects/GMP-EE/GMP-EE-desktop/src/main/resources/IKONS/16/circle_ok.png")); // NOI18N
        gBConfirm.setStartColor(new java.awt.Color(51, 102, 255));
        gBConfirm.setToolTipText("Confirmar");
        gBConfirm.setVerticalTextPosition(3);
        gBConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBConfirmActionPerformed(evt);
            }
        });
        jTBFunctions.add(gBConfirm);

        gBDiscard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/invert/circle_delete.png"))); // NOI18N
        gBDiscard.setEndColor(new java.awt.Color(51, 153, 255));
        gBDiscard.setHorizontalTextPosition(0);
        gBDiscard.setPressedIcon(new javax.swing.ImageIcon("/home/kaciano/NetBeansProjects/GMP-EE/GMP-EE-desktop/src/main/resources/IKONS/16/circle_delete.png")); // NOI18N
        gBDiscard.setStartColor(new java.awt.Color(51, 102, 255));
        gBDiscard.setToolTipText("Descartar");
        gBDiscard.setVerticalTextPosition(3);
        gBDiscard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBDiscardActionPerformed(evt);
            }
        });
        jTBFunctions.add(gBDiscard);

        gBProcess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/invert/cog.png"))); // NOI18N
        gBProcess.setEndColor(new java.awt.Color(51, 153, 255));
        gBProcess.setHorizontalTextPosition(0);
        gBProcess.setPressedIcon(new javax.swing.ImageIcon("/home/kaciano/NetBeansProjects/GMP-EE/GMP-EE-desktop/src/main/resources/IKONS/16/cog.png")); // NOI18N
        gBProcess.setStartColor(new java.awt.Color(51, 102, 255));
        gBProcess.setToolTipText("Processar");
        gBProcess.setVerticalTextPosition(3);
        gBProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBProcessActionPerformed(evt);
            }
        });
        jTBFunctions.add(gBProcess);

        jTBSearch.setFloatable(false);

        jTSearchField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTSearchField.setMinimumSize(new java.awt.Dimension(120, 19));
        jTBSearch.add(jTSearchField);

        gBSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/invert/magnifying_glass.png"))); // NOI18N
        gBSearch.setEndColor(new java.awt.Color(51, 153, 255));
        gBSearch.setHorizontalTextPosition(0);
        gBSearch.setPressedIcon(new javax.swing.ImageIcon("/home/kaciano/NetBeansProjects/GMP-EE/GMP-EE-desktop/src/main/resources/IKONS/16/magnifying_glass.png")); // NOI18N
        gBSearch.setStartColor(new java.awt.Color(51, 102, 255));
        gBSearch.setToolTipText("Procurar");
        gBSearch.setVerticalTextPosition(3);
        gBSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBSearchActionPerformed(evt);
            }
        });
        jTBSearch.add(gBSearch);

        jTBMsg.setFloatable(false);

        jLMsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/speech_bubble_1.png"))); // NOI18N
        jLMsg.setMaximumSize(new java.awt.Dimension(32174, 32174));
        jTBMsg.add(jLMsg);

        jTBUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTBUser.setFloatable(false);

        gBLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/invert/logout.png"))); // NOI18N
        gBLogout.setEndColor(new java.awt.Color(51, 153, 255));
        gBLogout.setHorizontalTextPosition(0);
        gBLogout.setPressedIcon(new javax.swing.ImageIcon("/home/kaciano/NetBeansProjects/GMP-EE/GMP-EE-desktop/src/main/resources/IKONS/16/logout.png")); // NOI18N
        gBLogout.setStartColor(new java.awt.Color(51, 102, 255));
        gBLogout.setToolTipText("Trocar usuário");
        gBLogout.setVerticalTextPosition(3);
        gBLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBLogoutActionPerformed(evt);
            }
        });
        jTBUser.add(gBLogout);
        jTBUser.add(jSeparator1);

        jLUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/user_circle.png"))); // NOI18N
        jLUser.setText("Usuário");
        jLUser.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jTBUser.add(jLUser);

        jTBSystem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTBSystem.setFloatable(false);

        jLWeb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLWeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/globe.png"))); // NOI18N
        jLWeb.setMaximumSize(new java.awt.Dimension(30, 32678));
        jLWeb.setMinimumSize(new java.awt.Dimension(30, 15));
        jTBSystem.add(jLWeb);

        jLSystem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLSystem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/wifi_3.png"))); // NOI18N
        jLSystem.setMaximumSize(new java.awt.Dimension(30, 32678));
        jLSystem.setMinimumSize(new java.awt.Dimension(30, 15));
        jTBSystem.add(jLSystem);

        gTPDesktops.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        gTPDesktops.addClosableTab("Desktop", desktop);
        gTPDesktops.setTabPlacement(JTabbedPane.BOTTOM);

        jMOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/list_2.png"))); // NOI18N
        jMOption.setText("Opções");

        jMILogoff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/logout.png"))); // NOI18N
        jMILogoff.setText("Logout");
        jMOption.add(jMILogoff);

        jMIExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/power.png"))); // NOI18N
        jMIExit.setText("Sair");
        jMOption.add(jMIExit);

        jMenuBar.add(jMOption);

        jMLookAndFeel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/map.png"))); // NOI18N
        jMLookAndFeel.setText("LookAndFeel");

        buttonGroup1.add(jMIMetal);
        jMIMetal.setSelected(true);
        jMIMetal.setText("Metal");
        jMIMetal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIMetalActionPerformed(evt);
            }
        });
        jMLookAndFeel.add(jMIMetal);

        buttonGroup1.add(jMIMotif);
        jMIMotif.setText("Motif");
        jMIMotif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIMotifActionPerformed(evt);
            }
        });
        jMLookAndFeel.add(jMIMotif);

        jMenuBar.add(jMLookAndFeel);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TaskContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTBUser, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTBFunctions, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(jTBSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTBMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(jTBSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(gTPDesktops, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TaskContainer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTBSearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTBFunctions, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(gTPDesktops, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTBMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTBUser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTBSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMIMetalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIMetalActionPerformed
        changeLAF("Metal");
    }//GEN-LAST:event_jMIMetalActionPerformed

    private void jMIMotifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIMotifActionPerformed
        changeLAF("CDE/Motif");
    }//GEN-LAST:event_jMIMotifActionPerformed

    private void gBConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gBConfirmActionPerformed
        appBean.confirm();
    }//GEN-LAST:event_gBConfirmActionPerformed

    private void gBDiscardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gBDiscardActionPerformed
        appBean.discard();
    }//GEN-LAST:event_gBDiscardActionPerformed

    private void gBProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gBProcessActionPerformed
        appBean.process();
    }//GEN-LAST:event_gBProcessActionPerformed

    private void gBLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gBLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gBLogoutActionPerformed

    private void gBSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gBSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gBSearchActionPerformed

    //<editor-fold desc="Get's & Set's" defaultstate="collapsed">
    /**
     *
     * @return
     */
    public VisualAppBean getAppBean() {
        return appBean;
    }

    /**
     *
     * @param appBean
     */
    public void setAppBean(VisualAppBean appBean) {
        this.appBean = appBean;
    }

    /**
     *
     * @return
     */
    public org.jdesktop.swingx.JXTaskPaneContainer getTaskContainer() {
        return TaskContainer;
    }

    /**
     *
     * @param TaskContainer
     */
    public void setTaskContainer(org.jdesktop.swingx.JXTaskPaneContainer TaskContainer) {
        this.TaskContainer = TaskContainer;
    }

    /**
     *
     * @return
     */
    public javax.swing.JDesktopPane getDesktop() {
        return desktop;
    }

    /**
     *
     * @param desktop
     */
    public void setDesktop(javax.swing.JDesktopPane desktop) {
        this.desktop = desktop;
    }

    /**
     *
     * @return
     */
    public javax.swing.JLabel getjLUser() {
        return jLUser;
    }

    /**
     *
     * @param jLUser
     */
    public void setjLUser(javax.swing.JLabel jLUser) {
        this.jLUser = jLUser;
    }

    /**
     *
     * @return
     */
    public javax.swing.JToolBar.Separator getjSeparator1() {
        return jSeparator1;
    }

    /**
     *
     * @param jSeparator1
     */
    public void setjSeparator1(javax.swing.JToolBar.Separator jSeparator1) {
        this.jSeparator1 = jSeparator1;
    }

    /**
     *
     * @return
     */
    public javax.swing.JToolBar getjTBFunctions() {
        return jTBFunctions;
    }

    /**
     *
     * @param jTBFunctions
     */
    public void setjTBFunctions(javax.swing.JToolBar jTBFunctions) {
        this.jTBFunctions = jTBFunctions;
    }

    /**
     *
     * @return
     */
    public javax.swing.JToolBar getjTBMsg() {
        return jTBMsg;
    }

    /**
     *
     * @param jTBMsg
     */
    public void setjTBMsg(javax.swing.JToolBar jTBMsg) {
        this.jTBMsg = jTBMsg;
    }

    /**
     *
     * @return
     */
    public javax.swing.JToolBar getjTBSearch() {
        return jTBSearch;
    }

    /**
     *
     * @param jTBSearch
     */
    public void setjTBSearch(javax.swing.JToolBar jTBSearch) {
        this.jTBSearch = jTBSearch;
    }

    /**
     *
     * @return
     */
    public javax.swing.JToolBar getjTBUser() {
        return jTBUser;
    }

    /**
     *
     * @param jTBUser
     */
    public void setjTBUser(javax.swing.JToolBar jTBUser) {
        this.jTBUser = jTBUser;
    }

    /**
     *
     * @return
     */
    public javax.swing.JTextField getjTSearchField() {
        return jTSearchField;
    }

    /**
     *
     * @param jTSearchField
     */
    public void setjTSearchField(javax.swing.JTextField jTSearchField) {
        this.jTSearchField = jTSearchField;
    }
    //</editor-fold>

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        try {
//            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
//        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
//            Logger.getLogger(VisualApp.class.getName()).log(Level.SEVERE, null, ex);
//        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VisualApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXTaskPaneContainer TaskContainer;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JDesktopPane desktop;
    private comps.button.GMPButton gBConfirm;
    private comps.button.GMPButton gBDiscard;
    private comps.button.GMPButton gBLogout;
    private comps.button.GMPButton gBProcess;
    private comps.button.GMPButton gBSearch;
    private comps.tabbedpane.GMPJTabbedPane gTPDesktops;
    private javax.swing.JLabel jLMsg;
    private javax.swing.JLabel jLSystem;
    private javax.swing.JLabel jLUser;
    private javax.swing.JLabel jLWeb;
    private javax.swing.JMenuItem jMIAdd;
    private javax.swing.JMenuItem jMICloseAll;
    private javax.swing.JMenuItem jMIExit;
    private javax.swing.JMenuItem jMILogoff;
    private javax.swing.JRadioButtonMenuItem jMIMetal;
    private javax.swing.JRadioButtonMenuItem jMIMotif;
    private javax.swing.JMenu jMLookAndFeel;
    private javax.swing.JMenu jMOption;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPopupMenu jPopDesktop;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar jTBFunctions;
    private javax.swing.JToolBar jTBMsg;
    private javax.swing.JToolBar jTBSearch;
    private javax.swing.JToolBar jTBSystem;
    private javax.swing.JToolBar jTBUser;
    private javax.swing.JTextField jTSearchField;
    // End of variables declaration//GEN-END:variables

}
