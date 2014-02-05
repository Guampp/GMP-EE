package br.com.gmp.desktop.app.dialogs.login;

import br.com.gmp.desktop.app.Session;
import br.com.gmp.utils.interaction.WindowUtil;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * Painel de login
 *
 * @author kaciano
 */
public class LoginPane extends javax.swing.JDialog {

    private LoginPaneBean loginBean;
    private Session session;

    /**
     * Cria nova instancia de LoginPane
     *
     * @param parent Componente Pai
     * @param modal Frame modal?
     * @param session Sessão atual
     */
    public LoginPane(java.awt.Frame parent, boolean modal, Session session) {
        super(parent, modal);
        this.session = session;
        loginBean = new LoginPaneBean(this, session.getUser());
        initComponents();
    }

    /**
     * Inicialização de componentes gerados automaticamente
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPLogin = new javax.swing.JPanel();
        jPUserData = new javax.swing.JPanel();
        jTUserID = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jLUserID = new javax.swing.JLabel();
        jLPassword = new javax.swing.JLabel();
        jBLogin = new javax.swing.JButton();
        jBExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acessar");
        setUndecorated(true);
        setResizable(false);

        jPLogin.setBackground(new java.awt.Color(51, 153, 255));

        jPUserData.setBackground(new java.awt.Color(0, 102, 255));

        jTUserID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLUserID.setBackground(new java.awt.Color(204, 204, 204));
        jLUserID.setForeground(new java.awt.Color(204, 204, 204));
        jLUserID.setText("Usuário:*");

        jLPassword.setBackground(new java.awt.Color(204, 204, 204));
        jLPassword.setForeground(new java.awt.Color(204, 204, 204));
        jLPassword.setText("Senha:*");

        javax.swing.GroupLayout jPUserDataLayout = new javax.swing.GroupLayout(jPUserData);
        jPUserData.setLayout(jPUserDataLayout);
        jPUserDataLayout.setHorizontalGroup(
            jPUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPUserDataLayout.createSequentialGroup()
                .addGroup(jPUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPUserDataLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLUserID))
                    .addGroup(jPUserDataLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLPassword)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTUserID)
                    .addComponent(jPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPUserDataLayout.setVerticalGroup(
            jPUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPUserDataLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLUserID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPUserDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLPassword))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPUserDataLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPassword, jTUserID});

        jBLogin.setIcon(new javax.swing.ImageIcon("/home/kaciano/NetBeansProjects/GMP-EE/GMP-EE-desktop/src/main/resources/IKONS/32/login.png")); // NOI18N
        jBLogin.setText("Entrar");
        jBLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLoginActionPerformed(evt);
            }
        });

        jBExit.setIcon(new javax.swing.ImageIcon("/home/kaciano/NetBeansProjects/GMP-EE/GMP-EE-desktop/src/main/resources/IKONS/32/close.png")); // NOI18N
        jBExit.setText("Sair");
        jBExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPLoginLayout = new javax.swing.GroupLayout(jPLogin);
        jPLogin.setLayout(jPLoginLayout);
        jPLoginLayout.setHorizontalGroup(
            jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPUserData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPLoginLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBExit, jBLogin});

        jPLoginLayout.setVerticalGroup(
            jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLoginLayout.createSequentialGroup()
                .addComponent(jPUserData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLogin)
                    .addComponent(jBExit))
                .addContainerGap())
        );

        jPLoginLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBExit, jBLogin});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExitActionPerformed
        if (WindowUtil.confirmation(this, "Sair", "Deseja realmente sair do sistema", "Sair", "Cancelar")) {
            System.exit(0);
        }
    }//GEN-LAST:event_jBExitActionPerformed

    private void jBLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLoginActionPerformed
        loginBean.validateUser(session.getUser());
    }//GEN-LAST:event_jBLoginActionPerformed

    //<editor-fold desc="Get's & Set's" defaultstate="collapsed">
    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public LoginPaneBean getLoginBean() {
        return loginBean;
    }

    public void setLoginBean(LoginPaneBean loginBean) {
        this.loginBean = loginBean;
    }

    public JPasswordField getjPassword() {
        return jPassword;
    }

    public JTextField getjTUserID() {
        return jTUserID;
    }

    //</editor-fold>
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBExit;
    private javax.swing.JButton jBLogin;
    private javax.swing.JLabel jLPassword;
    private javax.swing.JLabel jLUserID;
    private javax.swing.JPanel jPLogin;
    private javax.swing.JPanel jPUserData;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTUserID;
    // End of variables declaration//GEN-END:variables

}
