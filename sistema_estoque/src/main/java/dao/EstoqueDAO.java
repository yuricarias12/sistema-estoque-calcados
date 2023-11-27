
package dao;

import dto.EstoqueDTO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;




public class EstoqueDAO {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<EstoqueDTO> lista = new ArrayList<>();
            
    public void cadastrarEstoque(EstoqueDTO objestoquedto) {
        
        String sql = "INSERT INTO estoque (id_estoque, id_produto, valor_estoque, quantidade_em_estoque, quantidade_maxima, quantidade_minima, data_entrada, id_fornecedor, descricao) VALUES (?, ? ,? ,? ,?, ?, ?, ?, ?)";
        
        conn = new ConexaoDAO().conexaoBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objestoquedto.getId_estoque());
            pstm.setInt(2, objestoquedto.getId_produto());
            pstm.setDouble(3, objestoquedto.getValor_estoque());
            pstm.setInt(4, objestoquedto.getQuantidade_em_estoque());
            pstm.setInt(5, objestoquedto.getQuantidade_maxima());
            pstm.setInt(6, objestoquedto.getQuantidade_minima());
            pstm.setString(7, objestoquedto.getData_entrada());
            pstm.setInt(8, objestoquedto.getId_fornecedor());
            pstm.setString(9, objestoquedto.getDescricao());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "EstoqueDAO" + erro);
        } 
        
    }
    
    
    public ArrayList<EstoqueDTO> PesquisarEstoque() {
        
        String sql = "SELECT * FROM estoque";
        
        conn = new ConexaoDAO().conexaoBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                
                EstoqueDTO objestoqueDTO = new EstoqueDTO();
                
                objestoqueDTO.setId_estoque(rs.getInt("id_estoque"));
                objestoqueDTO.setId_produto(rs.getInt("id_produto"));
                objestoqueDTO.setValor_estoque(rs.getDouble("valor_estoque"));
                objestoqueDTO.setQuantidade_em_estoque(rs.getInt("quantidade_em_estoque"));
                objestoqueDTO.setQuantidade_maxima(rs.getInt("quantidade_maxima"));
                objestoqueDTO.setQuantidade_minima(rs.getInt("quantidade_minima"));
                objestoqueDTO.setData_entrada(rs.getString("data_entrada"));
                objestoqueDTO.setId_fornecedor(rs.getInt("id_fornecedor"));
                objestoqueDTO.setDescricao(rs.getString("descricao"));
                
                
                lista.add(objestoqueDTO);
                
            }
            
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "EstoqueDAO Pesquisar" + erro);
        }
        
        return lista;
    }
    
    
     public void AlterarEstoque(EstoqueDTO objestoquedto) {
        
        String sql = "UPDATE estoque SET id_estoque = ?, id_produto = ?, valor_estoque = ?, quantidade_em_estoque = ?, quantidade_maxima = ?, quantidade_minima = ?, data_entrada = ?, id_fornecedor = ?, descricao = ? WHERE id_estoque = ? ";
        
        
         conn = new ConexaoDAO().conexaoBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objestoquedto.getId_estoque());
            pstm.setInt(2, objestoquedto.getId_produto());
            pstm.setDouble(3, objestoquedto.getValor_estoque());
            pstm.setInt(4, objestoquedto.getQuantidade_em_estoque());
            pstm.setInt(5, objestoquedto.getQuantidade_maxima());
            pstm.setInt(6, objestoquedto.getQuantidade_minima());
            pstm.setString(7, objestoquedto.getData_entrada());
            pstm.setInt(8, objestoquedto.getId_fornecedor());
            pstm.setString(9, objestoquedto.getDescricao());
            pstm.setInt(10, objestoquedto.getId_estoque());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "EstoqueDAO Alterar" + erro);
        } 
        
    }
     
     
      public void excluirEstoque(EstoqueDTO objestoquedto) {
        
        String sql = "DELETE FROM estoque WHERE id_estoque = ?";
        
        conn = new ConexaoDAO().conexaoBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            
            pstm.setInt(1, objestoquedto.getId_estoque());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "EstoqueDAO Excluir" + erro);
        } 
    }
      
    
}
