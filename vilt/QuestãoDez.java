package vilt;

import java.util.Scanner;

public class QuestãoDez {

//	CRIANDO A FUNÇÃO FIBONACCI 
	static long fibo(int n) {
		if (n < 2) {
			return n;
		} else {
			return fibo(n - 1) + fibo(n - 2);
		}
	}

//	INICIANDO O MÉTODO EXECUTÁVEL MAIN
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print(" Defina um Limite de Valores: ");
		int T = sc.nextInt();

		int[] aArray;
		aArray = new int[T];
		int nNum;

		for (int i = 0; i < T; i++) {
			System.out.print("\n Insira o valor : ");
			int valor = sc.nextInt();
			aArray[i] = valor;
		}

		nNum = 0;
		for (int a : aArray) {
			System.out.print("\n Fib(" + aArray[nNum] + ") = " + Questão10_JeanSantos.fibo(aArray[nNum]) + "\n");
			nNum += 1;
		}

		sc.close();
	}

}
