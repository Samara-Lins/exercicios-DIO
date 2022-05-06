package loops;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Nota:");
		int nota = ler.nextInt();
		while (nota < 0 || nota > 10) {
			System.out.println("Valor inválido, digite novamente:");
			nota = ler.nextInt();
		}
	}
}
