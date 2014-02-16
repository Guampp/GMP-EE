package br.com.gmp.desktop.app;

import br.com.gmp.utils.interact.WindowUtil;
import br.com.gmp.desktop.app.bean.VisualAppBean;
import br.com.gmp.comps.tabbedpane.GMPJTabbedPane;
import br.com.gmp.comps.taskcontainer.GMPTaskContainer;
import br.com.gmp.desktop.app.system.SystemProperties;
import br.com.gmp.desktop.views.ViewFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 * Aplicação Visual Principal
 *
 * @author kaciano
 * @since 1.0
 * @version 1.0
 */
public class VisualApp extends javax.swing.JFrame {

    private VisualAppBean appBean;
    private SystemProperties systemProperties;

    /**
     * Cria nova instancia de VisualApp
     *
     * @see javax.swing.JFrame
     */
    public VisualApp() {
        initComponents();
        appBean = new VisualAppBean(this);
        initialize();
    }

    /**
     * Inicializa o Frame
     *
     * @see br.com.gmp.desktop.app.system.SystemProperties#constructActions()
     */
    private void initialize() {
        systemProperties = new SystemProperties(this);
        this.getGlassPane().setBackground(Color.red);
        Task.add(item);
    }

    /**
     * Muda o LookAndFeel
     *
     * @param laf <code>String</code> Nome do LookAndFeel
     */
    private void changeLAF(String laf) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (laf.equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    System.out.println(laf);
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        this.getContentPane().repaint();
        this.getContentPane().revalidate();
        SwingUtilities.updateComponentTreeUI(this);
    }

    /**
     * Adiciona novo desktop
     */
    private void addDesktop() {
        appBean.addDesktop();
    }

    /**
     * Remove todos os desktops
     */
    private void removeAllDesktops() {
        if (WindowUtil.confirmation(this, "Remover todas", "Deseja remover todos os desktops?", "Excluir", "Cancelar")) {
            appBean.removeAllDesktops();
        }
    }

    /**
     * Adiciona View aos favoritos
     */
    private void favoriteView() {
        appBean.favoriteView();
    }

