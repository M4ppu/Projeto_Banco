package Banco;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.Random;
import java.util.regex.Pattern;

public class testeGeral2 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		Random gerador = new Random();
		
		CheckNome checkname = new CheckNome();
		ContaCorrente contaCorrenteV = new ContaCorrente(1234, 12345);
		ContaCorrente contaCorrenteE = new ContaCorrente(2345, 23456);
		ContaPoupanca contaPoupancaL = new ContaPoupanca(3456, 34567);
		Administrador administrador = new Administrador("marcela", "123.456.789-10", 34, "Administrador");
		Cliente cliente1 = new Cliente("Valentina", "123.456.789-10", 23, contaCorrenteV);
		Cliente cliente2 = new Cliente("Enzo", "234.567.891-10", 38, contaCorrenteE);
		Cliente cliente3 = new Cliente("Larissa", "234.567.891-10", 38, contaPoupancaL);
		Gerente gerente = new Gerente("Marcos", "123.234.098-01", 25, "Gerente");
		
		ArrayList<Cliente> listaCadastro = new ArrayList<Cliente>();
		
		int op = 0, i, j, k, l;
		double transf1, saca1, deposito1, transf2, saca2, deposito2, depositoPoup, sacaPoupanca;
		boolean continueLoop = true;

		do {
			System.out.println("\n-_-_-_-_-_--_-_--_-_--_-_-_-_-_-_-_-_-_-_\n");
			System.out.println("\t\tBem vinde!");
			System.out.println("\t\tMu Bank");
			System.out.println("\n--> Qualquer semelhança com a realidade é mera coincidência <--");
			System.out.println("\n-_-_-_-_-_--_-_--_-_--_-_-_-_-_-_-_-_-_-_\n");
			System.out.println("Qual operação você deseja realizar?");
			System.out.println("Tecle 1 para - Cadastro novo usuario!");
			System.out.println("Tecle 2 para - Acessar a conta corrente!");
			System.out.println("Tecle 3 para - Acessar a poupança!");
			System.out.println("Tecle 0 para finalizar o procedimento");
			System.out.println("\n-_-_-_-_-_--_-_--_-_--_-_-_-_-_-_-_-_-_-_\n");
			System.out.print("Digite aqui sua opção: ");
			op = scan.nextInt();

			switch (op) {
			
			case 1:
				System.out.println("\nVocê escolheu cadastro de novo usuario!");
				System.out.println("Vamos te conectar com o gerente!");

				int agencia = (int) gerador.nextLong(1111, 9999);
				int numero = (int) gerador.nextLong(11111, 99999);

				System.out.println("\nQual o tipo de conta?");
				System.out.print("Digite 1 para conta Corrente ou Digite 2 para conta Poupança: ");
				int continha = scan.nextInt();

				while (continha != 1 && continha != 2) {
					System.out.println("\nNumero invalido, escolha novamente!");
					System.out.print("\nDigite 1 para conta Corrente ou Digite 2 para conta Poupança: ");
					continha = scan.nextInt();
				}
				Conta continhaCriada = gerente.criarConta(agencia, numero, continha);
				System.out.print("\nDigite seu nome:");
				String nome = scan.next();

				do {

					try {
						if (Pattern.matches("[a-zA-Z]+", nome) == false || nome.length() < 3) {
							throw new Exception("\nNome inválido");
						} else
							continueLoop = false;
					} catch (Exception e) {
						System.err.printf("Exceção: %s\n", e);
						System.out.print("Digite seu nome:");
						nome = scan.next();
					}
				}

				while (continueLoop);

				System.out.print("Digite seu CPF:");
				String CPF = scan.next();

				System.out.print("Digite sua idade:");
				int idade = scan.nextInt();
				while (idade < 18) {
					System.out.println("Idade menor que 18 anos");
					System.out.print("Digite sua idade:");
					idade = scan.nextInt();
				}

				Cliente novaConta = gerente.associaConta(nome, CPF, idade, continhaCriada);
				listaCadastro.add(novaConta);
				System.out.println("\n-_-_-_-_-_--_-_--_-_--_-_-_-_-_-_-_-_-_-_\n");
				System.out.println("Dados da sua nova conta ");
				System.out.println(novaConta);
				System.out.println("\n-_-_-_-_-_--_-_--_-_--_-_-_-_-_-_-_-_-_-_\n");
				break;

			case 2:
				System.out.println("\n-_-_-_-_-_--_-_--_-_--_-_-_-_-_-_-_-_-_-_\n");
				System.out.println("\nVocê escolheu acessar a conta corrente!!");
				System.out.println("1 - Valentina");
				System.out.println("2 - Enzo");
				System.out.println("Tecle 0 para sair!");
				System.out.println("\n-_-_-_-_-_--_-_--_-_--_-_-_-_-_-_-_-_-_-_\n");
				System.out.print("Digite sua opção: ");
				i = scan.nextInt();
				while (i != 1 && i != 2 && i != 0) {
					System.out.println("\nOpção inválida, digite novamente");
					System.out.println("\n-_-_-_-_-_--_-_--_-_--_-_-_-_-_-_-_-_-_-_\n");
					System.out.println("\nVocê escolheu acessar a conta corrente!!");
					System.out.println("1 - Valentina");
					System.out.println("2 - Enzo");
					System.out.println("Tecle 0 para sair!");
					System.out.println("\n-_-_-_-_-_--_-_--_-_--_-_-_-_-_-_-_-_-_-_\n");
					System.out.print("Digite sua opção: ");
					i = scan.nextInt();
				}
				while (true) {
					if (i == 1) {
						System.out.println("\n-_-_-_-_-_--_-_--_-_--_-_-_-_-_-_-_-_-_-_\n");
						System.out.println("Bem vinda, Valentina!");
						System.out.println("Tecle 1 para ver seu saldo!");
						System.out.println("Tecle 2 para fazer uma transferencia!");
						System.out.println("Tecle 3 para fazer um depósito!");
						System.out.println("Tecle 4 para sacar!");
						System.out.println("Tecle 0 para finalizar o procedimento");
						System.out.println("\n-_-_-_-_-_--_-_--_-_--_-_-_-_-_-_-_-_-_-_\n");
						System.out.print("Digite sua opção aqui: ");
						j = scan.nextInt();
						while (j != 1 && j != 2 && j != 3 && j != 4 && j != 0) {
							System.out.println("\nOpção inválida, digite novamente");
							System.out.println("\n-_-_-_-_-_--_-_--_-_--_-_-_-_-_-_-_-_-_-_\n");
							System.out.println("Tecle 1 para ver seu saldo!");
							System.out.println("Tecle 2 para fazer uma transferência!");
							System.out.println("Tecle 3 para fazer um depósito!");
							System.out.println("Tecle 4 para sacar!");
							System.out.println("Tecle 0 para finalizar o procedimento");
							System.out.println("\n-_-_-_-_-_--_-_--_-_--_-_-_-_-_-_-_-_-_-_\n");
							System.out.print("Digite sua opção aqui: ");
							j = scan.nextInt();
						}
						if (j == 1) {
							System.out.println("\nVocê escolheu ver seu saldo");
							System.out.printf("\nSeu saldo é de R$%.2f\n", cliente1.conta.getSaldo());
						} else if (j == 2) {
							System.out.println("\n Você escolheu fazer uma tranferência!");
							System.out.print("Valor que deseja transferir para Enzo: R$");
							transf1 = scan.nextDouble();
							while (transf1 <= 0) {
								System.out.println("\nValor não válido");
								System.out.print("Valor que deseja transferir para Enzo: R$");
								transf1 = scan.nextDouble();
							}
							System.out.printf("\nTransferir R$%.2f para Enzo", transf1);
							cliente1.conta.Tranferir(transf1, cliente2.conta);
						} else if (j == 3) {
							System.out.println("\nVocê escolheu fazer um depósito!");
							System.out.print("Valor do depósito: R$");
							deposito1 = scan.nextDouble();
							contaCorrenteV.Deposita(deposito1);
						} else if (j == 4) {
							System.out.println("\nVocê escolheu sacar o dinheiro");
							System.out.printf("\nValor em conta R$%.2f\n", contaCorrenteV.getSaldo());
							System.out.print("Valor do saque R$");
							saca1 = scan.nextDouble();
							contaCorrenteE.Saca(saca1);
						} else if (j == 0)
							break;
					} else if (i == 2) {
						System.out.println("\n-_-_-_-_-_--_-_--_-_--_-_-_-_-_-_-_-_-_-_\n");
						System.out.println("\nBem vindo, Enzo!");
						System.out.println("Tecle 1 para ver seu saldo!");
						System.out.println("Tecle 2 para fazer uma transferencia!");
						System.out.println("Tecle 3 para fazer um depósito!");
						System.out.println("Tecle 4 para sacar!");
						System.out.println("Tecle 0 para finalizar o procedimento");
						System.out.println("\n-_-_-_-_-_--_-_--_-_--_-_-_-_-_-_-_-_-_-_\n");
						System.out.print("Digite sua opção aqui: ");
						j = scan.nextInt();
						while (j != 1 && j != 2 && j != 3 && j != 4 && j != 0) {
							System.out.println("\nOpção inválida, digite novamente");
							System.out.println("\n-_-_-_-_-_--_-_--_-_--_-_-_-_-_-_-_-_-_-_\n");
							System.out.println("Tecle 1 para ver seu saldo!");
							System.out.println("Tecle 2 para fazer uma transferência!");
							System.out.println("Tecle 3 para fazer um depósito!");
							System.out.println("Tecle 4 para sacar!");
							System.out.println("Tecle 0 para finalizar o procedimento");
							System.out.println("\n-_-_-_-_-_--_-_--_-_--_-_-_-_-_-_-_-_-_-_\n");
							System.out.print("Digite sua opção aqui: ");
							j = scan.nextInt();
						}
						if (j == 1) {
							System.out.println("\nVocê escolheu ver seu saldo");
							System.out.printf("\nSeu saldo é de R$%.2f\n", cliente2.conta.getSaldo());
						}
						if (j == 2) {
							System.out.println("\n Você escolheu fazer uma tranferência!");
							System.out.print("Valor que deseja transferir para Valentina: R$");
							transf2 = scan.nextDouble();
							while (transf2 <= 0) {
								System.out.println("\nValor não válido");
								transf2 = scan.nextDouble();
							}
							System.out.printf("\nTransferir R$%.2f para Valentina", transf2);
							cliente2.conta.Tranferir(transf2, cliente1.conta);
						}
						if (j == 3) {
							System.out.println("\nVocê escolheu fazer um depósito!");
							System.out.print("Valor do depósito: R$");
							deposito2 = scan.nextDouble();
							contaCorrenteE.Deposita(deposito2);
						}
						if (j == 4) {
							System.out.println("\nVocê escolheu sacar o dinheiro");
							System.out.printf("\nValor em conta R$%.2f\n", contaCorrenteE.getSaldo());
							System.out.print("Valor do saque R$");
							saca2 = scan.nextDouble();
							contaCorrenteE.Saca(saca2);
						}
						if (j == 0)
							break;
					} else
						break;
				}
				break;

			case 3:
				System.out.println("\n-_-_-_-_-_--_-_--_-_--_-_-_-_-_-_-_-_-_-_\n");
				System.out.println("\nVocê escolheu acessar a poupança!!");
				System.out.println("1 - Larissa");
				System.out.println("Tecle 0 para finalizar o procedimento");
				System.out.println("\n-_-_-_-_-_--_-_--_-_--_-_-_-_-_-_-_-_-_-_\n");
				System.out.print("Digite sua opção: ");
				k = scan.nextInt();
				while (k != 1 && k != 0) {
					System.out.println("\nOpção inválida, digite novamente");
					System.out.println("\n-_-_-_-_-_--_-_--_-_--_-_-_-_-_-_-_-_-_-_\n");
					System.out.println("\nVocê escolheu acessar a poupança!!");
					System.out.println("1 - Larissa");
					System.out.println("Tecle 0 para finalizar o procedimento");
					System.out.println("\n-_-_-_-_-_--_-_--_-_--_-_-_-_-_-_-_-_-_-_\n");
					System.out.print("Digite sua opção: ");
					k = scan.nextInt();
				}
				while (true) {
					if (k == 1) {
						System.out.println("\n-_-_-_-_-_--_-_--_-_--_-_-_-_-_-_-_-_-_-_\n");
						System.out.println("Bem vinda, Larissa");
						System.out.println("Tecle 1 - Depositar!");
						System.out.println("Tecle 2 - Sacar!");
						System.out.println("Tecle 3 - Saber o saldo!");
						System.out.println("Tecle 0 para finalizar o procedimento");
						System.out.println("\n-_-_-_-_-_--_-_--_-_--_-_-_-_-_-_-_-_-_-_\n");
						System.out.print("Digite a sua opção: ");
						l = scan.nextInt();
						while (l != 1 && l != 2 && l != 3 && l != 0) {
							System.out.println("opção inválida, dgite novamente");
							System.out.println("Bem vinda, Larissa");
							System.out.println("Tecle 1 - Depositar!");
							System.out.println("Tecle 2 - Sacar!");
							System.out.println("Tecle 3 - Saber o saldo!");
							System.out.println("Tecle 0 para finalizar o procedimento");
							System.out.print("Digite a sua opção: ");
							l = scan.nextInt();
						}
						if (l == 1) {
							System.out.println("Você escolheu depositar na poupança!");
							System.out.print("Valor a ser depositado R$");
							depositoPoup = scan.nextDouble();
							contaPoupancaL.Deposita(depositoPoup);
						} else if (l == 2) {
							System.out.println("Você escolheu sacar da poupança!");
							System.out.print("Valor a ser sacado R$");
							sacaPoupanca = scan.nextDouble();
							contaPoupancaL.Saca(sacaPoupanca);
							
						} else if(l == 3) {
							System.out.println("\nVocê escolheu ver seu saldo");
							System.out.printf("\nSeu saldo é de R$%.2f\n", cliente3.conta.getSaldo());
						}
						else
							break;
					}
				}
				break;

			case 0:
				System.out.println("Muito obrigada pela preferencia!");
				break;
			default:
				System.out.println("Opção invalida!!");
				break;
			}
		} while (op != 0);
	}
}