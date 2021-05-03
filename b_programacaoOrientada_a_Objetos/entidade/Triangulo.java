package b_programacaoOrientada_a_Objetos.entidade;

public class Triangulo {

	public double valor01;
	public double valor02;
	public double valor03;

	public double area() {

		double p = (valor01 + valor02 + valor03) / 2;

		return (Math.sqrt(p * (p - valor01) * (p - valor02) * (p - valor03)));

	}

}
