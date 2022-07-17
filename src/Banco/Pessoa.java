package Banco;

public abstract class Pessoa {
	private String nome;
	private String CPF;
	private int Idade;
	
	public Pessoa(String nome, String CPF, int Idade) {
		this.nome= nome;
		this.CPF= CPF;
		this.Idade= Idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}

	
}