package Banco;

public class Testagerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente("Marcos", "112.043.824-17", 34, "Gerente");

		System.out.println("\nOs dados do gerente são: ");
		System.out.println(g1.getNome());
		System.out.println(g1.getCPF());
		System.out.println(g1.getCargo());
		System.out.println(g1.getIdade());
	}
}