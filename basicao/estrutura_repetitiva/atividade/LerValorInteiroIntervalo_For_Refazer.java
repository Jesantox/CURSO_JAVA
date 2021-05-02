package basicao.estrutura_repetitiva.atividade;

import java.util.Scanner;

public class LerValorInteiroIntervalo_For_Refazer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
		 * que serão lidos em seguida. Mostre quantos destes valores X estão dentro do
		 * intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
		 * informações conforme exemplo (use a palavra "in" para dentro do intervalo, e
		 * "out" para fora do intervalo).
		 */

		System.out.println(" Insira um limite de valores : ");
		int qtdeValor = sc.nextInt();

		int v1 = 0;
		int dentro = 0;
		int fora = 0;

		int acumulador01 = 0;
		int acumulador02 = 0;

		for (int i = 1; i <= qtdeValor; i++) {
			System.out.println(" Digite um Valor : ");
			v1 = sc.nextInt();

			if (v1 >= 10 && v1 <= 20) {
				dentro = dentro + 1;

			}

			else {
				fora = fora + 1;
			}
		}

		System.out.println("\n" + dentro + " Valores estão dentro do Intervalo." + "\n São eles " + acumulador01);
		System.out.println("\n" + fora + " Valores estão fora do Intervalo." + "\n São eles " + acumulador02);

		sc.close();

	}

}
