package Banco;

public class Gerente extends Funcionario {
	// o cargo é private pois pode ser acessado apenas a classe gerente
		private String cargo;

	//criação do construtor
	public Gerente(String nome, String CPF, int Idade, String Cargo) {
		super(nome, CPF, Idade);
		this.cargo = Cargo;
	}
	public Cliente associaConta(String nome, String cpf, int idade, Conta conta) {
		Cliente cliente = new Cliente(nome, cpf, idade, conta);
		return cliente;
	}
	
	public Conta criarConta(Long agencia, Long numeroConta, int tipoConta){
		if(tipoConta == 1) {
			ContaCorrente conta = new ContaCorrente(agencia, numeroConta);
			return conta;
			}
		else if(tipoConta == 2) {
			ContaPoupanca conta = new ContaPoupanca(agencia, numeroConta);
			return conta;
			}
		return null;
	}


	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}