    /**
     *
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        desktop = new javax.swing.JDesktopPane();
        jPopDesktop = new javax.swing.JPopupMenu();
        jMIAdd = new javax.swing.JMenuItem();
        jMICloseAll = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JSeparator();
        jPopTray = new javax.swing.JPopupMenu();
        jMIInfo = new javax.swing.JMenuItem();
        jMIClose = new javax.swing.JMenuItem();
        item = new javax.swing.JMenuItem();
        jTBDesktop = new javax.swing.JToolBar();
        gBClean = new br.com.gmp.comps.button.GMPButton();
        gBProcess = new br.com.gmp.comps.button.GMPButton();
        gBDiscard = new br.com.gmp.comps.button.GMPButton();
        gBConfirm = new br.com.gmp.comps.button.GMPButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        gBFavorite = new br.com.gmp.comps.button.GMPButton();
        gBAddDesk = new br.com.gmp.comps.button.GMPButton();
        gBRemoveDesks = new br.com.gmp.comps.button.GMPButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        gBOrganize = new br.com.gmp.comps.button.GMPButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jTBSearch = new javax.swing.JToolBar();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        jTSearchField = new javax.swing.JTextField();
        gBSearch = new br.com.gmp.comps.button.GMPButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        jTBMsg = new javax.swing.JToolBar();
        jLMsg = new javax.swing.JLabel();
        jTBUser = new javax.swing.JToolBar();
        gBLogout = new br.com.gmp.comps.button.GMPButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jLUser = new javax.swing.JLabel();
        jTBSystem = new javax.swing.JToolBar();
        jLWeb = new javax.swing.JLabel();
        jLSystem = new javax.swing.JLabel();
        jSplit = new javax.swing.JSplitPane();
        gTPDesktops = new br.com.gmp.comps.tabbedpane.GMPJTabbedPane();
        jSP = new javax.swing.JScrollPane();
        MenuContainer = new br.com.gmp.comps.taskcontainer.GMPTaskContainer();
        Task = new br.com.gmp.comps.taskpane.GMPTaskPane();

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
        jMIAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAddActionPerformed(evt);
            }
        });
        jPopDesktop.add(jMIAdd);

        jMICloseAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/browser_delete.png"))); // NOI18N
        jMICloseAll.setText("Remover todas");
        jMICloseAll.setToolTipText("Remove todas as áreas de trabalho");
        jMICloseAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICloseAllActionPerformed(evt);
            }
        });
        jPopDesktop.add(jMICloseAll);

        jMIInfo.setText("Informações");
        jPopTray.add(jMIInfo);

        jMIClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/close.png"))); // NOI18N
        jMIClose.setText("Fechar");
        jPopTray.add(jMIClose);

        item.setText("Bosta de cavalo");
        item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Guampp 1.0");
        setMinimumSize(new java.awt.Dimension(750, 475));

        jTBDesktop.setBackground(new java.awt.Color(102, 153, 255));
        jTBDesktop.setBorder(null);
        jTBDesktop.setFloatable(false);
        jTBDesktop.setMaximumSize(new java.awt.Dimension(88, 40));
        jTBDesktop.setMinimumSize(new java.awt.Dimension(88, 40));
        jTBDesktop.setPreferredSize(new java.awt.Dimension(88, 40));

        gBClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/32/invert/repeat_1.png"))); // NOI18N
        gBClean.setEndColor(new java.awt.Color(51, 102, 255));
        gBClean.setHorizontalTextPosition(0);
        gBClean.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/32/repeat_1.png"))); // NOI18N
        gBClean.setStartColor(new java.awt.Color(0, 153, 255));
        gBClean.setToolTipText("Limpar os campos da View");
        gBClean.setVerticalTextPosition(3);
        gBClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBCleanActionPerformed(evt);
            }
        });
        jTBDesktop.add(gBClean);

        gBProcess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/32/invert/cog.png"))); // NOI18N
        gBProcess.setEndColor(new java.awt.Color(51, 102, 255));
        gBProcess.setHorizontalTextPosition(0);
        gBProcess.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/32/cog.png"))); // NOI18N
        gBProcess.setStartColor(new java.awt.Color(0, 153, 255));
        gBProcess.setToolTipText("Processar");
        gBProcess.setVerticalTextPosition(3);
        gBProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBProcessActionPerformed(evt);
            }
        });
        jTBDesktop.add(gBProcess);

        gBDiscard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/32/invert/circle_delete.png"))); // NOI18N
        gBDiscard.setEndColor(new java.awt.Color(51, 102, 255));
        gBDiscard.setHorizontalTextPosition(0);
        gBDiscard.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/32/circle_delete.png"))); // NOI18N
        gBDiscard.setStartColor(new java.awt.Color(0, 153, 255));
        gBDiscard.setToolTipText("Descartar");
        gBDiscard.setVerticalTextPosition(3);
        gBDiscard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBDiscardActionPerformed(evt);
            }
        });
        jTBDesktop.add(gBDiscard);

        gBConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/32/invert/circle_ok.png"))); // NOI18N
        gBConfirm.setEndColor(new java.awt.Color(51, 102, 255));
        gBConfirm.setHorizontalTextPosition(0);
        gBConfirm.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/32/circle_ok.png"))); // NOI18N
        gBConfirm.setStartColor(new java.awt.Color(0, 153, 255));
        gBConfirm.setToolTipText("Confirmar");
        gBConfirm.setVerticalTextPosition(3);
        gBConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBConfirmActionPerformed(evt);
            }
        });
        jTBDesktop.add(gBConfirm);
        jTBDesktop.add(jSeparator2);

        gBFavorite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/32/invert/star.png"))); // NOI18N
        gBFavorite.setEndColor(new java.awt.Color(51, 102, 255));
        gBFavorite.setHorizontalTextPosition(0);
        gBFavorite.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/32/star.png"))); // NOI18N
        gBFavorite.setStartColor(new java.awt.Color(0, 153, 255));
        gBFavorite.setToolTipText("Adicionar aos favoritos");
        gBFavorite.setVerticalTextPosition(3);
        gBFavorite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBFavoriteActionPerformed(evt);
            }
        });
        jTBDesktop.add(gBFavorite);

        gBAddDesk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/32/invert/browser_add.png"))); // NOI18N
        gBAddDesk.setEndColor(new java.awt.Color(51, 102, 255));
        gBAddDesk.setHorizontalTextPosition(0);
        gBAddDesk.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/32/browser_add.png"))); // NOI18N
        gBAddDesk.setStartColor(new java.awt.Color(0, 153, 255));
        gBAddDesk.setToolTipText("Adicionar novo desktop");
        gBAddDesk.setVerticalTextPosition(3);
        gBAddDesk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBAddDeskActionPerformed(evt);
            }
        });
        jTBDesktop.add(gBAddDesk);

        gBRemoveDesks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/32/invert/browser_delete.png"))); // NOI18N
        gBRemoveDesks.setEndColor(new java.awt.Color(51, 102, 255));
        gBRemoveDesks.setHorizontalTextPosition(0);
        gBRemoveDesks.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/32/browser_delete.png"))); // NOI18N
        gBRemoveDesks.setStartColor(new java.awt.Color(0, 153, 255));
        gBRemoveDesks.setToolTipText("Remover todos os Desktops");
        gBRemoveDesks.setVerticalTextPosition(3);
        gBRemoveDesks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBRemoveDesksActionPerformed(evt);
            }
        });
        jTBDesktop.add(gBRemoveDesks);
        jTBDesktop.add(jSeparator4);

        gBOrganize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/32/invert/grid_1.png"))); // NOI18N
        gBOrganize.setEndColor(new java.awt.Color(51, 102, 255));
        gBOrganize.setHorizontalTextPosition(0);
        gBOrganize.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/32/grid_1.png"))); // NOI18N
        gBOrganize.setStartColor(new java.awt.Color(0, 153, 255));
        gBOrganize.setToolTipText("Organizar os itens no desktop");
        gBOrganize.setVerticalTextPosition(3);
        gBOrganize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBOrganizeActionPerformed(evt);
            }
        });
        jTBDesktop.add(gBOrganize);
        jTBDesktop.add(jSeparator6);

        jTBSearch.setBackground(new java.awt.Color(102, 153, 255));
        jTBSearch.setBorder(null);
        jTBSearch.setFloatable(false);
        jTBSearch.add(jSeparator7);

        jTSearchField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTSearchField.setMaximumSize(new java.awt.Dimension(2147483647, 28));
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
        jTBSearch.add(jSeparator8);

        jTBMsg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTBMsg.setFloatable(false);

        jLMsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/speech_bubble_1.png"))); // NOI18N
        jLMsg.setMaximumSize(new java.awt.Dimension(32174, 32174));
        jTBMsg.add(jLMsg);

        jTBUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTBUser.setFloatable(false);

        gBLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/invert/logout.png"))); // NOI18N
        gBLogout.setEndColor(new java.awt.Color(51, 153, 255));
        gBLogout.setHorizontalTextPosition(0);
        gBLogout.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/logout.png"))); // NOI18N
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

        jSplit.setDividerLocation(200);
        jSplit.setDividerSize(4);

        gTPDesktops.setBackground(new java.awt.Color(51, 153, 255));
        gTPDesktops.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        gTPDesktops.setMinimumSize(new java.awt.Dimension(350, 100));
        gTPDesktops.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        gTPDesktops.setTabPlacement(JTabbedPane.TOP);
        jSplit.setRightComponent(gTPDesktops);

        jSP.setBorder(null);
        jSP.setMaximumSize(new java.awt.Dimension(32767, 150));
        jSP.setMinimumSize(new java.awt.Dimension(21, 150));

        MenuContainer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        MenuContainer.setMinimumSize(new java.awt.Dimension(200, 60));
        MenuContainer.setPreferredSize(new java.awt.Dimension(150, 60));
        MenuContainer.setLayout(new org.jdesktop.swingx.VerticalLayout());
        MenuContainer.add(Task);

        jSP.add(MenuContainer);

        jSP.setViewportView(MenuContainer);

        jSplit.setLeftComponent(jSP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTBUser, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTBMsg, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jTBSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSplit)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTBDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jTBSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTBDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTBSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSplit, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTBMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTBUser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTBSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        appBean.searchView(jTSearchField.getText());
    }//GEN-LAST:event_gBSearchActionPerformed

    private void gBAddDeskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gBAddDeskActionPerformed
        addDesktop();
    }//GEN-LAST:event_gBAddDeskActionPerformed

    private void gBFavoriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gBFavoriteActionPerformed
        favoriteView();
    }//GEN-LAST:event_gBFavoriteActionPerformed

    private void jMIAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAddActionPerformed
        addDesktop();
    }//GEN-LAST:event_jMIAddActionPerformed

    private void jMICloseAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICloseAllActionPerformed
        removeAllDesktops();
    }//GEN-LAST:event_jMICloseAllActionPerformed

    private void gBRemoveDesksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gBRemoveDesksActionPerformed
        removeAllDesktops();
    }//GEN-LAST:event_gBRemoveDesksActionPerformed

    private void gBOrganizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gBOrganizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gBOrganizeActionPerformed

    private void gBCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gBCleanActionPerformed
        appBean.clean();
    }//GEN-LAST:event_gBCleanActionPerformed

    private void itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActionPerformed
        ViewFrame view = new ViewFrame();
        view.setSize(400, 300);
        view.setVisible(true);
        appBean.insertView(view);
    }//GEN-LAST:event_itemActionPerformed

    //<editor-fold desc="Get's & Set's" defaultstate="collapsed">
    /**
     *
     * @return
     */
    public SystemProperties getSystemProperties() {
        return systemProperties;
    }

