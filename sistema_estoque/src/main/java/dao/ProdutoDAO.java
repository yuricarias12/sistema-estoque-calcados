/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dto.ProdutoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudo
 */
public class ProdutoDAO {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ProdutoDTO> lista = new ArrayList<>();
            
    public void cadastrarProduto(ProdutoDTO objprodutodto) {
        
        String sql = "INSERT INTO produto (id_produto, nome, tamanho, marca, cor, preco, quantidade, categoria, id_estoque, codigo_sku, modelo) VALUES (?, ? ,? ,? ,?, ?, ?, ?, ?, ?, ?)";
        
        conn = new ConexaoDAO().conexaoBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objprodutodto.getId_produto());
            pstm.setString(2, objprodutodto.getNome());
            pstm.setInt(3, objprodutodto.getTamanho());
            pstm.setString(4, objprodutodto.getMarca());
            pstm.setString(5, objprodutodto.getCor());
            pstm.setDouble(6, objprodutodto.getPreco());
            pstm.setInt(7, objprodutodto.getQuantidade());
            pstm.setString(8, objprodutodto.getCategoria());
            pstm.setInt(9, objprodutodto.getId_estoque());
             pstm.setString(10, objprodutodto.getCodigo_sku());
              pstm.setString(11, objprodutodto.getModelo());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "ProdutoDAO" + erro);
        } 
        
    }
    
    public ArrayList<ProdutoDTO> PesquisarProduto() {
        
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
                objprodutoDTO.setPreco(rs.getDouble("preco"));
                objprodutoDTO.setQuantidade(rs.getInt("quantidade"));
                objprodutoDTO.setCategoria(rs.getString("categoria"));
                objprodutoDTO.setId_estoque(rs.getInt("id_estoque"));
                objprodutoDTO.setCodigo_sku(rs.getString("codigo_sku"));
                objprodutoDTO.setModelo(rs.getString("modelo"));
                
                
                lista.add(objprodutoDTO);
                
            }
            
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "ProdutoDAO Pesquisar" + erro);
        }
        
        return lista;
        
        
    }
    
    
     public void AlterarProduto(ProdutoDTO objprodutodto) {
        
        String sql = "UPDATE produto SET id_produto = ?, nome = ?, tamanho = ?, marca = ?, cor = ?, preco = ?, quantidade = ?, id_estoque = ?, codigo_sku = ?, modelo = ? WHERE id_produto = ? ";
        
        
         conn = new ConexaoDAO().conexaoBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objprodutodto.getId_produto());
            pstm.setString(2, objprodutodto.getNome());
            pstm.setInt(3, objprodutodto.getTamanho());
            pstm.setString(4, objprodutodto.getMarca());
            pstm.setString(5, objprodutodto.getCor());
            pstm.setDouble(6, objprodutodto.getPreco());
            pstm.setInt(7, objprodutodto.getQuantidade());
            pstm.setInt(8, objprodutodto.getId_estoque());
            pstm.setString(9, objprodutodto.getCodigo_sku());
            pstm.setString(10, objprodutodto.getModelo());
            pstm.setInt(11, objprodutodto.getId_produto());
            
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
            
            JOptionPane.showMessageDialog(null, "ProdutoDAO Excluir" + erro);
        } 
    }
    
}
    
    

