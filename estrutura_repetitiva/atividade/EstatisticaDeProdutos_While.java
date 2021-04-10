package estrutura_repetitiva.atividade;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EstatisticaDeProdutos_While {

	public static void main(String[] args) {

		/*
		 * Um Posto de combust�veis deseja determinar qual de seus produtos tem a
		 * prefer�ncia de seus clientes. Escreva um algoritmo para ler o tipo de
		 * combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina
		 * 3.Diesel 4.Fim). Caso o usu�rio informe um c�digo inv�lido (fora da faixa de
		 * 1 a 4) deve ser solicitado um novo c�digo (at� que seja v�lido). O programa
		 * ser� encerrado quando o c�digo informado for o n�mero 4. Deve ser escrito a
		 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
		 * tipo de combust�vel, conforme exemplo.
		 */

		Scanner sc = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat();
        df.applyPattern("00.##");
		
		System.out.println( " Ol�, tudo bem? " + 
		                    " \n A equipe Ipiranga est� levantando uma Estat�stica � respeito dos seus Combust�veis." + 
				            " \n Voc� teria um minuto para nos dar um feedback? \n ");
		String resposta = sc.nextLine();

		if (resposta.equalsIgnoreCase("sim")) {

			System.out.println(" \n Siga abaixo as informa��es : \n "                  + 
			                   " \n Qual destes Combust�veis voc� mais consome? \n "   +
					           " \n �lcool                 Aperte [ 1 ] "                      +
					           " \n Gasolina               Aperte [ 2 ] "                      +
					           " \n �leo Diesel            Aperte [ 3 ] "                      +
					           " \n\n Encerrar Aplica��o     Aperte [ 4 ] ");
			int alcool = 0;
			int gasolina = 0;
			int diesel = 0;

			System.out.println(" \n Digite um op��o : \n ");
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
				System.out.println(" \n �lcool ---------- " + df.format(alcool)   + " votos "+
						           " \n Gasolina -------- " + df.format(gasolina) + " votos "+
						           " \n �leo Diesel ----- " + df.format(diesel)   + " votos ");
		}

		else {
			System.out.println("\n Tudo bem. At� mais!");
			System.exit(0);
		}

		sc.close();
	}

}
