package estrutura_condicional.atividade;

import java.util.Locale;
import java.util.Scanner;

public class PositivoENegativo {

	public static void main(String[] args) {
	
//  Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		
		Locale.setDefault(Locale.US);
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Como se chama? ");
		String nome = sc.nextLine();
		
		System.out.println("Digite um número : ");
		int numero = sc.nextInt();
	
		if(numero < 0)
			System.out.printf("%n Olá, %s. %n O numero %d é Negativo.", nome, numero);
			
		else if(numero >= 0)
			System.out.printf("%n Olá, %s. %n O numero %d é Positivo.", nome, numero);
		
		sc.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
