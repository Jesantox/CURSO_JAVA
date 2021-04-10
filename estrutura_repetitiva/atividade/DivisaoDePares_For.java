package estrutura_repetitiva.atividade;

import java.util.Scanner;

public class DivisaoDePares_For {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler um número N. Depois leia N pares de números e
		 * mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero,
		 * mostrar a mensagem "divisao impossivel".
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println(" Digite um limite de valores :");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println(" \n Digite o 1º Valor : ");
			double numerador = sc.nextDouble();
			System.out.println(" Digite o 2º valor : ");
			double denominador = sc.nextDouble();

			double divisao = 0;

			if (denominador != 0) {

				divisao = numerador / denominador;
				System.out.println(divisao);
			}

			else {
				System.out.println(" Divisão impossivel. ");
			}
		}

		System.out.println(" \n Fim da Aplicação. ");

		sc.close();

	}

}
