package basicao.estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class UsandoDebug {

	public static void main(String[] args) {
		
/*      COMO ATIVAR O DEBUG?
		
		> Marque com um BreakPoints a linha ao qual você deseja iniciar o Debug.
		> Botão Direito do Mouse > Debug as > Java Aplicattion 
		> vai mostrar uma linha marcada em verde. 
		> Significa que essa será a próxima linha do debug.
		> Pra ir rodando o debug linha por linha. Tecle f6 ou a função Step Over.
		
		
		Conclusão 
		
		Muito útil em casos onde se deseja entender o que acontece em cada linha.
		Seja pra saber valores existentes em variáveis referente aquela linha;
		Seja pra saber que decisão o programa esta tomando (em casos de condições).

*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf(" AREA = %.2f %n"
				        + " PREÇO = %.2f", area, preco);
		
		sc.close();

	}

}
