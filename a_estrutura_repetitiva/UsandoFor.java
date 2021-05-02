package a_estrutura_repetitiva;

import java.util.Scanner;

public class UsandoFor {

	public static void main(String[] args) {

		/*
		 * Usar quando se sabe previamente a quantidade de repetições Ótimo para fazer.
		 * contagens(Progressiva ou Regressiva).
		 * 
		 * REGRA :
		 * 
		 * for(inicio;condição;incremento){ bloco de comandos bloco de comandos }
		 * 
		 * EXPLICAÇÃO :
		 * 
		 * > INICIO : executa somente uma vêz. 
		 * > CONDIÇÃO : verdadeira(executa e volta)
		 * || falsa(pula fora). > INCREMENTO : executa toda vez depois de voltar(vai
		 * aumentando o valor do início até a condição ser falsa e pular fora).
		 * 
		 */

//		   Faça um programa que lê um valor N e depois N números inteiros. 
//		   Ao final, mostra a soma dos N números lidos. 

		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Olá, tudo bem? \n Digite um número :");
		int n = sc.nextInt();
		int soma = 0;
		
		for(int i=0; i<n; i++) {
			System.out.println(" Digite o Algarismo : ");
			int x = sc.nextInt();
			soma = soma + x;
		}
		
		System.out.println(" A soma dos Algarismos Inteiros : " + soma);

		sc.close();

	}

}
