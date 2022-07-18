package Banco;

public class Cliente extends Pessoa {
	private String profissao;
	private int senha;
	Conta conta;
	
	public Cliente(String nome, String CPF, int Idade, Conta conta) {
		super(nome, CPF, Idade);
		this.conta = conta;
	}

		public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nConta: " + conta.getNumeroConta() + "\nAgência: " + conta.getAgencia();
	}	
}