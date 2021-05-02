package basicao.estrutura_repetitiva.atividade;

import java.util.Scanner;

public class MostrarImpares_For {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
		 * até X, um valor por linha, inclusive o X, se for o caso.
		 */

		System.out.println(" Olá, tudo bem? Como posso te chamar? ");
		String nome = sc.nextLine();

		int numero = 0;
		String resposta = "";

//		INICIO DA APLICAÇÃO 
		do {
			System.out.println(" Olá. Digite um número Inteiro : ");
			numero = sc.nextInt();

//			1º CONDIÇÃO
			if (numero > 0 && numero <= 1000) {
				while (numero > 0 && numero <= 1000) {

//					1º for
//					IMPRIMINDO NÚMEROS IMPARES 
					System.out.println(" \n Números Impares. \n Dentre o valor solicitado : ");
					for (int i = 1; i <= numero; i++) {
						if (i % 2 != 0) {
							System.out.println(i);
						}
					}

//					2º for
//					IMPRIMINDO NÚMEROS PARES 
					System.out.println(" \n Números Pares. \n Dentre o valor solicitado : ");
					for (int i = 1; i <= numero; i++) {
						if (i % 2 == 0) {
							System.out.println(i);
						}
					}

					break; // serve para parar o while. Fazendo com que ele pule para a LINHA 104
				}
			}

//			2º CONDIÇÃO
			else if (numero < 0 || numero > 1000) {
				System.out.println(" \n Somente valores dentre 1 e 1000 são permitidos, " + nome + "!");

				while (numero > 0 && numero <= 1000) {
					System.out.println(" \n Números Impares. \n Dentre o valor solicitado : ");

					/*
					 * EXPLICAÇÃO DO FOR
					 * 
					 * enquanto o i for menor que o valor solicitado. irá verificar -> Caso divida o
					 * i por 2, e sobre um valor diferente do zero. irá imprimir este valor caso
					 * contrário, irá ignorálo, pois com a sintaxe "i++(incrementador)" irá aumentar
					 * o valor do i. fazendo com que a condição verifique o seguinte valor. esse
					 * processo irá acontecer até o valor da variável "i" alcançar o valor da
					 * variável "numero".
					 * 
					 * Após o 1º for ter sido verificado completamente, e encerrado. irá acontecer o
					 * mesmo processo no 2º "for".
					 */

//					1º for
//					IMPRIMINDO NÚMEROS IMPARES 
					for (int i = 1; i <= numero; i++) {
						if (i % 2 != 0) {
							System.out.println(i);
						}
					}
//					2º for
//					IMPRIMINDO NÚMEROS PARES 
					System.out.println(" \n Números Pares. \n Dentre o valor solicitado : ");
					for (int i = 1; i <= numero; i++) {
						if (i % 2 == 0) {
							System.out.println(i);
						}
					}

					break; // serve para parar o while. Fazendo com que ele pule para a LINHA 104
				}
			}

//			DECISÃO DE RETORNO DA APLICAÇÃO
			/*
			 * EXPLICAÇÃO
			 * 
			 * se a resposta do usuário for
			 * "Sim (lembrando que estamos ignorando caixa alta)" o programa irá voltar para
			 * a LINHA 24. Repetindo todo o processo.
			 * 
			 * se a resposta do usuário for DIFERENTE da palavra "sim" o programa irá sai da
			 * estrutura "do while" e ir direto para a LINHA 110
			 */

			System.out.println(" \n Deseja Digitar Novamente, " + nome + " ? \n (sim/nao)?");
			sc.nextLine();
			resposta = sc.nextLine();

		} while (resposta.equalsIgnoreCase("sim"));

		System.out.println(" \n Obrigado por usar nossa Aplicação, " + nome + ".");

		sc.close();

		/*
		 * ESTRUTURAS USADAS E SUAS RESPECTIVAS FUNÇÕES
		 * 
		 * do while > usei para repetir todo o programa. > incluí a possibilidade de
		 * repetir todo o programa. Deixando o usuário decidir.
		 * 
		 * if/else if > usei para determinar que rumo a aplicação tomaria. >> Caso fosse
		 * positivo, a aplicação rodaria sem problemas, mostrando o que se pede. >> Caso
		 * fosse negativo, a aplicação avisaria que o valor solicitado não é permitido.
		 * >>> Fazendo com que o usuário forneça de novo um valor permitido. # LEMBRANDO
		 * QUE A QUALQUER MOMENTO O PROGRAMA PERGUNTA PRO USUÁRIO SE DESEJA RESPONDER OU
		 * ENCERRAR A APLICAÇÃO. >
		 */

	}

}
