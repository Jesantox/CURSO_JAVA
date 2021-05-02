package basicao.estrutura_condicional.atividade;

import java.util.Locale;
import java.util.Scanner;

public class CalcularDescontoPreco {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println(" Olá, tudo bem? Como se chama?");
		String nome = sc.nextLine();

		System.out.println(" Informe o nome do Produto : ");
		String produto = sc.nextLine();
		
		System.out.println(" Informe o valor do Produto : ");
		double valor = sc.nextDouble();

		int desconto;
		double total = 0;

		if (valor >= 50) {

			desconto = 5;
			total = valor - (desconto * valor / 100);

		}

		else if (valor >= 200) {

			desconto = 6;
			total = valor - (desconto * valor / 100);

		}

		else if (valor >= 500) {

			desconto = 7;
			total = valor - (desconto * valor / 100);

		}
		
		else if (valor >= 1000) {

			desconto = 8;
			total = valor - (desconto * valor / 100);

		}

		if(valor < 0)
			System.out.println(" \n Valor inválido! \n Insira um valor acima de 0.");

		else
			System.out.printf(" Olá, %s. Veja sua Nota Fiscal :"
					        + "%n Nome do Produto : %s "
					        + "%n Preço de Produto : R$ %.2f "
					        + "%n Valor com Desconto : R$ %.2f", nome, produto, valor, total);
		sc.close();

	}
}
