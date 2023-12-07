/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.yuricarias.sistema_estoque.gui;

/**
 *
 * @author Estudo
 */
public class formPrincipalView extends javax.swing.JFrame {

    /**
     * Creates new form formPrincipalView
     */
    public formPrincipalView() {
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

        jPanel1 = new javax.swing.JPanel();
        btnTelaCadastroFornecedor = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnTelaCadastroEstoque = new javax.swing.JButton();
        btnTelaCadastroFuncionario = new javax.swing.JButton();
        btnTelaCadastroProdutos = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        btnTelaCadastroFornecedor.setBackground(new java.awt.Color(51, 0, 102));
        btnTelaCadastroFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        btnTelaCadastroFornecedor.setIcon(new javax.swing.ImageIcon("C:\\Users\\Estudo\\Desktop\\sistema_estoque\\src\\main\\java\\com\\yuricarias\\sistema_estoque\\icons\\supplier.png")); // NOI18N
        btnTelaCadastroFornecedor.setText("Cadastrar e Consultar um Fornecedor");
        btnTelaCadastroFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaCadastroFornecedorActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("O que deseja fazer:");

        btnSair.setBackground(new java.awt.Color(153, 0, 0));
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setIcon(new javax.swing.ImageIcon("C:\\Users\\Estudo\\Desktop\\sistema_estoque\\src\\main\\java\\com\\yuricarias\\sistema_estoque\\icons\\logout.png")); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bem Vindo");

        btnTelaCadastroEstoque.setBackground(new java.awt.Color(51, 0, 102));
        btnTelaCadastroEstoque.setForeground(new java.awt.Color(255, 255, 255));
        btnTelaCadastroEstoque.setIcon(new javax.swing.ImageIcon("C:\\Users\\Estudo\\Desktop\\sistema_estoque\\src\\main\\java\\com\\yuricarias\\sistema_estoque\\icons\\in-stock.png")); // NOI18N
        btnTelaCadastroEstoque.setText("Cadastrar e Consultar Estoque");
        btnTelaCadastroEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaCadastroEstoqueActionPerformed(evt);
            }
        });

        btnTelaCadastroFuncionario.setBackground(new java.awt.Color(51, 0, 102));
        btnTelaCadastroFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnTelaCadastroFuncionario.setIcon(new javax.swing.ImageIcon("C:\\Users\\Estudo\\Desktop\\sistema_estoque\\src\\main\\java\\com\\yuricarias\\sistema_estoque\\icons\\multiple-users-silhouette.png")); // NOI18N
        btnTelaCadastroFuncionario.setText("Cadastrar e Consultar Funcionario");
        btnTelaCadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaCadastroFuncionarioActionPerformed(evt);
            }
        });

        btnTelaCadastroProdutos.setBackground(new java.awt.Color(51, 0, 102));
        btnTelaCadastroProdutos.setForeground(new java.awt.Color(255, 255, 255));
        btnTelaCadastroProdutos.setIcon(new javax.swing.ImageIcon("C:\\Users\\Estudo\\Desktop\\sistema_estoque\\src\\main\\java\\com\\yuricarias\\sistema_estoque\\icons\\features.png")); // NOI18N
        btnTelaCadastroProdutos.setText("Cadastrar e Consultar Produtos");
        btnTelaCadastroProdutos.setBorderPainted(false);
        btnTelaCadastroProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaCadastroProdutosActionPerformed(evt);
            }
        });

        jPanel2.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Estudo\\Desktop\\sistema_estoque\\src\\main\\java\\com\\yuricarias\\sistema_estoque\\icons\\logo300.jpeg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(369, 369, 369)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTelaCadastroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTelaCadastroFornecedor, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTelaCadastroEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTelaCadastroProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(btnSair)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTelaCadastroProdutos)
                    .addComponent(btnTelaCadastroFuncionario))
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTelaCadastroFornecedor)
                    .addComponent(btnTelaCadastroEstoque))
                .addGap(96, 96, 96)
                .addComponent(btnSair)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1009, 670));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTelaCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaCadastroFuncionarioActionPerformed
        exibirTelaCadastroFuncionario();
    }//GEN-LAST:event_btnTelaCadastroFuncionarioActionPerformed

    private void btnTelaCadastroProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaCadastroProdutosActionPerformed
        exibirTelaCadastroProduto();
    }//GEN-LAST:event_btnTelaCadastroProdutosActionPerformed

    private void btnTelaCadastroFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaCadastroFornecedorActionPerformed
        exibirTelaCadastroFornecedor();
    }//GEN-LAST:event_btnTelaCadastroFornecedorActionPerformed

    private void btnTelaCadastroEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaCadastroEstoqueActionPerformed
        exibirTelaCadastroEstoque();
    }//GEN-LAST:event_btnTelaCadastroEstoqueActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        sairSistema();
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(formPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formPrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnTelaCadastroEstoque;
    private javax.swing.JButton btnTelaCadastroFornecedor;
    private javax.swing.JButton btnTelaCadastroFuncionario;
    private javax.swing.JButton btnTelaCadastroProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    
    public void exibirTelaCadastroEstoque() {
        
                formEstoqueView formestoqueview = new formEstoqueView();
                formestoqueview.setVisible(true);
                dispose();
    }
    
    
    public void exibirTelaCadastroFornecedor() {
        
                formFornecedorView formfornecedorview = new formFornecedorView();
                formfornecedorview.setVisible(true);
                dispose();
    }
    
    
     public void exibirTelaCadastroFuncionario() {
        
                formFuncionarioView formfuncionarioview = new formFuncionarioView();
                formfuncionarioview.setVisible(true);
                dispose();
    }
    
    
    public void exibirTelaCadastroProduto() {
        
                formProdutoView formprodutoview = new formProdutoView();
                formprodutoview.setVisible(true);
                dispose();
    }
    
    
    public void sairSistema() {
        
        formLogin formlogin = new formLogin();
        formlogin.setVisible(true);
        
        dispose();
    }

}