    /**
     *
     * @param systemProperties
     */
    public void setSystemProperties(SystemProperties systemProperties) {
        this.systemProperties = systemProperties;
    }

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
    public GMPTaskContainer getTaskContainer() {
        return MenuContainer;
    }

    /**
     *
     * @param TaskContainer
     */
    public void setTaskContainer(GMPTaskContainer TaskContainer) {
        this.MenuContainer = TaskContainer;
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

    /**
     * Retorna o painel de abas das áreas de trabalho
     *
     * @return Painel de abas
     */
    public GMPJTabbedPane getgTPDesktops() {
        return gTPDesktops;
    }

    /**
     * Retorna a barra de mensagens
     *
     * @return
     */
    public JLabel getjLMsg() {
        return jLMsg;
    }

    //</editor-fold>
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VisualApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.gmp.comps.taskcontainer.GMPTaskContainer MenuContainer;
    private br.com.gmp.comps.taskpane.GMPTaskPane Task;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JDesktopPane desktop;
    private br.com.gmp.comps.button.GMPButton gBAddDesk;
    private br.com.gmp.comps.button.GMPButton gBClean;
    private br.com.gmp.comps.button.GMPButton gBConfirm;
    private br.com.gmp.comps.button.GMPButton gBDiscard;
    private br.com.gmp.comps.button.GMPButton gBFavorite;
    private br.com.gmp.comps.button.GMPButton gBLogout;
    private br.com.gmp.comps.button.GMPButton gBOrganize;
    private br.com.gmp.comps.button.GMPButton gBProcess;
    private br.com.gmp.comps.button.GMPButton gBRemoveDesks;
    private br.com.gmp.comps.button.GMPButton gBSearch;
    private br.com.gmp.comps.tabbedpane.GMPJTabbedPane gTPDesktops;
    private javax.swing.JMenuItem item;
    private javax.swing.JLabel jLMsg;
    private javax.swing.JLabel jLSystem;
    private javax.swing.JLabel jLUser;
    private javax.swing.JLabel jLWeb;
    private javax.swing.JMenuItem jMIAdd;
    private javax.swing.JMenuItem jMIClose;
    private javax.swing.JMenuItem jMICloseAll;
    private javax.swing.JMenuItem jMIInfo;
    private javax.swing.JPopupMenu jPopDesktop;
    private javax.swing.JPopupMenu jPopTray;
    private javax.swing.JScrollPane jSP;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JSplitPane jSplit;
    private javax.swing.JToolBar jTBDesktop;
    private javax.swing.JToolBar jTBMsg;
    private javax.swing.JToolBar jTBSearch;
    private javax.swing.JToolBar jTBSystem;
    private javax.swing.JToolBar jTBUser;
    private javax.swing.JTextField jTSearchField;
    // End of variables declaration//GEN-END:variables

}
