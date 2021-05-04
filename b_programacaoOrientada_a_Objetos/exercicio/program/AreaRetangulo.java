package b_programacaoOrientada_a_Objetos.exercicio.program;

import java.util.Locale;
import java.util.Scanner;

import b_programacaoOrientada_a_Objetos.exercicio.entities.Retangulo;

/**
 * 
 * @author Jesantox
 * 
 *         Fazer um programa para ler a ALTURA e LARGURA de um ret�ngulo. Em
 *         seguida, mostrar em tela o valor da sua �rea, pe�metro e diagonal.
 * 
 *         Usar uma classe.
 * 
 *         CONCLU�DA COM SUCESSO AA
 *
 */
public class AreaRetangulo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Retangulo medidas = new Retangulo(); // Instanciando a Classe Triangulo

		System.out.print(" Informe a Altura : ");
		medidas.altura = sc.nextDouble(); // Definindo os valores dos atributos

		System.out.print(" Informe a Largura : ");
		medidas.largura = sc.nextDouble(); // Definindo os valores dos atributos

		System.out.println();
		System.out.println(medidas.imprimir()); // Chamei o m�todo que imprimi em formato String

		sc.close();

	}

}
