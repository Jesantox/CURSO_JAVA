package basicao.estrutura_repetitiva.atividade;

import java.util.Scanner;

public class MostrarImpares_For {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os �mpares de 1
		 * at� X, um valor por linha, inclusive o X, se for o caso.
		 */

		System.out.println(" Ol�, tudo bem? Como posso te chamar? ");
		String nome = sc.nextLine();

		int numero = 0;
		String resposta = "";

//		INICIO DA APLICA��O 
		do {
			System.out.println(" Ol�. Digite um n�mero Inteiro : ");
			numero = sc.nextInt();

//			1� CONDI��O
			if (numero > 0 && numero <= 1000) {
				while (numero > 0 && numero <= 1000) {

//					1� for
//					IMPRIMINDO N�MEROS IMPARES 
					System.out.println(" \n N�meros Impares. \n Dentre o valor solicitado : ");
					for (int i = 1; i <= numero; i++) {
						if (i % 2 != 0) {
							System.out.println(i);
						}
					}

//					2� for
//					IMPRIMINDO N�MEROS PARES 
					System.out.println(" \n N�meros Pares. \n Dentre o valor solicitado : ");
					for (int i = 1; i <= numero; i++) {
						if (i % 2 == 0) {
							System.out.println(i);
						}
					}

					break; // serve para parar o while. Fazendo com que ele pule para a LINHA 104
				}
			}

//			2� CONDI��O
			else if (numero < 0 || numero > 1000) {
				System.out.println(" \n Somente valores dentre 1 e 1000 s�o permitidos, " + nome + "!");

				while (numero > 0 && numero <= 1000) {
					System.out.println(" \n N�meros Impares. \n Dentre o valor solicitado : ");

					/*
					 * EXPLICA��O DO FOR
					 * 
					 * enquanto o i for menor que o valor solicitado. ir� verificar -> Caso divida o
					 * i por 2, e sobre um valor diferente do zero. ir� imprimir este valor caso
					 * contr�rio, ir� ignor�lo, pois com a sintaxe "i++(incrementador)" ir� aumentar
					 * o valor do i. fazendo com que a condi��o verifique o seguinte valor. esse
					 * processo ir� acontecer at� o valor da vari�vel "i" alcan�ar o valor da
					 * vari�vel "numero".
					 * 
					 * Ap�s o 1� for ter sido verificado completamente, e encerrado. ir� acontecer o
					 * mesmo processo no 2� "for".
					 */

//					1� for
//					IMPRIMINDO N�MEROS IMPARES 
					for (int i = 1; i <= numero; i++) {
						if (i % 2 != 0) {
							System.out.println(i);
						}
					}
//					2� for
//					IMPRIMINDO N�MEROS PARES 
					System.out.println(" \n N�meros Pares. \n Dentre o valor solicitado : ");
					for (int i = 1; i <= numero; i++) {
						if (i % 2 == 0) {
							System.out.println(i);
						}
					}

					break; // serve para parar o while. Fazendo com que ele pule para a LINHA 104
				}
			}

//			DECIS�O DE RETORNO DA APLICA��O
			/*
			 * EXPLICA��O
			 * 
			 * se a resposta do usu�rio for
			 * "Sim (lembrando que estamos ignorando caixa alta)" o programa ir� voltar para
			 * a LINHA 24. Repetindo todo o processo.
			 * 
			 * se a resposta do usu�rio for DIFERENTE da palavra "sim" o programa ir� sai da
			 * estrutura "do while" e ir direto para a LINHA 110
			 */

			System.out.println(" \n Deseja Digitar Novamente, " + nome + " ? \n (sim/nao)?");
			sc.nextLine();
			resposta = sc.nextLine();

		} while (resposta.equalsIgnoreCase("sim"));

		System.out.println(" \n Obrigado por usar nossa Aplica��o, " + nome + ".");

		sc.close();

		/*
		 * ESTRUTURAS USADAS E SUAS RESPECTIVAS FUN��ES
		 * 
		 * do while > usei para repetir todo o programa. > inclu� a possibilidade de
		 * repetir todo o programa. Deixando o usu�rio decidir.
		 * 
		 * if/else if > usei para determinar que rumo a aplica��o tomaria. >> Caso fosse
		 * positivo, a aplica��o rodaria sem problemas, mostrando o que se pede. >> Caso
		 * fosse negativo, a aplica��o avisaria que o valor solicitado n�o � permitido.
		 * >>> Fazendo com que o usu�rio forne�a de novo um valor permitido. # LEMBRANDO
		 * QUE A QUALQUER MOMENTO O PROGRAMA PERGUNTA PRO USU�RIO SE DESEJA RESPONDER OU
		 * ENCERRAR A APLICA��O. >
		 */

	}

}
