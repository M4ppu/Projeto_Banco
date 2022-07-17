package Banco;

public class TestaAdministrador {

	public static void main(String[] args) {

		Administrador adm = new Administrador("Marluce", "11204465418", 53, "Administrador");
		adm.setCPF("0000000000");
		adm.setNome("Marluce");
		adm.setIdade(53);
		adm.Salario(10000);

		System.out.println("Administradora: " + adm.getNome());
		System.out.println("Salário base: " + adm.getSalario());
		System.out.println("Salário com adicional: " + adm.getSalarioComAdicional());

		adm.setSenha("2222");
		boolean autenticou = adm.autentica("2222");
		if (autenticou) {
			System.out.println("Adminstrador autenticado");
		} else {
			System.out.println("Adminstrador não autenticado");
		}

	}
}