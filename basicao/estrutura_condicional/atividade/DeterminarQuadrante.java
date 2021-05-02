package basicao.estrutura_condicional.atividade;

import java.util.Locale;
import java.util.Scanner;

public class DeterminarQuadrante {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Ol�, tudo bem? Como se chama? ");
		String nome = sc.nextLine();
		
		System.out.println("Insira a 1� Coordenada : ");
		double x = sc.nextDouble();
		
		System.out.println("Insira a 2� Coordenada : ");
		double y = sc.nextDouble();
		
		if(x >= 0.1 && y >= 0.1)
		{
			System.out.printf(" %n Ol�, %s, tudo bem? "
					         + "%n As coordenadas solicitadas (eixo x = %.1f) (eixo y = %.1f) "
					         + "%n Encontram-se no 1� Quadrante :) ", nome, x, y); }
		
		
		else if(x <= -0.1 && y >= 0.1)
		{
			System.out.printf(" %n Ol�, %s, tudo bem? "
					         +" %n As coordenadas solicitadas (eixo x = %.1f) ( eixo y = %.1f) "
					         +" %n Encontram-se no 2� Quadrante :) ", nome, x, y); }
		
		else if(x <= -0.1 && y <= -0.1)
		{
			System.out.printf(" %n Ol�, %s, tudo bem? "
					         +" %n As coordenadas solicitadas (eixo x = %.1f) (eixo y = %.1f) "
					         +" %n Encontram-se no 3� Quadrante :) ", nome, x, y); }
		
		if(x >= 0.1 && y <= -0.1)
		{
			System.out.printf(" %n Ol�, %s, tudo bem? "
					         +" %n As coordenadas solicitadas (eixo x = %.1f) (eixo y = %.1f) "
					         +" %n Encontram-se no 4� Quadrante :) ", nome, x, y); }
		
		else if (x == 0.0 && y == 0.0)
		{
			System.out.printf(" %n Ol�, %s, tudo bem? "
			                + " %n As coordenadas solicitadas (eixo x = %.1f) (eixo y = %.1f) "
			                + " %n Encontram-se na Origem ", nome, x, y); }
		
		sc.close();;
	}

}
