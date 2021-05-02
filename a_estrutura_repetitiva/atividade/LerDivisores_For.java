package a_estrutura_repetitiva.atividade;

import java.util.Scanner;

public class LerDivisores_For {

	public static void main(String[] args) {

//		Ler um número inteiro N e calcular todos os seus divisores.

		Scanner sc = new Scanner(System.in);

		System.out.println(" Digite um número : ");
		int n = sc.nextInt();
		int qtde = 0 ;
		
		for (int i=1; i<=n; i++) {
			if (n % i == 0) {
				qtde = qtde + 1;
				System.out.println(" Divisores : " + i);
			}
		}
		
		System.out.println(" \n Quantidade de Divisores : " + qtde);

		sc.close();

	}

}
