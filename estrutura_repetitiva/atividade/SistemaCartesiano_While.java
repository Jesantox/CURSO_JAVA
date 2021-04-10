package estrutura_repetitiva.atividade;

import java.util.Scanner;

public class SistemaCartesiano_While {

	public static void main(String[] args) {

		/*
		 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
		 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
		 * quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
		 * uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
		 * alguma).
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println(" Insira a 1º Coordenada : ");
		int x = sc.nextInt();

		System.out.println(" Insira a 2º Coordenada : ");
		int y = sc.nextInt();

		while (x != 0 && y != 0) {

			if (x > 0 && y > 0) {
				System.out.println(" = 1º Quadrante"); // Eu posso colocar um System.exit(0) para encerrar o programa.
			}

			else if (x < 0 && y > 0) {
				System.out.println(" = 2º Quadrante");
			}

			else if (x < 0 && y < 0) {
				System.out.println(" = 3º Quadrante");
			}

			else {
				System.out.println(" = 4º Quadrante");
			}

			System.out.println(" \n --> Digite zero para encerrar a aplicação ");
			
			System.out.println(" \n Insira a 1º Coordenada : ");
			x = sc.nextInt();

			System.out.println(" Insira a 2º Coordenada : ");
			y = sc.nextInt();

		}

		System.out.println(" Fim");

		sc.close();

	}

}
