package br.com.gmp.desktop.app.login;

import br.com.gmp.comps.dialog.GMPDialog;
import br.com.gmp.desktop.app.event.BeanEvent;
import br.com.gmp.desktop.app.login.bean.LoginBean;
import br.com.gmp.desktop.utils.Hasher;
import br.com.gmp.utils.encoding.StringEncoder;
import java.awt.Dimension;
import java.awt.Frame;

/**
 * Painel de login
 *
 * @author kaciano
 */
public class LoginPane extends GMPDialog {

    private LoginBean loginBean;

    /**
     * Cria nova instancia de LoginPane
     *
     * @param owner <code>Frame</code> Pai do frame
     */
    public LoginPane(Frame owner) {
        super(owner);
        this.initComponents();
        this.setUndecorated(true);
        this.loginBean = new LoginBean(this);
        this.setVisible(true);
    }

    /**
     * Método para submeter o Login
     */
    private void submit() {
        if (this.gTUsu.validateComponent() && this.gPassword.validateComponent()) {
            this.loginBean.submit(new BeanEvent(null, new String[]{
                gTUsu.getText(), new Hasher().encode(gPassword.getText())
            }));
        }
    }

    /**
     * Método para cancelar o Login
     */
    private void cancel() {
        System.exit(0);
    }

    //<editor-fold desc="Get's & Set's" defaultstate="collapsed">
    /**
     *
     * @return
     */
    public LoginBean getLoginBean() {
        return loginBean;
    }

    /**
     *
     * @param loginBean
     */
    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }
    //</editor-fold>

    /**
     * Dados gerados automaticamente
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPMain = new javax.swing.JPanel();
        jLLogo = new javax.swing.JLabel();
        jPLogin = new javax.swing.JPanel();
        jLUsu = new javax.swing.JLabel();
        gTUsu = new br.com.gmp.comps.textfield.GMPTextField();
        jLPass = new javax.swing.JLabel();
        gPassword = new br.com.gmp.comps.password.GMPPassword();
        jBCancel = new javax.swing.JButton();
        jBSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(278, 173));
        setModal(true);

        jPMain.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPMain.setMaximumSize(new java.awt.Dimension(278, 173));
        jPMain.setMinimumSize(new java.awt.Dimension(278, 173));

        jLLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/guampp32.png"))); // NOI18N

        jPLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLUsu.setText("Usuário:");

        gTUsu.setPlaceholder("Login");

        jLPass.setText("Senha:");

        javax.swing.GroupLayout jPLoginLayout = new javax.swing.GroupLayout(jPLogin);
        jPLogin.setLayout(jPLoginLayout);
        jPLoginLayout.setHorizontalGroup(
            jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLUsu)
                    .addComponent(jLPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gTUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPLoginLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {gPassword, gTUsu});

        jPLoginLayout.setVerticalGroup(
            jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLoginLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLUsu)
                    .addComponent(gTUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLPass))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPLoginLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {gPassword, gTUsu});

        jBCancel.setText("Sair");
        jBCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelActionPerformed(evt);
            }
        });

        jBSubmit.setText("Entrar");
        jBSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPMainLayout = new javax.swing.GroupLayout(jPMain);
        jPMain.setLayout(jPMainLayout);
        jPMainLayout.setHorizontalGroup(
            jPMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPMainLayout.createSequentialGroup()
                .addGroup(jPMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPMainLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jBSubmit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPMainLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCancel, jBSubmit});

        jPMainLayout.setVerticalGroup(
            jPMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPMainLayout.createSequentialGroup()
                .addComponent(jLLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSubmit)
                    .addComponent(jBCancel))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSubmitActionPerformed
        submit();
    }//GEN-LAST:event_jBSubmitActionPerformed

    private void jBCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelActionPerformed
        cancel();
    }//GEN-LAST:event_jBCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.gmp.comps.password.GMPPassword gPassword;
    private br.com.gmp.comps.textfield.GMPTextField gTUsu;
    private javax.swing.JButton jBCancel;
    private javax.swing.JButton jBSubmit;
    private javax.swing.JLabel jLLogo;
    private javax.swing.JLabel jLPass;
    private javax.swing.JLabel jLUsu;
    private javax.swing.JPanel jPLogin;
    private javax.swing.JPanel jPMain;
    // End of variables declaration//GEN-END:variables
}
