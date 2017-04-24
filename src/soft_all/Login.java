
package soft_all;

import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import utilitarios.ConectaBanco;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


         
public class Login extends javax.swing.JFrame {
    PreparedStatement pstm = null;
    ResultSet rs = null;
    Connection con = null;
    //ConectaBanco conecta = new ConectaBanco();
    
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        try {
            con = ConectaBanco.conectabanco();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
     public void Logar(){
        String sql = "Select *from usuario where nome=? and senha=?";
        try {
            pstm = con.prepareStatement(sql);
            pstm.setString(1, txt_Usuario.getText());
            pstm.setString(2, txt_Senha.getText());
            rs = pstm.executeQuery();
            if(rs.next()){
                MenuPrincipal menu = new MenuPrincipal();
                menu.setVisible(true);
                dispose();
                
            }else{
                JOptionPane.showMessageDialog(null, "Login/Senha inválido!");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showConfirmDialog(null, "ERRO:"+e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bt_Entrar = new javax.swing.JButton();
        bt_Cancelar = new javax.swing.JButton();
        bt_Cadastar = new javax.swing.JButton();
        msgLogin = new javax.swing.JLabel();
        msgUsuario = new javax.swing.JLabel();
        txt_Usuario = new javax.swing.JTextField();
        msgSenha = new javax.swing.JLabel();
        txt_Senha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        bt_Entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/accept.png"))); // NOI18N
        bt_Entrar.setText("Entrar");
        bt_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_EntrarActionPerformed(evt);
            }
        });

        bt_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancel.png"))); // NOI18N
        bt_Cancelar.setText("Cancelar");
        bt_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CancelarActionPerformed(evt);
            }
        });

        bt_Cadastar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/application_edit.png"))); // NOI18N
        bt_Cadastar.setText("Cadastrar");
        bt_Cadastar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CadastarActionPerformed(evt);
            }
        });

        msgLogin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        msgLogin.setText("Login");

        msgUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        msgUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user.png"))); // NOI18N
        msgUsuario.setText("Usuário:");

        txt_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UsuarioActionPerformed(evt);
            }
        });

        msgSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        msgSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/textfield_key.png"))); // NOI18N
        msgSenha.setText("Senha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_Cadastar)
                                .addGap(28, 28, 28)
                                .addComponent(bt_Cancelar)
                                .addGap(18, 18, 18)
                                .addComponent(bt_Entrar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(msgUsuario)
                                    .addComponent(msgSenha))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(msgLogin)
                        .addGap(138, 138, 138)))
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(msgLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(msgUsuario)
                            .addComponent(txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(msgSenha)
                            .addComponent(txt_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bt_Cancelar)
                            .addComponent(bt_Cadastar)
                            .addComponent(bt_Entrar))))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UsuarioActionPerformed

    private void bt_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_EntrarActionPerformed
        Logar();
//        try {
//            String SQL = "Select nome,senha from usuario where nome='"+txt_Usuario+"'";
//            //PreparedStatement pst = conecta.conn.prepareStatement("Select nome,senha from usuario where nome='"+txt_Usuario+"'");
//            PreparedStatement pst = conecta.conn.prepareStatement(SQL);
//            conecta.rs.first();
//            
//            if(conecta.rs.getString("senha").equals(txt_Senha.getText())){
//                MenuPrincipal obj = new MenuPrincipal();
//                obj.setVisible(true);
//                dispose();
//            }else{
//                JOptionPane.showMessageDialog(rootPane, "Senha Inválida!");
//            }
//            
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(rootPane, "Erro no Login!\n ERRO:"+ex);
//        }
        
    }//GEN-LAST:event_bt_EntrarActionPerformed

    private void bt_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CancelarActionPerformed
//        conecta.desconecta();
        System.exit(0);
    }//GEN-LAST:event_bt_CancelarActionPerformed

    private void bt_CadastarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CadastarActionPerformed
        
    }//GEN-LAST:event_bt_CadastarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Cadastar;
    private javax.swing.JButton bt_Cancelar;
    private javax.swing.JButton bt_Entrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel msgLogin;
    private javax.swing.JLabel msgSenha;
    private javax.swing.JLabel msgUsuario;
    private javax.swing.JPasswordField txt_Senha;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
}
