package a_basicao.treino;

import java.util.Locale;
import java.util.Scanner;

public class AreaQuadrado {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // mudando virgulas para ponto

		Scanner sc = new Scanner(System.in); // entrada de dados

		System.out.println("Olá, tudo bem? Como se chama? ");
		String nome = sc.nextLine();

		System.out.println("Informe o 1º lado :");
		double lado01 = sc.nextDouble();

		System.out.println("Informe o 2º lado :");
		double lado02 = sc.nextDouble();

		double area = (lado01 * lado02);
		double dobroArea = 2 * area;

		System.out.printf("%n Olá, %s %n A área do quadrado é : %.0f cm² %n o dobro da área é : %.0f cm²", nome, area, dobroArea);

		sc.close();

		/*
		 * Eu podia tbm calcular diretamente na saída de dados. Sem a necessidade de calcular nas variáveis.
		 * Exemplo -> System.out.println("A área é igual a : " + (lado01 * lado02));
		 */
	}

}
