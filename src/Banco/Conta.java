package Banco;

public abstract class Conta {
	protected double Saldo;
	protected int Agencia;
	protected int NumeroConta;
	
	abstract boolean Deposita(Double Valor);
	
	public Conta(int agencia, int numeroConta) {
		this.Agencia = agencia;
		this.NumeroConta = numeroConta;
		this.Saldo = 0;
	}
	
	public boolean Saca(Double Valor) {
		if(this.Saldo >= Valor) {
			this.Saldo -= Valor;
			System.out.println("--> Saque realizado com sucesso!");
			return true;
		}
		else {
			System.out.println("--> Valor inserido maior que o da conta!");
			return false;
		}
	}
	public boolean Tranferir(Double Valor, Conta Destino) {
		if(this.Saldo >= Valor) {
			this.Saldo -= Valor;
			Destino.Deposita(Valor);
			System.out.println("\n--> Transferência feita com sucesso");
			return true;
		}
		else {
			System.out.println("\n--> Transferência falhou!");
			return false;
		}
	}
	public double getSaldo() {
		return Saldo;
	}

	public int getAgencia() {
		return Agencia;
	}

	public int getNumeroConta() {
		return NumeroConta;
	}
	
}