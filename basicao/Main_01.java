package basicao;
import java.util.Locale;

public class Main_01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // Necessário importar
//      => Configurei pra que troque virgulas por ponto

		//	IMPRIMINDO TIPOS PRIMITIVOS	 

		// INTEIRO
		int y = 32;

		System.out.println("Inteiro : " + y);

		// DOUBLE
		double x = 10.35784234;

		System.out.println("Double  : " + x);
		System.out.println("");

		/* TRUQUE PARA FORMATAR 
		 * -> ACRESCENTE A LETRA F NO PRINT 
		 * -> ENTRE ASPAS IMPRIMA
		 * '%.2f%' -> CASO QUEIRA UMA QUEBRA DE LINHA '%.2f%n' 
		 * OBS => '%n' serve como
		 * quebra de linha (independente da plataforma) */

		System.out.printf("Com 1 casa  decimal  : " + "%.1f%n", x);
		System.out.printf("Com 2 casas decimais : " + "%.2f%n", x);
		System.out.printf("Com 3 casas decimais : " + "%.3f%n", x);
		System.out.printf("Com 4 casas decimais : " + "%.4f%n", x);
		System.out.printf("Com 5 casas decimais : " + "%.5f%n", x);
		System.out.printf("Com 6 casas decimais : " + "%.6f%n", x);
		System.out.printf("Com 7 casas decimais : " + "%.7f%n", x);
		System.out.printf("Com 8 casas decimais : " + "%.8f%n", x);
		System.out.printf("Com 9 casas decimais : " + "%.9f%n", x);
		System.out.println("ETC..");

		// FAZENDO DE OUTRO JEITO
		System.out.printf("Com 1 casa  decimal  : %.1f %n", x);
		System.out.printf("Resultado = %.2f metros %n", x);

		/* USANDO MARCADORES DE VARIAVEIS (%d, %f, %s, %n)
		 * 
		 * %d -> INTEIRO 
		 * %f -> FORMATAR CASAS 
		 * %s -> STRINGS 
		 * %n -> QUEBRA DE LINHA */
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;

		System.out.printf("%s tem %d e ganha R$ %.2f reais %n", nome, idade, renda);

	}

}
