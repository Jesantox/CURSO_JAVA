package estrutura_repetitiva.atividade;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EstatisticaDeProdutos_While {

	public static void main(String[] args) {

		/*
		 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a
		 * preferência de seus clientes. Escreva um algoritmo para ler o tipo de
		 * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
		 * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
		 * 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa
		 * será encerrado quando o código informado for o número 4. Deve ser escrito a
		 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
		 * tipo de combustível, conforme exemplo.
		 */

		Scanner sc = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat();
        df.applyPattern("00.##");
		
		System.out.println( " Olá, tudo bem? " + 
		                    " \n A equipe Ipiranga está levantando uma Estatística à respeito dos seus Combustíveis." + 
				            " \n Você teria um minuto para nos dar um feedback? \n ");
		String resposta = sc.nextLine();

		if (resposta.equalsIgnoreCase("sim")) {

			System.out.println(" \n Siga abaixo as informações : \n "                  + 
			                   " \n Qual destes Combustíveis você mais consome? \n "   +
					           " \n Álcool                 Aperte [ 1 ] "                      +
					           " \n Gasolina               Aperte [ 2 ] "                      +
					           " \n Óleo Diesel            Aperte [ 3 ] "                      +
					           " \n\n Encerrar Aplicação     Aperte [ 4 ] ");
			int alcool = 0;
			int gasolina = 0;
			int diesel = 0;

			System.out.println(" \n Digite um opção : \n ");
			int opcao = sc.nextInt();

			while (opcao != 4) {
				if (opcao == 1) {
					alcool = alcool + 1;
				}

				else if (opcao == 2) {
					gasolina = gasolina + 1;
				}

				else if (opcao == 3) {
					diesel = diesel + 1;
				}
				
				System.out.println(" \n Insira novamente : ");
			    opcao = sc.nextInt();
			}
			
				System.out.println(" \n Muito Obrigado pelo Feedback!");
				System.out.println(" \n Álcool ---------- " + df.format(alcool)   + " votos "+
						           " \n Gasolina -------- " + df.format(gasolina) + " votos "+
						           " \n Óleo Diesel ----- " + df.format(diesel)   + " votos ");
		}

		else {
			System.out.println("\n Tudo bem. Até mais!");
			System.exit(0);
		}

		sc.close();
	}

}
