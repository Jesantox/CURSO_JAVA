package estrutura_condicional.atividade;

import java.util.Locale;
import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {


/* Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" 
   ou "Nao sao Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. 
   Aten��o: os n�meros devem poder ser digitados em ordem crescente ou decrescente. */

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ol�, como se chama? ");
		String nome = sc.nextLine();
		
		System.out.println("Digite 0 1� n�mero : ");
		int numero01 = sc.nextInt();
		
		System.out.println("Digite 0 2� n�mero : ");
		int numero02 = sc.nextInt();
		
		if (numero01 % numero02 == 0 || numero02 % numero01 == 0)
			System.out.println("\n Ol�, " + nome + " \n Os n�meros " + numero01 + " e " + numero02 + " s�o Multiplos.");
		
		else 
			System.out.println("\n Ol�, " + nome + " \n Os n�meros " + numero01 + " e " + numero02 + " n�o s�o Multiplos.");
		

		sc.close();
	}

}
