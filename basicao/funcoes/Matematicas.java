package basicao.funcoes;

import java.text.DecimalFormat;
import java.util.Locale;

/**
 * 
 * @author Jesantox
 * 
 *         Arredondar Próximo; 
 *         Arredondar Anterior; 
 *         Valor Mínimo;
 *         Valor Máximo;
 *         Raiz Quadrada;
 *         Potência;
 *         Números Aleatórios;
 *         Formatar Números;
 *         Usando o Locale;
 * 
 */
public class Matematicas {

	public static void main(String[] args) {

		DecimalFormat df01 = new DecimalFormat();
		df01.applyPattern(" 00.00");

		DecimalFormat df02 = new DecimalFormat();
		df02.applyPattern("00.00");

		// ARREDONDAR PRÓXIMO

		double a = 5.2, b = 5.6, c = -5.8;

		if (a < 0) {
			System.out.println(" ARREDONDAR PRÓXIMO ");
			System.out.println(" \n Arredondando  5.2 = " + df02.format(Math.ceil(a)));
			System.out.println(" Arredondando  5.6 = " + df01.format(Math.ceil(b)));
			System.out.println(" Arredondando -5.8 = " + df01.format(Math.ceil(c)) + "\n");
		}

		else if (b < 0) {
			System.out.println(" ARREDONDAR PRÓXIMO ");
			System.out.println(" \n Arredondando  5.2 = " + df01.format(Math.ceil(a)));
			System.out.println(" Arredondando  5.6 = " + df02.format(Math.ceil(b)));
			System.out.println(" Arredondando -5.8 = " + df01.format(Math.ceil(c)) + "\n");
		}

		else {
			System.out.println(" ARREDONDAR PRÓXIMO ");
			System.out.println(" \n Arredondando  5.2 = " + df01.format(Math.ceil(a)));
			System.out.println(" Arredondando  5.6 = " + df01.format(Math.ceil(b)));
			System.out.println(" Arredondando -5.8 = " + df02.format(Math.ceil(c)) + "\n");
		}
//----------------------------------------------------------------------------------------------------------

//      ARREDONDAR ANTERIOR

		double d = 5.2, e = 5.6, f = -5.8;

		if (d < 0) {
			System.out.println(" ARREDONDAR ANTERIOR ");
			System.out.println(" \n Arredondando  5.2 = " + df02.format(Math.ceil(d)));
			System.out.println(" Arredondando  5.6 = " + df01.format(Math.ceil(e)));
			System.out.println(" Arredondando -5.8 = " + df01.format(Math.ceil(f)) + "\n");
		}

		else if (e < 0) {
			System.out.println(" ARREDONDAR ANTERIOR ");
			System.out.println(" \n Arredondando  5.2 = " + df01.format(Math.ceil(d)));
			System.out.println(" Arredondando  5.6 = " + df02.format(Math.ceil(e)));
			System.out.println(" Arredondando -5.8 = " + df01.format(Math.ceil(f)) + "\n");
		}

		else {
			System.out.println(" ARREDONDAR ANTERIOR ");
			System.out.println(" \n Arredondando  5.2 = " + df01.format(Math.ceil(d)));
			System.out.println(" Arredondando  5.6 = " + df01.format(Math.ceil(e)));
			System.out.println(" Arredondando -5.8 = " + df02.format(Math.ceil(f)) + "\n");
		}

//----------------------------------------------------------------------------------------------------------

//	    VALOR MÍNIMO 

		int g = 10, h = 15;
		double i = -5.9, j = -4.5;

		System.out.println(" VALOR MÍNIMO \n ");

		System.out.println(" O menor entre 10   e  15     = " + df02.format(Math.min(g, h)));
		System.out.println(" O menor entre -5.9 e -4.5    = " + df02.format(Math.min(i, j)));
		System.out.println(" O menor entre 10   e -5.9    = " + df02.format(Math.min(a, i)) + "\n");

//----------------------------------------------------------------------------------------------------------

//	    VALOR MÁXIMO 

		int k = 10, l = 15;
		double m = -5.9, n = -4.5;

		System.out.println(" VALOR MÁXIMO \n ");

		System.out.println(" O maior entre 10   e  15     = " + df02.format(Math.max(k, l)));
		System.out.println(" O maior entre -5.9 e -4.5    = " + df02.format(Math.max(m, n)));
		System.out.println(" O maior entre 10   e -5.9    = " + df02.format(Math.max(k, m)) + "\n");

//----------------------------------------------------------------------------------------------------------

//		RAIZ QUADRADA

		double o = 900, p = 30.25;

		System.out.println(" RAIZ QUADRADA : ");
		System.out.println(" A raiz quadrada de 900   = " + Math.sqrt(o));
		System.out.println(" A raiz quadrada de 30.25 = " + Math.sqrt(p) + "\n");

//----------------------------------------------------------------------------------------------------------

//		POTENCIA 

		double base = 5.5, potencia = 2;

		System.out.println(" POTÊNCIA : \n");
		System.out.println(" 5.5  elevado a 2   = " + Math.pow(base, potencia));
		System.out.println(" 25   elevado a 0.5 = " + Math.pow(25, .5));
		System.out.println(" 5678 elevado a 0   = " + Math.pow(5678, 0) + "\n");

//----------------------------------------------------------------------------------------------------------

//		NUMÉROS ALEATÓRIOS 

		System.out.println(" NÚMEROS ALEATÓRIOS : \n");

		for (int qtd = 1; qtd <= 5; qtd++) { // 5 LINHAS
			for (int x = 1; x <= 6; x++) { // 6 COLUNAS
				int num = (int) (Math.random() * 100);
				System.out.print(" " + num + " ");
			}
			System.out.println(" \n");
		}

//----------------------------------------------------------------------------------------------------------

//		FORMATAR NÚMEROS

		System.out.println(" FORMATAR NÚMEROS : \n ");
		DecimalFormat df = new DecimalFormat(); // importei a função de formatação

		short idade = 38;
		df.applyPattern("000");
		System.out.println(" Idade : " + df.format(idade));

		int quantidade = 9750;
		df.applyPattern("#0,000");
		System.out.println(" Quantidade : " + df.format(quantidade));

		long estoque = 198564;
		df.applyPattern("#,##0,000");
		System.out.println(" Estoque : " + df.format(estoque));

		float altura = 1.74f;
		df.applyPattern("#0.00");
		System.out.println(" Altura : " + df.format(altura));

		double peso = 70.25;
		df.applyPattern("#0.00");
		System.out.println(" Peso : " + df.format(peso));

		double valorEmReais = 2583.75;
		df.applyPattern("R$ #,##0.00");
		System.out.println(" Valor em Reais: " + df.format((valorEmReais)) + "\n");

//----------------------------------------------------------------------------------------------------------

//	    USANDO O LOCALE  

		DecimalFormat df03 = new DecimalFormat();
		Locale local = Locale.getDefault();

		System.out.println(" USANDO O LOCALE \n\n Configuracoes do Sistema Operacional:");
		System.out.println(" Sigla: " + local.getCountry());
		System.out.println(" Pais: " + local.getDisplayCountry());
		System.out.println(" Idioma: " + local.getDisplayLanguage());
		System.out.println(" Teclado: " + local.getDisplayName() + "\n");

		double valor = 1370.25;
		if (local.getCountry().equals("BR")) {
			df03.applyPattern("R$ #,##0.00");
		}
		System.out.println(" valor: " + df.format(valor));

	}
}
