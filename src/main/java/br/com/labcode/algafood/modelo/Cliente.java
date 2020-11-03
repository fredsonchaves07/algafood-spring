package br.com.labcode.algafood.modelo;

public class Cliente {
    private String nome;
    private String email;
    private String telefone;
    private Boolean ativo = false;

    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void ativarCliente(){
        this.ativo = true;
    }
}
