package estrutura_condicional.atividade;

import java.util.Locale;
import java.util.Scanner;

public class CalcularResistencia {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println(" Olá, tudo bem? Como se chama? ");
		String nome = sc.nextLine();

		System.out.println(" Informe o valor da 1º Resistência : ");
		int resistencia01 = sc.nextInt();

		if (resistencia01 <= 0) {
			System.out.println(" Olá, " + nome + ". Informe uma Resistência válida!");
			System.exit(0);
		}

		System.out.println(" Informe o valor da 2º Resistência : ");
		int resistencia02 = sc.nextInt();

		if (resistencia02 <= 0) {
			System.out.println(" Olá, " + nome + ". Informe uma Resistência válida!");
			System.exit(0);
		}

		System.out.println(" Informe o valor da 3º Resistência : ");
		int resistencia03 = sc.nextInt();

		if (resistencia03 <= 0) {
			System.out.println(" Olá, " + nome + ". Informe uma Resistência válida!");
			System.exit(0);
		}

		System.out.println(" Informe o valor da 4º Resistência : ");
		int resistencia04 = sc.nextInt();

		if (resistencia04 <= 0) {
			System.out.println(" Olá, " + nome + ". Informe uma Resistência válida!");
			System.exit(0);
		}

		int soma = resistencia01 + resistencia02 + resistencia03 + resistencia04;

		int maior = (resistencia01>resistencia02 && resistencia01>resistencia03)?resistencia01: 
			        (resistencia02>resistencia03 && resistencia02>resistencia04)?resistencia02: 
			        (resistencia03>resistencia04)?resistencia03:resistencia04;
		
		int menor = (resistencia01<resistencia02 && resistencia01<resistencia03)?resistencia01:
			        (resistencia02<resistencia03 && resistencia02<resistencia04)?resistencia02:
			        (resistencia03<resistencia04)?resistencia03:resistencia04;

		System.out.println("\n Olá, " + nome + ". Segue abaixo as análises : \n");
		System.out.println(" Resistências Fornecidas : " 
		                 + "(" + resistencia01 + ") " 
				         + "(" + resistencia02 + ") " 
		                 + "(" + resistencia03 + ") " 
				         + "(" + resistencia04 + ") ");

		System.out.println(" Cálculo Total de Resistências : " + soma + " Resistências ");
		System.out.println(" Maior Resistência : " + maior);
		System.out.println(" Menor Resistência : " + menor);

		sc.close();
		;

	}

}
