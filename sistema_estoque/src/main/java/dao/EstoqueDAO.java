
package dao;

import dto.EstoqueDTO;
import dto.ProdutoDTO;
import interfaces.EstoqueInterface;
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
import java.time.format.DateTimeParseException;




public class EstoqueDAO implements EstoqueInterface {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<EstoqueDTO> lista = new ArrayList<>();
    
   @Override         
   public void cadastrarEstoque(EstoqueDTO objestoquedto) {

    String sql = "INSERT INTO estoque (id_estoque, quantidade_em_estoque, quantidade_maxima, quantidade_minima, data_entrada, descricao, id_produto, preco_unidade, valor_total_estoque) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

    conn = new ConexaoDAO().conexaoBD();

    try {
        
        // Chama o método valorTotalEmEstoque da classe EstoqueDTO
        Double valorTotalEstoque = objestoquedto.valorTotalEmEstoque();
        
        pstm = conn.prepareStatement(sql);
        pstm.setInt(1, objestoquedto.getId_estoque());
        pstm.setInt(2, objestoquedto.getQuantidade_em_estoque());
        pstm.setInt(3, objestoquedto.getQuantidade_maxima());
        pstm.setInt(4, objestoquedto.getQuantidade_minima());
        
        try {
    
                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                LocalDateTime dataHoraEntrada = LocalDateTime.now();
                pstm.setTimestamp(5, Timestamp.valueOf(dataHoraEntrada.format(dateTimeFormatter)));

    
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null, "Informe a data no formato correto xx/xx/xxxx: " + e.getMessage());
        }
        
        pstm.setString(6, objestoquedto.getDescricao());
        pstm.setInt(7, objestoquedto.getId_produto());
        pstm.setDouble(8, objestoquedto.getPreco_unidade());
        
        // Verifica se valorTotalEstoque não é nulo antes de atribuir ao parâmetro
        if (valorTotalEstoque != null) {
            pstm.setDouble(9, valorTotalEstoque);
        } else {
            pstm.setNull(9, java.sql.Types.DOUBLE);
        }

        pstm.execute();
        pstm.close();

    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "EstoqueDAO" + erro);
    }
}


    
    @Override
    public ArrayList<EstoqueDTO> pesquisarEstoque() {
        
        String sql = "SELECT * FROM estoque";
        
        conn = new ConexaoDAO().conexaoBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                
                EstoqueDTO objestoqueDTO = new EstoqueDTO();
                
                objestoqueDTO.setId_estoque(rs.getInt("id_estoque"));
                objestoqueDTO.setQuantidade_em_estoque(rs.getInt("quantidade_em_estoque"));
                objestoqueDTO.setQuantidade_maxima(rs.getInt("quantidade_maxima"));
                objestoqueDTO.setQuantidade_minima(rs.getInt("quantidade_minima"));
                objestoqueDTO.setData_entrada(rs.getString("data_entrada"));
                objestoqueDTO.setDescricao(rs.getString("descricao"));
                objestoqueDTO.setId_produto(rs.getInt("id_produto"));
                objestoqueDTO.setPreco_unidade(rs.getDouble("preco_unidade"));
                
                
                lista.add(objestoqueDTO);
                
            }
            
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "EstoqueDAO Pesquisar" + erro);
        }
        
        return lista;
    }
    
     @Override
     public void alterarEstoque(EstoqueDTO objestoquedto) {
        
        String sql = "UPDATE estoque SET id_estoque = ?, quantidade_em_estoque = ?, quantidade_maxima = ?, quantidade_minima = ?, data_entrada = ?, descricao = ? WHERE id_estoque = ? ";
        
        
         conn = new ConexaoDAO().conexaoBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objestoquedto.getId_estoque());
            pstm.setInt(2, objestoquedto.getQuantidade_em_estoque());
            pstm.setInt(3, objestoquedto.getQuantidade_maxima());
            pstm.setInt(4, objestoquedto.getQuantidade_minima());
            pstm.setString(5, objestoquedto.getData_entrada());
            pstm.setString(6, objestoquedto.getDescricao());
            pstm.setInt(7, objestoquedto.getId_estoque());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "EstoqueDAO Alterar" + erro);
        } 
        
    }
     
     @Override
      public void excluirEstoque(EstoqueDTO objestoquedto) {
        
        String sql = "DELETE FROM estoque WHERE id_estoque = ?";
        
        conn = new ConexaoDAO().conexaoBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            
            pstm.setInt(1, objestoquedto.getId_estoque());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "EstoqueDAO Excluir" + erro.getMessage());
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
