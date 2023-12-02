// Pacote: interfaces
package interfaces;

import dto.FuncionarioDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface FuncionarioInterface {
   void cadastrarFuncionario(FuncionarioDTO objfuncionariodto) throws SQLException;
    ArrayList<FuncionarioDTO> PesquisarFuncionario() throws SQLException;
    void AlterarFuncionario(FuncionarioDTO objfuncionariodto) throws SQLException;
    void excluirFuncionario(FuncionarioDTO objfuncionariodto) throws SQLException;
}
