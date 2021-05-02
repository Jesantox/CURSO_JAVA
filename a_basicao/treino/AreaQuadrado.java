package a_basicao.treino;

import java.util.Locale;
import java.util.Scanner;

public class AreaQuadrado {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // mudando virgulas para ponto

		Scanner sc = new Scanner(System.in); // entrada de dados

		System.out.println("Ol�, tudo bem? Como se chama? ");
		String nome = sc.nextLine();

		System.out.println("Informe o 1� lado :");
		double lado01 = sc.nextDouble();

		System.out.println("Informe o 2� lado :");
		double lado02 = sc.nextDouble();

		double area = (lado01 * lado02);
		double dobroArea = 2 * area;

		System.out.printf("%n Ol�, %s %n A �rea do quadrado � : %.0f cm� %n o dobro da �rea � : %.0f cm�", nome, area, dobroArea);

		sc.close();

		/*
		 * Eu podia tbm calcular diretamente na sa�da de dados. Sem a necessidade de calcular nas vari�veis.
		 * Exemplo -> System.out.println("A �rea � igual a : " + (lado01 * lado02));
		 */
	}

}
