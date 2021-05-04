package b_programacaoOrientada_a_Objetos.exercicio.program;

import java.util.Locale;
import java.util.Scanner;

import b_programacaoOrientada_a_Objetos.exercicio.entities.Estudante;

/**
 * 
 * @author Jesantox
 * 
 * Fazer um programa para ler o NOME de um aluno e as TRÊS notas 
 * que ele obteve nos três trimestres do ano (primeiro trimestre vale 30
 * e o segundo e terceiro vale 35 cada.
 * 
 * Em seguida, mostrar a nota final do aluno no ano;
 * Em seguida mostrar se o aluno está aprovado(PASS) ou reprovado(Failed);
 * Em seguida, em caso negativo, mostrar quantos pontos faltam para o aluno obter o mínimo
 * para ser aprovado (que é 60% da nota);
 * 
 * Criar uma Classe para o problema !
 * 
 *
 */
public class CalcularNotaFinal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Estudante aluno = new Estudante();
		
		System.out.print("\n Olá, tudo bem?. Como se chama? ");
		aluno.nome = sc.nextLine();
		
		System.out.println();
		
		System.out.print(" Insira a 1º Nota : ");
		aluno.nota01 = sc.nextDouble();
		System.out.print(" Insira a 2º Nota : ");
		aluno.nota02 = sc.nextDouble();
		System.out.print(" Insira a 3º Nota : ");
		aluno.nota03 = sc.nextDouble();
		
		aluno.notaFinal();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
