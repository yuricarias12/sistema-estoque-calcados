/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.yuricarias.sistema_estoque.gui;

import com.yuricarias.sistema_estoque.repository.ProdutoDAO;
import com.yuricarias.sistema_estoque.model.FuncionarioDTO;
import com.yuricarias.sistema_estoque.model.ProdutoDTO;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Estudo
 */
public class formProdutoView extends javax.swing.JFrame {

    /**
     * Creates new form formProdutoView
     */
    public formProdutoView() {
        initComponents();
        listarProdutos();
        restaurarDadosComboBoxCategoria();
        
         tabelaProdutos.getTableHeader().setFont(new Font ("Segoe UI", Font.BOLD, 12));
        tabelaProdutos.getTableHeader().setOpaque(false);
        tabelaProdutos.getTableHeader().setBackground(new Color(32, 136, 203));
        tabelaProdutos.getTableHeader().setForeground(new Color(0, 0, 0));
        tabelaProdutos.setRowHeight(25);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIdProduto = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtTamanho = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtCor = new javax.swing.JTextField();
        txtCodigoSku = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnCadastrarProduto = new javax.swing.JButton();
        btnAlterarInformacoes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        btnLimparCamposProduto = new javax.swing.JButton();
        btnCarregarInformacoesProduto = new javax.swing.JButton();
        btnExcluirInformacoesProduto = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        cbxCategoria = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("Cadastro de Produtos");

        txtIdProduto.setEnabled(false);
        txtIdProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProdutoActionPerformed(evt);
            }
        });

        jLabel2.setText("ID_Produto");

        jLabel3.setText("Nome");

        jLabel4.setText("Tamanho");

        jLabel5.setText("Marca");

        jLabel6.setText("Cor");

        jLabel9.setText("Categoria");

        jLabel11.setText("Cóidgo_SKU");

        jLabel12.setText("Modelo");

        btnCadastrarProduto.setIcon(new javax.swing.ImageIcon("C:\\Users\\Estudo\\Desktop\\sistema_estoque\\src\\main\\java\\com\\yuricarias\\sistema_estoque\\icons\\news.png")); // NOI18N
        btnCadastrarProduto.setText("Cadastrar");
        btnCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProdutoActionPerformed(evt);
            }
        });

        btnAlterarInformacoes.setIcon(new javax.swing.ImageIcon("C:\\Users\\Estudo\\Desktop\\sistema_estoque\\src\\main\\java\\com\\yuricarias\\sistema_estoque\\icons\\refresh.png")); // NOI18N
        btnAlterarInformacoes.setText("Alterar Informações");
        btnAlterarInformacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarInformacoesActionPerformed(evt);
            }
        });

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
            },
            new String [] {
                "ID_Produto", "Nome", "Tamanho", "Marca", "Cor", "ID_Categoria", "Código_SKU", "Modelo" }
        ));
        tabelaProdutos.setFocusable(false);
        tabelaProdutos.setRowHeight(25);
        tabelaProdutos.setSelectionBackground(new java.awt.Color(232, 57, 95));
        tabelaProdutos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaProdutos);

        btnLimparCamposProduto.setIcon(new javax.swing.ImageIcon("C:\\Users\\Estudo\\Desktop\\sistema_estoque\\src\\main\\java\\com\\yuricarias\\sistema_estoque\\icons\\eraser.png")); // NOI18N
        btnLimparCamposProduto.setText("Limpar Campos");
        btnLimparCamposProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposProdutoActionPerformed(evt);
            }
        });

        btnCarregarInformacoesProduto.setIcon(new javax.swing.ImageIcon("C:\\Users\\Estudo\\Desktop\\sistema_estoque\\src\\main\\java\\com\\yuricarias\\sistema_estoque\\icons\\reload.png")); // NOI18N
        btnCarregarInformacoesProduto.setText("Carregar Informações");
        btnCarregarInformacoesProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarInformacoesProdutoActionPerformed(evt);
            }
        });

        btnExcluirInformacoesProduto.setIcon(new javax.swing.ImageIcon("C:\\Users\\Estudo\\Desktop\\sistema_estoque\\src\\main\\java\\com\\yuricarias\\sistema_estoque\\icons\\trash.png")); // NOI18N
        btnExcluirInformacoesProduto.setText("Excluir Informações");
        btnExcluirInformacoesProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirInformacoesProdutoActionPerformed(evt);
            }
        });

        btnVoltar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Estudo\\Desktop\\sistema_estoque\\src\\main\\java\\com\\yuricarias\\sistema_estoque\\icons\\return.png")); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimparCamposProduto)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdProduto)
                            .addComponent(txtNome)
                            .addComponent(txtTamanho)
                            .addComponent(txtMarca)
                            .addComponent(txtCor)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCadastrarProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(btnAlterarInformacoes)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodigoSku, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                    .addComponent(txtModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(cbxCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCarregarInformacoesProduto)
                        .addGap(36, 36, 36)
                        .addComponent(btnExcluirInformacoesProduto))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(10, 10, 10)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel11)
                        .addGap(10, 10, 10)
                        .addComponent(txtCodigoSku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarProduto)
                    .addComponent(btnAlterarInformacoes))
                .addGap(18, 18, 18)
                .addComponent(btnLimparCamposProduto)
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCarregarInformacoesProduto)
                    .addComponent(btnExcluirInformacoesProduto)
                    .addComponent(btnVoltar))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarInformacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarInformacoesActionPerformed
        if (txtNome.getText().isEmpty() && txtTamanho.getText().isEmpty() && txtMarca.getText().isEmpty() && txtCor.getText().isEmpty() && txtCodigoSku.getText().isEmpty() && txtModelo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha as Informações dos campos");
        } else {
                
            alterarProduto();
            listarProdutos();
            limparCampos();  
        }
    }//GEN-LAST:event_btnAlterarInformacoesActionPerformed

    private void txtIdProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProdutoActionPerformed

    private void btnCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProdutoActionPerformed
        if (txtNome.getText().isEmpty() || txtTamanho.getText().isEmpty() || txtMarca.getText().isEmpty() || txtCor.getText().isEmpty() || txtCodigoSku.getText().isEmpty() || txtModelo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Prencha as Informações dos campos");
        } else {
             
            cadastrarProduto();
            listarProdutos();
            limparCampos();
            restaurarDadosComboBoxCategoria();
        }
    }//GEN-LAST:event_btnCadastrarProdutoActionPerformed

    private void btnLimparCamposProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposProdutoActionPerformed
        limparCampos();
        restaurarDadosComboBoxCategoria();
    }//GEN-LAST:event_btnLimparCamposProdutoActionPerformed

    private void btnCarregarInformacoesProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarInformacoesProdutoActionPerformed
        carregarCamposProduto();
        
    }//GEN-LAST:event_btnCarregarInformacoesProdutoActionPerformed

    private void btnExcluirInformacoesProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirInformacoesProdutoActionPerformed
        if (txtNome.getText().isEmpty() || txtTamanho.getText().isEmpty() || txtMarca.getText().isEmpty() || txtCor.getText().isEmpty() || txtCodigoSku.getText().isEmpty() || txtModelo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Prencha as Informações dos campos");
        } else {
                
            excluirProduto();
            listarProdutos();
            limparCampos();
            restaurarDadosComboBoxCategoria();
        }
    }//GEN-LAST:event_btnExcluirInformacoesProdutoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        voltarTela();
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(formProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formProdutoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarInformacoes;
    private javax.swing.JButton btnCadastrarProduto;
    private javax.swing.JButton btnCarregarInformacoesProduto;
    private javax.swing.JButton btnExcluirInformacoesProduto;
    private javax.swing.JButton btnLimparCamposProduto;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTextField txtCodigoSku;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtIdProduto;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTamanho;
    // End of variables declaration//GEN-END:variables



    
private void listarProdutos() {
        
        try {
            
            ProdutoDAO objprodutodao = new ProdutoDAO();
            
            DefaultTableModel model = (DefaultTableModel) tabelaProdutos.getModel();
            
            model.setNumRows(0);
            
            ArrayList<ProdutoDTO> lista = objprodutodao.pesquisarProduto();
            
            for(int num = 0 ; num < lista.size(); num++) {
                
                model.addRow(new Object[] {
                    
                    lista.get(num).getId_produto(),
                    lista.get(num).getNome(),
                    lista.get(num).getTamanho(),
                    lista.get(num).getMarca(),
                    lista.get(num).getCor(),
                    lista.get(num).getCod_categoria(), 
                    lista.get(num).getCodigo_sku(), 
                    lista.get(num).getModelo() 
            });       
            }
            
        } catch (Exception erro) {
            
            JOptionPane.showMessageDialog(null, "Listar Produtos VIEW" + erro);
        }
    }

    
    
     private void carregarCamposProduto() {
        
        int setar = tabelaProdutos.getSelectedRow();
        
        txtIdProduto.setText(tabelaProdutos.getModel().getValueAt(setar, 0).toString());
        txtNome.setText(tabelaProdutos.getModel().getValueAt(setar, 1).toString());
        txtTamanho.setText(tabelaProdutos.getModel().getValueAt(setar, 2).toString());
        txtMarca.setText(tabelaProdutos.getModel().getValueAt(setar, 3).toString());
        txtCor.setText(tabelaProdutos.getModel().getValueAt(setar, 4).toString());
        txtCodigoSku.setText(tabelaProdutos.getModel().getValueAt(setar, 5).toString());
        txtModelo.setText(tabelaProdutos.getModel().getValueAt(setar, 6).toString());
    }
     
     
     
     
      private void cadastrarProduto() {
        
       
       String nome;
       int tamanho;
       String marca;
       String cor;
       Double preco;
       int quantidade;
       int codcategoria;
       int id_estoque;
       String codigo_sku;
       String modelo;
        
        
        nome = txtNome.getText();
        tamanho = Integer.parseInt(txtTamanho.getText());
        marca = txtMarca.getText();
        cor = txtCor.getText();
        codcategoria = id_categoria.get(cbxCategoria.getSelectedIndex() - 1);
        codigo_sku = txtCodigoSku.getText();
        modelo = txtModelo.getText();
     
    
    ProdutoDTO objprodutodto = new ProdutoDTO();
    
    
    objprodutodto.setNome(nome);
    objprodutodto.setTamanho(tamanho);
    objprodutodto.setMarca(marca);
    objprodutodto.setCor(cor);
    objprodutodto.setCod_categoria(codcategoria);
    objprodutodto.setCodigo_sku(codigo_sku);
    objprodutodto.setModelo(modelo);
    
    ProdutoDAO objprodutodao = new ProdutoDAO();
    
    objprodutodao.cadastrarProduto(objprodutodto);
    
      }
      
      
      private void limparCampos() {
        
        txtIdProduto.setText("");
        txtNome.setText("");
        txtTamanho.setText("");
        txtMarca.setText("");
        txtCor.setText("");
        txtCodigoSku.setText("");
         txtModelo.setText("");
        txtIdProduto.requestFocus();
             
    }
      
      
      
    private void alterarProduto() {
        
    int id_produto;
    String nome;
    int tamanho;
    String marca;
    String cor;
    int cod_categoria;
    String codigo_sku;
    String modelo;
 
    
    id_produto = Integer.parseInt( txtIdProduto.getText());
    nome = txtNome.getText();
    tamanho = Integer.parseInt(txtTamanho.getText());
    marca = txtMarca.getText();
    cor = txtCor.getText();
    cod_categoria = id_categoria.get(cbxCategoria.getSelectedIndex());
    codigo_sku = txtCodigoSku.getText();
    modelo = txtModelo.getText();
    
    
    ProdutoDTO objprodutodto = new ProdutoDTO();
    
    objprodutodto.setId_produto(id_produto);
    objprodutodto.setNome(nome);
    objprodutodto.setTamanho(tamanho);
    objprodutodto.setMarca(marca);
    objprodutodto.setCor(cor);
    objprodutodto.setCod_categoria(cod_categoria);
    objprodutodto.setCodigo_sku(codigo_sku);
    objprodutodto.setModelo(modelo);
    
    ProdutoDAO objprodutodao = new ProdutoDAO();
    
    objprodutodao.alterarProduto(objprodutodto);
    
                
    }
    
    
     private void excluirProduto() {
        
        int id_produto;
        
        id_produto = Integer.parseInt(txtIdProduto.getText());
        
        ProdutoDTO objprodutodto = new ProdutoDTO();
        
        objprodutodto.setId_produto(id_produto);
        
        ProdutoDAO objprodutodao = new ProdutoDAO();
        
        objprodutodao.excluirProduto(objprodutodto);
        
        
    }
     
     
     Vector<Integer> id_categoria = new Vector<Integer>();
     
     public void restaurarDadosComboBoxCategoria() {
         
         try {
             
             ProdutoDAO objprodutodao = new ProdutoDAO();
             ResultSet rs = objprodutodao.listarCategoria();
             
             while (rs.next()) {
                 
                 id_categoria.addElement(rs.getInt(1));
                 cbxCategoria.addItem(rs.getString(2));
             }
             
         } catch (SQLException erro) {
             
             JOptionPane.showMessageDialog(null, "Carregar ComboBoxCategoria");
         }
     }
     
     
     
     
     
     
     
     
     public void voltarTela() {
         
          formPrincipalView formprincipalview = new formPrincipalView();
                formprincipalview.setVisible(true);
                
                dispose();
     }



}