package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numeros[] = new int[5];
		for (int cont = 0;cont < 5;cont++) {
			System.out.println("Valor para a posição "
					+ "" + (cont+1) + ":");
			numeros[cont] = ler.nextInt();
			int maior = numeros[0];
			int menor = numeros[0];	
		}
		Arrays.sort(numeros);
		for (int valor = 4;valor >= 0;valor--) {
			System.out.print(numeros[valor] + " ");
		}
	}
}
