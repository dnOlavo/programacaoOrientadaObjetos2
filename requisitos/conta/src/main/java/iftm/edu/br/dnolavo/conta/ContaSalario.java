package iftm.edu.br.dnolavo.conta;

// ContaSalario.java
public class ContaSalario extends Conta {

    public ContaSalario(Agencia agencia, String numeroConta, double saldo) {
        super(agencia, numeroConta, saldo);
    }

    @Override
    public void saque(double valor) throws ContaException {
        if (valor > 0) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
            } else {
                throw new ContaException("Conta sem saldo suficiente: " + this.saldo);
            }
        } else {
            throw new ContaException("Valor inválido para saque " + valor);
        }
    }

    // ContaSalario não tem tarifa nem rendimento
}