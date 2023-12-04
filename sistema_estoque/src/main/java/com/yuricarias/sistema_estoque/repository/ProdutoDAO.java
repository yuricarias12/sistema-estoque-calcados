/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yuricarias.sistema_estoque.repository;

import com.yuricarias.sistema_estoque.model.CategoriaDTO;
import com.yuricarias.sistema_estoque.model.EstoqueDTO;
import com.yuricarias.sistema_estoque.model.ProdutoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.yuricarias.sistema_estoque.interfaces.ProdutoInterface;

/**
 *
 * @author Estudo
 */
public class ProdutoDAO implements ProdutoInterface {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ProdutoDTO> lista = new ArrayList<>();
    ArrayList<CategoriaDTO> listarcategoria = new ArrayList<>();
    ArrayList<EstoqueDTO> listarestoque = new ArrayList<>();
    
    @Override       
    public void cadastrarProduto(ProdutoDTO objprodutodto) {
        
        String sql = "INSERT INTO produto (id_produto, nome, tamanho, marca, cor, id_categoria, codigo_sku, modelo) VALUES (?, ? ,? ,? ,?, ?, ?, ?)";
        
        conn = new ConexaoDAO().conexaoBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            
            pstm.setInt(1, objprodutodto.getId_produto());
            pstm.setString(2, objprodutodto.getNome());
            pstm.setInt(3, objprodutodto.getTamanho());
            pstm.setString(4, objprodutodto.getMarca());
            pstm.setString(5, objprodutodto.getCor());
            pstm.setInt(6, objprodutodto.getCod_categoria());
            pstm.setString(7, objprodutodto.getCodigo_sku());
            pstm.setString(8, objprodutodto.getModelo());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "ProdutoDAO" + erro);
        } 
        
    }
    
    @Override
    public ArrayList<ProdutoDTO> pesquisarProduto() {
        
        String sql = "SELECT * FROM produto";
        
        conn = new ConexaoDAO().conexaoBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                
                ProdutoDTO objprodutoDTO = new ProdutoDTO();
                
                objprodutoDTO.setId_produto(rs.getInt("id_produto"));
                objprodutoDTO.setNome(rs.getString("nome"));
                objprodutoDTO.setTamanho(rs.getInt("tamanho"));
                objprodutoDTO.setMarca(rs.getString("marca"));
                objprodutoDTO.setCor(rs.getString("cor"));
                objprodutoDTO.setCod_categoria(rs.getInt("id_categoria"));
                objprodutoDTO.setCodigo_sku(rs.getString("codigo_sku"));
                objprodutoDTO.setModelo(rs.getString("modelo"));
                
                
                lista.add(objprodutoDTO);
                
            }
            
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "ProdutoDAO Pesquisar" + erro);
        }
        
        return lista;
        
        
    }
    
     @Override  
     public void alterarProduto(ProdutoDTO objprodutodto) {
        
        String sql = "UPDATE produto SET id_produto = ?, nome = ?, tamanho = ?, marca = ?, cor = ?, id_categoria = ?, codigo_sku = ?, modelo = ? WHERE id_produto = ? ";
        
        
         conn = new ConexaoDAO().conexaoBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objprodutodto.getId_produto());
            pstm.setString(2, objprodutodto.getNome());
            pstm.setInt(3, objprodutodto.getTamanho());
            pstm.setString(4, objprodutodto.getMarca());
            pstm.setString(5, objprodutodto.getCor());
            pstm.setInt(6, objprodutodto.getCod_categoria());
            pstm.setString(7, objprodutodto.getCodigo_sku());
            pstm.setString(8, objprodutodto.getModelo());
            pstm.setInt(9, objprodutodto.getId_produto());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "ProdutoDAO Alterar" + erro);
        } 
        
    }
     
     public void excluirProduto(ProdutoDTO objprodutodto) {
        
        String sql = "DELETE FROM produto WHERE id_produto = ?";
        
        conn = new ConexaoDAO().conexaoBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            
            pstm.setInt(1, objprodutodto.getId_produto());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "ProdutoDAO Excluir // NÃO PODE EXCLUIR UM PRODUTO VINCULADO A UM ESTOQUE OU FORNECEDOR !!!" + erro);
        } 
    }
     
     @Override
     public ResultSet listarCategoria() {
         
         conn = new ConexaoDAO().conexaoBD();
         
         String sql = "SELECT * FROM categoria ORDER BY nome_categoria";
                 
                 try {
                     
                     pstm = conn.prepareStatement(sql);
                     return pstm.executeQuery();
                     
                 }catch (SQLException erro) {
                    JOptionPane.showMessageDialog(null, "ListarCategoria ProdutoDAO" + erro.getMessage());
                     return null;
                 }
     }
     
     
     @Override
     public ResultSet listarEstoque() {
         
         conn = new ConexaoDAO().conexaoBD();
         
         String sql = "SELECT * FROM estoque ORDER BY descricao";
                 
                 try {
                     
                     pstm = conn.prepareStatement(sql);
                     return pstm.executeQuery();
                     
                 }catch (SQLException erro) {
                    JOptionPane.showMessageDialog(null, "ListarEstoque ProdutoDAO" + erro.getMessage());
                     return null;
                 }
     }
    
}
    
    

