package banco;

import java.util.Scanner;

public class ContaPoupanca extends Conta {
private double taxaRendimento = 0.1;
	
	public ContaPoupanca(Long agencia, Long numeroConta) {
		super(agencia, numeroConta);
	}
	@Override
	boolean Deposita(Double Valor) {
		System.out.print("Diga quantos anos o dinheiro vai ficar guardado na poupança: ");
		Scanner read = new Scanner(System.in);
		int tempoAno = read.nextInt();
		double taxaValorFinal = 0;
		for(int i=0; i<tempoAno; i++) {
			taxaValorFinal += (Valor + taxaValorFinal) * taxaRendimento;
		}
		if (Valor > 0) {
			this.Saldo += Valor + taxaValorFinal;
			return true;
		}
		return false;
	}
	@Override
	public boolean Saca(Double Valor) {		
			return super.Saca(Valor);
	}

}
