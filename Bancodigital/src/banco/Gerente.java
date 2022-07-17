package banco;

public class Gerente extends Funcionario{

	//criação do construtor 
	public Gerente(String nome, String CPF, String Cargo, int Idade) {
		super(nome, CPF, Cargo, Idade);
	}
		
	//o cargo é private pois pode ser acessado apenas a classe gerente
	private String cargo;
	
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	

	}

	
	
	


