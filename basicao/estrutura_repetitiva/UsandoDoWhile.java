package basicao.estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class UsandoDoWhile {

	public static void main(String[] args) {

//		ESTRUTURA : FAÇA-ENQUANTO

		/*
		 * do { comando 1 comando 2 } while(condição);
		 * 
		 * Usando essa estrutura o bloco de comandos é executado pelo menos uma vez. Na
		 * segunda vez, é verificado a condição. Caso seja verdadeira, é executado
		 * novamente.
		 * 
		 * while(condição){ comando 1 comando 2 }
		 * 
		 * Usando essa estrutura. Para que o bloco de comandos seja executado pelo menos
		 * uma vez. É necessário verificar se a condição é falsa ou verdadeira primeiro.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String resposta = "";

		do {
			System.out.println(" Digite a temperatura em Celsius : ");
			double celsius = sc.nextDouble();

			double fahrenheit = ((9 * celsius) / 5) + 32;

			System.out.printf(" %n Equivalente em Fahrenheit : %.1f", fahrenheit);
			System.out.println(" \n Deseja repetir (sim/nao) ? ");

			sc.nextLine(); // usei para arrumar o lance de acumulação.
			resposta = sc.nextLine();

//			if (resposta.equalsIgnoreCase("não"))
//				System.out.println(" \n Fim da Aplicação !");

		} while (resposta.equalsIgnoreCase("sim"));
		
		System.out.println(" \n Fim da Aplicação !");

		sc.close();

	}

}
