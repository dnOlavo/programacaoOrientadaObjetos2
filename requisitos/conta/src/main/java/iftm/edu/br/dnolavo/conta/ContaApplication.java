package iftm.edu.br.dnolavo.conta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContaApplication {
	public static void main(String[] args) throws Exception {

		Agencia caixaLuizote = new Agencia("0205-08");

		Conta contaCorrente = new ContaCorrente(caixaLuizote, "1164-9", 500d, 1000);
		Conta contaPoupanca = new ContaPoupanca(caixaLuizote, "1324-9", 700d);
		Conta contaSalario = new ContaSalario(caixaLuizote, "1424-5", 1200d);

		caixaLuizote.addConta(contaPoupanca);
		caixaLuizote.addConta(contaCorrente);
		caixaLuizote.addConta(contaSalario);

		caixaLuizote.saque("1164-9", 1200);
		caixaLuizote.saque("1324-9", 1000);
		caixaLuizote.saque("1424-5", 500);

		// Cobrar tarifa das contas que são Tarifáveis
		if (contaCorrente instanceof Tarifavel) {
			((Tarifavel) contaCorrente).cobrarTarifa();
		}

		System.out.println("Saldo da Conta Corrente após tarifa: " + contaCorrente.getSaldo());
		System.out.println("Saldo da Conta Poupança: " + contaPoupanca.getSaldo());
		System.out.println("Saldo da Conta Salário: " + contaSalario.getSaldo());
	}

}