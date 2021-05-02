package basicao.estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class UsandoDoWhile {

	public static void main(String[] args) {

//		ESTRUTURA : FA�A-ENQUANTO

		/*
		 * do { comando 1 comando 2 } while(condi��o);
		 * 
		 * Usando essa estrutura o bloco de comandos � executado pelo menos uma vez. Na
		 * segunda vez, � verificado a condi��o. Caso seja verdadeira, � executado
		 * novamente.
		 * 
		 * while(condi��o){ comando 1 comando 2 }
		 * 
		 * Usando essa estrutura. Para que o bloco de comandos seja executado pelo menos
		 * uma vez. � necess�rio verificar se a condi��o � falsa ou verdadeira primeiro.
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

			sc.nextLine(); // usei para arrumar o lance de acumula��o.
			resposta = sc.nextLine();

//			if (resposta.equalsIgnoreCase("n�o"))
//				System.out.println(" \n Fim da Aplica��o !");

		} while (resposta.equalsIgnoreCase("sim"));
		
		System.out.println(" \n Fim da Aplica��o !");

		sc.close();

	}

}
