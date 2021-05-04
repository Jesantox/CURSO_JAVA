package b_programacaoOrientada_a_Objetos.exercicio.entities;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double imposto;

	public double salarioLiquido() {

		return salarioBruto - imposto;
	}

	public double aumentarSalario( double porcentagem) {

	// DUAS FORMAS
		return salarioBruto += (salarioBruto * porcentagem / 100.0) - imposto;
//		return (porcentagem * (this.salarioBruto) / 100) + (salarioBruto - imposto);
	}
	
	public String imprimir01() {
		
		return " \n" +
			   " Nome : " + nome + "\n" + 
		       " Salário Bruto : " + String.format("%.2f", salarioBruto) + "\n" +
			   " Valor do Imposto : " + String.format("%.2f", imposto) + "\n\n" +
		       " Empregado : " + nome + ", R$ " + String.format("%.2f", salarioLiquido());
	}
	
    public String imprimir02() {
		
		return " \n" +
			   " Nome : " + nome + "\n" + 
		       " Salário Bruto : " + String.format("%.2f", salarioBruto) + "\n" +
			   " Valor do Imposto : " + String.format("%.2f", imposto) + "\n\n" +
		       " Empregado : " + nome + ", R$ " + String.format("%.2f", salarioLiquido());
	}
}
