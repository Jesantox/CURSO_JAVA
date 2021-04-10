package estrutura_repetitiva.atividade;

import java.util.Scanner;

public class LerSenha_While {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/* ENUNCIADO
		 * 
		 * Escreva um programa que REPITA a leitura de uma senha at� que ela seja
		 * v�lida. Para cada leitura de senha incorreta informada, escrever a mensagem
		 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
		 * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
		 * correta � o valor 2002.
		 */

		System.out.println(" Ol�, tudo bem? Como se chama? ");
		String nome = sc.nextLine();

		System.out.println(" Ol�, " + nome + ". Insira a senha : ");
		int senha = sc.nextInt();

		while (senha != 2002) {
			System.out.println(" Senha inv�lida. Tente novamente : ");
			senha = sc.nextInt();
		}

		System.out.println(" Ol�, " + nome + ". Acesso Permitido :)");
		System.out.println(" Programa Encerrado.");

		sc.close();

	}

}
