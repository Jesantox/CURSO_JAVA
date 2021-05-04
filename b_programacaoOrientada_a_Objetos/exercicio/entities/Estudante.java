package b_programacaoOrientada_a_Objetos.exercicio.entities;

public class Estudante {
	
	public String nome;
	public double nota01;
	public double nota02;
	public double nota03;
	
	public void notaFinal() {
		
		double conta = nota01 + nota02 + nota03;
		double restante = 60 - conta;
		
		if(conta > 60.00) {
			System.out.println("\n FINAL GRADE : " + String.format("%.2f", conta) + "\n " + nome + " - " +
		                       " PASS");
		} else {
			System.out.println("\n FINAL GRADE : " + String.format("%.2f", conta) + "\n " + nome + " - " +
                               " FAILED" + "\n"  +
					           " MISSING : "     + String.format("%.2f", restante) + " PONTOS");	
		}	
	}
}
