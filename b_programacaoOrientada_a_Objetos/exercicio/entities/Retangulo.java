package b_programacaoOrientada_a_Objetos.exercicio.entities;

public class Retangulo {

	public double largura;
	public double altura;

	public double area() {

		return largura * altura;
	}

	public double perimetro() {

		return (largura * 2.00) + (altura * 2.00);
	}

	public double diagonal() {

		return Math.sqrt((largura * largura) + (altura * altura));
	}
	
	public String imprimir() {
		
		return " AREA : "      + String.format("%.2f", area())      + " m²\n" +
               " PERIMETRO : " + String.format("%.2f", perimetro()) + "\n"    +
		       " DIAGONAL : "  + String.format("%.2f", diagonal()) ;
	}

}
