package Banco;

public class Cliente extends Pessoa {

	public Cliente(String nome, String CPF, int Idade) {
		super(nome, CPF, Idade);
	}
	private String profissao;
	private int senha;
	
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
}