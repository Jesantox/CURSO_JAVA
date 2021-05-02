package basicao.estrutura_repetitiva.atividade;

import java.util.Scanner;

public class CalcularFatorial_For {

	public static void main(String[] args) {

		/*
		 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N =
		 * N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por defini��o, fatorial
		 * de 0 � 1.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println(" Digite um valor : ");
		int n = sc.nextInt();
		double calculo = 1;

		/*
		 * EXPLICA��O DO FOR 
		 * 
		 * o for vai executar por completo o n�mero de vezes contido na vari�vel "n".
		 * o incrementador deve ser "i++".
		 * > porque como se estabelece */
		for (int i = 1; i <= n; i++) {

			calculo = calculo * i;

		}

		System.out.println(calculo);

		sc.close();

	}

}
