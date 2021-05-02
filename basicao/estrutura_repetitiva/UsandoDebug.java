package basicao.estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class UsandoDebug {

	public static void main(String[] args) {
		
/*      COMO ATIVAR O DEBUG?
		
		> Marque com um BreakPoints a linha ao qual voc� deseja iniciar o Debug.
		> Bot�o Direito do Mouse > Debug as > Java Aplicattion 
		> vai mostrar uma linha marcada em verde. 
		> Significa que essa ser� a pr�xima linha do debug.
		> Pra ir rodando o debug linha por linha. Tecle f6 ou a fun��o Step Over.
		
		
		Conclus�o 
		
		Muito �til em casos onde se deseja entender o que acontece em cada linha.
		Seja pra saber valores existentes em vari�veis referente aquela linha;
		Seja pra saber que decis�o o programa esta tomando (em casos de condi��es).

*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf(" AREA = %.2f %n"
				        + " PRE�O = %.2f", area, preco);
		
		sc.close();

	}

}
