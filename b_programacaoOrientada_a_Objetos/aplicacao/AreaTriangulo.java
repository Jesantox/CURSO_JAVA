package b_programacaoOrientada_a_Objetos.aplicacao;

import java.util.Locale;
import java.util.Scanner;

import b_programacaoOrientada_a_Objetos.entidade.Triangulo;

/**
  @author <u> Jesantox </u> <br>
  
  Melhoria da Atividade em que se Calcula a �rea de um Tri�ngulo. <br> <br>
  
  Por�m agora usando classes e m�todos para condensar o c�digo. <br> <br>
  
  <b> Primeiro </b> > <i> Criei uma classe chamada Triangulo : Contendo os atributos </i> <br>
  
  <b> Segundo </b> > <i> Criei vari�veis do tipo Triangulo : Contendo os atributos </i>
  
  
 *
 */
public class AreaTriangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" 1� Tri�ngulo - Insira as medidas : \n");
		
		Triangulo primeiroTriangulo = new Triangulo(); // Instanciei as vari�veis
		Triangulo segundoTriangulo = new Triangulo();  // Instanciei as vari�veis
		
		System.out.print(" 1� Valor : "); 
		primeiroTriangulo.valor01 = sc.nextDouble(); // chamei a vari�vel
		
		System.out.print(" 2� Valor : ");
		primeiroTriangulo.valor02 = sc.nextDouble();
		
		System.out.print(" 3� Valor : ");
		primeiroTriangulo.valor03 = sc.nextDouble();
		
		double _01area = primeiroTriangulo.area(); // chamei o m�todo

// 		----------------------------------------------------------------------------------------------------		
	
		System.out.println(" \n 2� Tri�ngulo - Insira as medidas : \n");
		
		System.out.print(" 1� Valor : "); 
		segundoTriangulo.valor01 = sc.nextDouble();
		
		System.out.print(" 2� Valor : ");
		segundoTriangulo.valor02 = sc.nextDouble();
		
		System.out.print(" 3� Valor : ");
		segundoTriangulo.valor03 = sc.nextDouble();
		
		double _02area = segundoTriangulo.area();

// 		----------------------------------------------------------------------------------------------------	
		
		double maior = a_fechamentoBasico.Funcoes.maiorValor(_01area, _02area); // chamei o m�todo 
			
		System.out.printf(" \n �rea Total do 1� Tri�ngulo : %.4f",_01area);
		System.out.printf(" \n �rea Total do 2� Tri�ngulo : %.4f",_02area, "\n");
		
		System.out.printf(" \n\n A maior �rea : %.4f", maior);
		
		sc.close();	
	}
}
