package estrutura_condicional.atividade;

import java.util.Locale;
import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		
//  Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Ol�, como se chama? ");
	String nome = sc.nextLine();
	
	System.out.println("Digite um n�mero : ");
	int numero = sc.nextInt();
	
	if (numero % 2 == 0)
		System.out.printf("%n Ol�, %s. %n O n�mero %d � Par.", nome, numero);
	
	else if (numero % 2 == 1)
		System.out.printf("%n Ol�, %s. %n O n�mero %d � Impar.", nome, numero);
		
	sc.close();
		
	}

}
