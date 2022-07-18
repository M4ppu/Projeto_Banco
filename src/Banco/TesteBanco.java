package Banco;

public class TesteBanco {
	public static void main(String[] args) {
		ContaPoupanca poup = new ContaPoupanca(12153, 45456);
		ContaCorrente corre = new ContaCorrente(56458, 983457);
		ContaCorrente contaCorrente1 = new ContaCorrente(1234,12345);
		ContaCorrente contaCorrente2 = new ContaCorrente(3456,34567);
		Cliente cliente1 = new Cliente("Ana", "123.456.789-10", 23, contaCorrente1);
		Cliente cliente2 = new Cliente("Enzo", "234.567.891-10", 38, contaCorrente2);
		
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
		
		contaCorrente1.Deposita(35.0);
		System.out.println("Conta ana: " + contaCorrente1.getSaldo());
		System.out.println("Conta enzo: " + contaCorrente2.getSaldo());
		cliente1.conta.Tranferir(32.0, cliente2.conta);
		System.out.println("Conta ana: " + contaCorrente1.getSaldo());
		System.out.println("Conta enzo: " + contaCorrente2.getSaldo());
	}
}