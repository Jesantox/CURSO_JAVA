package a_estrutura_condicional.atividade;

import java.util.Locale;
import java.util.Scanner;

public class CalcularDuracaoDeTempo {

	public static void main(String[] args) {

		/*
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do
		 * jogo, sabendo que o mesmo pode come�ar em um dia e terminar em outro, tendo
		 * uma dura��o m�nima de 1 hora e m�xima de 24 horas.
		 */

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println(" Ol�, como se chama? ");
		String nome = sc.nextLine();

		System.out.println(" Digite a Hora Inicial : ");
		int horaInicio = sc.nextInt();

		System.out.println(" Digite a Hora Final : ");
		int horaFinal = sc.nextInt();

		int duracao = 0;

		if (horaInicio < horaFinal) {
			duracao = (horaFinal - horaInicio);
		}

		else {
			duracao = 24 - horaInicio + horaFinal;

		}

		System.out.printf("%n Ol�, %s. Veja a dura��o do seu jogo :) " 
		                + "%n Hora Inicial : %d:00h"
				        + "%n Hora Final : %d:00h " 
		                + "%n Dura��o de jogo : %d:00h ", nome, horaInicio, horaFinal, duracao);

		sc.close();
	}
}
