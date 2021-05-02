package fechamentoBasico;

import java.util.Scanner;

/**
 * 
 * @author Jesantox
 * 
 *         <h1> Criar Fun��es Personalizadas </h1>
 *         
 *         <h2> Criando uma Fun��o Inline </h2>
 *         
 *         Criamos fora do m�todo <b> main </b> ;
 *         
 *         public static <b> Tipo de dado </b> <b> Nome da Fun��o </b> (<b> par�metros de entrada </b>){
 *         
 *         }
 *         
 *         <h2> Defini��es </h2> <br>
 *         
 *         <b> public </b> : <i> Significa que a fun��o pode ser usado em outras classes.       </i> <br>
 *         <b> static </b> : <i> Significa que a fun��o pode ser chamada mesmo criando Objetos. </i> <br>
 *         <b> void   </b> : <i> Significa que a fun��o n�o retorna um valor. Ou seja, tem o tipo vazio. N�o retorna um valor. Somente atua.                            </i>
 *         
 *         
 *         
 *
 */
public class Funcoes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(" Insira 3 valores : ");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max = maiorValor(a, b, c);
		
		System.out.println();
        imprimir(max);

		sc.close();
	}

// ----------------------------------------------------------------------------------------------------

/**  
   	<u> <b> Descobrir o maior valor dentre 3 N�meros </b> </u>
	 
	   @param a <b> 1� Par�metro </b>
	   @param b <b> 2� Par�metro </b>
	   @param c <b> 3� Par�metro </b>
	 
	   @return  --> <b> Maior valor  </b> */
	public static int maiorValor(int a, int b, int c) {
		
		int aux;           // Vari�vel privada --> Pr�pria da Fun��o
		
		if(a > b && a > c) // L�GICA DA FUN��O
			aux = a;       // L�GICA DA FUN��O
		else if (b > c)    // L�GICA DA FUN��O
			aux = b;       // L�GICA DA FUN��O
		else               // L�GICA DA FUN��O
			aux = c;       // L�GICA DA FUN��O
		
		return aux;        // RESULTADO 
	}
	
/**  ----------------------------------------------------------------------------------------------------	
	   <b> Exibir na tela </b>
	   
	   @param value --> <b> vari�vel </b> */
	public static void imprimir(int value) {
		
		System.out.println("O maior valor � : " + value);
	
	}
}
