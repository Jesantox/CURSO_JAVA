package basicao;

public class Main_02 {

	public static void main(String[] args) {

		int a;
		double b;

		a = 5;
		b = 2 * a;

		System.out.println(a);
		System.out.printf("Double : " + b + "%n%n");

//      ------------------------------------

		int c;
		int d;

		c = 5;
		d = 2 * c;

		System.out.println(c);
		System.out.printf("Inteiro : " + d + "%n%n");

		/*
		 * # CALCULANDO A �REA DE UM TRAP�ZIO
		 * 
		 * -> DECLARO AS VARI�VEIS 
		 * -> ATRIBUO VALORES AS VARI�VEIS 
		 * -> PROCESSO ESSES VALORES 
		 * -> EXIBO O RESULTADO DO C�LCULO DESSES VALORES
		 * 
		 */

		// DECLARA��O DE VARI�VEIS TIPO DOUBLE (OBSERVE A ESCRITA DOS VALORES)

		double baseMenor = 6.0;
		double baseMaior = 8.0;
		double h = 5.0;
		double area;

		area = (baseMenor + baseMaior) / 2.0 * h;

		System.out.printf("�rea do Trap�zio : " + area + "%n%n");

		/* DECLARA��O DE VARI�VEIS TIPO FLOAT (OBSERVE A ESCRITA DOS VALORES)
		 * 
		 * double baseMenor = 6f; double baseMaior = 8f; double h = 5f; double area;
		 * area = (baseMenor+ baseMaior) / 2f * h;
		 * System.out.println("�rea do Trap�zio : " + area); */

		// SEM CASTING
		// IR� EXIBIR SEM CASAS DECIMAIS, OU SEJA, O C�LCULO ESTAR� ERRADO AO EXIBIR

		int e = 5;
		int f = 2;

		double resultado01 = e / f;

		System.out.println("Resultado do tipo double : " + resultado01 + "  (ERRADO)");

		/*
		 * FAZENDO O 'CASTING' DECLARANDO UM TIPO
		 * 
		 * Caso queira que exiba com determinado tipo Coloque o nome do tipo entre
		 * parenteses na vari�vel que processa os dados Por exemplo, quero que seja
		 * exibido com tipo DOUBLE (com uma casa decimal) � s� escrever 'double' entre
		 * parenteses na frente da opera��o dentro da vari�vel que a est� processando.
		 * IR� EXIBIR COM CASAS DECIMAIS, OU SEJA, O C�LCULO ESTAR� CERTO AO EXIBIR
		 */
		int g = 5;
		int i = 2;

		double resultado02 = (double) g / i;

		System.out.printf("Resultado do tipo double : " + resultado02 + "  (CERTO)" + "%n%n");

		// CONVERTENDO DOUBLE PARA INT
		double j = 5.0;
		int k = (int) j;

		System.out.println(k);

		// CONVERTENDO INT PARA DOUBLE
		double l = 5.0;
		double m = (double) l;

		System.out.println(m);

	}

}
