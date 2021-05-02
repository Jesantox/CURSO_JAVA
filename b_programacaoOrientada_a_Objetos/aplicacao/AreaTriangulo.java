package b_programacaoOrientada_a_Objetos.aplicacao;

import java.util.Locale;
import java.util.Scanner;

import b_programacaoOrientada_a_Objetos.entidade.Triangulo;

/**
  @author <u> Jesantox </u> <br>
  
  Melhoria da Atividade em que se Calcula a Área de um Triângulo. <br> <br>
  
  Porém agora usando classes para condensar o código. <br> <br>
  
  <b> Primeiro </b> > <i> Criei uma classe chamada Triangulo : Contendo os atributos </i> <br>
  
  <b> Segundo </b> > <i> Criei variáveis do tipo Triangulo : Contendo os atributos </i>
  
  
 *
 */
public class AreaTriangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" 1º Triângulo - Insira as medidas : \n");
		
		Triangulo primeiroTriangulo = new Triangulo(); // Instanciei as variáveis
		Triangulo segundoTriangulo = new Triangulo();  // Instanciei as variáveis
		
		System.out.print(" 1º Valor : "); 
		primeiroTriangulo.valor01 = sc.nextDouble();
		
		System.out.print(" 2º Valor : ");
		primeiroTriangulo.valor02 = sc.nextDouble();
		
		System.out.print(" 3º Valor : ");
		primeiroTriangulo.valor03 = sc.nextDouble();
		
		double _1p = ((primeiroTriangulo.valor01 + primeiroTriangulo.valor02 + primeiroTriangulo.valor03) / 2.0);
		double _01area = Math.sqrt(_1p * (_1p-primeiroTriangulo.valor01) * (_1p - primeiroTriangulo.valor02) * (_1p - primeiroTriangulo.valor03));

// 		----------------------------------------------------------------------------------------------------		
	
		System.out.println(" \n 2º Triângulo - Insira as medidas : \n");
		
		System.out.print(" 1º Valor : "); 
		segundoTriangulo.valor01 = sc.nextDouble();
		
		System.out.print(" 2º Valor : ");
		segundoTriangulo.valor02 = sc.nextDouble();
		
		System.out.print(" 3º Valor : ");
		segundoTriangulo.valor03 = sc.nextDouble();
		
		double _2p = ((segundoTriangulo.valor01 + segundoTriangulo.valor02 + segundoTriangulo.valor03) / 2.0);
		double _02area = Math.sqrt(_2p * (_2p-segundoTriangulo.valor01) * (_2p - segundoTriangulo.valor02) * (_2p - segundoTriangulo.valor03));

// 		----------------------------------------------------------------------------------------------------	
		
		double maior = a_fechamentoBasico.Funcoes.maiorValor(_01area, _02area);
			
		System.out.printf(" \n Área Total do 1º Triângulo : %.4f",_01area);
		System.out.printf(" \n Área Total do 2º Triângulo : %.4f",Math.abs(_02area), "\n");
		
		System.out.printf(" \n\n A maior Área : %.4f", maior);
		
		sc.close();	
	}
}
