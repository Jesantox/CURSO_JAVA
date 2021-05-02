package a_basicao;
import java.util.Locale;
import java.util.Scanner;

public class Main_03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in); // ENTRADA DE DADOS

/*
		 ==> ENTRANDO COM STRING String a = sc.next();
		 System.out.println("Você digitou: " + a);
		  
		 ==> ENTRANDO COM INTEIRO int b = sc.nextInt();
		 System.out.println("Você digitou: " + b);
		  
		 ==> ENTRANDO COM DOUBLE double c = sc.nextDouble();
		 System.out.println("Você digitou: " + c);
		  
		 ==> ENTRANDO COM CHAR char d = sc.next().charAt(0);
		 System.out.println("Você digitou: " + d);
*/
		
/*
		String x = sc.next(); // aqui só é possível inserir uma palavra no console 
		int y = sc.nextInt();
		double z = sc.nextDouble();

		System.out.println("Dados Digitados : ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
*/

		
//      LENDO UM TEXTO ATÉ A QUEBRA DE LINHA (É PRECISO CHAMAR O next.line)
		 
		String s1 = sc.nextLine(); // aqui é possivel inserir frases no console
		String s2 = sc.nextLine(); // aqui é possivel inserir frases no console
		String s3 = sc.nextLine(); // aqui é possivel inserir frases no console
		
		System.out.println("DADOS DIGITADOS : ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	
//      CONCLUSÃO DO NEXT E O NEXTLINE		
/*
		O next lê somente uma palavra. Ou seja, você só pode escrever uma palavra na variável
		Enquanto o nextline possibilita esrever frases e, consequentemente, ler elas. 
*/
		
		
		
//      LENDO UM NUMERO JUNTO ANTES DE LER STRINGS 
		
		int numero= sc.nextInt();
		sc.nextLine();
		String s4 = sc.nextLine(); // aqui é possivel inserir frases no console
		String s5 = sc.nextLine(); // aqui é possivel inserir frases no console
		String s6 = sc.nextLine(); // aqui é possivel inserir frases no console
		
		System.out.println("DADOS DIGITADOS : ");
		System.out.println(numero);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		
	
//      CONCLUSÃO DO NEXT E O NEXTLINE		
/*
		É preciso por um (nextLine) após o nextInt. 
		Porque assim esse nextLine consome a linha pendente deixada quando apertamos enter. 
		Não causando erro ao ler todas as Strings. 
*/
		sc.close();

	}

}
