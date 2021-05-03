package b_programacaoOrientada_a_Objetos.entidade;

/**
 * 
 * @author Jesantox
 *
 *         <b> this --> serve para específicar que me refiro ao ATRIBUTO
 *         quantidade </b>
 *
 */
public class Produto {

	public String nome;
	public double preco;
	public int quantidade;

	public double valorTotal() {

		return (preco * quantidade);

	}

	public void addProduto(int quantidade) {

		this.quantidade += quantidade;

	}

	public void removeProduto(int quantidade) {

		this.quantidade -= quantidade;

	}
	
	/**
	 * Serve para poder exibir os valores dos atributos.
	 * Usei a função de formatação bem simples e útil.
	 * 
	 */
	public String toString() {
		
		return " \n"                     + 
		       " Nome do Produto : "     + nome                         + "\n"            +
			   " Valor do Produto : R$ " + String.format("%.2f", preco) + "\n"            +
			   " Quantidade : "          + quantidade                   + " Unidades \n"  +
			   " Valor Total : R$ "      + String.format("%.2f", valorTotal());
	}

}
