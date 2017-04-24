/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft_all;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilitarios.ConectaBanco;

/**
 *
 * @author Marcilio
 */
public class MenuPrincipal extends javax.swing.JFrame {

    PreparedStatement pstm = null;
    ResultSet rs = null;
    Connection con = null;
    
    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        try {
            con = ConectaBanco.conectabanco();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        BDSoftAllPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("BDSoftAllPU").createEntityManager();
        entradasQuery = java.beans.Beans.isDesignTime() ? null : BDSoftAllPUEntityManager.createQuery("SELECT e FROM Entradas e");
        entradasList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : entradasQuery.getResultList();
        msg_entradaesaida = new javax.swing.JLabel();
        bt_Entradas = new javax.swing.JButton();
        msg_AlterarCadastro = new javax.swing.JLabel();
        bt_AlterarCadastro = new javax.swing.JButton();
        msg_EmitirRelatorios = new javax.swing.JLabel();
        bt_EmitirRelatorios = new javax.swing.JButton();
        msg_UltimosLancamentos = new javax.swing.JLabel();
        bt_Saidas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        msg_entradaesaida.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        msg_entradaesaida.setText("Novas Entradas");

        bt_Entradas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/6943_128x128.png"))); // NOI18N
        bt_Entradas.setToolTipText("Entradas");
        bt_Entradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_EntradasActionPerformed(evt);
            }
        });

        msg_AlterarCadastro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        msg_AlterarCadastro.setText("Alterar Cadastro");

        bt_AlterarCadastro.setIcon(new javax.swing.ImageIcon("D:\\Imagem\\UserI.png")); // NOI18N
        bt_AlterarCadastro.setToolTipText("Alterar Cadastro");
        bt_AlterarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AlterarCadastroActionPerformed(evt);
            }
        });

        msg_EmitirRelatorios.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        msg_EmitirRelatorios.setText("Emitir Relatórios");

        bt_EmitirRelatorios.setIcon(new javax.swing.ImageIcon("D:\\Imagem\\2979_128x128.png")); // NOI18N
        bt_EmitirRelatorios.setToolTipText("Emitir Relatório");
        bt_EmitirRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_EmitirRelatoriosActionPerformed(evt);
            }
        });

        msg_UltimosLancamentos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        msg_UltimosLancamentos.setText("Últimos Lançamentos:");

        bt_Saidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/entradaesaida.png"))); // NOI18N
        bt_Saidas.setToolTipText("Saidas");
        bt_Saidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_SaidasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Novas Saídas");

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, entradasList, jTable2);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${valor}"));
        columnBinding.setColumnName("Valor");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${observacoes}"));
        columnBinding.setColumnName("Observacoes");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${referente}"));
        columnBinding.setColumnName("Referente");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cedenteSacado}"));
        columnBinding.setColumnName("Cedente Sacado");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataOperacao}"));
        columnBinding.setColumnName("Data Operacao");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();

        jScrollPane2.setViewportView(jTable2);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/delete.png"))); // NOI18N
        jButton1.setText("Fazer Logoff");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(msg_UltimosLancamentos)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bt_Entradas, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(bt_Saidas)
                                        .addGap(49, 49, 49)
                                        .addComponent(bt_EmitirRelatorios)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(msg_entradaesaida)
                                .addGap(108, 108, 108)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(msg_EmitirRelatorios)
                                .addGap(67, 67, 67)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_AlterarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(msg_AlterarCadastro)
                                .addGap(23, 23, 23)))
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(msg_entradaesaida, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msg_EmitirRelatorios)
                    .addComponent(msg_AlterarCadastro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_EmitirRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_Entradas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_AlterarCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_Saidas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addComponent(msg_UltimosLancamentos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(307, 307, 307))
        );

        bindingGroup.bind();

        setBounds(0, 0, 877, 569);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_EntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_EntradasActionPerformed
        telaEntradas telaE = new telaEntradas();
        telaE.setVisible(true);
    }//GEN-LAST:event_bt_EntradasActionPerformed

    private void bt_AlterarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AlterarCadastroActionPerformed
        Cadastro telaCadastro = new Cadastro();
        telaCadastro.setVisible(true);
    }//GEN-LAST:event_bt_AlterarCadastroActionPerformed

    private void bt_EmitirRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_EmitirRelatoriosActionPerformed
        Relatorios telaRelatorio = new Relatorios();
        telaRelatorio.setVisible(true);
    }//GEN-LAST:event_bt_EmitirRelatoriosActionPerformed

    private void bt_SaidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_SaidasActionPerformed
        telaSaidas telaS = new telaSaidas();
        telaS.setVisible(true);
    }//GEN-LAST:event_bt_SaidasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager BDSoftAllPUEntityManager;
    private javax.swing.JButton bt_AlterarCadastro;
    private javax.swing.JButton bt_EmitirRelatorios;
    private javax.swing.JButton bt_Entradas;
    private javax.swing.JButton bt_Saidas;
    private java.util.List<soft_all.Entradas> entradasList;
    private javax.persistence.Query entradasQuery;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel msg_AlterarCadastro;
    private javax.swing.JLabel msg_EmitirRelatorios;
    private javax.swing.JLabel msg_UltimosLancamentos;
    private javax.swing.JLabel msg_entradaesaida;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}