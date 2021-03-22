package estrutura_condicional.atividade;

import java.util.Locale;
import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		
//  Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Olá, como se chama? ");
	String nome = sc.nextLine();
	
	System.out.println("Digite um número : ");
	int numero = sc.nextInt();
	
	if (numero % 2 == 0)
		System.out.printf("%n Olá, %s. %n O número %d é Par.", nome, numero);
	
	else if (numero % 2 == 1)
		System.out.printf("%n Olá, %s. %n O número %d é Impar.", nome, numero);
		
	sc.close();
		
	}

}
