package basicao;
import java.util.Locale;
import java.util.Scanner;

public class Atividade_04 {

	public static void main(String[] args) {
		
/*	Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, 
    o valor que recebe por hora e calcula o sal�rio desse funcion�rio. A seguir, 
    mostre o n�mero e o sal�rio do funcion�rio, com duas casas decimais.  */
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	String funcionario = sc.nextLine();
	int number = sc.nextInt();
	int horasTrabalhadas = sc.nextInt();
	double value = sc.nextDouble();
	
	double salary = horasTrabalhadas*value;
	
	System.out.printf(" %n Funcionario : "+ funcionario + "%n%n" + 
			          " Telefone para Contato : " + number + "%n%n" +
	                  " Sal�rio : " + "R$ %.2f" , salary);
	
	 
	sc.close();
	

	}

}
