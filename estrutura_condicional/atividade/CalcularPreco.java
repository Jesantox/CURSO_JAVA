package estrutura_condicional.atividade;

import java.util.Locale;
import java.util.Scanner;

public class CalcularPreco {

	public static void main(String[] args) {
		
/*  	escreva um programa que leia o código de um item e a quantidade deste item. A
		seguir, calcule e mostre o valor da conta a pagar. */ 
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(" Olá, como se chama? ");
		String nome = sc.nextLine();
		
		System.out.println("Informe o código deste Produto : ");
		int codigo = sc.nextInt();
		
		System.out.println("Informe a quantidade deste item : ");
		int quantidade = sc.nextInt();
		
		System.out.println("Informe o preço deste item : ");
		double preco = sc.nextDouble();
		
		double valorFinal = quantidade * preco;
		
		System.out.printf("%n Olá, %s, tudo bem? "
						+ "%n Id do Produto : %d "
						+ "%n Quantidade : %d itens"
						+ "%n Preço : R$ %.2f "
						+ "%n Valor da Compra : R$ %.2f ", nome, codigo, quantidade, preco, valorFinal);
		
		sc.close();
		
		/* CASO FOSSE NECESSÁRIO DECLARAR PREÇOS FIXOS
		 
------------------------------------------------------------------------------
	    Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double total;
		if (codigo == 1) {
			total = quantidade * 4.0;
		}
		else if (codigo == 2) {
			total = quantidade * 4.5;
		}
		else if (codigo == 3) {
			total = quantidade * 5.0;
		}
		else if (codigo == 4) {
			total = quantidade * 2.0;
		}
		else {
			total = quantidade * 1.5;
		}

		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
------------------------------------------------------------------------------ 
*/

	}

}
