package iftm.edu.br.dnolavo.conta;

public class ContaCorrente extends Conta implements Tarifavel {

   private double limiteChequeEspecial;
   private static final double TARIFA = 15.0; // Exemplo de valor de tarifa

   public ContaCorrente(Agencia agencia, String numeroConta, double saldo, double limiteChequeEspecial) {
       super(agencia, numeroConta, saldo);
       this.limiteChequeEspecial = limiteChequeEspecial;
   }
   
   @Override
   public void saque(double valor) throws ContaException {
       if (valor > 0) {
           if (this.saldo + limiteChequeEspecial >= valor) {
               this.saldo -= valor;
           } else {
               throw new ContaException("Conta sem saldo suficiente: " + this.saldo);
           }
       } else {
           throw new ContaException("Valor inválido para saque " + valor);
       }
   }

   @Override
   public void cobrarTarifa() {
       if (this.saldo >= TARIFA) {
           this.saldo -= TARIFA;
       } else {
           System.out.println("Saldo insuficiente para cobrança da tarifa.");
       }
   }
}
