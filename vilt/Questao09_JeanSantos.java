package vilt;

import java.util.Scanner;

public class Questao09_JeanSantos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(" Digite o 1� Valor : ");
		int a = sc.nextInt();

		System.out.println(" Digite o 2� Valor : ");
		int b = sc.nextInt();

		System.out.println(" Digite o 3� Valor : ");
		int c = sc.nextInt();

		System.out.println(" Digite o 4� Valor : ");
		int d = sc.nextInt();

		if (b > c && d > a && c + d > a + b && c > 0 && d > 0 && a % 2 == 0) {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores nao aceitos");
		}

		sc.close();

	}

}
