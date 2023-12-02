// Pacote: interfaces
package interfaces;

import dto.ProdutoDTO;
import java.sql.ResultSet;
import java.util.ArrayList;

public interface ProdutoInterface {
    void cadastrarProduto(ProdutoDTO objprodutodto);
    ArrayList<ProdutoDTO> pesquisarProduto();
    void alterarProduto(ProdutoDTO objprodutodto);
    void excluirProduto(ProdutoDTO objprodutodto);
    ResultSet listarCategoria();
    ResultSet listarEstoque();
}
