package loops;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		System.out.println("Escolha um número de 1 a 10:");
		numero = ler.nextInt();
		System.out.println("----Tabuada do " + numero + "----");
		for (int contador = 1;contador <= 10;contador++) {
			System.out.println(numero + " x "
					+ "" + contador + " = " + numero*contador);
		}
	} 
}
