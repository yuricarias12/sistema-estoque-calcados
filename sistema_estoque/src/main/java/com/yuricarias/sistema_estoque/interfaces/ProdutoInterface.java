// Pacote: interfaces
package com.yuricarias.sistema_estoque.interfaces;

import com.yuricarias.sistema_estoque.model.ProdutoDTO;
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
