package Banco;

public class Administrador extends Funcionario implements Autenticavel {

	public Administrador(String nome, String CPF, int Idade, String Cargo) {
		super(nome, CPF, Cargo, Idade);
	}

	private String senha;
	private double adicionalSalario = 500;
	private double salario;

	public double getSalarioComAdicional() {
		return this.salario + adicionalSalario;
	}

	@Override
	public void setSenha(String novaSenha) {
		this.senha = novaSenha;
	}

	@Override
	public boolean autentica(String senha) {
		if (this.senha.equals(senha)) {
			return true;
		}
		return false;
	}

	public String getSalario() {
		return this.getSalario();
	}
}