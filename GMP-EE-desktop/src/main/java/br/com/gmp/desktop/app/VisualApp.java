package br.com.gmp.desktop.app;

import br.com.gmp.utils.interact.WindowUtil;
import br.com.gmp.desktop.app.bean.VisualAppBean;
import br.com.gmp.comps.tabbedpane.GMPJTabbedPane;
import br.com.gmp.comps.taskcontainer.GMPTaskContainer;
import br.com.gmp.desktop.app.system.SystemProperties;
import br.com.gmp.desktop.views.ProfileView;
import br.com.gmp.desktop.views.ViewFrame;
import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import com.jtattoo.plaf.aero.AeroLookAndFeel;
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import com.jtattoo.plaf.fast.FastLookAndFeel;
import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;
import com.jtattoo.plaf.hifi.HiFiLookAndFeel;
import com.jtattoo.plaf.luna.LunaLookAndFeel;
import com.jtattoo.plaf.mcwin.McWinLookAndFeel;
import com.jtattoo.plaf.mint.MintLookAndFeel;
import com.jtattoo.plaf.smart.SmartLookAndFeel;
import com.jtattoo.plaf.texture.TextureLookAndFeel;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.synth.SynthLookAndFeel;

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
        changeMenu(MenuContainer);
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
     * Troca o menu do painel
     *
     * @param comp <code><b>Component</b></code> Componente do menu
     */
    private void changeMenu(Component comp) {
        jPMenus.removeAll();
        jPMenus.setLayout(new GridLayout(0, 1));
        jPMenus.add(comp);
        jPMenus.repaint();
        jPMenus.revalidate();
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
        MenuContainer = new br.com.gmp.comps.taskcontainer.GMPTaskContainer();
        Task = new br.com.gmp.comps.taskpane.GMPTaskPane();
        jSPTree = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        gBLogout = new br.com.gmp.comps.button.GMPButton();
        jTBDesktop = new javax.swing.JToolBar();
        gBTaskMenu = new br.com.gmp.comps.button.GMPButton();
        gBTreeMenu = new br.com.gmp.comps.button.GMPButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        gBConfirm = new br.com.gmp.comps.button.GMPButton();
        gBDiscard = new br.com.gmp.comps.button.GMPButton();
        gBProcess = new br.com.gmp.comps.button.GMPButton();
        gBClean = new br.com.gmp.comps.button.GMPButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        gBFavorite = new br.com.gmp.comps.button.GMPButton();
        gBAddDesk = new br.com.gmp.comps.button.GMPButton();
        gBRemoveDesks = new br.com.gmp.comps.button.GMPButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        gBOrganize = new br.com.gmp.comps.button.GMPButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jButton1 = new javax.swing.JButton();
        jTBSearch = new javax.swing.JToolBar();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        jTSearchField = new javax.swing.JTextField();
        gBSearch = new br.com.gmp.comps.button.GMPButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        jTBMsg = new javax.swing.JToolBar();
        jLUser = new javax.swing.JLabel();
        jLMsg = new javax.swing.JLabel();
        jTBUser = new javax.swing.JToolBar();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jTBSystem = new javax.swing.JToolBar();
        jLWeb = new javax.swing.JLabel();
        jLSystem = new javax.swing.JLabel();
        gTPDesktops = new br.com.gmp.comps.tabbedpane.GMPJTabbedPane();
        jPMenus = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

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

        MenuContainer.setAutoscrolls(true);
        MenuContainer.setBackground(new java.awt.Color(255, 255, 255));
        MenuContainer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        MenuContainer.setMinimumSize(new java.awt.Dimension(200, 60));
        MenuContainer.setPreferredSize(new java.awt.Dimension(150, 60));
        MenuContainer.setLayout(new org.jdesktop.swingx.VerticalLayout());
        MenuContainer.add(Task);

        jSPTree.setBorder(null);
        jSPTree.setViewportView(jTree);

        gBLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/16/Key.png"))); // NOI18N
        gBLogout.setBackground(new java.awt.Color(255, 255, 255));
        gBLogout.setEndColor(new java.awt.Color(255, 255, 255));
        gBLogout.setHorizontalTextPosition(0);
        gBLogout.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/16/Key.png"))); // NOI18N
        gBLogout.setStartColor(new java.awt.Color(204, 204, 204));
        gBLogout.setToolTipText("Trocar usuário");
        gBLogout.setVerticalTextPosition(3);
        gBLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBLogoutActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Guampp 1.0");
        setMinimumSize(new java.awt.Dimension(750, 475));

        jTBDesktop.setBorder(null);
        jTBDesktop.setFloatable(false);
        jTBDesktop.setBorderPainted(false);
        jTBDesktop.setMaximumSize(new java.awt.Dimension(88, 40));
        jTBDesktop.setMinimumSize(new java.awt.Dimension(88, 40));
        jTBDesktop.setPreferredSize(new java.awt.Dimension(88, 40));

        gBTaskMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/32/Layout.png"))); // NOI18N
        gBTaskMenu.setBackground(new java.awt.Color(255, 255, 255));
        gBTaskMenu.setEndColor(new java.awt.Color(255, 255, 255));
        gBTaskMenu.setHorizontalTextPosition(0);
        gBTaskMenu.setStartColor(new java.awt.Color(204, 204, 204));
        gBTaskMenu.setVerticalTextPosition(3);
        gBTaskMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBTaskMenuActionPerformed(evt);
            }
        });
        jTBDesktop.add(gBTaskMenu);

        gBTreeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/32/Gealogy_view.png"))); // NOI18N
        gBTreeMenu.setBackground(new java.awt.Color(255, 255, 255));
        gBTreeMenu.setEndColor(new java.awt.Color(255, 255, 255));
        gBTreeMenu.setHorizontalTextPosition(0);
        gBTreeMenu.setStartColor(new java.awt.Color(204, 204, 204));
        gBTreeMenu.setVerticalTextPosition(3);
        gBTreeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBTreeMenuActionPerformed(evt);
            }
        });
        jTBDesktop.add(gBTreeMenu);
        jTBDesktop.add(jSeparator5);

        gBConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/32/Save-icon.png"))); // NOI18N
        gBConfirm.setMnemonic('<');
        gBConfirm.setEndColor(new java.awt.Color(255, 255, 255));
        gBConfirm.setHorizontalTextPosition(0);
        gBConfirm.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/32/Save-icon.png"))); // NOI18N
        gBConfirm.setStartColor(new java.awt.Color(204, 204, 204));
        gBConfirm.setToolTipText("Confirmar");
        gBConfirm.setVerticalTextPosition(3);
        gBConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBConfirmActionPerformed(evt);
            }
        });
        jTBDesktop.add(gBConfirm);

        gBDiscard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/32/Cancel.png"))); // NOI18N
        gBDiscard.setBackground(new java.awt.Color(255, 255, 255));
        gBDiscard.setEndColor(new java.awt.Color(255, 255, 255));
        gBDiscard.setHorizontalTextPosition(0);
        gBDiscard.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/32/Cancel.png"))); // NOI18N
        gBDiscard.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/32/Cancel.png"))); // NOI18N
        gBDiscard.setStartColor(new java.awt.Color(204, 204, 204));
        gBDiscard.setToolTipText("Descartar");
        gBDiscard.setVerticalTextPosition(3);
        gBDiscard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBDiscardActionPerformed(evt);
            }
        });
        jTBDesktop.add(gBDiscard);

        gBProcess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/32/Wheel.png"))); // NOI18N
        gBProcess.setBackground(new java.awt.Color(255, 255, 255));
        gBProcess.setEndColor(new java.awt.Color(255, 255, 255));
        gBProcess.setHorizontalTextPosition(0);
        gBProcess.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/32/Wheel.png"))); // NOI18N
        gBProcess.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/32/Wheel.png"))); // NOI18N
        gBProcess.setStartColor(new java.awt.Color(204, 204, 204));
        gBProcess.setToolTipText("Processar");
        gBProcess.setVerticalTextPosition(3);
        gBProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBProcessActionPerformed(evt);
            }
        });
        jTBDesktop.add(gBProcess);

        gBClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/32/Refresh.png"))); // NOI18N
        gBClean.setBackground(new java.awt.Color(255, 255, 255));
        gBClean.setEndColor(new java.awt.Color(255, 255, 255));
        gBClean.setHorizontalTextPosition(0);
        gBClean.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/32/Refresh.png"))); // NOI18N
        gBClean.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/32/Refresh.png"))); // NOI18N
        gBClean.setStartColor(new java.awt.Color(204, 204, 204));
        gBClean.setToolTipText("Limpar os campos da View");
        gBClean.setVerticalTextPosition(3);
        gBClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBCleanActionPerformed(evt);
            }
        });
        jTBDesktop.add(gBClean);
        jTBDesktop.add(jSeparator2);

        gBFavorite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/32/Star_Full.png"))); // NOI18N
        gBFavorite.setBackground(new java.awt.Color(255, 255, 255));
        gBFavorite.setEndColor(new java.awt.Color(255, 255, 255));
        gBFavorite.setHorizontalTextPosition(0);
        gBFavorite.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/32/Star_Full.png"))); // NOI18N
        gBFavorite.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/32/Star_Full.png"))); // NOI18N
        gBFavorite.setStartColor(new java.awt.Color(204, 204, 204));
        gBFavorite.setToolTipText("Adicionar aos favoritos");
        gBFavorite.setVerticalTextPosition(3);
        gBFavorite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBFavoriteActionPerformed(evt);
            }
        });
        jTBDesktop.add(gBFavorite);

        gBAddDesk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/32/Add_1.png"))); // NOI18N
        gBAddDesk.setBackground(new java.awt.Color(255, 255, 255));
        gBAddDesk.setEndColor(new java.awt.Color(255, 255, 255));
        gBAddDesk.setHorizontalTextPosition(0);
        gBAddDesk.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/32/Add_1.png"))); // NOI18N
        gBAddDesk.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/32/Add_1.png"))); // NOI18N
        gBAddDesk.setStartColor(new java.awt.Color(204, 204, 204));
        gBAddDesk.setToolTipText("Adicionar novo desktop");
        gBAddDesk.setVerticalTextPosition(3);
        gBAddDesk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBAddDeskActionPerformed(evt);
            }
        });
        jTBDesktop.add(gBAddDesk);

        gBRemoveDesks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/32/Close.png"))); // NOI18N
        gBRemoveDesks.setBackground(new java.awt.Color(255, 255, 255));
        gBRemoveDesks.setEndColor(new java.awt.Color(255, 255, 255));
        gBRemoveDesks.setHorizontalTextPosition(0);
        gBRemoveDesks.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/32/Close.png"))); // NOI18N
        gBRemoveDesks.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/32/Close.png"))); // NOI18N
        gBRemoveDesks.setStartColor(new java.awt.Color(204, 204, 204));
        gBRemoveDesks.setToolTipText("Remover todos os Desktops");
        gBRemoveDesks.setVerticalTextPosition(3);
        gBRemoveDesks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBRemoveDesksActionPerformed(evt);
            }
        });
        jTBDesktop.add(gBRemoveDesks);
        jTBDesktop.add(jSeparator4);

        gBOrganize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/32/Addons.png"))); // NOI18N
        gBOrganize.setBackground(new java.awt.Color(255, 255, 255));
        gBOrganize.setEndColor(new java.awt.Color(255, 255, 255));
        gBOrganize.setHorizontalTextPosition(0);
        gBOrganize.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/32/Addons.png"))); // NOI18N
        gBOrganize.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/32/Addons.png"))); // NOI18N
        gBOrganize.setStartColor(new java.awt.Color(204, 204, 204));
        gBOrganize.setToolTipText("Organizar os itens no desktop");
        gBOrganize.setVerticalTextPosition(3);
        gBOrganize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBOrganizeActionPerformed(evt);
            }
        });
        jTBDesktop.add(gBOrganize);
        jTBDesktop.add(jSeparator6);

        jButton1.setText("jButton1");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jTBDesktop.add(jButton1);

        jTBSearch.setBorder(null);
        jTBSearch.setFloatable(false);
        jTBSearch.add(jSeparator7);

        jTSearchField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTSearchField.setMaximumSize(new java.awt.Dimension(2147483647, 28));
        jTSearchField.setMinimumSize(new java.awt.Dimension(120, 20));
        jTSearchField.setPreferredSize(new java.awt.Dimension(120, 20));
        jTBSearch.add(jTSearchField);

        gBSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/16/Search.png"))); // NOI18N
        gBSearch.setBackground(new java.awt.Color(255, 255, 255));
        gBSearch.setEndColor(new java.awt.Color(255, 255, 255));
        gBSearch.setHorizontalTextPosition(0);
        gBSearch.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/16/Search.png"))); // NOI18N
        gBSearch.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/16/Search.png"))); // NOI18N
        gBSearch.setStartColor(new java.awt.Color(204, 204, 204));
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

        jLUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gmp/desktop/icons/16/Man_2.png"))); // NOI18N
        jLUser.setText("Usuário");
        jLUser.setMaximumSize(new java.awt.Dimension(32767, 32767));
        jTBMsg.add(jLUser);

        jLMsg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/speech_bubble_1.png"))); // NOI18N
        jLMsg.setMaximumSize(new java.awt.Dimension(32174, 32174));
        jTBMsg.add(jLMsg);

        jTBUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTBUser.setFloatable(false);
        jTBUser.add(jSeparator1);

        jTBSystem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTBSystem.setFloatable(false);

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

        gTPDesktops.setBackground(new java.awt.Color(81, 179, 255));
        gTPDesktops.setBorder(null);
        gTPDesktops.setMinimumSize(new java.awt.Dimension(350, 100));
        gTPDesktops.setOpaque(true);
        gTPDesktops.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        gTPDesktops.setTabPlacement(JTabbedPane.TOP);

        jPMenus.setBackground(new java.awt.Color(0, 51, 102));
        jPMenus.setMinimumSize(new java.awt.Dimension(196, 0));

        javax.swing.GroupLayout jPMenusLayout = new javax.swing.GroupLayout(jPMenus);
        jPMenus.setLayout(jPMenusLayout);
        jPMenusLayout.setHorizontalGroup(
            jPMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 196, Short.MAX_VALUE)
        );
        jPMenusLayout.setVerticalGroup(
            jPMenusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        jMenu1.setText("Opções");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Look And Feel");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTBDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jTBSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPMenus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTBUser, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTBMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(jTBSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(gTPDesktops, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTBDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTBSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPMenus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gTPDesktops, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE))
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
        ViewFrame view = new ProfileView();
        view.setSize(400, 300);
        view.setVisible(true);
        appBean.insertView(view);
    }//GEN-LAST:event_itemActionPerformed

    private void gBTaskMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gBTaskMenuActionPerformed
        changeMenu(MenuContainer);
    }//GEN-LAST:event_gBTaskMenuActionPerformed

    private void gBTreeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gBTreeMenuActionPerformed
        changeMenu(jSPTree);
    }//GEN-LAST:event_gBTreeMenuActionPerformed

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
        try {
            UIManager.setLookAndFeel(new AluminiumLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(VisualApp.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    private br.com.gmp.comps.button.GMPButton gBTaskMenu;
    private br.com.gmp.comps.button.GMPButton gBTreeMenu;
    private br.com.gmp.comps.tabbedpane.GMPJTabbedPane gTPDesktops;
    private javax.swing.JMenuItem item;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLMsg;
    private javax.swing.JLabel jLSystem;
    private javax.swing.JLabel jLUser;
    private javax.swing.JLabel jLWeb;
    private javax.swing.JMenuItem jMIAdd;
    private javax.swing.JMenuItem jMIClose;
    private javax.swing.JMenuItem jMICloseAll;
    private javax.swing.JMenuItem jMIInfo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPMenus;
    private javax.swing.JPopupMenu jPopDesktop;
    private javax.swing.JPopupMenu jPopTray;
    private javax.swing.JScrollPane jSPTree;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar jTBDesktop;
    private javax.swing.JToolBar jTBMsg;
    private javax.swing.JToolBar jTBSearch;
    private javax.swing.JToolBar jTBSystem;
    private javax.swing.JToolBar jTBUser;
    private javax.swing.JTextField jTSearchField;
    private javax.swing.JTree jTree;
    // End of variables declaration//GEN-END:variables

}
