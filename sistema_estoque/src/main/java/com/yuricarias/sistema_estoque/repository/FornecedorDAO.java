/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yuricarias.sistema_estoque.repository;


import com.yuricarias.sistema_estoque.model.FornecedorDTO;
import com.yuricarias.sistema_estoque.interfaces.FornecedorInterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class FornecedorDAO implements FornecedorInterface {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    
    ArrayList<FornecedorDTO> lista = new ArrayList<>();
    
     @Override
    public void cadastrarFornecedor(FornecedorDTO objfornecedordto) {
        
        String sql = "INSERT INTO fornecedor (nome_empresa, id_produto, razao_social, cnpj, telefone, endereco, email) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        conn = new ConexaoDAO().conexaoBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfornecedordto.getNome_empresa());
            pstm.setInt(2, objfornecedordto.getId_produto());
            pstm.setString(3, objfornecedordto.getRazao_social());
            pstm.setString(4, objfornecedordto.getCnpj());
            pstm.setInt(5, objfornecedordto.getTelefone());
            pstm.setString(6, objfornecedordto.getEndereco());
            pstm.setString(7, objfornecedordto.getEmail());
                 
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "FornecedorDAO" + erro);
        }
    }
    
    @Override
    public ArrayList<FornecedorDTO> pesquisarFornecedor() {
        
        String sql = "SELECT * FROM fornecedor";
        
        conn = new ConexaoDAO().conexaoBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while (rs.next()) {
            
            FornecedorDTO objfornecedorDTO = new FornecedorDTO();
            objfornecedorDTO.setId_fornecedor(rs.getInt("id_fornecedor"));
            objfornecedorDTO.setNome_empresa(rs.getString("nome_empresa"));
            objfornecedorDTO.setId_produto(rs.getInt("id_produto"));
            objfornecedorDTO.setRazao_social(rs.getString("razao_social"));
            objfornecedorDTO.setCnpj(rs.getString("cnpj"));
            objfornecedorDTO.setTelefone(rs.getInt("telefone"));
            objfornecedorDTO.setEndereco(rs.getString("endereco"));
            objfornecedorDTO.setEmail(rs.getString("email"));
            
            lista.add(objfornecedorDTO);
            
            }
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "FornecedorDAO Pesquisar" + erro);
        }
        
        return lista;
    }
    
     
   @Override
    public void alterarFornecedor(FornecedorDTO objfornecedordto) {
        
        String sql = "UPDATE fornecedor SET nome_empresa = ?, razao_social = ?, cnpj = ?, telefone = ?, endereco = ?, email = ? WHERE id_fornecedor = ? ";
        
        
         conn = new ConexaoDAO().conexaoBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfornecedordto.getNome_empresa());
            pstm.setString(2, objfornecedordto.getRazao_social());
            pstm.setString(3, objfornecedordto.getCnpj());
            pstm.setInt(4, objfornecedordto.getTelefone());
            pstm.setString(5, objfornecedordto.getEndereco());
            pstm.setString(6, objfornecedordto.getEmail());
            pstm.setInt(7, objfornecedordto.getId_fornecedor());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "FornecedorDAO Alterar" + erro);
        } 
        
    }
    
    @Override
    public void excluirFornecedor(FornecedorDTO objfornecedordto) {
        
        String sql = "DELETE FROM fornecedor WHERE id_fornecedor = ?";
        
        conn = new ConexaoDAO().conexaoBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            
            pstm.setInt(1, objfornecedordto.getId_fornecedor());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "FornecedorDAO Excluir" + erro);
        } 
    }
    
     @Override
     public ResultSet listarIdProduto() {
          
          conn = new ConexaoDAO().conexaoBD();
          
          String sql = "SELECT *  FROM produto ORDER BY nome";
          
          try {
              pstm = conn.prepareStatement(sql);
              return pstm.executeQuery();
              
          } catch (SQLException erro) {
              
              JOptionPane.showMessageDialog(null, "EstoqueDAO listarIdProduto" + erro.getMessage());
              return null;
          }
      }

    
}
