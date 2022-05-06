package arrays;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numeros[] = new int[20];
		for (int cont = 0;cont < 20;cont++) {
			System.out.println("Um número entre 1 e 100:");
			numeros[cont] = ler.nextInt();
		}
		for (int pos = 0;pos < 20;pos++) {
			System.out.println((pos+1) + "º número: "
					+ "" + numeros[pos] + "\n"
							+ "Sucessor: " + (numeros[pos]+1));
		}
	}
}
