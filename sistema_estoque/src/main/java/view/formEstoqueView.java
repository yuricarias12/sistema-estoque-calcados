/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.EstoqueDAO;
import dto.EstoqueDTO;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudo
 */
public class formEstoqueView extends javax.swing.JFrame {

    /**
     * Creates new form formEstoqueView
     */
    public formEstoqueView() {
        initComponents();
        ListarEstoque();
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
        txtQuantidadeMaxima = new javax.swing.JTextField();
        txtDataEntrada = new javax.swing.JTextField();
        txtValorEstoque = new javax.swing.JTextField();
        txtQuantidadeEstoque = new javax.swing.JTextField();
        txtIdFornecedor = new javax.swing.JTextField();
        txtQuantidadeMinima = new javax.swing.JTextField();
        txtIdEstoque = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnCadastrarEstoque = new javax.swing.JButton();
        btnAlterarInformacoesEstoque = new javax.swing.JButton();
        btnLimparCamposEstoque = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEstoque = new javax.swing.JTable();
        btnCarregarInformacoesEstoque = new javax.swing.JButton();
        btnExcluirInformacoesEstoque = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro Estoque");

        jLabel2.setText("ID_Estoque");

        jLabel3.setText("ID_Produto");

        jLabel4.setText("Valor do Estoque");

        jLabel5.setText("Quantidade em Estoque");

        jLabel6.setText("Quantidade Máxima");

        jLabel7.setText("Quantidade Minima");

        jLabel8.setText("Data de Entrada");

        jLabel9.setText("ID_Fornecedor");

        jLabel10.setText("Descrição");

        btnCadastrarEstoque.setText("Cadastrar");
        btnCadastrarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarEstoqueActionPerformed(evt);
            }
        });

        btnAlterarInformacoesEstoque.setText("Alterar Informações");
        btnAlterarInformacoesEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarInformacoesEstoqueActionPerformed(evt);
            }
        });

        btnLimparCamposEstoque.setText("Limpar Campos");
        btnLimparCamposEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposEstoqueActionPerformed(evt);
            }
        });

        tabelaEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID_Estoque", "ID_Produto", "Valor do Estoque", "Quantidade em Estoque", "Quantidade Máxima", "Quantidade Minima", "Data de Entrada", "ID_Fornecedor", "Descrição"
            }
        ));
        jScrollPane1.setViewportView(tabelaEstoque);

        btnCarregarInformacoesEstoque.setText("Carregar Informações");
        btnCarregarInformacoesEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarInformacoesEstoqueActionPerformed(evt);
            }
        });

        btnExcluirInformacoesEstoque.setText("Excluir Informações");
        btnExcluirInformacoesEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirInformacoesEstoqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(654, Short.MAX_VALUE)
                .addComponent(btnCarregarInformacoesEstoque)
                .addGap(47, 47, 47)
                .addComponent(btnExcluirInformacoesEstoque)
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 988, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCadastrarEstoque)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlterarInformacoesEstoque)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimparCamposEstoque))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtIdEstoque, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtQuantidadeEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jLabel8)))
                                        .addGap(62, 62, 62)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtQuantidadeMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtIdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel9))))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4)
                                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtQuantidadeMinima, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantidadeMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantidadeEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantidadeMinima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarEstoque)
                    .addComponent(btnAlterarInformacoesEstoque)
                    .addComponent(btnLimparCamposEstoque))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirInformacoesEstoque)
                    .addComponent(btnCarregarInformacoesEstoque))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarInformacoesEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarInformacoesEstoqueActionPerformed
        if (txtIdEstoque.getText().isEmpty() || txtIdProduto.getText().isEmpty() || txtValorEstoque.getText().isEmpty() || txtQuantidadeEstoque.getText().isEmpty() || txtQuantidadeMaxima.getText().isEmpty() || txtQuantidadeMinima.getText().isEmpty() || txtDataEntrada.getText().isEmpty() || txtIdFornecedor.getText().isEmpty() || txtDescricao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Prencha as Informações dos campos");
        } else {
             
            AlterarEstoque();
            ListarEstoque();
            LimparCampos();
        }
    }//GEN-LAST:event_btnAlterarInformacoesEstoqueActionPerformed

    private void btnCarregarInformacoesEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarInformacoesEstoqueActionPerformed
        CarregarCamposEstoque();
    }//GEN-LAST:event_btnCarregarInformacoesEstoqueActionPerformed

    private void btnCadastrarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarEstoqueActionPerformed
        if (txtIdEstoque.getText().isEmpty() || txtIdProduto.getText().isEmpty() || txtValorEstoque.getText().isEmpty() || txtQuantidadeEstoque.getText().isEmpty() || txtQuantidadeMaxima.getText().isEmpty() || txtQuantidadeMinima.getText().isEmpty() || txtDataEntrada.getText().isEmpty() || txtIdFornecedor.getText().isEmpty() || txtDescricao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Prencha as Informações dos campos");
        } else {
             
            CadastrarEstoque();
            ListarEstoque();
            LimparCampos();
        }
    }//GEN-LAST:event_btnCadastrarEstoqueActionPerformed

    private void btnExcluirInformacoesEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirInformacoesEstoqueActionPerformed
       if (txtIdEstoque.getText().isEmpty() || txtIdProduto.getText().isEmpty() || txtValorEstoque.getText().isEmpty() || txtQuantidadeEstoque.getText().isEmpty() || txtQuantidadeMaxima.getText().isEmpty() || txtQuantidadeMinima.getText().isEmpty() || txtDataEntrada.getText().isEmpty() || txtIdFornecedor.getText().isEmpty() || txtDescricao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Prencha as Informações dos campos");
        } else {
             
            ExcluirEstoque();
            ListarEstoque();
            LimparCampos();
        }
    }//GEN-LAST:event_btnExcluirInformacoesEstoqueActionPerformed

    private void btnLimparCamposEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposEstoqueActionPerformed
        LimparCampos();
    }//GEN-LAST:event_btnLimparCamposEstoqueActionPerformed

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
            java.util.logging.Logger.getLogger(formEstoqueView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formEstoqueView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formEstoqueView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formEstoqueView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formEstoqueView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarInformacoesEstoque;
    private javax.swing.JButton btnCadastrarEstoque;
    private javax.swing.JButton btnCarregarInformacoesEstoque;
    private javax.swing.JButton btnExcluirInformacoesEstoque;
    private javax.swing.JButton btnLimparCamposEstoque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaEstoque;
    private javax.swing.JTextField txtDataEntrada;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtIdEstoque;
    private javax.swing.JTextField txtIdFornecedor;
    private javax.swing.JTextField txtIdProduto;
    private javax.swing.JTextField txtQuantidadeEstoque;
    private javax.swing.JTextField txtQuantidadeMaxima;
    private javax.swing.JTextField txtQuantidadeMinima;
    private javax.swing.JTextField txtValorEstoque;
    // End of variables declaration//GEN-END:variables


    
    private void ListarEstoque() {
        
        try {
            
            EstoqueDAO objestoquedao = new EstoqueDAO();
            
            DefaultTableModel model = (DefaultTableModel) tabelaEstoque.getModel();
            
            model.setNumRows(0);
            
            ArrayList<EstoqueDTO> lista = objestoquedao.PesquisarEstoque();
            
            for(int num = 0 ; num < lista.size(); num++) {
                
                model.addRow(new Object[] {
                    
                    lista.get(num).getId_estoque(),
                    lista.get(num).getId_produto(),
                    lista.get(num).getValor_estoque(),
                    lista.get(num).getQuantidade_em_estoque(),
                    lista.get(num).getQuantidade_maxima(),
                    lista.get(num).getQuantidade_minima(),
                    lista.get(num).getData_entrada(), 
                    lista.get(num).getId_fornecedor(), 
                    lista.get(num).getDescricao(), 
            });
                   
            }
            
        } catch (Exception erro) {
            
            JOptionPane.showMessageDialog(null, "Listar Estoque VIEW" + erro);
        }
    }
    
    
    private void CarregarCamposEstoque() {
        
        int setar = tabelaEstoque.getSelectedRow();
        
        txtIdEstoque.setText(tabelaEstoque.getModel().getValueAt(setar, 0).toString());
        txtIdProduto.setText(tabelaEstoque.getModel().getValueAt(setar, 1).toString());
        txtValorEstoque.setText(tabelaEstoque.getModel().getValueAt(setar, 2).toString());
        txtQuantidadeEstoque.setText(tabelaEstoque.getModel().getValueAt(setar, 3).toString());
        txtQuantidadeMaxima.setText(tabelaEstoque.getModel().getValueAt(setar, 4).toString());
        txtQuantidadeMinima.setText(tabelaEstoque.getModel().getValueAt(setar, 5).toString());
        txtDataEntrada.setText(tabelaEstoque.getModel().getValueAt(setar, 6).toString());
        txtIdFornecedor.setText(tabelaEstoque.getModel().getValueAt(setar, 7).toString());
        txtDescricao.setText(tabelaEstoque.getModel().getValueAt(setar, 8).toString());
        
    }
    
    
    private void CadastrarEstoque() {
        
        int id_estoque;
        int id_produto;
        Double valor_estoque;
        int quantidade_em_estoque;
        int quantidade_maxima;
        int quantidade_minima;
        String data_entrada;
        int id_fornecedor;
        String descricao;
        
        id_estoque = Integer.parseInt(txtIdEstoque.getText());
        id_produto = Integer.parseInt(txtIdProduto.getText());
        valor_estoque = Double.parseDouble(txtValorEstoque.getText());
        quantidade_em_estoque = Integer.parseInt(txtQuantidadeEstoque.getText());
        quantidade_maxima = Integer.parseInt(txtQuantidadeMaxima.getText());
        quantidade_minima = Integer.parseInt( txtQuantidadeMinima.getText());
        data_entrada = txtDataEntrada.getText();
        id_fornecedor = Integer.parseInt(txtIdFornecedor.getText());
        descricao = txtDescricao.getText();
       
     
    
    EstoqueDTO objestoquedto = new EstoqueDTO();
    
    objestoquedto.setId_estoque(id_estoque);
    objestoquedto.setId_produto(id_produto);
    objestoquedto.setValor_estoque(valor_estoque);
    objestoquedto.setQuantidade_em_estoque(quantidade_em_estoque);
    objestoquedto.setQuantidade_maxima(quantidade_maxima);
    objestoquedto.setQuantidade_minima(quantidade_minima);
    objestoquedto.setData_entrada(data_entrada);
    objestoquedto.setId_fornecedor(id_fornecedor);
    objestoquedto.setDescricao(descricao);
    
    EstoqueDAO objestoquedao = new EstoqueDAO();
    
    objestoquedao.cadastrarEstoque(objestoquedto);
    }
    
    
     private void LimparCampos() {
        
        txtIdEstoque.setText("");
        txtIdProduto.setText("");
        txtValorEstoque.setText("");
        txtQuantidadeEstoque.setText("");
        txtQuantidadeMaxima.setText("");
        txtQuantidadeMinima.setText("");
        txtDataEntrada.setText("");
        txtIdFornecedor.setText("");
        txtDescricao.setText("");
        txtIdEstoque.requestFocus();

    }
     
     
    private void AlterarEstoque() {
        
    int id_estoque;
    int id_produto;
    Double valor_estoque;
    int quantidade_em_estoque;
    int quantidade_maxima;
    int quantidade_minima;
    String data_entrada;
    int id_fornecedor;
    String descricao;
 
    
    id_estoque = Integer.parseInt( txtIdEstoque.getText());
    id_produto = Integer.parseInt(txtIdProduto.getText());
    valor_estoque = Double.parseDouble(txtValorEstoque.getText());
    quantidade_em_estoque = Integer.parseInt(txtQuantidadeEstoque.getText());
    quantidade_maxima= Integer.parseInt(txtQuantidadeMaxima.getText());
    quantidade_minima = Integer.parseInt( txtQuantidadeMinima.getText());
    data_entrada = txtDataEntrada.getText();
    id_fornecedor = Integer.parseInt(txtIdFornecedor.getText());
    descricao = txtDescricao.getText();
  
    
    EstoqueDTO objestoquedto = new EstoqueDTO();
    
    objestoquedto.setId_estoque( id_estoque);
    objestoquedto.setId_produto(id_produto);
    objestoquedto.setValor_estoque(valor_estoque);
    objestoquedto.setQuantidade_em_estoque( quantidade_em_estoque);
    objestoquedto.setQuantidade_maxima(quantidade_maxima);
    objestoquedto.setQuantidade_minima(quantidade_minima);
    objestoquedto.setData_entrada(data_entrada);
    objestoquedto.setId_fornecedor( id_fornecedor);
    objestoquedto.setDescricao(descricao);
    
    
    EstoqueDAO objestoquedao = new EstoqueDAO();
    
    objestoquedao.AlterarEstoque(objestoquedto);
           
    }
    
     private void ExcluirEstoque() {
        
        int id_estoque;
        
        id_estoque = Integer.parseInt(txtIdEstoque.getText());
        
        EstoqueDTO objestoquedto = new EstoqueDTO();
        
        objestoquedto.setId_estoque(id_estoque);
        
        EstoqueDAO objestoquedao = new EstoqueDAO();
        
        objestoquedao.excluirEstoque(objestoquedto);
        
        
    }
    


}