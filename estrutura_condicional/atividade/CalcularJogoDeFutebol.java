package estrutura_condicional.atividade;

import java.util.Scanner;

public class CalcularJogoDeFutebol {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(" Informe o nome do 1º Time : ");
		String time01 = sc.nextLine();

		System.out.println(" Informe a quantidade de pontos :");
		int pontos01 = sc.nextInt();
		sc.nextLine();

		System.out.println(" Informe o nome do 2º Time : ");
		String time02 = sc.nextLine();

		System.out.println(" Informe a quantidade de pontos :");
		int pontos02 = sc.nextInt();
		
		
		int calculo = 0;
		int ultrapassar = 0;
		
		if (pontos01 > pontos02) {
			calculo = (pontos01 - pontos02) / 3;
			ultrapassar = (pontos01 - pontos02) / 3 + 1;
			
			System.out.printf("%n Parabéns! %sganhou o Campeonato!"
				             + "%n Segue abaixo as análises : %n" 
					         + "%n %s : %d Pontos" 
			                 + "%n %s : %d Pontos" 
				             + "%n Para o %s alcançar o %s : %d Pontos" 
				             + "%n Para ultrapassá-lo : %d Pontos", time01, time01, pontos01, time02, pontos02, time02, time01, calculo, ultrapassar);
		}

		else if (pontos01 < pontos02) {
			calculo = (pontos02 - pontos01) / 3;
			ultrapassar = (pontos02 - pontos01) / 3 +1;
			
			System.out.printf("%n Parabéns! %sganhou o Campeonato!"
		                    + "%n Segue abaixo as análises :  %n" 
			                + "%n %s : %d Pontos" 
		                    + "%n %s : %d Pontos" 
		                    + "%n Para o %s alcançar o %s : %d Pontos"
		                    + "%n Para ultrapassá-lo : %d Pontos", time02, time02, pontos02, time01, pontos01, time01, time02, calculo, ultrapassar);
		}
		
		sc.close();

	}

}
