package estrutura_condicional.atividade;

import java.util.Scanner;

public class PositivoNegativoCondicaoTernaria {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(" Insira um número : ");
		int numero = sc.nextInt();

		String decisao = (numero > 0) ? "Positivo" : (numero == 0) ? "Nulo" : (numero < 0) ? "Negativo" : "Positivo";

		System.out.println(decisao);

		sc.close();

	}

}
