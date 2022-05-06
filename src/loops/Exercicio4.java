package loops;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero = 0, totalPares = 0, totalImpares = 0;
		while (numero != 999) {
			System.out.println("Digite um número:");
			numero = ler.nextInt();
			if (numero == 999) {
				break;
			}
			if (numero % 2 == 0) {
				totalPares += 1;
			} else {
				totalImpares += 1;
			}
		}
		System.out.println("Foram digitados " + totalPares + ""
				+ " números pares e " + totalImpares + " "
						+ "números Ímpares.");
	}
}
