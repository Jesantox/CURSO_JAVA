package basicao.estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class TresCondicoes {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Como se chama?");
		String nome = sc.nextLine();

		System.out.println("Que horas são?");
		int hora = sc.nextInt();

		if (hora <= 12) {
			System.out.println("Bom Dia, " + nome);
		}

		else if (hora < 18) { // OU else if (hora > 12 && hora < 18) Caso fosse do tipo boolean
			System.out.println("Boa Tarde, " + nome);
		}

		else {
			System.out.println("Boa Noite, " + nome);
		}

		sc.close();

	}

}
