package estrutura_condicional;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Como se chama? ");
		String nome = sc.nextLine();
		
		System.out.println(" Digie um n�mero : ");
		int x = sc.nextInt();
		
		String dia;
		
		switch(x) 
		{ 
		  case 1: 
			dia = "Domingo"; break;
		  case 2: 
			dia = "Segunda-Feira"; break;
		  case 3: 
		    dia = "Ter�a-Feira"; break;
		  case 4: 
		    dia = "Quarta-Feira"; break;
		  case 5: 
		    dia = "Quinta-Feira"; break;
		  case 6: 
			dia = "Sexta-Feira"; break;
		  case 7: 
			dia = "S�bado"; break;
		  default: 
			dia = "Valor inv�lido!";
		}
		
		System.out.println(" Ol�, " + nome + ". Hoje � " + dia);
	

	sc.close();

}

}
