
package dto;

public class EstoqueDTO {
    
    private int id_estoque;
    private int id_produto;
    private Double valor_estoque;
    private int quantidade_em_estoque;
    private int quantidade_maxima;
    private int quantidade_minima;
    private String data_entrada;
    private int id_fornecedor;
    private String descricao;

    public EstoqueDTO() {
    }

    public EstoqueDTO(int id_estoque, int id_produto, Double valor_estoque, int quantidade_em_estoque, int quantidade_maxima, int quantidade_minima, String data_entrada, int id_fornecedor, String descricao) {
        this.id_estoque = id_estoque;
        this.id_produto = id_produto;
        this.valor_estoque = valor_estoque;
        this.quantidade_em_estoque = quantidade_em_estoque;
        this.quantidade_maxima = quantidade_maxima;
        this.quantidade_minima = quantidade_minima;
        this.data_entrada = data_entrada;
        this.id_fornecedor = id_fornecedor;
        this.descricao = descricao;
    }

    public int getId_estoque() {
        return id_estoque;
    }

    public void setId_estoque(int id_estoque) {
        this.id_estoque = id_estoque;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public Double getValor_estoque() {
        return valor_estoque;
    }

    public void setValor_estoque(Double valor_estoque) {
        this.valor_estoque = valor_estoque;
    }

    public int getQuantidade_em_estoque() {
        return quantidade_em_estoque;
    }

    public void setQuantidade_em_estoque(int quantidade_em_estoque) {
        this.quantidade_em_estoque = quantidade_em_estoque;
    }

    public int getQuantidade_maxima() {
        return quantidade_maxima;
    }

    public void setQuantidade_maxima(int quantidade_maxima) {
        this.quantidade_maxima = quantidade_maxima;
    }

    public int getQuantidade_minima() {
        return quantidade_minima;
    }

    public void setQuantidade_minima(int quantidade_minima) {
        this.quantidade_minima = quantidade_minima;
    }

    public String getData_entrada() {
        return data_entrada;
    }

    public void setData_entrada(String data_entrada) {
        this.data_entrada = data_entrada;
    }

    public int getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
    
}
