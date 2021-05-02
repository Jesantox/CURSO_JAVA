package a_basicao;
import java.util.Locale;
import java.util.Scanner;

public class Atividade_05 {

	public static void main(String[] args) {
		
/*		Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
    	c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.  */
		
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
		// DESSA FORMA N�O PRECISARIA DAS VARI�VEIS 'CALCULO01/CALCULO02'
		
		System.out.printf(" %n" +
		                  "--------------------------------------- %n" +
				          " C�digo : " + codigo01 + "%n%n" +
					      " Quantidade de Pe�as : " + qtde01 + "%n%n");
		       
		System.out.printf(" Valor unit�rio : %.2f %n", valor01);
		
		System.out.printf("--------------------------------------- %n" +
				          " C�digo : " + codigo02 + "%n%n" +
			         	  " Quantidade de Pe�as : " + qtde02 + "%n%n");
		
		System.out.printf(" Valor unit�rio : %.2f %n", valor02);
		
		System.out.printf(" --------------------------------------- %n Total a se pagar :  R$ %.2f ",total);
		
		
		sc.close();
		

	}

}
