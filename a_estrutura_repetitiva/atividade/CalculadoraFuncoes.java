package a_estrutura_repetitiva.atividade;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

import a_fechamentoBasico.FuncoesMatematicas;

/**
 * 
 * @author Jesantox
 * 
 *         Criei uma Calculadora Digital.
 * 
 *         Onde se � poss�vel fazer as Quatro Opera��es b�sicas: Adi��o;
 *         Subtra��o; Divis�o e Multiplica��o.
 * 
 *         Todas as opera��es est�o funcionando corretamente (30/04/2021) Tentei
 *         aplicar ao m�ximo o que aprendi at� este momento.
 * 
 *         Como por exemplo: Estrutura Condicional, Estrutura Repetitiva,
 *         Fun��es �teis e Formata��es de N�meros.
 */
public class CalculadoraFuncoes {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // Trocando de 'v�rgula' para 'ponto'

		Scanner sc = new Scanner(System.in); // iniciando a entrada de dados

		DecimalFormat df = new DecimalFormat();
		df.applyPattern("00"); // Formata N�meros

		System.out.print(" Ol�, tudo bem? \n Como posso te chamar? ");
		String usuario = sc.nextLine();

		String retorno = ""; // Criei pra saber quando se deve reiniciar o sistema

		do { // Estrutura Repetitiva, Muito usado para retornos na Aplica��o.
			System.out.printf("\n Bem vindo, %s", usuario + "!\n\n");

			System.out.printf(" Usar� N�meros Inteiros ou com Casas Decimais \n (int/dec)? ");
			String tipoDados = sc.nextLine();

			System.out.print("\n Insira o 1� Valor : ");
			double numero01 = sc.nextDouble();

			System.out.print(" Insira o 2� Valor : ");
			double numero02 = sc.nextDouble();

			// Tabelinha com os Termos
			System.out.print(" \n" + " Adi��o         [ sum ] \n" + " Subtra��o      [ sub ] \n"
					+ " Multiplica��o  [ mul ] \n" + " Divis�o        [ div ] \n\n");

			System.out.print(" O que Deseja fazer com eles? \n"
					+ " Veja qual atende melhor sua necessidade \n e insira os termos chaves : ");
			sc.nextLine();
			String operacao = sc.nextLine();

			System.out.print(" \n Tudo ok! \n Dados recebidos com sucesso \"-\" \n\n");

			double conta = 0; // Criei e Inicializei para poder usar em todo os blocos dentro do Arquivo

			// OPERA��O SOMA
			if (operacao.equalsIgnoreCase("sum")) {
				// CASO SEJA DO TIPO INTEIRO
				if (tipoDados.equalsIgnoreCase("int")) {
					conta = FuncoesMatematicas.adicao(numero01, numero02);
					System.out.printf(" A soma de [" + df.format(numero01) + "] + [" + df.format(numero02) + "] � : "
							+ df.format(conta));
				} else { // CASO N�O SEJA
					conta = FuncoesMatematicas.adicao(numero01, numero02);
					System.out.printf(" A soma de [%.2f] + [%.2f] � : %.2f", numero01, numero02, conta);
				}
			}

			// OPERA��O MENOS
			else if (operacao.equalsIgnoreCase("sub")) {
				// CASO SEJA DO TIPO INTEIRO
				if (tipoDados.equalsIgnoreCase("int")) {
					if (numero01 > numero02) {
						conta = FuncoesMatematicas.subtracao(numero01, numero02);
						System.out.printf(" A Subtra��o de [" + df.format(numero01) + "] - [" + df.format(numero02)
								+ "] � : " + df.format(conta));
					} else { // SERVE PRA IMPRIMIR N�MEROS NEGATIVOS
						conta = FuncoesMatematicas.subtracao(numero01, numero02);
						System.out.printf(" A Subtra��o de [" + df.format(numero01) + "] - [" + df.format(numero02)
								+ "] � : " + df.format(conta));

					}
				} else { // CASO N�O SEJA
					if (numero01 < numero02) {
						conta = FuncoesMatematicas.subtracao(numero01, numero02);
						System.out.printf(" A Subtra��o de [%.2f] - [%.2f] � : %.2f", numero01, numero02, conta);
					} else { // SERVE PRA IMPRIMIR N�MEROS NEGATIVOS
						conta = FuncoesMatematicas.subtracao(numero01, numero02);
						System.out.printf(" A Subtra��o de [%.2f] - [%.2f] � : %.2f", numero01, numero02, conta);
					}
				}
			}

			// OPERA��O VEZES
			else if (operacao.equalsIgnoreCase("mul")) {
				// CASO SEJA DO TIPO INTEIRO
				if (tipoDados.equalsIgnoreCase("int")) {
					conta = FuncoesMatematicas.multiplicacao(numero01, numero02);
					System.out.printf(" A Multiplica��o de [" + df.format(numero01) + "] * [" + df.format(numero02)
							+ "] � : " + df.format(conta));
				} else { // CASO N�O SEJA
					conta = FuncoesMatematicas.multiplicacao(numero01, numero02);
					System.out.printf(" A Multiplica��o de [%.2f] * [%.2f] � : %.2f", numero01, numero02, conta);
				}
			}

			// OPERA��O DIVIDIR
			else if (operacao.equalsIgnoreCase("div")) {
				// CASO SEJA DO TIPO INTEIRO
				if (tipoDados.equalsIgnoreCase("int")) {
					if (numero01 > numero02) {
						conta = FuncoesMatematicas.divisao(numero01, numero02);
						System.out.printf(" A Divis�o de [" + df.format(numero01) + "] / [" + df.format(numero02)
								+ "] � : " + df.format(conta));
					} else { // SERVE PRA IMPRIMIR N�MERO NEGATIVOS
						conta = FuncoesMatematicas.divisao(numero01, numero02);
						System.out.printf(
								" A Divis�o de [" + df.format(numero01) + "] / [" + df.format(numero02) + "] � : %.2f",
								conta);
					}
				} else { // CASO N�O SEJA INTEIRO
					if (numero01 > numero02) {
						conta = FuncoesMatematicas.divisao(numero01, numero02);
						System.out.printf(" A Divis�o de [%.2f] / [%.2f] � : %.2f", numero01, numero02, conta);

					} else { // SERVE PRA IMPRIMIR N�MERO NEGATIVOS
						conta = FuncoesMatematicas.divisao(numero01, numero02);
						System.out.printf(" A Divis�o de [%.2f] / [%.2f] � : %.2f", numero01, numero02, conta);
					}

				}
			}

			// RETORNO DA APLICA��O
			System.out.print(" \n\n Ol�, " + usuario + ". Deseja reiniciar a aplica��o(S/N)?");
			retorno = sc.nextLine();

		} while (retorno.equalsIgnoreCase("s")); // Se digitar 's/S'. A aplica��o reinicializar�.

		System.out.println(" \n Fim da Aplica��o. At� mais, " + usuario + "."); // FIM DA APLICA��O

		sc.close(); // Encerramento de entradas
	}
}
