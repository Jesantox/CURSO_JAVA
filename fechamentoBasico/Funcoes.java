package fechamentoBasico;

import java.util.Scanner;

/**
 * 
 * @author Jesantox
 * 
 *         <h1> Criar Funções Personalizadas </h1>
 *         
 *         <h2> Criando uma Função Inline </h2>
 *         
 *         Criamos fora do método <b> main </b> ;
 *         
 *         public static <b> Tipo de dado </b> <b> Nome da Função </b> (<b> parâmetros de entrada </b>){
 *         
 *         }
 *         
 *         <h2> Definições </h2> <br>
 *         
 *         <b> public </b> : <i> Significa que a função pode ser usado em outras classes.       </i> <br>
 *         <b> static </b> : <i> Significa que a função pode ser chamada mesmo criando Objetos. </i> <br>
 *         <b> void   </b> : <i> Significa que a função não retorna um valor. Ou seja, tem o tipo vazio. Não retorna um valor. Somente atua.                            </i>
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
   	<u> <b> Descobrir o maior valor dentre 3 Números </b> </u>
	 
	   @param a <b> 1º Parâmetro </b>
	   @param b <b> 2º Parâmetro </b>
	   @param c <b> 3º Parâmetro </b>
	 
	   @return  --> <b> Maior valor  </b> */
	public static int maiorValor(int a, int b, int c) {
		
		int aux;           // Variável privada --> Própria da Função
		
		if(a > b && a > c) // LÓGICA DA FUNÇÃO
			aux = a;       // LÓGICA DA FUNÇÃO
		else if (b > c)    // LÓGICA DA FUNÇÃO
			aux = b;       // LÓGICA DA FUNÇÃO
		else               // LÓGICA DA FUNÇÃO
			aux = c;       // LÓGICA DA FUNÇÃO
		
		return aux;        // RESULTADO 
	}
	
/**  ----------------------------------------------------------------------------------------------------	
	   <b> Exibir na tela </b>
	   
	   @param value --> <b> variável </b> */
	public static void imprimir(int value) {
		
		System.out.println("O maior valor é : " + value);
	
	}
}
