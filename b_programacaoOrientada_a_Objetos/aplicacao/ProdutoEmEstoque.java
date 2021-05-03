package b_programacaoOrientada_a_Objetos.aplicacao;

import java.util.Locale;
import java.util.Scanner;

import b_programacaoOrientada_a_Objetos.entidade.Produto;

/**
 * 
 * @author <u> <b> Jesantox </b> </u>
 * 
 * <b> ANOTAÇÕES!                               </b> <br> <br>
 * 
 * <i> Toda classe Java é SubClasse da Class Object ;      </i> <br>
 * 
 * 
 * <b> Métodos que que contém na class Object : </b> <br> <br>
 * 
 * <i> getClass -> Retorna o tipo do objeto ;              </i> <br>
 * <i> equals   -> Compara se o objeto é igual ao o outro; </i> <br>
 * <i> hashCode -> Retorna um código hash do objeto        </i> <br>
 * <i> toString -> Converte o objeto para String           </i> <br>
 * 
 * 
 * 
 * 
 * 
 *
 */
public class ProdutoEmEstoque {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.print(" Insira o Nome do Produto : ");
		produto.nome = sc.nextLine();
		
		System.out.print(" Insira o Valor do Produto : ");
		produto.preco = sc.nextDouble();
		
		System.out.print(" Insira a Quantidade de Produtos : ");
		produto.quantidade = sc.nextInt();
		
		// chamei o método que converteu os atributos em String
		// funciona sem chamar tbm, pois na classe Produto tem o método. Converte automaticamente
		// System.out.println(produto); 
		
		System.out.println(produto.toString()); 
		
		//		System.out.println(" Nome : " + produto.nome + "\n" + 
//						   " Valor : " + produto.preco + "\n" + 
//				           " Quantidade : " + produto.quantidade);
		
		System.out.printf(" \n Quantidade de unidades para adicionar ao estoque : ");
		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		
		System.out.println(produto.toString()); 
		
		System.out.printf(" \n Quantidade de unidades para remover do estoque : ");
		quantidade = sc.nextInt();
		produto.removeProduto(quantidade);
		
		System.out.println(produto.toString()); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
