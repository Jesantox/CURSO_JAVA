package basicao;
import java.util.Locale;
import java.util.Scanner;

public class Atividade_02 {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	
	Scanner sc = new Scanner(System.in);
	
	

	double valorDePi = sc.nextDouble();
	double raio = sc.nextDouble();
	double raioQuadrado = Math.pow(raio, 2);
	
	Double area = raioQuadrado*valorDePi;
	
	// OU
	// Double area = valorPi * raio * raio;
	// assim n�o precisaria ter a vari�vel 'raioQuadrado'
	
	System.out.printf("%n �REA : %.4f ", area);
	
	sc.close();

	}

}
