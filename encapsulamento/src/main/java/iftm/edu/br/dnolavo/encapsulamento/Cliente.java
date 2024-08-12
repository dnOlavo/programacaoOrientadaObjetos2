package iftm.edu.br.dnolavo.encapsulamento;

public class Cliente {
    private String nome;
    private String tipo; // "PessoaFisica" ou "PessoaJuridica"

    public Cliente(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
