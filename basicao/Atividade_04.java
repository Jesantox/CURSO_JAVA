package basicao;
import java.util.Locale;
import java.util.Scanner;

public class Atividade_04 {

	public static void main(String[] args) {
		
/*	Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, 
    o valor que recebe por hora e calcula o salário desse funcionário. A seguir, 
    mostre o número e o salário do funcionário, com duas casas decimais.  */
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	String funcionario = sc.nextLine();
	int number = sc.nextInt();
	int horasTrabalhadas = sc.nextInt();
	double value = sc.nextDouble();
	
	double salary = horasTrabalhadas*value;
	
	System.out.printf(" %n Funcionario : "+ funcionario + "%n%n" + 
			          " Telefone para Contato : " + number + "%n%n" +
	                  " Salário : " + "R$ %.2f" , salary);
	
	 
	sc.close();
	

	}

}
