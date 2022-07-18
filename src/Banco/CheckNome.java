package Banco;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckNome {
	private boolean continueLoop = true;
	Scanner scan = new Scanner(System.in);
	public String checarNome(String nome) {
		do {
			
			try {
				if (Pattern.matches("[a-zA-Z]+", nome) == false || nome.length() < 3) {
					throw new Exception("\nNome inválido");
				} else
					continueLoop = false;
			} 
			catch (Exception e) {
				System.err.printf("Exceção: %s\n", e);
				nome = scan.next();
			}
			return nome;
		}
		
		while (continueLoop);
	}
}