package a_estrutura_repetitiva;

import java.util.Scanner;

public class ContagemFor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		CONTAGEM PROGRESSIVA 

		System.out.println(" Ol�, tudo bem? \n Voc� quer contar at� quanto? ");
		int a = sc.nextInt();

		for (int i = 0; i <= a; i++) {
			System.out.println(i);
		}

		System.out.println(" \n Acabou :/ \n");

//		CONTAGEM REGRESSIVA 

		System.out.println(" Ol�, tudo bem? \n Determine a contagem : ");
		int b = sc.nextInt();

		for (int i = b; i >= 0; i--) {
			System.out.println(" Come�ando o Jogo em... " + i);
		}

		System.out.println(" \n Partida Iniciada !");
		sc.close();

	}

}
