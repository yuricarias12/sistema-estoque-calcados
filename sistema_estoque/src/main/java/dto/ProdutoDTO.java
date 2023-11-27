
package dto;

public class ProdutoDTO {
    
    private int id_produto;
    private String nome;
    private int tamanho;
    private String marca;
    private String cor;
    private Double preco;
    private int quantidade;
    private String categoria;
    private int id_estoque;
    private String codigo_sku;
    private String modelo;

    public ProdutoDTO() {
    }

    public ProdutoDTO(int id_produto, String nome, int tamanho, String marca, String cor, Double preco, int quantidade, String categoria, int id_estoque, String codigo_sku, String modelo) {
        this.id_produto = id_produto;
        this.nome = nome;
        this.tamanho = tamanho;
        this.marca = marca;
        this.cor = cor;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.id_estoque = id_estoque;
        this.codigo_sku = codigo_sku;
        this.modelo = modelo;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getId_estoque() {
        return id_estoque;
    }

    public void setId_estoque(int id_estoque) {
        this.id_estoque = id_estoque;
    }

    public String getCodigo_sku() {
        return codigo_sku;
    }

    public void setCodigo_sku(String codigo_sku) {
        this.codigo_sku = codigo_sku;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    
    
}
