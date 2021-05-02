package a_estrutura_condicional.atividade;

import java.util.Locale;
import java.util.Scanner;

public class PagarImposto {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n Olá, tudo bem? Como se chama?");
		String nome = sc.nextLine();
		
		System.out.println("\n Informe sua Renda Salarial: ");
		double salario = sc.nextDouble();
		
		double imposto;
		if ( salario <= 2000.00)
		{	imposto = 0.0;	}
		
		else if ( salario <= 3000.00)
		{	imposto = (salario - 2000.00) * 0.08;	}
		
		else if ( salario <= 4500.00)
		{	imposto = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;	}
		
		else 
		{	imposto = (salario - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;	}
		
		if(imposto == 0.0)
		{	System.out.printf(" %n Olá, %s, tudo bem? %n Você está isento. ");}
		
		else
		{	System.out.printf(" %n Olá, %s. %n Valor do seu imposto : R$ %.2f", nome, imposto);}
		
		sc.close();

	}

}
