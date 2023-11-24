
package dao;

import dto.FuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class FuncionarioValidacaoLogin {
    
    Connection conn;
    
    public ResultSet autenticacaoFuncionario(FuncionarioDTO funcionarioDto) {
        
        conn = new ConexaoDAO().conexaoBD();
        
        try {
            
            String sql = "SELECT * FROM funcionario WHERE matricula = ? and senha = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, funcionarioDto.getMatricula());
            pstm.setString(2, funcionarioDto.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "FuncionarioDAO: " + erro);
            return null;
            
        }
        
        
    }
    
}
