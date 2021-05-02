package basicao.estrutura_condicional.atividade;

import java.util.Scanner;

public class MonitorarFaixaEtaria {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(" Olá, tudo bem? Como se chama? ");
		String nome = sc.nextLine();

		System.out.println(" Olá, " + nome + ". \n Você tem quantos anos?");
		int idade = sc.nextInt();

		if (idade >= 0 && idade <= 3)
			System.out.printf("%n Olá, %s. %n Você tem %d anos. Ou seja, um Bebê. ", nome, idade);

		else if (idade > 3 && idade <= 12)
			System.out.printf("%n Olá, %s. %n Você tem %d anos. Ou seja, uma Criança. ", nome, idade);

		else if (idade > 12 && idade <= 18)
			System.out.printf("%n Olá, %s. %n Você tem %d anos. Ou seja, um Adolescente. ", nome, idade);

		else if (idade > 18 && idade <= 70)
			System.out.printf("%n Olá, %s. %n Você tem %d anos. Ou seja, um Adulto. ", nome, idade);

		else if (idade > 70 && idade <= 120)
			System.out.printf("%n Olá, %s. %n Você tem %d anos. Ou seja, está na Terceira Idade. ", nome, idade);

		else if (idade > 120)
			System.out.printf("%n Olá, %s. %n Você tem %d anos. Parabens por viver tanto :O ", nome, idade);

		sc.close();

	}

}
