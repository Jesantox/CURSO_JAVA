package a_estrutura_repetitiva.atividade;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 * @author Jesantox
 *			
 *			
 *			Nessa classe eu mostro como formatar números abaixo de 10
 */
public class Tabuada_For {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat("");
		df.applyPattern("00");

		int n = 0;

		String resposta = "";

		do {
			System.out.println(" \n Digite um valor : ");
			n = sc.nextInt();

			if (2 < n && n < 1000) {
				for (int i = 1; i <= 10; i++) {

					int multiplicador = i * n;
					System.out.printf("%n " + df.format(i) + " x " + n + " = " + df.format(multiplicador));

				}

				System.out.println(" \n\n Gostaria de inserir um novo valor? ");
				sc.nextLine();
				resposta = sc.nextLine();

			}

			else {
				System.out.println(" Somente valores no intervalo ( 3 a 1000 )");
				System.out.println(" Digite novamente : ");
				n = sc.nextInt();

			}

		} while (resposta.equalsIgnoreCase("sim"));

		System.out.println(" \n Fim da aplicação !");

		sc.close();
	}
}
