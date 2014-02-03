/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gmp.desktop;

/**
 *
 * @author kaciano
 */
public class LoginPane extends javax.swing.JDialog {

    /**
     * Creates new form LoginPane
     */
    public LoginPane(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
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
        setResizable(false);

        jPLogin.setBackground(new java.awt.Color(51, 153, 255));

        jPUserData.setBackground(new java.awt.Color(51, 102, 255));

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

        jBExit.setIcon(new javax.swing.ImageIcon("/home/kaciano/NetBeansProjects/GMP-EE/GMP-EE-desktop/src/main/resources/IKONS/32/close.png")); // NOI18N
        jBExit.setText("Sair");

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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginPane dialog = new LoginPane(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

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