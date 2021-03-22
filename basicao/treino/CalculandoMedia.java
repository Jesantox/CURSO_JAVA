package basicao.treino;

import java.util.Locale;
import java.util.Scanner;

public class CalculandoMedia {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // mudando virgulas para ponto
		
		Scanner sc = new Scanner(System.in); // entrada de dados

		System.out.println("Ol�, tudo bem? Como se Chama?");
		String nome = sc.nextLine();
		
		System.out.println("Insira a 1� nota : ");
		double nota01 = sc.nextDouble();
		
		System.out.println("Insira a 2� nota : ");
		double nota02 = sc.nextDouble();
		
		System.out.println("Insira a 3� nota : ");
		double nota03 = sc.nextDouble();
		
		System.out.println("Insira a 4� nota : ");
		double nota04 = sc.nextDouble();
		
		double media = (nota01 + nota02 + nota03 + nota04) / 4;
		
		System.out.printf("%n Ol� %s %n Sua M�dia � : %.2f ", nome, media);
		
		sc.close();
	}

}
