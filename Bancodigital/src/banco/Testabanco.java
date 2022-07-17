package banco;

public class Testabanco {

	public static void main(String[] args) {
	
		ContaPoupanca poup = new ContaPoupanca(12153L, 45456L);
		ContaCorrente corre = new ContaCorrente(56458L, 983457L);
		
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


