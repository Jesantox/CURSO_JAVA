package basicao.estrutura_condicional.atividade;

import java.util.Locale;
import java.util.Scanner;

public class DeterminarQuadrante {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Olá, tudo bem? Como se chama? ");
		String nome = sc.nextLine();
		
		System.out.println("Insira a 1º Coordenada : ");
		double x = sc.nextDouble();
		
		System.out.println("Insira a 2º Coordenada : ");
		double y = sc.nextDouble();
		
		if(x >= 0.1 && y >= 0.1)
		{
			System.out.printf(" %n Olá, %s, tudo bem? "
					         + "%n As coordenadas solicitadas (eixo x = %.1f) (eixo y = %.1f) "
					         + "%n Encontram-se no 1º Quadrante :) ", nome, x, y); }
		
		
		else if(x <= -0.1 && y >= 0.1)
		{
			System.out.printf(" %n Olá, %s, tudo bem? "
					         +" %n As coordenadas solicitadas (eixo x = %.1f) ( eixo y = %.1f) "
					         +" %n Encontram-se no 2º Quadrante :) ", nome, x, y); }
		
		else if(x <= -0.1 && y <= -0.1)
		{
			System.out.printf(" %n Olá, %s, tudo bem? "
					         +" %n As coordenadas solicitadas (eixo x = %.1f) (eixo y = %.1f) "
					         +" %n Encontram-se no 3º Quadrante :) ", nome, x, y); }
		
		if(x >= 0.1 && y <= -0.1)
		{
			System.out.printf(" %n Olá, %s, tudo bem? "
					         +" %n As coordenadas solicitadas (eixo x = %.1f) (eixo y = %.1f) "
					         +" %n Encontram-se no 4º Quadrante :) ", nome, x, y); }
		
		else if (x == 0.0 && y == 0.0)
		{
			System.out.printf(" %n Olá, %s, tudo bem? "
			                + " %n As coordenadas solicitadas (eixo x = %.1f) (eixo y = %.1f) "
			                + " %n Encontram-se na Origem ", nome, x, y); }
		
		sc.close();;
	}

}
