package basicao;
import java.util.Locale;

public class Atividade_06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		// ENTRADA DE DADOS
		double A = 12.7;
		double B = 10.4;
		double C = 15.2;
		double valorPi = 3.14159;
		
		// PROCESSAMENTO DE DADOS
		double areaTriangulo = (A * C) / 2.0 ;
		double areaCirculo = (valorPi * Math.pow(C, 2.0)); // OU double areaCirculo = 3.14159 * C * C;
		double areaTrapezio = (A + B) / 2.0 *C ;
		double areaQuadrado = (Math.pow(B, 2.00));  // OU double areaQuadrado  = B * B;
		double areaRetangulo = (A * B);
		
		// SAIDA DE DADOS
		System.out.printf(" %n Área do Triângulo : %.3f", areaTriangulo);
		System.out.printf(" %n Área do Circulo : %.3f", areaCirculo);
		System.out.printf(" %n Área do Trapézio : %.3f", areaTrapezio);
		System.out.printf(" %n Área do Quadrado : %.3f", areaQuadrado);
		System.out.printf(" %n Área do Retangulo : %.3f", areaRetangulo);
	}

}
