// Pacote: interfaces
package interfaces;

import dto.FornecedorDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface FornecedorInterface {
    void cadastrarFornecedor(FornecedorDTO objfornecedordto) throws SQLException;
    ArrayList<FornecedorDTO> pesquisarFornecedor() throws SQLException;
    void alterarFornecedor(FornecedorDTO objfornecedordto) throws SQLException;
    void excluirFornecedor(FornecedorDTO objfornecedordto) throws SQLException;
    ResultSet listarIdProduto() throws SQLException;
}
