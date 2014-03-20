package br.com.gmp.desktop.app;

import br.com.gmp.utils.interact.WindowUtil;
import br.com.gmp.desktop.app.bean.VisualAppBean;
import br.com.gmp.comps.tabbedpane.GMPJTabbedPane;
import br.com.gmp.comps.taskcontainer.GMPTaskContainer;
import br.com.gmp.comps.textfield.GMPTextField;
import br.com.gmp.desktop.app.login.LoginPane;
import br.com.gmp.desktop.app.system.SystemControls;
import br.com.gmp.desktop.views.ProfileView;
import br.com.gmp.desktop.views.ViewFrame;
import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import com.jtattoo.plaf.aero.AeroLookAndFeel;
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import com.jtattoo.plaf.fast.FastLookAndFeel;
import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;
import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import com.jtattoo.plaf.luna.LunaLookAndFeel;
import com.jtattoo.plaf.noire.NoireLookAndFeel;
import com.jtattoo.plaf.smart.SmartLookAndFeel;
import com.jtattoo.plaf.texture.TextureLookAndFeel;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.LookAndFeel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Aplicação Visual Principal
 *
 * @author kaciano
 * @since 1.0
 * @version 1.0
 */
public class VisualApp extends javax.swing.JFrame {

    private VisualAppBean appBean;

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
        Task.add(item);
        addLafItens();
    }

    /**
     * Mapa de LookAndFeel's
     *
     * @return
     */
    private Map<String, LookAndFeel> lafMap() {
        Map<String, LookAndFeel> lafMap = new HashMap<>();
        lafMap.put("Acryl", new AcrylLookAndFeel());
        lafMap.put("Aero", new AeroLookAndFeel());
        lafMap.put("Aluminium", new AluminiumLookAndFeel());
        lafMap.put("Fast", new FastLookAndFeel());
        lafMap.put("Graphite", new GraphiteLookAndFeel());
        lafMap.put("HiFi", new HiFiLookAndFeel());
        lafMap.put("Luna", new LunaLookAndFeel());
        lafMap.put("Noire", new NoireLookAndFeel());
        lafMap.put("Smart", new SmartLookAndFeel());
        lafMap.put("Texture", new TextureLookAndFeel());
        return lafMap;
    }

    /**
     * Adiciona no meu aparencia, os itens de cada LAF
     */
    private void addLafItens() {
        Set<String> keys = lafMap().keySet();
        for (final String key : keys) {
            JRadioButtonMenuItem radio = new JRadioButtonMenuItem(key);
            radio.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        changeLAF(lafMap().get(key));
                    } catch (UnsupportedLookAndFeelException ex) {
                        Logger.getLogger(VisualApp.class.getName())
                                .log(Level.SEVERE, null, ex);
                    }
                }
            });
            bGLafs.add(radio);
            jMLAF.add(radio);
        }
    }

    /**
     * Muda o LookAndFeel
     *
     * @param laf <code>String</code> Nome do LookAndFeel
     */
    private void changeLAF(LookAndFeel laf) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(laf);
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
     * Troca o menu do painel
     *
     * @param comp <code><b>Component</b></code> Componente do menu
     */
    private void changeMenu(Component comp) {
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
        jSPTree = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        bGLafs = new javax.swing.ButtonGroup();
        jTBDesktop = new javax.swing.JToolBar();
        jTBSearch = new javax.swing.JToolBar();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        jBSearch = new javax.swing.JButton();
        gTSearch = new br.com.gmp.comps.textfield.GMPTextField();
        jTBMsg = new javax.swing.JToolBar();
        jLMsg = new javax.swing.JLabel();
        jTBUser = new javax.swing.JToolBar();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jBMenu = new javax.swing.JButton();
        jBTree = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        jBToggleMenus = new javax.swing.JButton();
        jTBSystem = new javax.swing.JToolBar();
        jLUser = new javax.swing.JLabel();
        jLWeb = new javax.swing.JLabel();
        jLSystem = new javax.swing.JLabel();
        gTPDesktops = new br.com.gmp.comps.tabbedpane.GMPJTabbedPane();
        jTBDesktop1 = new javax.swing.JToolBar();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        jBSave = new javax.swing.JButton();
        jBDiscard = new javax.swing.JButton();
        jBProccess = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jBClean = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jBAddDesktop = new javax.swing.JButton();
        jBRemoveDesktops = new javax.swing.JButton();
        jSPMenus = new javax.swing.JScrollPane();
        MenuContainer = new br.com.gmp.comps.taskcontainer.GMPTaskContainer();
        Task = new br.com.gmp.comps.taskpane.GMPTaskPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMOptions = new javax.swing.JMenu();
        jMLAF = new javax.swing.JMenu();

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

        jSPTree.setBorder(null);
        jSPTree.setViewportView(jTree);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Guampp 1.0");
        setMinimumSize(new java.awt.Dimension(750, 475));

        jTBDesktop.setFloatable(false);
        jTBDesktop.setRollover(true);
        jTBDesktop.setBorderPainted(false);
        jTBDesktop.setMaximumSize(new java.awt.Dimension(196, 40));
        jTBDesktop.setMinimumSize(new java.awt.Dimension(196, 40));
        jTBDesktop.setPreferredSize(new java.awt.Dimension(196, 40));

        jTBSearch.setBorder(null);
        jTBSearch.setFloatable(false);
        jTBSearch.setRollover(true);
        jTBSearch.add(jSeparator7);

        jBSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/controlers/search.png"))); // NOI18N
        jBSearch.setFocusable(false);
        jBSearch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBSearch.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jTBSearch.add(jBSearch);

        gTSearch.setText("gMPTextField1");
        gTSearch.setMaximumSize(new java.awt.Dimension(2147483647, 20));
        gTSearch.setMinimumSize(new java.awt.Dimension(5, 16));
        gTSearch.setPreferredSize(new java.awt.Dimension(100, 16));
        jTBSearch.add(gTSearch);

        jTBMsg.setFloatable(false);
        jTBMsg.setRollover(true);

        jLMsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/16/Chat.png"))); // NOI18N
        jLMsg.setMaximumSize(new java.awt.Dimension(32174, 32174));
        jTBMsg.add(jLMsg);

        jTBUser.setFloatable(false);
        jTBUser.setRollover(true);
        jTBUser.setMaximumSize(new java.awt.Dimension(12, 18));
        jTBUser.setMinimumSize(new java.awt.Dimension(12, 18));
        jTBUser.add(jSeparator1);

        jBMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/16/Navigate_right.png"))); // NOI18N
        jBMenu.setFocusable(false);
        jBMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBMenu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMenuActionPerformed(evt);
            }
        });
        jTBUser.add(jBMenu);

        jBTree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/16/sitemap.png"))); // NOI18N
        jBTree.setFocusable(false);
        jBTree.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBTree.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBTree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTreeActionPerformed(evt);
            }
        });
        jTBUser.add(jBTree);
        jTBUser.add(jSeparator8);

        jBToggleMenus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/16/Hide_left.png"))); // NOI18N
        jBToggleMenus.setFocusable(false);
        jBToggleMenus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBToggleMenus.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBToggleMenus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBToggleMenusActionPerformed(evt);
            }
        });
        jTBUser.add(jBToggleMenus);

        jTBSystem.setFloatable(false);
        jTBSystem.setRollover(true);

        jLUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/16/Man.png"))); // NOI18N
        jLUser.setMaximumSize(new java.awt.Dimension(30, 32768));
        jLUser.setMinimumSize(new java.awt.Dimension(30, 15));
        jTBSystem.add(jLUser);

        jLWeb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLWeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/16/Globe.png"))); // NOI18N
        jLWeb.setMaximumSize(new java.awt.Dimension(30, 32678));
        jLWeb.setMinimumSize(new java.awt.Dimension(30, 15));
        jTBSystem.add(jLWeb);

        jLSystem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLSystem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/16/Basic_data.png"))); // NOI18N
        jLSystem.setMaximumSize(new java.awt.Dimension(30, 32678));
        jLSystem.setMinimumSize(new java.awt.Dimension(30, 15));
        jTBSystem.add(jLSystem);

        gTPDesktops.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        gTPDesktops.setMinimumSize(new java.awt.Dimension(350, 100));
        gTPDesktops.setOpaque(true);
        gTPDesktops.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        gTPDesktops.setTabPlacement(JTabbedPane.BOTTOM);

        jTBDesktop1.setFloatable(false);
        jTBDesktop1.setRollover(true);
        jTBDesktop1.setBorderPainted(false);
        jTBDesktop1.setMaximumSize(new java.awt.Dimension(88, 40));
        jTBDesktop1.setMinimumSize(new java.awt.Dimension(88, 40));
        jTBDesktop1.setPreferredSize(new java.awt.Dimension(88, 40));
        jTBDesktop1.add(jSeparator9);

        jBSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/controlers/save.png"))); // NOI18N
        jBSave.setFocusable(false);
        jBSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSaveActionPerformed(evt);
            }
        });
        jTBDesktop1.add(jBSave);

        jBDiscard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/controlers/exit.png"))); // NOI18N
        jBDiscard.setFocusable(false);
        jBDiscard.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBDiscard.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBDiscard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDiscardActionPerformed(evt);
            }
        });
        jTBDesktop1.add(jBDiscard);

        jBProccess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/controlers/settings.png"))); // NOI18N
        jBProccess.setFocusable(false);
        jBProccess.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBProccess.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBProccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProccessActionPerformed(evt);
            }
        });
        jTBDesktop1.add(jBProccess);
        jTBDesktop1.add(jSeparator2);

        jBClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/transition/switch.png"))); // NOI18N
        jBClean.setFocusable(false);
        jBClean.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBClean.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCleanActionPerformed(evt);
            }
        });
        jTBDesktop1.add(jBClean);
        jTBDesktop1.add(jSeparator6);

        jBAddDesktop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/controlers/new.png"))); // NOI18N
        jBAddDesktop.setFocusable(false);
        jBAddDesktop.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBAddDesktop.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBAddDesktop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddDesktopActionPerformed(evt);
            }
        });
        jTBDesktop1.add(jBAddDesktop);

        jBRemoveDesktops.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ComponentIcons/controlers/off.png"))); // NOI18N
        jBRemoveDesktops.setFocusable(false);
        jBRemoveDesktops.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBRemoveDesktops.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBRemoveDesktops.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRemoveDesktopsActionPerformed(evt);
            }
        });
        jTBDesktop1.add(jBRemoveDesktops);

        jSPMenus.setBorder(null);
        jSPMenus.setMaximumSize(new java.awt.Dimension(196, 32767));
        jSPMenus.setMinimumSize(new java.awt.Dimension(196, 22));

        MenuContainer.setAutoscrolls(true);
        MenuContainer.setBackground(new java.awt.Color(51, 51, 51));
        MenuContainer.add(Task);

        jSPMenus.setViewportView(MenuContainer);

        jMOptions.setText("Opções");
        jMenuBar1.add(jMOptions);

        jMLAF.setText("Aparencia");
        jMenuBar1.add(jMLAF);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTBUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTBDesktop, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSPMenus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTBMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(jTBSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(gTPDesktops, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTBDesktop1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(jTBSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTBDesktop1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTBSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTBDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gTPDesktops, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSPMenus, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTBMsg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTBSystem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTBUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMIAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAddActionPerformed
        addDesktop();
    }//GEN-LAST:event_jMIAddActionPerformed

    private void jMICloseAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICloseAllActionPerformed
        removeAllDesktops();
    }//GEN-LAST:event_jMICloseAllActionPerformed

    private void itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActionPerformed
        ViewFrame view = new ProfileView();
        view.setSize(400, 300);
        view.setVisible(true);
        appBean.insertView(view);
    }//GEN-LAST:event_itemActionPerformed

    private void jBSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSaveActionPerformed
        appBean.confirm();
    }//GEN-LAST:event_jBSaveActionPerformed

    private void jBDiscardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDiscardActionPerformed
        appBean.discard();
    }//GEN-LAST:event_jBDiscardActionPerformed

    private void jBProccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProccessActionPerformed
        appBean.process();
    }//GEN-LAST:event_jBProccessActionPerformed

    private void jBCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCleanActionPerformed
        appBean.clean();
    }//GEN-LAST:event_jBCleanActionPerformed

    private void jBAddDesktopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddDesktopActionPerformed
        addDesktop();
    }//GEN-LAST:event_jBAddDesktopActionPerformed

    private void jBRemoveDesktopsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRemoveDesktopsActionPerformed
        removeAllDesktops();
    }//GEN-LAST:event_jBRemoveDesktopsActionPerformed

    private void jBToggleMenusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBToggleMenusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBToggleMenusActionPerformed

    private void jBTreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBTreeActionPerformed

    private void jBMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBMenuActionPerformed

    //<editor-fold desc="Get's & Set's" defaultstate="collapsed">
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
    public GMPTextField getgTSearch() {
        return gTSearch;
    }

    /**
     *
     * @param gTSearch
     */
    public void setgTSearch(GMPTextField gTSearch) {
        this.gTSearch = gTSearch;
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.gmp.comps.taskcontainer.GMPTaskContainer MenuContainer;
    private br.com.gmp.comps.taskpane.GMPTaskPane Task;
    private javax.swing.ButtonGroup bGLafs;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JDesktopPane desktop;
    private br.com.gmp.comps.tabbedpane.GMPJTabbedPane gTPDesktops;
    private br.com.gmp.comps.textfield.GMPTextField gTSearch;
    private javax.swing.JMenuItem item;
    private javax.swing.JButton jBAddDesktop;
    private javax.swing.JButton jBClean;
    private javax.swing.JButton jBDiscard;
    private javax.swing.JButton jBMenu;
    private javax.swing.JButton jBProccess;
    private javax.swing.JButton jBRemoveDesktops;
    private javax.swing.JButton jBSave;
    private javax.swing.JButton jBSearch;
    private javax.swing.JButton jBToggleMenus;
    private javax.swing.JButton jBTree;
    private javax.swing.JLabel jLMsg;
    private javax.swing.JLabel jLSystem;
    private javax.swing.JLabel jLUser;
    private javax.swing.JLabel jLWeb;
    private javax.swing.JMenuItem jMIAdd;
    private javax.swing.JMenuItem jMIClose;
    private javax.swing.JMenuItem jMICloseAll;
    private javax.swing.JMenuItem jMIInfo;
    private javax.swing.JMenu jMLAF;
    private javax.swing.JMenu jMOptions;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopDesktop;
    private javax.swing.JPopupMenu jPopTray;
    private javax.swing.JScrollPane jSPMenus;
    private javax.swing.JScrollPane jSPTree;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JToolBar jTBDesktop;
    private javax.swing.JToolBar jTBDesktop1;
    private javax.swing.JToolBar jTBMsg;
    private javax.swing.JToolBar jTBSearch;
    private javax.swing.JToolBar jTBSystem;
    private javax.swing.JToolBar jTBUser;
    private javax.swing.JTree jTree;
    // End of variables declaration//GEN-END:variables

}
