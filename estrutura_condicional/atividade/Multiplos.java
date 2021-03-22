package estrutura_condicional.atividade;

import java.util.Locale;
import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {


/* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" 
   ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. 
   Atenção: os números devem poder ser digitados em ordem crescente ou decrescente. */

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Olá, como se chama? ");
		String nome = sc.nextLine();
		
		System.out.println("Digite 0 1º número : ");
		int numero01 = sc.nextInt();
		
		System.out.println("Digite 0 2º número : ");
		int numero02 = sc.nextInt();
		
		if (numero01 % numero02 == 0 || numero02 % numero01 == 0)
			System.out.println("\n Olá, " + nome + " \n Os números " + numero01 + " e " + numero02 + " são Multiplos.");
		
		else 
			System.out.println("\n Olá, " + nome + " \n Os números " + numero01 + " e " + numero02 + " não são Multiplos.");
		

		sc.close();
	}

}
