package Banco;

public abstract class Conta {
	protected double Saldo;
	protected Long Agencia;
	protected Long NumeroConta;
	
	abstract boolean Deposita(Double Valor);
	
	public boolean Saca(Double Valor) {
		if(this.Saldo >= Valor) {
			this.Saldo -= Valor;
			return true;
		}
		else {
			System.out.println("Valor inserido maior que o da conta!");
			return false;
		}
	}
	public boolean Tranferir(Double Valor, Conta Destino) {
		if(this.Saldo >= Valor) {
			this.Saldo -= Valor;
			Destino.Deposita(Valor);
			return true;
		}
		else {
			System.out.println("Valor inserido maior que o da conta!");
			return false;
		}
	}
	public double getSaldo() {
		return Saldo;
	}
}