package a_estrutura_repetitiva.atividade;

import java.util.Locale;
import java.util.Scanner;

public class MediaEmpoderada {

	public static void main(String[] args) {

		/*
		 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
		 * seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma
		 * casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3
		 * valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e
		 * o terceiro valor tem peso 5.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println(" Determine um limite de valores : ");
		int valor = sc.nextInt();

		double mediaPonderada = 0;

		for (int i = 0; i < valor; i++) {

			System.out.println(" Insira o 1º Valor : ");
			double a = sc.nextDouble();

			System.out.println(" Insira o 2º Valor : ");
			double b = sc.nextDouble();

			System.out.println(" Insira o 3º Valor : ");
			double c = sc.nextDouble();

			mediaPonderada = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
			
			System.out.printf("%.1f %n", mediaPonderada);
		}

		System.out.println(" Fim da Aplicação !");

		sc.close();

	}

}
