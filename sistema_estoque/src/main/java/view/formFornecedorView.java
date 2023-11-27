/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.FornecedorDAO;
import dto.FornecedorDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Estudo
 */
public class formFornecedorView extends javax.swing.JFrame {

    /**
     * Creates new form formFornecedorView
     */
    public formFornecedorView() {
        initComponents();
        ListarFornecedor();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdProduto = new javax.swing.JTextField();
        txtRazaoSocial = new javax.swing.JTextField();
        txtCnpj = new javax.swing.JTextField();
        txtNomeEmpresa = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaFornecedor = new javax.swing.JTable();
        btnCarregarInformacoesFornecedor = new javax.swing.JButton();
        btnExcluirFornecedor = new javax.swing.JButton();
        btnAlterarInformacoesFornecedor = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtIdFornecedor = new javax.swing.JTextField();
        btnLimparCampos = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("id_produto");

        jLabel2.setText("razao social");

        jLabel3.setText("cnpj");

        jLabel4.setText("Telefone");

        jLabel5.setText("Endereço");

        jLabel6.setText("Email");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel7.setText("Nome empresa");

        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        jLabel8.setText("Cadastro de Fornecedores");

        tabelaFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
            },
            new String [] {
                "ID", "Nome_Empresa", "ID_Produto", "Razao Social", "CNPJ", "Telefone", "Endereço", "Email"
            }
        ));
        jScrollPane2.setViewportView(tabelaFornecedor);

        btnCarregarInformacoesFornecedor.setText("Carregar Informações");
        btnCarregarInformacoesFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarInformacoesFornecedorActionPerformed(evt);
            }
        });

        btnExcluirFornecedor.setText("Excluir Registro");
        btnExcluirFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirFornecedorActionPerformed(evt);
            }
        });

        btnAlterarInformacoesFornecedor.setText("Alterar Informações");
        btnAlterarInformacoesFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarInformacoesFornecedorActionPerformed(evt);
            }
        });

        jLabel9.setText("ID");

        txtIdFornecedor.setEnabled(false);
        txtIdFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdFornecedorActionPerformed(evt);
            }
        });

        btnLimparCampos.setText("Limpar Campos");
        btnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCadastrar)
                                .addGap(40, 40, 40)
                                .addComponent(btnLimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(txtNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9)
                                            .addComponent(txtIdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(46, 46, 46)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(jLabel8)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCarregarInformacoesFornecedor)
                        .addGap(40, 40, 40)
                        .addComponent(btnAlterarInformacoesFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluirFornecedor))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnLimparCampos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCarregarInformacoesFornecedor)
                    .addComponent(btnExcluirFornecedor)
                    .addComponent(btnAlterarInformacoesFornecedor))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (txtNomeEmpresa.getText().isEmpty() && txtIdProduto.getText().isEmpty() && txtRazaoSocial.getText().isEmpty() && txtCnpj.getText().isEmpty() && txtEmail.getText().isEmpty() && txtTelefone.getText().isEmpty() && txtEndereco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Insira todos os dados.");
        } else {
             
             CadastrarFornecedor();
             ListarFornecedor();
        }
        
       
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void btnExcluirFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirFornecedorActionPerformed
      
         if (txtNomeEmpresa.getText().isEmpty() && txtIdProduto.getText().isEmpty() && txtRazaoSocial.getText().isEmpty() && txtCnpj.getText().isEmpty() && txtEmail.getText().isEmpty() && txtTelefone.getText().isEmpty() && txtEndereco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Carregue as informações de um fornecedor");
        } else {
             
            ExcluirFornecedor();
            ListarFornecedor();
            LimparCampos();
        }
    }//GEN-LAST:event_btnExcluirFornecedorActionPerformed

    private void btnCarregarInformacoesFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarInformacoesFornecedorActionPerformed
            CarregarCamposFornecedor();
    }//GEN-LAST:event_btnCarregarInformacoesFornecedorActionPerformed

    private void btnAlterarInformacoesFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarInformacoesFornecedorActionPerformed
          if (txtNomeEmpresa.getText().isEmpty() && txtIdProduto.getText().isEmpty() && txtRazaoSocial.getText().isEmpty() && txtCnpj.getText().isEmpty() && txtEmail.getText().isEmpty() && txtTelefone.getText().isEmpty() && txtEndereco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Carregue as informações de um fornecedor");
        } else {
             
            AlterarFornecedor();
            ListarFornecedor();
            LimparCampos();
        }
    }//GEN-LAST:event_btnAlterarInformacoesFornecedorActionPerformed

    private void txtIdFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdFornecedorActionPerformed

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
         if (txtNomeEmpresa.getText().isEmpty() && txtIdProduto.getText().isEmpty() && txtRazaoSocial.getText().isEmpty() && txtCnpj.getText().isEmpty() && txtEmail.getText().isEmpty() && txtTelefone.getText().isEmpty() && txtEndereco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos os campos estão vazios.");
        } else {
             
             LimparCampos();
        }
       
    }//GEN-LAST:event_btnLimparCamposActionPerformed

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
            java.util.logging.Logger.getLogger(formFornecedorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formFornecedorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formFornecedorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formFornecedorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formFornecedorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarInformacoesFornecedor;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCarregarInformacoesFornecedor;
    private javax.swing.JButton btnExcluirFornecedor;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabelaFornecedor;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIdFornecedor;
    private javax.swing.JTextField txtIdProduto;
    private javax.swing.JTextField txtNomeEmpresa;
    private javax.swing.JTextField txtRazaoSocial;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables


    
    private void CadastrarFornecedor() {
        
       String nome_empresa;
        int id_produto;
        String razao_social;
        String cnpj;
        int telefone;
        String endereco;
        String email;
        
        nome_empresa = txtNomeEmpresa.getText();
        id_produto = Integer.parseInt(txtIdProduto.getText());
        razao_social = txtRazaoSocial.getText();
        cnpj = txtCnpj.getText();
        telefone = Integer.parseInt(txtTelefone.getText());
        endereco = txtEndereco.getText();
        email = txtEmail.getText();
        
        FornecedorDTO objfornecedordto = new FornecedorDTO();
        
         objfornecedordto.setNome_empresa(nome_empresa);
        objfornecedordto.setId_produto(id_produto);
        objfornecedordto.setRazao_social(razao_social);
        objfornecedordto.setCnpj(cnpj);
        objfornecedordto.setTelefone(telefone);
        objfornecedordto.setEndereco(endereco);
        objfornecedordto.setEmail(email);
        
        FornecedorDAO objfornecedordao = new FornecedorDAO();
        
        objfornecedordao.cadastrarFornecedor(objfornecedordto);
        
    }
    
    
    private void ListarFornecedor() {
        
        try {
            
            FornecedorDAO objfuncionariodao = new FornecedorDAO();
            
            DefaultTableModel model = (DefaultTableModel) tabelaFornecedor.getModel();
            
            model.setNumRows(0);
            
            ArrayList<FornecedorDTO> lista = objfuncionariodao.PesquisarFornecedor();
            
            for(int num = 0 ; num < lista.size(); num++) {
                
                model.addRow(new Object[] {
                    
                    lista.get(num).getId_fornecedor(),
                    lista.get(num).getNome_empresa(),
                    lista.get(num).getId_produto(),
                    lista.get(num).getRazao_social(),
                    lista.get(num).getCnpj(),
                    lista.get(num).getTelefone(),
                    lista.get(num).getEndereco(),
                    lista.get(num).getEmail(), 
            });
                   
            }
            
        } catch (Exception erro) {
            
            JOptionPane.showMessageDialog(null, "Fornecedor VIEW" + erro);
        }
    }
    
    
    private void AlterarFornecedor() {
     
    int id_fornecedor;   
    String nome_empresa;
    int id_produto;
    String razao_social;
    String cnpj;
    int telefone;
    String endereco;
    String email;
    
 
    id_fornecedor = Integer.parseInt(txtIdFornecedor.getText());
    nome_empresa = txtNomeEmpresa.getText();
    id_produto = Integer.parseInt(txtIdProduto.getText()); 
    razao_social = txtRazaoSocial.getText();
    cnpj = txtCnpj.getText();
    telefone = Integer.parseInt(txtTelefone.getText());
    endereco =  txtEndereco.getText();
    email = txtEmail.getText();
    
    FornecedorDTO objfornecedordto = new FornecedorDTO();
    
    objfornecedordto.setId_fornecedor(id_fornecedor);
    objfornecedordto.setNome_empresa(nome_empresa);
    objfornecedordto.setId_produto(id_produto);
    objfornecedordto.setRazao_social(razao_social);
    objfornecedordto.setCnpj(cnpj);
    objfornecedordto.setTelefone(telefone);
    objfornecedordto.setEndereco(endereco);
    objfornecedordto.setEmail(email);
    
    
    FornecedorDAO objfornecedordao = new FornecedorDAO();
    
    objfornecedordao.AlterarFornecedor(objfornecedordto);
    
                
    }
    
    
    private void ExcluirFornecedor() {
        
        int id_fornecedor;
        
        id_fornecedor = Integer.parseInt(txtIdFornecedor.getText());
        
        FornecedorDTO objfornecedordto = new FornecedorDTO();
        
        objfornecedordto.setId_fornecedor(id_fornecedor);
        
        FornecedorDAO objfornecedordao = new FornecedorDAO();
        
        objfornecedordao.excluirFornecedor(objfornecedordto);
        
        
    }
    
    
     private void LimparCampos() {
        
        txtIdFornecedor.setText("");
        txtNomeEmpresa.setText("");
        txtIdProduto.setText("");
        txtRazaoSocial.setText("");
        txtCnpj.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");
        txtEndereco.setText("");
        txtNomeEmpresa.requestFocus();
        
        
    }
     
     
      private void CarregarCamposFornecedor() {
        
        int setar = tabelaFornecedor.getSelectedRow();
        
        txtIdFornecedor.setText(tabelaFornecedor.getModel().getValueAt(setar, 0).toString());
        txtNomeEmpresa.setText(tabelaFornecedor.getModel().getValueAt(setar, 1).toString());
        txtIdProduto.setText(tabelaFornecedor.getModel().getValueAt(setar, 2).toString());
        txtRazaoSocial.setText(tabelaFornecedor.getModel().getValueAt(setar, 3).toString());
        txtCnpj.setText(tabelaFornecedor.getModel().getValueAt(setar, 4).toString());
        txtTelefone.setText(tabelaFornecedor.getModel().getValueAt(setar, 5).toString());
        txtEndereco.setText(tabelaFornecedor.getModel().getValueAt(setar, 6).toString());
        txtEmail.setText(tabelaFornecedor.getModel().getValueAt(setar, 7).toString());
        
    }
    
    
    

}