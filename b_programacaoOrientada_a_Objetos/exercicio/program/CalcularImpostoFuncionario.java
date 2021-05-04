package b_programacaoOrientada_a_Objetos.exercicio.program;

import java.util.Locale;
import java.util.Scanner;

import b_programacaoOrientada_a_Objetos.exercicio.entities.Funcionario;

/**
 * 
 * @author Jesantox
 * 
 * Fazer um programa para ler os dados de um Funcion�rio (Nome, Sal�rio Bruto e Imposto).
 * Em seguida, mostrar os dados do Funcion�rio (Nome e Sal�rio L�quido).
 * Em seguida, aumentar o sal�rio do Funcion�rio com base em uma porcentagem dada(que s� afeta o Sal�rio Bruto)
 * Em seguida, mostrar novamente os dados do Funcion�rio.
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
		
		System.out.print(" Informe seu Sal�rio Bruto : ");
		func.salarioBruto = sc.nextDouble();
		
		System.out.print(" Informe o valor do Imposto : ");
		func.imposto = sc.nextDouble();
				
		System.out.println(func.imprimir01());
		
		System.out.print("\n Insira o valor do Percentual : ");
		double porcentagem = sc.nextDouble();
		
		System.out.println("\n" +
				           " Informa��es Atualizadas ! " + "\n" +
		                   " Nome : " + func.nome + ", R$ " + String.format("%.2f", func.aumentarSalario(porcentagem)));
		
		
		
		
		
		sc.close();
		

	}

}
