package basicao.estrutura_condicional.atividade;

import java.util.Locale;
import java.util.Scanner;

public class ImpostoTransmissaoDeBensMoveis {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Olá, tudo bem? Como se chama?");
		String nome  = sc.nextLine();
		
		System.out.println(" Prazer, " + nome + ".");
		
		System.out.println(" Insira o valor da Transação : ");
		double transacao= sc.nextDouble();
		
		System.out.println(" Insira o custo do valorVenal : ");
		double valorVenal = sc.nextDouble();
		
		int porcentagemValor = 0;
		double porcentagemCalculo = 0;
		double valorFinal = 0;
		String simbolo = "%";
		
		if(transacao > valorVenal) {
			System.out.println(" Informe o Percentual : ");
			porcentagemValor = sc.nextInt();
			porcentagemCalculo = (transacao * porcentagemValor) / 100;
			valorFinal = transacao - porcentagemCalculo;
		}
		
		else {
			System.out.println(" Informe o Percentual : ");
			porcentagemValor = sc.nextInt();
			porcentagemCalculo = (valorVenal * porcentagemValor) / 100;
			valorFinal = valorVenal - porcentagemCalculo;
		}
		
		System.out.printf(" %n Olá, %s. "
				        + " %n Segue abaixo as análises. "
				        + " %n Valor Percentual : %d%s " 
				        + " %n Valor do Desconto : R$ %.2f" 
				        + " %n Imposto Final : R$ %.2f", nome, porcentagemValor, simbolo, porcentagemCalculo, valorFinal);
		
		sc.close();

	}

}
