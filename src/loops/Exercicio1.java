package loops;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int matricula = 1000;
		int idade;
		int altura;
		while (matricula != 0) {
			System.out.println("Número de matrícula:");
			matricula = ler.nextInt();
			System.out.println("Altura:");
			altura = ler.nextInt();
			System.out.println("Idade:");
			idade = ler.nextInt();
		}
		System.out.println("---PROGRAMA ENCERRADO---");
	}
}
