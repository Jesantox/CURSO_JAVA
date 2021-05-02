package basicao.funcoes;

/**
 * 
 * @author Jesantox
  
-------------------------------------------------------------------------------------------------------        
        Quantidade de Caracteres
        
		Fórmula : variável.length()
           
-------------------------------------------------------------------------------------------------------         
        Retorna Caracteres
        
		Fórmula : variável.charAt(index)
		
-------------------------------------------------------------------------------------------------------        
        Texto Maiúsculo e Minúsculo
        
		Fórmula : variável.toLowerCase() --> Minúsculo
		Fórmula : variável.toUpperCase() --> Maiúsculo

-------------------------------------------------------------------------------------------------------        
        Copiar Caracteres
        
		Fórmula : variável.substring(início, fim)
		Fórmula : variável.substring(inicio)
		
-------------------------------------------------------------------------------------------------------        
		Remover Espaços
		
		Fórmula : variável.trim()
		
-------------------------------------------------------------------------------------------------------      
		Substituir Caracteres
		
		Fórmula : variável.replace(antigo, novo)
		
-------------------------------------------------------------------------------------------------------        
		Converter Dados

-------------------------------------------------------------------------------------------------------        
 
 		Localizar Carateres
 		
 		Fórmula : texto.indexOf(caracter)
 		Fórmula : texto.indexOf(caracter, index inicial)
 		
 		Fórmula : texto.indexOf(palavra)
 		Fórmula : texto.indexOf(palavra, index inicial)
 		
-------------------------------------------------------------------------------------------------------        
 		Recortar Strings


 */
public class Textos {

	public static void main(String[] args) {

//		QUANTIDADE DE CARACTERES

		System.out.println(" \n QUANTIDADE DE CARACTERES ");
		String frase01 = "Aprendendo Java";
		int tamanho;

		tamanho = frase01.length();

		System.out.println(" String: " + frase01);
		System.out.println(" Tamanho da string = " + tamanho + "\n");

//----------------------------------------------------------------------------------------------------------

//		RETORNA CARACTERE

		String frase02 = "Aprendendo Java";

		System.out.println(" String   = " + frase02);
		System.out.println(" Caracter = " + frase02.charAt(5));
		System.out.print(" Trecho   = ");

		for (int i = 11; i <= 14; i++) {
			System.out.print(frase02.charAt(i));
		}
		System.out.println();

//----------------------------------------------------------------------------------------------------------

//		TEXTO MAIÚSCULO E MINÚSCULO 

		String palavra = "LINGUAGEM JAVA", palavra1 = "ARROZ", palavra2 = "batata";

		System.out.println("\n TRECHO              = " + palavra.substring(10, 14));

		System.out.println(" ARROZ  em minúsculo = " + palavra1.toLowerCase());
		System.out.println(" batata em maiúscula = " + palavra2.toUpperCase());
		System.out.println(" SaLaDa em minúscula = " + "SaLaDa".toLowerCase());

//----------------------------------------------------------------------------------------------------------

//		COPIAR CARACTERES  

		String frase03 = "Eu gosto de java!";

		System.out.println("\n Separando uma frase em palavras: \n");

		System.out.println(" Palavra 1: " + frase03.substring(0, 2));
		System.out.println(" Palavra 2: " + frase03.substring(3, 8));
		System.out.println(" Palavra 3: " + frase03.substring(9, 11));
		System.out.println(" Palavra 4: " + frase03.substring(12) + "\n");

//----------------------------------------------------------------------------------------------------------

//		REMOVER ESPAÇOS		

		System.out.println(" REMOVER ESPAÇOS : \n");
		String frase04 = " Jesus Cristo: o rei dos reis. ";
		System.out.println(" Com espacos: " + "*" + frase04 + "*");
		System.out.println(" Sem espacos: " + "*" + frase04.trim() + "*");

//----------------------------------------------------------------------------------------------------------

//		SUBSTITUIR CARACTERES

		System.out.println(" \n SUBSTITUIR CARACTERES : ");
		String frase1 = "o macaco gosta de banana";
		String frase2 = frase1.replace(" ", "");

		System.out.println("\n Frase 1: " + frase1);
		System.out.println(" Frase 2: " + frase2);
		System.out.println(" Frase 3: " + frase1.replace(" ", "_"));
		System.out.println(" Frase 4: " + frase1.replace("a", "u"));
		System.out.println(" Frase 5: " + frase1.replace("na", "NA"));

//----------------------------------------------------------------------------------------------------------

//		CONVERTER DADOS

		System.out.println(" \n CONVERTER DADOS \n ");
		String x = "";
		int a = 11;
		long b = 222;
		float c = 3333;
		double d = 4.444;
		x = x + String.valueOf(a) + " - ";
		x = x + String.valueOf(b) + " - ";
		x = x + String.valueOf(c) + " - ";
		x = x + String.valueOf(d);
		System.out.println(" Valores convertidos:");
		System.out.println(" " + x + "\n");

//----------------------------------------------------------------------------------------------------------

//		LOCALIZAR CARACTERES

		System.out.println(" LOCALIZAR CARACTERES \n ");

		String texto = "Livro Java 2 - Ensino didatico";
		char caractere = 'a';

		System.out.println(" Caracter (" + caractere + ") \n");
		System.out.println(" indice: " + texto.indexOf(caractere));
		System.out.println(" indice: " + texto.indexOf(caractere, 10));
		System.out.println(" indice: " + texto.indexOf("Ensino"));
		System.out.println(" indice: " + texto.indexOf("Java", 15));
		
//----------------------------------------------------------------------------------------------------------

//		RECORTAR STRINGS 
		
		String texto01 = "Olá, Jean. Tudo bem?";
		String[] vect = texto01.split(" ");
		
		String palavra01 = vect[0].replace(",", " ");
		String palavra02 = vect[1].replace(".", " ");
		String palavra03 = vect[2];
		String palavra04 = vect[3].replace("?", " ");
		
		System.out.println(" 1º Palavra : " + palavra01 + "\n" +
				           " 2º Palavra : " + palavra02 + "\n" + 
				           " 3º Palavra : " + palavra03 + "\n" +
				           " 4º Palavra : " + palavra04);
	
	}

}
