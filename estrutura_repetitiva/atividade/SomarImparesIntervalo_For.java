package estrutura_repetitiva.atividade;

import java.util.Scanner;

public class SomarImparesIntervalo_For {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(" Digite o 1� Valor : ");
		int x = sc.nextInt();

		System.out.println(" Digite o 2� Valor : ");
		int y = sc.nextInt();

		int maior = (x > y) ? x : y;
		int menor = (x < y) ? x : y;

		int soma = 0;

		for (int i = menor + 1; i < maior; i++) {

			if (i % 2 != 0) {

				soma = soma + i;

			}

		}
		System.out.println(" \n N�meros Impares dentro do intervalo solicitado : " + soma);

		sc.close();
	}
}
