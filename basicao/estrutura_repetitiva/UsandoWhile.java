package basicao.estrutura_repetitiva;

import java.util.Scanner;

public class UsandoWhile {

	public static void main(String[] args) {

		/*
		 * REGRAS > se for verdadeiro = executa e repete > Se for falso = pula fora
		 * 
		 * O qu� est� acontecendo?
		 
		 * Enquanto o valor informado for diferente de zero.
		 * A aplica��o continuar� rodando e somando.
		 * Quando o valor for igual a zero. 
		 * A aplica��o encerra
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println(" Digite um valor : ");
		int x = sc.nextInt();

		int soma = 0;
		while (x != 0) {
			soma = soma + x; // ou += x;
			x = sc.nextInt();
		}

		System.out.println(soma);

		sc.close();
	}

}
