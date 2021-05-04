package b_programacaoOrientada_a_Objetos.exercicio.program;

import java.util.Locale;
import java.util.Scanner;

import b_programacaoOrientada_a_Objetos.exercicio.entities.Funcionario;

/**
 * 
 * @author Jesantox
 * 
 * Fazer um programa para ler os dados de um Funcionário (Nome, Salário Bruto e Imposto).
 * Em seguida, mostrar os dados do Funcionário (Nome e Salário Líquido).
 * Em seguida, aumentar o salário do Funcionário com base em uma porcentagem dada(que só afeta o Salário Bruto)
 * Em seguida, mostrar novamente os dados do Funcionário.
 * 
 * Use uma Classe ! 
 */
public class CalcularImpostoFuncionario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		
		System.out.print(" Como se chama ? ");
		func.nome = sc.nextLine();
		
		System.out.print(" Informe seu Salário Bruto : ");
		func.salarioBruto = sc.nextDouble();
		
		System.out.print(" Informe o valor do Imposto : ");
		func.imposto = sc.nextDouble();
				
		System.out.println(func.imprimir01());
		
		System.out.print("\n Insira o valor do Percentual : ");
		double porcentagem = sc.nextDouble();
		
		System.out.println("\n" +
				           " Informações Atualizadas ! " + "\n" +
		                   " Nome : " + func.nome + ", R$ " + String.format("%.2f", func.aumentarSalario(porcentagem)));
		
		
		
		
		
		sc.close();
		

	}

}
