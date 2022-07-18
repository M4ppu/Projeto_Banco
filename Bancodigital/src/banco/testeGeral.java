package banco;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.Random;
import java.util.regex.Pattern;
public class testeGeral {
	public static void main(String[] args) throws Exception {
	
	ContaPoupanca Poupanca =new ContaPoupanca(123456,34567);
	ContaCorrente contaCorrente= new ContaCorrente(12345,123454234);
	Administrador administrador =new Administrador("marcela","123.456.789-10",34,"Administrador");
	Cliente cliente =new Cliente("Ana", "123.456.789 -10", 23, null);
	Gerente gerente = new Gerente("Marcos", "123.234.098-01", 25, "Gerente");
	Scanner scan =new Scanner(System.in);
	ArrayList<Cliente> listaCadastro= new ArrayList<Cliente>();
	Random gerador = new Random();
	int op=0;
	boolean continueLoop = true;
	
	do
	{
		System.out.println("\n-_-_-_-_-_--_-_--_-_--_-_-_-_-_-_-_-_-_-_\n");
		System.out.println("\t\tBem vinde!");
		System.out.println("\t\tMu Bank");
		System.out.println("\n-_-_-_-_-_--_-_--_-_--_-_-_-_-_-_-_-_-_-_\n");
		System.out.println("Qual operação você deseja realizar?");
		System.out.println("Tecle 1 para - Cadastro novo usuario!");
		System.out.println("Tecle 2 para - Acessar a conta corrente!");
		System.out.println("Tecle 3 para - Acessar a poupança!");
		System.out.println("Tecle 0 para finalizar o procedimento");
		System.out.println("\n-_-_-_-_-_--_-_--_-_--_-_-_-_-_-_-_-_-_-_\n");
		op =scan.nextInt();
		
		switch (op)
		{
		case 1:
			System.out.println("\nVocê escolheu cadastro de novo usuario!");
			System.out.println("\nVamos te conectar com o gerente!");
			
			int agencia =(int) gerador.nextLong(1111,9999);
			int numero = (int) gerador.nextLong(1111,9999);
			
			System.out.println("\nQual o tipo de conta?");
			System.out.println("\nDigite 1 para conta Corrente ou Digite 2 para conta Poupança");
			int continha = scan.nextInt();
			
			while(continha != 1 && continha !=2) {
				System.out.println("\nNumero invalido, escolha novamente!");
				continha = scan.nextInt();	
			}
			Conta continhaCriada=gerente.criarConta(agencia, numero, continha);
			System.out.println("\nDigite seu nome:");
			String nome = scan.next();
			
			do {
				System.out.println("\nNome invalido! insira novamente!");
				nome = scan.next();
				try {
					if (Pattern.matches("[a-zA-Z]+", nome) == false || nome.length() < 3) {
						throw new Exception("\nNome inválido");
					} else
						continueLoop = false;
				} 
				catch (Exception e) {
					System.err.printf("Exceção: %s\n", e);
				}
			}
			
			while (continueLoop);
			System.out.println("\nDigite seu CPF:");
			String CPF =scan.next();
			
			System.out.println("\nDigite sua idade:");
			int idade = scan.nextInt();
			
			Cliente novaConta = gerente.associaConta(nome,CPF,idade,continhaCriada);
			listaCadastro.add(novaConta);
		case 2:
			System.out.println("Você escolheu acessar a conta corrente!!");
			
			System.out.println("Digite seu nome");
			String nomee = scan.next();
			
			System.out.println("Digite seu CPF");
			String CPf =scan.next();	
			
			System.out.println("Digite sua idade");
			int idadee = scan.nextInt();
			
			System.out.println("Digite sua agencia");
			int agenciaa = scan.nextInt();
			
			System.out.println("Digite o número da sua conta");
			int numeroo = scan.nextInt();
			
			ContaCorrente contaCorrentee= new ContaCorrente(agenciaa,numeroo);
			Cliente clientee =new Cliente(nomee, CPf,idadee, contaCorrentee);
			
			
		case 3:
			System.out.println("Você escolheu acessar a poupança!!");
			
			System.out.println("Digite seu nome");
			String noome = scan.next();
			
			System.out.println("Digite seu CPF");
			String CpF =scan.next();	
			
			System.out.println("Digite sua idade");
			int idaade = scan.nextInt();
			
			System.out.println("Digite sua agencia");
			int agenciia = scan.nextInt();
			
			System.out.println("Digite o número da sua conta");
			int nuumero = scan.nextInt();
			
			ContaCorrente contaaCorrentee= new ContaCorrente(agenciia,nuumero);
			Cliente cliientee =new Cliente(noome, CpF,idaade, contaaCorrentee);
			
		case 0:
			System.out.println("Muito obrigada pela preferencia!");break;
		default:
			System.out.println("Opção invalida!!");break;

		}
			
	}while(op!=0);


	}
}
