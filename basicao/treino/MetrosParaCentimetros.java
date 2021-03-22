package basicao.treino;

import java.util.Locale;
import java.util.Scanner;

public class MetrosParaCentimetros {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // mudando virgulas para ponto
		
		Scanner sc = new Scanner(System.in); // entrada de dados

		System.out.println("Ol�, tudo bem? Como se chama? ");
		String nome = sc.nextLine();
		
		System.out.println("Quantos metros? ");
		double metro = sc.nextDouble();
		
		
		double centimetro = metro * 100 ;
		
		System.out.printf("%n Ol�, %s %n %.0f metros s�o : %.0f centimetros", nome, metro, centimetro);
		
		sc.close();
	}

}
