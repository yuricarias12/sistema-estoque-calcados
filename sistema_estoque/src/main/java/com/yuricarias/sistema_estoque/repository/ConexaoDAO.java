/*
DAO PARA ACESSO AOS OBJETOS
DTO PARA TRANSFERENCIA DE OBJETOS
 */
package com.yuricarias.sistema_estoque.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudo
 */
public class ConexaoDAO {
    
    public Connection conexaoBD() {
        
        Connection conn = null;
        
        try {
            
            String url = "jdbc:mysql://localhost:3306/sistema_estoque?user=root&password=";
            conn = DriverManager.getConnection(url);
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO" + erro.getMessage());
        }
        return conn;
    }
    
}
