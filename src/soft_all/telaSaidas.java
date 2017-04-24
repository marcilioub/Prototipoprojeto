package soft_all;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import utilitarios.ConectaBanco;
import java.util.Date;

public class telaSaidas extends javax.swing.JFrame {

    PreparedStatement pstm = null;
    ResultSet rs = null;
    Connection con = null;
    
    public telaSaidas() {
        initComponents();
        setLocationRelativeTo(null);
        try {
            con = ConectaBanco.conectabanco();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro: "+ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_Valor = new javax.swing.JTextField();
        msg_Cedente = new javax.swing.JLabel();
        msg_Observacoes = new javax.swing.JLabel();
        txt_dataOperacao = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        txt_Observacoes = new javax.swing.JScrollPane();
        txt_obs = new javax.swing.JTextArea();
        txt_CedenteSacado = new javax.swing.JTextField();
        msg_DatadaOperacao = new javax.swing.JLabel();
        msg_Referentea = new javax.swing.JLabel();
        bt_Cancelar = new javax.swing.JButton();
        msg_EntradaseSaidas = new javax.swing.JLabel();
        bt_Gravar = new javax.swing.JButton();
        txt_Referentea = new javax.swing.JTextField();
        msg_Valor = new javax.swing.JLabel();
        msg_Codigo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Saidas");

        msg_Cedente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        msg_Cedente.setText("Cedente/Sacado:");

        msg_Observacoes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        msg_Observacoes.setText("Observações:");

        txt_dataOperacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dataOperacaoActionPerformed(evt);
            }
        });

        txt_obs.setColumns(20);
        txt_obs.setRows(5);
        txt_Observacoes.setViewportView(txt_obs);

        msg_DatadaOperacao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        msg_DatadaOperacao.setText("Data da Operação: ");

        msg_Referentea.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        msg_Referentea.setText("Referente à:");

        bt_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancel.png"))); // NOI18N
        bt_Cancelar.setText("Cancelar");
        bt_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CancelarActionPerformed(evt);
            }
        });

        msg_EntradaseSaidas.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        msg_EntradaseSaidas.setForeground(new java.awt.Color(255, 0, 51));
        msg_EntradaseSaidas.setText("Saídas");

        bt_Gravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/shape_square_edit.png"))); // NOI18N
        bt_Gravar.setText("Gravar");
        bt_Gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_GravarActionPerformed(evt);
            }
        });

        msg_Valor.setText("Valor:");

        msg_Codigo.setText("Código:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(bt_Cancelar)
                        .addGap(27, 27, 27)
                        .addComponent(bt_Gravar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(msg_Observacoes)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(msg_EntradaseSaidas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(161, 161, 161)
                                        .addComponent(msg_Codigo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(msg_DatadaOperacao)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_dataOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(msg_Valor)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_Valor, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                    .addComponent(txt_id)))
                            .addComponent(txt_Observacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(msg_Cedente)
                                    .addComponent(msg_Referentea))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Referentea, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_CedenteSacado, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(40, 59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msg_Codigo)
                    .addComponent(msg_EntradaseSaidas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msg_Valor)
                    .addComponent(txt_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msg_DatadaOperacao)
                    .addComponent(txt_dataOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msg_Cedente)
                    .addComponent(txt_CedenteSacado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(msg_Referentea)
                    .addComponent(txt_Referentea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(msg_Observacoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Observacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Cancelar)
                    .addComponent(bt_Gravar))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_bt_CancelarActionPerformed

    private void bt_GravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_GravarActionPerformed
         try {
            PreparedStatement pst = con.prepareStatement("INSERT INTO saidas (valor,cedente_sacado,referente,observacoes)values(?,?,?,?)");     
            pst.setDouble(1, (Double.valueOf(txt_Valor.getText())));
            pst.setString(2, txt_CedenteSacado.getText());
            pst.setString(3, txt_Referentea.getText());
            pst.setString(4, txt_Observacoes.getToolTipText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Salvo com sucesso!");
               } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao salvar!\n "+ex);
        }
    }//GEN-LAST:event_bt_GravarActionPerformed

    private void txt_dataOperacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dataOperacaoActionPerformed
      Date d = new Date();
      
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            d = sdf.parse(txt_dataOperacao.getText());
            
        }catch (ParseException exx) {
            JOptionPane.showMessageDialog(null, "ERRO: "+exx);
        }
        
    }//GEN-LAST:event_txt_dataOperacaoActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaSaidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaSaidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaSaidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaSaidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaSaidas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Cancelar;
    private javax.swing.JButton bt_Gravar;
    private javax.swing.JLabel msg_Cedente;
    private javax.swing.JLabel msg_Codigo;
    private javax.swing.JLabel msg_DatadaOperacao;
    private javax.swing.JLabel msg_EntradaseSaidas;
    private javax.swing.JLabel msg_Observacoes;
    private javax.swing.JLabel msg_Referentea;
    private javax.swing.JLabel msg_Valor;
    private javax.swing.JTextField txt_CedenteSacado;
    private javax.swing.JScrollPane txt_Observacoes;
    private javax.swing.JTextField txt_Referentea;
    private javax.swing.JTextField txt_Valor;
    private javax.swing.JTextField txt_dataOperacao;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextArea txt_obs;
    // End of variables declaration//GEN-END:variables
}
