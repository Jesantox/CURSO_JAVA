package estrutura_condicional.atividade;

import java.util.Locale;
import java.util.Scanner;

public class CalcularResistencia {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println(" Ol�, tudo bem? Como se chama? ");
		String nome = sc.nextLine();

		System.out.println(" Informe o valor da 1� Resist�ncia : ");
		int resistencia01 = sc.nextInt();

		if (resistencia01 <= 0) {
			System.out.println(" Ol�, " + nome + ". Informe uma Resist�ncia v�lida!");
			System.exit(0);
		}

		System.out.println(" Informe o valor da 2� Resist�ncia : ");
		int resistencia02 = sc.nextInt();

		if (resistencia02 <= 0) {
			System.out.println(" Ol�, " + nome + ". Informe uma Resist�ncia v�lida!");
			System.exit(0);
		}

		System.out.println(" Informe o valor da 3� Resist�ncia : ");
		int resistencia03 = sc.nextInt();

		if (resistencia03 <= 0) {
			System.out.println(" Ol�, " + nome + ". Informe uma Resist�ncia v�lida!");
			System.exit(0);
		}

		System.out.println(" Informe o valor da 4� Resist�ncia : ");
		int resistencia04 = sc.nextInt();

		if (resistencia04 <= 0) {
			System.out.println(" Ol�, " + nome + ". Informe uma Resist�ncia v�lida!");
			System.exit(0);
		}

		int soma = resistencia01 + resistencia02 + resistencia03 + resistencia04;

		int maior = (resistencia01>resistencia02 && resistencia01>resistencia03)?resistencia01: 
			        (resistencia02>resistencia03 && resistencia02>resistencia04)?resistencia02: 
			        (resistencia03>resistencia04)?resistencia03:resistencia04;
		
		int menor = (resistencia01<resistencia02 && resistencia01<resistencia03)?resistencia01:
			        (resistencia02<resistencia03 && resistencia02<resistencia04)?resistencia02:
			        (resistencia03<resistencia04)?resistencia03:resistencia04;

		System.out.println("\n Ol�, " + nome + ". Segue abaixo as an�lises : \n");
		System.out.println(" Resist�ncias Fornecidas : " 
		                 + "(" + resistencia01 + ") " 
				         + "(" + resistencia02 + ") " 
		                 + "(" + resistencia03 + ") " 
				         + "(" + resistencia04 + ") ");

		System.out.println(" C�lculo Total de Resist�ncias : " + soma + " Resist�ncias ");
		System.out.println(" Maior Resist�ncia : " + maior);
		System.out.println(" Menor Resist�ncia : " + menor);

		sc.close();
		;

	}

}
