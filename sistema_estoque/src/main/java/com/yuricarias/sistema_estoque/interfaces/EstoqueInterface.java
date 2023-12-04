// Pacote: interfaces
package com.yuricarias.sistema_estoque.interfaces;

import com.yuricarias.sistema_estoque.model.EstoqueDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface EstoqueInterface {
    void cadastrarEstoque(EstoqueDTO objestoquedto) throws SQLException;
    ArrayList<EstoqueDTO> pesquisarEstoque() throws SQLException;
    void alterarEstoque(EstoqueDTO objestoquedto) throws SQLException;
    void excluirEstoque(EstoqueDTO objestoquedto) throws SQLException;
    ResultSet listarIdProduto() throws SQLException;
}
