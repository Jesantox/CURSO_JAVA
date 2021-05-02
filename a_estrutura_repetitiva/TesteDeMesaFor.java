package a_estrutura_repetitiva;

import java.util.Scanner;

public class TesteDeMesaFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Olá, tudo bem? \n Insira um limite de algarismos: ");
		int a = sc.nextInt();
		
		System.out.println(" Insira o Algarismo : ");
		int b = sc.nextInt();
		
		for(int i=0;i<a;i++) {
			System.out.print(i + ",");
			b = b + 5;
			
			System.out.println(b);
		}
		
		System.out.println(" Fim da Aplicação ");
		sc.close();

	}

}
