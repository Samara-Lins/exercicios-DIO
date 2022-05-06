package loops;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, fatorial = 1;
		System.out.println("Digite um número:");
		numero = ler.nextInt();
		for (int contador = numero;contador >= 1;contador--) {
			fatorial *= contador;
		}
		System.out.println(numero + "! = " + fatorial);
	}
}
