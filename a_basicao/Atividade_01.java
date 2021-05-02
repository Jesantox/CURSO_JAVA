package a_basicao;
import java.util.Locale;
import java.util.Scanner;

public class Atividade_01 {

	public static void main(String[] args) {
	
/*		Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		mensagem explicativa, conforme exemplos. */
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		int numero01, numero02, soma;
		
		numero01 = sc.nextInt();
		numero02 = sc.nextInt();
		
		soma = numero01 + numero02 ;
		
		System.out.println(" SOMA = " + soma);
		
		sc.close();
	}

}
