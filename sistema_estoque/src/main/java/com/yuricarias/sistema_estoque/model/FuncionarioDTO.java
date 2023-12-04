
package com.yuricarias.sistema_estoque.model;

/**
 *
 * @author Estudo
 */
public class FuncionarioDTO {
    
    private int id_funcionario;
    private String matricula;
    private String senha;
    private String nome;
    private String cpf;
    private int rg;
    private String cargo;
    private String cep;
    private String bairro;
    private String cidade;

    public FuncionarioDTO() {
    }

    public FuncionarioDTO(int id_funcionario, String matricula, String senha, String nome, String cpf, int rg, String cargo, String cep, String bairro, String cidade) {
        this.id_funcionario = id_funcionario;
        this.matricula = matricula;
        this.senha = senha;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.cargo = cargo;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    
    
    
    
}
