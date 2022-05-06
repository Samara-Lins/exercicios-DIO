package condicionais_e_fluxo;

import java.util.Scanner;

public class Semana {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Em que dia da semana estamos?");
		String diaDaSemana = ler.nextLine();
		switch (diaDaSemana) {
			case "segunda-feira":
				System.out.println(2);
				System.out.println("Certo!");
				break;
			case "terça-feira":
				System.out.println(3);
				System.out.println("Certo!");
				break;
			case "quarta-feira":
				System.out.println(4);
				System.out.println("Errado!");
				break;
			case "quinta-feira":
				System.out.println(5);
				System.out.println("Talvez...");
				break;
			case "domingo":
				System.out.println(1);
				System.out.println("Certo!");
				break;
			default:
				System.out.println("Valor indefinido.");
				break;
		}
		if (diaDaSemana == "segunda-feira"
				+ "" || diaDaSemana == "terça-feira"
						+ "" || diaDaSemana == "domingo") {
			System.out.println("Você me convenceu.");
		} else if (diaDaSemana == "quarta-feira") {
			System.out.println("Terraplanismo não é uma opinião, é um equívoco.");
		} else if (diaDaSemana == "quinta-feira") {
			System.out.println("Vou ter que ver na minha agenda.");
		} else {
			System.out.println("Pani no sistema alguém me desconfiguro");
		}
	}
}
