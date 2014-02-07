package comps.password;

/**
 * Frame para confirmação de senhas
 *
 * @author kaciano
 */
public class PasswordConfirmation extends javax.swing.JDialog {

    /**
     * Creates new form PasswordConfirmation
     *
     * @param parent
     */
    public PasswordConfirmation(java.awt.Frame parent) {
        super(parent, true);
        initComponents();
    }

    public static void showConfirmation(String text) {
        
    }

    /**
     *
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPPass = new javax.swing.JPanel();
        gBConfirm = new comps.button.GMPButton();
        jPassword = new javax.swing.JPasswordField();
        jLMsg = new javax.swing.JLabel();
        gBCancel = new comps.button.GMPButton();
        jLPass = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Confirmação de senha");
        setModal(true);
        setUndecorated(true);

        jPPass.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPPass.setName("jPPass"); // NOI18N

        gBConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/button/16/invert/circle_ok.png"))); // NOI18N
        gBConfirm.setName("gBConfirm"); // NOI18N
        gBConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBConfirmActionPerformed(evt);
            }
        });

        jPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPassword.setName("jPassword"); // NOI18N

        jLMsg.setText("Confirmação necessaria");
        jLMsg.setName("jLMsg"); // NOI18N

        gBCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/button/16/invert/circle_delete.png"))); // NOI18N
        gBCancel.setName("gBCancel"); // NOI18N
        gBCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gBCancelActionPerformed(evt);
            }
        });

        jLPass.setText("Senha:");
        jLPass.setName("jLPass"); // NOI18N

        javax.swing.GroupLayout jPPassLayout = new javax.swing.GroupLayout(jPPass);
        jPPass.setLayout(jPPassLayout);
        jPPassLayout.setHorizontalGroup(
            jPPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPassLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPPassLayout.createSequentialGroup()
                            .addComponent(gBConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(gBCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPPassLayout.createSequentialGroup()
                            .addComponent(jLPass)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPPassLayout.setVerticalGroup(
            jPPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gBConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gBCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gBConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gBConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gBConfirmActionPerformed

    private void gBCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gBCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gBCancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                PasswordConfirmation dialog = new PasswordConfirmation(new javax.swing.JFrame());
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
    private comps.button.GMPButton gBCancel;
    private comps.button.GMPButton gBConfirm;
    private javax.swing.JLabel jLMsg;
    private javax.swing.JLabel jLPass;
    private javax.swing.JPanel jPPass;
    private javax.swing.JPasswordField jPassword;
    // End of variables declaration//GEN-END:variables
}
