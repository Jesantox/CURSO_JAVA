package a_estrutura_repetitiva;

import java.util.Scanner;

public class UsandoFor {

	public static void main(String[] args) {

		/*
		 * Usar quando se sabe previamente a quantidade de repeti��es �timo para fazer.
		 * contagens(Progressiva ou Regressiva).
		 * 
		 * REGRA :
		 * 
		 * for(inicio;condi��o;incremento){ bloco de comandos bloco de comandos }
		 * 
		 * EXPLICA��O :
		 * 
		 * > INICIO : executa somente uma v�z. 
		 * > CONDI��O : verdadeira(executa e volta)
		 * || falsa(pula fora). > INCREMENTO : executa toda vez depois de voltar(vai
		 * aumentando o valor do in�cio at� a condi��o ser falsa e pular fora).
		 * 
		 */

//		   Fa�a um programa que l� um valor N e depois N n�meros inteiros. 
//		   Ao final, mostra a soma dos N n�meros lidos. 

		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Ol�, tudo bem? \n Digite um n�mero :");
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
