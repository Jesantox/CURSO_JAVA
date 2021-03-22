package basicao.treino;

import java.util.Locale;
import java.util.Scanner;

public class CalculandoMedia {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // mudando virgulas para ponto
		
		Scanner sc = new Scanner(System.in); // entrada de dados

		System.out.println("Olá, tudo bem? Como se Chama?");
		String nome = sc.nextLine();
		
		System.out.println("Insira a 1º nota : ");
		double nota01 = sc.nextDouble();
		
		System.out.println("Insira a 2º nota : ");
		double nota02 = sc.nextDouble();
		
		System.out.println("Insira a 3º nota : ");
		double nota03 = sc.nextDouble();
		
		System.out.println("Insira a 4º nota : ");
		double nota04 = sc.nextDouble();
		
		double media = (nota01 + nota02 + nota03 + nota04) / 4;
		
		System.out.printf("%n Olá %s %n Sua Média é : %.2f ", nome, media);
		
		sc.close();
	}

}
