// Pacote: interfaces
package com.yuricarias.sistema_estoque.interfaces;

import com.yuricarias.sistema_estoque.model.FuncionarioDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface FuncionarioInterface {
   void cadastrarFuncionario(FuncionarioDTO objfuncionariodto) throws SQLException;
    ArrayList<FuncionarioDTO> PesquisarFuncionario() throws SQLException;
    void AlterarFuncionario(FuncionarioDTO objfuncionariodto) throws SQLException;
    void excluirFuncionario(FuncionarioDTO objfuncionariodto) throws SQLException;
}
