package model;

public class Cadastro {

    private int id;
    
    private String login;
    private String senha;
    private String nome;
    private int numero;
    private String email;
    private String bairro;
    private String endereco;
    private String profissao;
    private String descricao;

    public Cadastro() {
        
    }
    
    public Cadastro(String login, String senha, String nome, int numero, String email, String bairro, String endereco, String profissao, String descricao) {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.numero = numero;
        this.email = email;
        this.bairro = bairro;
        this.endereco = endereco;
        this.profissao = profissao;
        this.descricao = descricao;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
}