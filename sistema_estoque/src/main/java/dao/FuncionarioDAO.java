
package dao;

import dto.FuncionarioDTO;
import interfaces.FuncionarioInterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class FuncionarioDAO implements FuncionarioInterface {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<FuncionarioDTO> lista = new ArrayList<>();
     
    @Override
    public void cadastrarFuncionario(FuncionarioDTO objfuncionariodto) {
        
        String sql = "INSERT INTO funcionario (nome, matricula, senha, cpf, rg, cargo, cep, bairro, cidade) VALUES (?, ? ,? ,? ,?, ?, ?, ?, ?)";
        
        conn = new ConexaoDAO().conexaoBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfuncionariodto.getNome());
            pstm.setString(2, objfuncionariodto.getMatricula());
            pstm.setString(3, objfuncionariodto.getSenha());
            pstm.setString(4, objfuncionariodto.getCpf());
            pstm.setInt(5, objfuncionariodto.getRg());
            pstm.setString(6, objfuncionariodto.getCargo());
            pstm.setString(7, objfuncionariodto.getCep());
            pstm.setString(8, objfuncionariodto.getBairro());
            pstm.setString(9, objfuncionariodto.getCidade());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "FuncionarioDAO" + erro);
        } 
        
    }
    
    //ResultSet usando o datatable percorre o SQL e trabalha com a parte dos atributos do banco de dados
    @Override
    public ArrayList<FuncionarioDTO> PesquisarFuncionario() {
        
        String sql = "SELECT * FROM funcionario";
        
        conn = new ConexaoDAO().conexaoBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                
                FuncionarioDTO objfuncionarioDTO = new FuncionarioDTO();
                
                objfuncionarioDTO.setId_funcionario(rs.getInt("id_funcionario"));
                objfuncionarioDTO.setMatricula(rs.getString("matricula"));
                objfuncionarioDTO.setSenha(rs.getString("senha"));
                objfuncionarioDTO.setNome(rs.getString("nome"));
                objfuncionarioDTO.setCpf(rs.getString("cpf"));
                objfuncionarioDTO.setRg(rs.getInt("rg"));
                objfuncionarioDTO.setCargo(rs.getString("cargo"));
                objfuncionarioDTO.setCep(rs.getString("cep"));
                objfuncionarioDTO.setBairro(rs.getString("bairro"));
                objfuncionarioDTO.setCidade(rs.getString("cidade"));
                
                lista.add(objfuncionarioDTO);
                
            }
            
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "FuncionarioDAO Pesquisar" + erro);
        }
        
        return lista;
        
        
    }
    
    @Override
    public void AlterarFuncionario(FuncionarioDTO objfuncionariodto) {
        
        String sql = "UPDATE funcionario SET matricula = ?, senha = ?, nome = ?, cpf = ?, rg = ?, cargo = ?, cep = ?, bairro = ?, cidade = ? WHERE id_funcionario = ? ";
        
        
         conn = new ConexaoDAO().conexaoBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfuncionariodto.getMatricula());
            pstm.setString(2, objfuncionariodto.getSenha());
            pstm.setString(3, objfuncionariodto.getNome());
            pstm.setString(4, objfuncionariodto.getCpf());
            pstm.setInt(5, objfuncionariodto.getRg());
            pstm.setString(6, objfuncionariodto.getCargo());
            pstm.setString(7, objfuncionariodto.getCep());
            pstm.setString(8, objfuncionariodto.getBairro());
            pstm.setString(9, objfuncionariodto.getCidade());
            pstm.setInt(10, objfuncionariodto.getId_funcionario());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "FuncionarioDAO Alterar" + erro);
        } 
        
    }
    
    @Override
    public void excluirFuncionario(FuncionarioDTO objfuncionariodto) {
        
        String sql = "DELETE FROM funcionario WHERE id_funcionario = ?";
        
        conn = new ConexaoDAO().conexaoBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            
            pstm.setInt(1, objfuncionariodto.getId_funcionario());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "FuncionarioDAO Excluir" + erro);
        } 
    }
    
}
