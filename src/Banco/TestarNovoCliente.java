package Banco;

public class TestarNovoCliente {
	public static void main(String[] args) {
		Gerente marcos = new Gerente("Marcos", "157485465551", 45, "Gerente");
		Conta contaCriada = marcos.criarConta(456465L, 1553165L, 1);
		Cliente luiza = marcos.associaConta("Luiza", "4156464132120", 25, contaCriada);
		
		System.out.println("\n" + luiza.toString());
		
		System.out.println(luiza.conta.getSaldo());
		
		luiza.conta.Deposita(12.0);
		
		luiza.conta.Saca(2.0);
		
		System.out.println(luiza.conta.getSaldo());
	}
}