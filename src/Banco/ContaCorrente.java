package Banco;

public class ContaCorrente extends Conta {
	private final double TAXA_SAQUE = 2.5;

	@Override
	boolean Deposita(Double Valor) {
		if (Valor > 0) {
			this.Saldo += Valor;
			return true;
		}
		return false;
	}

	public boolean Saca(Double Valor) {
			return super.Saca(Valor + TAXA_SAQUE);			
	}
}