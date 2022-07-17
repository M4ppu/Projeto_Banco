package banco;

public abstract class Funcionario extends Pessoa{
	public Funcionario(String nome, String CPF, String Cargo, int Idade) {
		super(nome, CPF, Idade);
	}
	

	public void nome (String nome) {
		System.out.println("Nome do Funcionario: "+nome);
	}
	
	public void Idade (int Idade) {
		System.out.println("Idade: "+Idade);
	}
	public void Som (String CPF) {
		System.out.println("O CPF do funcionario é: "+CPF);
	}
	public void Turno (String Turno) {
		System.out.println("O turno do funcionario é: "+Turno);
	}
	public void Salario (double Salario)
	{
		System.out.println("O salario é: "+Salario);
	}	
	
	public void Cargo (String Cargo) {
		System.out.println("O cargo do funcionário é:" + Cargo);
	}

}

