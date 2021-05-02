package b_programacaoOrientada_a_Objetos;

import java.util.Locale;
import java.util.Scanner;

import a_fechamentoBasico.Funcoes;

/**
  @author <u> Jesantox </u> <br>
  
  <h1> <u> Enunciado </u> </h1>
  
  <p>    
         Fazer um programa para ler as medidas dos lados de dois triângulos X e Y <br>
         (suponha medidas válidas). Em seguida, <b> <i> mostrar o valor das áreas </i> </b> dos dois triângulos <br>
         e dizer <b> <i> qual dos dois triângulos possui a maior área </i> </b>. <br> <br>
         
         A fórmula para calcular a área de um triângulo a partir das medidas <br> 
         de seus lados a, b e c é a seguinte (<b> fórmula de Heron </b>): <br> <br>
         
         <u> ÁREA </u> <br> <br>
         
         <b> 1º Fórmula (p)       --> ((a + b + c) / 2)  --> Valor do P </b> <br>
         <b> 2º Fórmula (area)    --> raiz quadrada de(p * ( p - a ) * ( p - b ) * (p - c)) </b>     
  </p> 
 *
 */
public class DesafioInicial {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" 1º Triângulo - Insira as medidas : \n");
		
		System.out.print(" 1º Valor : "); 
		double _01valor = sc.nextDouble();
		
		System.out.print(" 2º Valor : ");
		double _02valor = sc.nextDouble();
		
		System.out.print(" 3º Valor : ");
		double _03valor = sc.nextDouble();
		
		double _1p = ((_01valor + _02valor + _03valor) / 2.0);
		double _01area = Math.sqrt(_1p * (_1p-_01valor) * (_1p - _02valor) * (_1p - _03valor));

// 		----------------------------------------------------------------------------------------------------		
	
		System.out.println(" \n 2º Triângulo - Insira as medidas : \n");
		
		System.out.print(" 1º Valor : "); 
		double _04valor = sc.nextDouble();
		
		System.out.print(" 2º Valor : ");
		double _05valor = sc.nextDouble();
		
		System.out.print(" 3º Valor : ");
		double _06valor = sc.nextDouble();
		
		double _2p = ((_04valor + _05valor + _06valor) / 2.0);
		double _02area = Math.sqrt(_2p * (_2p-_04valor) * (_2p - _05valor) * (_2p - _06valor));

// 		----------------------------------------------------------------------------------------------------	
		
		double maior = Funcoes.maiorValor(_01area, _02area);
			
		System.out.printf(" \n Área Total do 1º Triângulo : %.4f",_01area);
		System.out.printf(" \n Área Total do 2º Triângulo : %.4f",Math.abs(_02area), "\n");
		
		System.out.printf(" \n\n A maior Área : %.4f", maior);
		
		sc.close();	
	}
}
