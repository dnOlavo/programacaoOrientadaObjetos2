package iftm.edu.br.dnolavo.encapsulamento;

public abstract class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método abstrato para aplicar o desconto, a ser implementado pelas subclasses
    public abstract double aplicarDesconto(double precoBase);
}
