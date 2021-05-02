package a_basicao;
import java.util.Locale;
import java.util.Scanner;

public class Atividade_05 {

	public static void main(String[] args) {
		
/*		Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
    	código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.  */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo01 = sc.nextInt();
		int qtde01 = sc.nextInt();
		double valor01 = sc.nextDouble();
		
		int codigo02 = sc.nextInt();
		int qtde02 = sc.nextInt();
		double valor02 = sc.nextDouble();
		
		double calculo01 = (qtde01 * valor01);
		double calculo02 = (qtde02 * valor02);
		
		double total = (calculo01 + calculo02);
		// OU
		// total = valor01 * qtde01 + valor02 * qtde02;
		// DESSA FORMA NÃO PRECISARIA DAS VARIÁVEIS 'CALCULO01/CALCULO02'
		
		System.out.printf(" %n" +
		                  "--------------------------------------- %n" +
				          " Código : " + codigo01 + "%n%n" +
					      " Quantidade de Peças : " + qtde01 + "%n%n");
		       
		System.out.printf(" Valor unitário : %.2f %n", valor01);
		
		System.out.printf("--------------------------------------- %n" +
				          " Código : " + codigo02 + "%n%n" +
			         	  " Quantidade de Peças : " + qtde02 + "%n%n");
		
		System.out.printf(" Valor unitário : %.2f %n", valor02);
		
		System.out.printf(" --------------------------------------- %n Total a se pagar :  R$ %.2f ",total);
		
		
		sc.close();
		

	}

}
