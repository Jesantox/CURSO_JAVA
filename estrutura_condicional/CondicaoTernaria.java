package estrutura_condicional;

public class CondicaoTernaria {

	public static void main(String[] args) {
		
//	    A estrutura Condicional Ternária normalmente se usa dentro de variáveis.
				
/*      Estrutura Condicional em If/else
 
		double preco = 34.5;
		double desconto;
		
		if(preco < 20.0) {
			desconto = preco * 0.1;
		}
		else {
			desconto = preco * 0.05;
		}
		
		System.out.println(desconto);
*/
		
//	    Estrutura Condicional Ternária
		
		double preco = 34.5;
		double desconto = (preco < 20.0)? preco * 0.1 : preco * 0.05;

		System.out.println(desconto);
	}

}
