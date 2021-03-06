package a_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class OperadorAcumulativo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int minutos = sc.nextInt();
		double conta = 50.00;

		if (minutos > 100) {
			conta += (minutos - 100) * 2.00;
		}

		System.out.printf("Valor da conta : R$ %.2f ", conta);

		sc.close();

	}

}
