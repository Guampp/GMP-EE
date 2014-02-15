package br.com.gmp.desktop.app;

import br.com.gmp.utils.interact.WindowUtil;
import br.com.gmp.desktop.app.bean.VisualAppBean;
import br.com.gmp.comps.tabbedpane.GMPJTabbedPane;
import br.com.gmp.comps.taskcontainer.GMPTaskContainer;
import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.KeyStroke;
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
    private final String confirmAct = "confirm";
    private final String discardAct = "discard";
    private final String processAct = "process";
    private final String cleanAct = "clean";
    private Action confirmAction;
    private Action discardAction;
    private Action processAction;
    private Action cleanAction;

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
     * @see br.com.gmp.desktop.app.VisualApp#addKeyEvents()
     * @see br.com.gmp.desktop.app.VisualApp#constructActions()
     */
    private void initialize() {
        try {
            generateTrayIcon();
        } catch (AWTException e) {
            Logger.getLogger(this.getClass().getName())
                    .log(Level.SEVERE, e.getMessage(), e);
        } finally {
            constructActions();
            addKeyEvents();
            
        }
    }

    /**
     * Gera o icone da barra de ferramentas
     *
     * @see java.awt.SystemTray
     * @see java.awt.TrayIcon
     * @throws AWTException
     */
    private void generateTrayIcon() throws AWTException {
        SystemTray sysTray = SystemTray.getSystemTray();
        URL url = getClass().getResource("/logo/guampp24.png");
        Image icon = new ImageIcon(url).getImage();
        TrayIcon tray = new TrayIcon(icon);
        PopupMenu pop = new PopupMenu();
        MenuItem item = new MenuItem("Fechar");

        // Adiciona os comandos no MenuItem
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Fechando o sistema");
                System.exit(0);
            }
        });

        // Adiciona os itens no PopUp
        pop.add(item);
        pop.add(new MenuItem());

        // Adiciona o PopUp no Tray
        tray.setPopupMenu(pop);
        tray.setToolTip("Guampp");        
        tray.setImageAutoSize(true);

        // Adiciona o Tray no SystemTray
        sysTray.add(tray);
    }

    /**
     * Constroi as ações da tela
     */
    private void constructActions() {
        this.confirmAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Confirmando...");
            }
        };
        //----------------------------------------------------------------------
        this.discardAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Descartando...");
            }
        };
        //----------------------------------------------------------------------
        this.processAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Processando...");
            }
        };
        //----------------------------------------------------------------------
        this.cleanAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Limpando...");
            }
        };
    }

    /**
     * Adiciona os KeyEvents
     *
     * @see br.com.gmp.desktop.app.VisualApp#addKeyInput(String, int, Action)
     */
    private void addKeyEvents() {
        addKeyInput(confirmAct, KeyEvent.VK_F2, confirmAction);
        addKeyInput(discardAct, KeyEvent.VK_F4, discardAction);
        addKeyInput(processAct, KeyEvent.VK_F6, processAction);
        addKeyInput(cleanAct, KeyEvent.VK_F8, cleanAction);
    }

    /**
     * Adiciona as ações especificas de cada tecla
     *
     * @param name <b><code>String</code></b> Nome da ação
     * @param keycode <b><code>KeyEvent</code></b> Código da tecla
     * @param action <b><code>Action</code></b> Ação da tecla
     */
    private void addKeyInput(String name, int keycode, Action action) {
        this.getRootPane().getActionMap().put(name, action);
        this.getRootPane().getInputMap()
                .put(KeyStroke.getKeyStroke(keycode, 0), name);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        desktop = new javax.swing.JDesktopPane();
        jPopDesktop = new javax.swing.JPopupMenu();
        jMIAdd = new javax.swing.JMenuItem();
        jMICloseAll = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JSeparator();
        jPopTray = new javax.swing.JPopupMenu();
        jMIInfo = new javax.swing.JMenuItem();
        jMIClose = new javax.swing.JMenuItem();
        jTBDesktop = new javax.swing.JToolBar();
        gBAddDesk = new br.com.gmp.comps.button.GMPButton();
        gBRemoveDesks = new br.com.gmp.comps.button.GMPButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        gBOrganize = new br.com.gmp.comps.button.GMPButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jLActualMenu = new javax.swing.JLabel();
        jLActualView = new javax.swing.JLabel();
        jTBSearch = new javax.swing.JToolBar();
        jTSearchField = new javax.swing.JTextField();
        gBSearch = new br.com.gmp.comps.button.GMPButton();
        jTBMsg = new javax.swing.JToolBar();
        jLMsg = new javax.swing.JLabel();
        jTBUser = new javax.swing.JToolBar();
        gBLogout = new br.com.gmp.comps.button.GMPButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jLUser = new javax.swing.JLabel();
        jTBSystem = new javax.swing.JToolBar();
        jLWeb = new javax.swing.JLabel();
        jLSystem = new javax.swing.JLabel();
        jTBFunctions = new javax.swing.JToolBar();
        gBFavorite = new br.com.gmp.comps.button.GMPButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        gBConfirm = new br.com.gmp.comps.button.GMPButton();
        gBDiscard = new br.com.gmp.comps.button.GMPButton();
        gBProcess = new br.com.gmp.comps.button.GMPButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        gBClean = new br.com.gmp.comps.button.GMPButton();
        jSplit = new javax.swing.JSplitPane();
        MenuContainer = new br.com.gmp.comps.taskcontainer.GMPTaskContainer();
        gMPTaskPane1 = new br.com.gmp.comps.taskpane.GMPTaskPane();
        gMPTaskPane2 = new br.com.gmp.comps.taskpane.GMPTaskPane();
        gTPDesktops = new br.com.gmp.comps.tabbedpane.GMPJTabbedPane();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Guampp 1.0");
        setMinimumSize(new java.awt.Dimension(750, 475));

        jTBDesktop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTBDesktop.setFloatable(false);
        jTBDesktop.setMaximumSize(new java.awt.Dimension(88, 40));
        jTBDesktop.setMinimumSize(new java.awt.Dimension(88, 40));
        jTBDesktop.setPreferredSize(new java.awt.Dimension(88, 40));

        gBAddDesk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/invert/browser_add.png"))); // NOI18N
        gBAddDesk.setEndColor(new java.awt.Color(51, 153, 255));
        gBAddDesk.setHorizontalTextPosition(0);
        gBAddDesk.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/browser_add.png"))); // NOI18N
        gBAddDesk.setStartColor(new java.awt.Color(51, 102, 255));
        gBAddDesk.setToolTipText("Adicionar novo desktop");
        gBAddDesk.setVerticalTextPosition(3);
        gBAddDesk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBAddDeskActionPerformed(evt);
            }
        });
        jTBDesktop.add(gBAddDesk);

        gBRemoveDesks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/invert/browser_delete.png"))); // NOI18N
        gBRemoveDesks.setEndColor(new java.awt.Color(51, 153, 255));
        gBRemoveDesks.setHorizontalTextPosition(0);
        gBRemoveDesks.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/browser_delete.png"))); // NOI18N
        gBRemoveDesks.setStartColor(new java.awt.Color(51, 102, 255));
        gBRemoveDesks.setToolTipText("Remover todos os Desktops");
        gBRemoveDesks.setVerticalTextPosition(3);
        gBRemoveDesks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBRemoveDesksActionPerformed(evt);
            }
        });
        jTBDesktop.add(gBRemoveDesks);
        jTBDesktop.add(jSeparator4);

        gBOrganize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/invert/grid_1.png"))); // NOI18N
        gBOrganize.setEndColor(new java.awt.Color(51, 153, 255));
        gBOrganize.setHorizontalTextPosition(0);
        gBOrganize.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/grid_1.png"))); // NOI18N
        gBOrganize.setStartColor(new java.awt.Color(51, 102, 255));
        gBOrganize.setToolTipText("Organizar os itens no desktop");
        gBOrganize.setVerticalTextPosition(3);
        gBOrganize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBOrganizeActionPerformed(evt);
            }
        });
        jTBDesktop.add(gBOrganize);
        jTBDesktop.add(jSeparator6);

        jLActualMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLActualMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/arrow_right.png"))); // NOI18N
        jLActualMenu.setText("Menu Atual");
        jLActualMenu.setMaximumSize(new java.awt.Dimension(32178, 100));
        jTBDesktop.add(jLActualMenu);

        jLActualView.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLActualView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/arrow_right.png"))); // NOI18N
        jLActualView.setText("View Atual");
        jLActualView.setMaximumSize(new java.awt.Dimension(32178, 100));
        jTBDesktop.add(jLActualView);

        jTBSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
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

        jTBFunctions.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTBFunctions.setFloatable(false);

        gBFavorite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/invert/star.png"))); // NOI18N
        gBFavorite.setEndColor(new java.awt.Color(51, 153, 255));
        gBFavorite.setHorizontalTextPosition(0);
        gBFavorite.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/star.png"))); // NOI18N
        gBFavorite.setStartColor(new java.awt.Color(51, 102, 255));
        gBFavorite.setToolTipText("Adicionar aos favoritos");
        gBFavorite.setVerticalTextPosition(3);
        gBFavorite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBFavoriteActionPerformed(evt);
            }
        });
        jTBFunctions.add(gBFavorite);
        jTBFunctions.add(jSeparator2);

        gBConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/invert/circle_ok.png"))); // NOI18N
        gBConfirm.setEndColor(new java.awt.Color(51, 153, 255));
        gBConfirm.setHorizontalTextPosition(0);
        gBConfirm.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/circle_ok.png"))); // NOI18N
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
        gBDiscard.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/circle_delete.png"))); // NOI18N
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
        gBProcess.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/cog.png"))); // NOI18N
        gBProcess.setStartColor(new java.awt.Color(51, 102, 255));
        gBProcess.setToolTipText("Processar");
        gBProcess.setVerticalTextPosition(3);
        gBProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBProcessActionPerformed(evt);
            }
        });
        jTBFunctions.add(gBProcess);
        jTBFunctions.add(jSeparator5);

        gBClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/invert/repeat_1.png"))); // NOI18N
        gBClean.setEndColor(new java.awt.Color(51, 153, 255));
        gBClean.setHorizontalTextPosition(0);
        gBClean.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IKONS/16/cog.png"))); // NOI18N
        gBClean.setStartColor(new java.awt.Color(51, 102, 255));
        gBClean.setToolTipText("Limpar os campos da View");
        gBClean.setVerticalTextPosition(3);
        gBClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBCleanActionPerformed(evt);
            }
        });
        jTBFunctions.add(gBClean);

        jSplit.setDividerLocation(200);
        jSplit.setDividerSize(4);

        MenuContainer.setMinimumSize(new java.awt.Dimension(200, 60));
        MenuContainer.setPreferredSize(new java.awt.Dimension(150, 60));
        MenuContainer.setSize(new java.awt.Dimension(150, 0));
        MenuContainer.setLayout(new org.jdesktop.swingx.VerticalLayout());

        gMPTaskPane1.setFinalColor(new java.awt.Color(102, 102, 255));
        gMPTaskPane1.setInitialColor(new java.awt.Color(153, 255, 0));
        MenuContainer.add(gMPTaskPane1);
        MenuContainer.add(gMPTaskPane2);

        jSplit.setLeftComponent(MenuContainer);

        gTPDesktops.setBackground(new java.awt.Color(51, 153, 255));
        gTPDesktops.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        gTPDesktops.setMinimumSize(new java.awt.Dimension(350, 100));
        gTPDesktops.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        gTPDesktops.setTabPlacement(JTabbedPane.TOP);
        jSplit.setRightComponent(gTPDesktops);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTBUser, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTBFunctions, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTBDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(jTBSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTBMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(jTBSystem, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(jSplit)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTBSearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTBDesktop, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTBFunctions, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSplit, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
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
        // TODO add your handling code here:
    }//GEN-LAST:event_gBCleanActionPerformed

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
    private javax.swing.ButtonGroup buttonGroup1;
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
    private br.com.gmp.comps.taskpane.GMPTaskPane gMPTaskPane1;
    private br.com.gmp.comps.taskpane.GMPTaskPane gMPTaskPane2;
    private br.com.gmp.comps.tabbedpane.GMPJTabbedPane gTPDesktops;
    private javax.swing.JLabel jLActualMenu;
    private javax.swing.JLabel jLActualView;
    private javax.swing.JLabel jLMsg;
    private javax.swing.JLabel jLSystem;
    private javax.swing.JLabel jLUser;
    private javax.swing.JLabel jLWeb;
    private javax.swing.JMenuItem jMIAdd;
    private javax.swing.JMenuItem jMIClose;
    private javax.swing.JMenuItem jMICloseAll;
    private javax.swing.JMenuItem jMIExit;
    private javax.swing.JMenuItem jMIInfo;
    private javax.swing.JMenuItem jMILogoff;
    private javax.swing.JRadioButtonMenuItem jMIMetal;
    private javax.swing.JRadioButtonMenuItem jMIMotif;
    private javax.swing.JMenu jMLookAndFeel;
    private javax.swing.JMenu jMOption;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPopupMenu jPopDesktop;
    private javax.swing.JPopupMenu jPopTray;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JSplitPane jSplit;
    private javax.swing.JToolBar jTBDesktop;
    private javax.swing.JToolBar jTBFunctions;
    private javax.swing.JToolBar jTBMsg;
    private javax.swing.JToolBar jTBSearch;
    private javax.swing.JToolBar jTBSystem;
    private javax.swing.JToolBar jTBUser;
    private javax.swing.JTextField jTSearchField;
    // End of variables declaration//GEN-END:variables

}
