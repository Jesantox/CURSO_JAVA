package basicao.estrutura_condicional.atividade;

import java.util.Locale;
import java.util.Scanner;

public class Intervalos {

	public static void main(String[] args) {
		
/* 		fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
		seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. 
		Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”. 		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Olá, como se chama? ");
		String nome = sc.nextLine();
		
		System.out.println("Insira um intervalo : ");
		double intervalo = sc.nextDouble();
		
		if(intervalo < 0.0 || intervalo > 100.0) {	
			System.out.printf(" Olá, %s, tudo bem? %n O valor solicitado encontra-se fora dos intervalos :/", nome);
			}
		
		else if(intervalo <= 25.0) {
			System.out.printf(" Olá, %s, tudo bem? %n O valor solicitado encontra-se no seguinte intervalo [0,25]", nome);
			}
		
		else if (intervalo <= 50.0) {
			System.out.printf(" Olá, %s, tudo bem? %n O valor solicitado encontra-se no seguinte intervalo (25,50]", nome); 
			}
		
		else if (intervalo <= 75.0){	
			System.out.printf(" Olá, %s, tudo bem? %n O valor solicitado encontra-se no seguinte intervalo (50,75]", nome); 
			}
		
		else {
			System.out.printf(" Olá, %s, tudo bem? %n O valor solicitado encontra-se no seguinte intervalo (75,100]", nome); 
			}

		sc.close();

	}
}
