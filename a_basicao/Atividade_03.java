package a_basicao;
public class Atividade_03 {

	public static void main(String[] args) {
		
/* 	Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
	de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).  */

		int A = 5;
		int B = 6;
		int C = 7;
		int D = 8;
		
		int DIFERENCA_01 = (A * B - C * D);
		
		System.out.println("DIFERENÇA = " + DIFERENCA_01 + " ( 7 )");
		
		int E = 5;
		int F = 6;
		int G= -7;
		int H = 8;
		
		int DIFERENCA_02 = (E * F - G * H);
		
		System.out.println("DIFERENÇA =  " + DIFERENCA_02 + " ( -7 )");
		
/*
        OU DESSA FORMA
        ASSIM SERIA MAIS FLEXIVEL. SEM TER VALORES FIXOS
        ------------------------------------------------------------      
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, dif;

	    A = sc.nextInt();
	    B = sc.nextInt();
	    C = sc.nextInt();
	    D = sc.nextInt();

	    dif = A * B - C * D;

	    System.out.println("DIFERENCA = " + dif);	
		
		sc.close();
		-----------------------------------------------------------
*/
	}

}
