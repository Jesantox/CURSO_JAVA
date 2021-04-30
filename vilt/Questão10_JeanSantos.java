package vilt;

import java.util.Scanner;

public class Questão10_JeanSantos {

	static long fibo(int n) {

		if (n < 2) {
			return n;
		} else {
			return fibo(n - 1) + fibo(n - 2);
		}
	}

	public static void fProcesso(int tamanhoArray) {
		int[] aArray;
		Scanner sc = new Scanner(System.in);
		aArray = new int[tamanhoArray];
		int nNum;

		for (int i = 0; i < tamanhoArray; i++) {

			System.out.print(" Insira o valor : ");
			int valor = sc.nextInt();
			aArray[i] = valor;

		}

		nNum = 0;
		for (int a : aArray) {
			System.out.print("Fib(" + aArray[nNum] + ") = " + Questão10_JeanSantos.fibo(aArray[nNum]) + "\n");
			nNum += 1;
		}

	}

	public static void main(String[] args) {

		int nRunTime = 0;
		String cQuestion;
		int iLimiteArray;
		Scanner sc = new Scanner(System.in);

		System.out.print(" Digite um limite de Valores: ");
		iLimiteArray = sc.nextInt();
		fProcesso(iLimiteArray);
		sc.close();

	}
}
