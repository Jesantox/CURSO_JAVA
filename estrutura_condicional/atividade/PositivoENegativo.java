package estrutura_condicional.atividade;

import java.util.Locale;
import java.util.Scanner;

public class PositivoENegativo {

	public static void main(String[] args) {
	
//  Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.
		
		Locale.setDefault(Locale.US);
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Como se chama? ");
		String nome = sc.nextLine();
		
		System.out.println("Digite um n�mero : ");
		int numero = sc.nextInt();
	
		if(numero < 0)
			System.out.printf("%n Ol�, %s. %n O numero %d � Negativo.", nome, numero);
			
		else if(numero >= 0)
			System.out.printf("%n Ol�, %s. %n O numero %d � Positivo.", nome, numero);
		
		sc.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
