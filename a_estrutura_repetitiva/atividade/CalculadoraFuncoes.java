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
 *         Onde se é possível fazer as Quatro Operações básicas: Adição;
 *         Subtração; Divisão e Multiplicação.
 * 
 *         Todas as operações estão funcionando corretamente (30/04/2021) Tentei
 *         aplicar ao máximo o que aprendi até este momento.
 * 
 *         Como por exemplo: Estrutura Condicional, Estrutura Repetitiva,
 *         Funções Úteis e Formatações de Números.
 */
public class CalculadoraFuncoes {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // Trocando de 'vírgula' para 'ponto'

		Scanner sc = new Scanner(System.in); // iniciando a entrada de dados

		DecimalFormat df = new DecimalFormat();
		df.applyPattern("00"); // Formata Números

		System.out.print(" Olá, tudo bem? \n Como posso te chamar? ");
		String usuario = sc.nextLine();

		String retorno = ""; // Criei pra saber quando se deve reiniciar o sistema

		do { // Estrutura Repetitiva, Muito usado para retornos na Aplicação.
			System.out.printf("\n Bem vindo, %s", usuario + "!\n\n");

			System.out.printf(" Usará Números Inteiros ou com Casas Decimais \n (int/dec)? ");
			String tipoDados = sc.nextLine();

			System.out.print("\n Insira o 1º Valor : ");
			double numero01 = sc.nextDouble();

			System.out.print(" Insira o 2º Valor : ");
			double numero02 = sc.nextDouble();

			// Tabelinha com os Termos
			System.out.print(" \n" + " Adição         [ sum ] \n" + " Subtração      [ sub ] \n"
					+ " Multiplicação  [ mul ] \n" + " Divisão        [ div ] \n\n");

			System.out.print(" O que Deseja fazer com eles? \n"
					+ " Veja qual atende melhor sua necessidade \n e insira os termos chaves : ");
			sc.nextLine();
			String operacao = sc.nextLine();

			System.out.print(" \n Tudo ok! \n Dados recebidos com sucesso \"-\" \n\n");

			double conta = 0; // Criei e Inicializei para poder usar em todo os blocos dentro do Arquivo

			// OPERAÇÃO SOMA
			if (operacao.equalsIgnoreCase("sum")) {
				// CASO SEJA DO TIPO INTEIRO
				if (tipoDados.equalsIgnoreCase("int")) {
					conta = FuncoesMatematicas.adicao(numero01, numero02);
					System.out.printf(" A soma de [" + df.format(numero01) + "] + [" + df.format(numero02) + "] é : "
							+ df.format(conta));
				} else { // CASO NÃO SEJA
					conta = FuncoesMatematicas.adicao(numero01, numero02);
					System.out.printf(" A soma de [%.2f] + [%.2f] é : %.2f", numero01, numero02, conta);
				}
			}

			// OPERAÇÃO MENOS
			else if (operacao.equalsIgnoreCase("sub")) {
				// CASO SEJA DO TIPO INTEIRO
				if (tipoDados.equalsIgnoreCase("int")) {
					if (numero01 > numero02) {
						conta = FuncoesMatematicas.subtracao(numero01, numero02);
						System.out.printf(" A Subtração de [" + df.format(numero01) + "] - [" + df.format(numero02)
								+ "] é : " + df.format(conta));
					} else { // SERVE PRA IMPRIMIR NÚMEROS NEGATIVOS
						conta = FuncoesMatematicas.subtracao(numero01, numero02);
						System.out.printf(" A Subtração de [" + df.format(numero01) + "] - [" + df.format(numero02)
								+ "] é : " + df.format(conta));

					}
				} else { // CASO NÃO SEJA
					if (numero01 < numero02) {
						conta = FuncoesMatematicas.subtracao(numero01, numero02);
						System.out.printf(" A Subtração de [%.2f] - [%.2f] é : %.2f", numero01, numero02, conta);
					} else { // SERVE PRA IMPRIMIR NÚMEROS NEGATIVOS
						conta = FuncoesMatematicas.subtracao(numero01, numero02);
						System.out.printf(" A Subtração de [%.2f] - [%.2f] é : %.2f", numero01, numero02, conta);
					}
				}
			}

			// OPERAÇÃO VEZES
			else if (operacao.equalsIgnoreCase("mul")) {
				// CASO SEJA DO TIPO INTEIRO
				if (tipoDados.equalsIgnoreCase("int")) {
					conta = FuncoesMatematicas.multiplicacao(numero01, numero02);
					System.out.printf(" A Multiplicação de [" + df.format(numero01) + "] * [" + df.format(numero02)
							+ "] é : " + df.format(conta));
				} else { // CASO NÃO SEJA
					conta = FuncoesMatematicas.multiplicacao(numero01, numero02);
					System.out.printf(" A Multiplicação de [%.2f] * [%.2f] é : %.2f", numero01, numero02, conta);
				}
			}

			// OPERAÇÃO DIVIDIR
			else if (operacao.equalsIgnoreCase("div")) {
				// CASO SEJA DO TIPO INTEIRO
				if (tipoDados.equalsIgnoreCase("int")) {
					if (numero01 > numero02) {
						conta = FuncoesMatematicas.divisao(numero01, numero02);
						System.out.printf(" A Divisão de [" + df.format(numero01) + "] / [" + df.format(numero02)
								+ "] é : " + df.format(conta));
					} else { // SERVE PRA IMPRIMIR NÚMERO NEGATIVOS
						conta = FuncoesMatematicas.divisao(numero01, numero02);
						System.out.printf(
								" A Divisão de [" + df.format(numero01) + "] / [" + df.format(numero02) + "] é : %.2f",
								conta);
					}
				} else { // CASO NÃO SEJA INTEIRO
					if (numero01 > numero02) {
						conta = FuncoesMatematicas.divisao(numero01, numero02);
						System.out.printf(" A Divisão de [%.2f] / [%.2f] é : %.2f", numero01, numero02, conta);

					} else { // SERVE PRA IMPRIMIR NÚMERO NEGATIVOS
						conta = FuncoesMatematicas.divisao(numero01, numero02);
						System.out.printf(" A Divisão de [%.2f] / [%.2f] é : %.2f", numero01, numero02, conta);
					}

				}
			}

			// RETORNO DA APLICAÇÃO
			System.out.print(" \n\n Olá, " + usuario + ". Deseja reiniciar a aplicação(S/N)?");
			retorno = sc.nextLine();

		} while (retorno.equalsIgnoreCase("s")); // Se digitar 's/S'. A aplicação reinicializará.

		System.out.println(" \n Fim da Aplicação. Até mais, " + usuario + "."); // FIM DA APLICAÇÃO

		sc.close(); // Encerramento de entradas
	}
}
