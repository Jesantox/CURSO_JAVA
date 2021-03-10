package basicao;
import java.util.Locale;

public class Main_01ExercicioDeFixacao {

	public static void main(String[] args) {
	
		// DECLARAÇÃO DE VARIÁVEIS
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		// EXIBINDO EM TELA
		
		System.out.printf(" Products: %n%n");
		System.out.printf(" -> %s, which price is R$ %.2f reais %n%n", product1, price1);
		System.out.printf(" -> %s, which price is R$ %.2f reais %n%n", product2, price2);
		
		System.out.printf(" Record : %d years old, code %d and gender: " + gender + "%n", age, code);
		System.out.printf(" Measure with eight decimal places : %f %n", measure);
		System.out.printf(" Roude (Three decimal places) : %.3f %n", measure);
		
		Locale.setDefault(Locale.US);
		System.out.printf(" US decimal point : %.3f ", measure);
	}

}
