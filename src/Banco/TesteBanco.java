package Banco;

public class TesteBanco {
	public static void main(String[] args) {
		ContaPoupanca poup = new ContaPoupanca(12153, 45456);
		ContaCorrente corre = new ContaCorrente(56458, 983457);
		
		poup.Deposita(100.0);
		System.out.println("Poupança: " + poup.getSaldo());
		
		corre.Deposita(200.0);
		System.out.println("\nCorrente: " + corre.getSaldo());
		
		poup.Saca(50.0);
		System.out.println("\nPopança pós saque: " + poup.getSaldo());
		
		corre.Saca(50.0);
		System.out.println("\nCorrente pós saque: " + corre.getSaldo());
		
		poup.Saca(72.0);
		System.out.println("\nPopança pós saque2: " + poup.getSaldo());
	}
}