package loops;
import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int soma = 0, contador = 0, numero, maior = 0;
		do {
			System.out.println("Digite um n�mero:");
			numero = ler.nextInt();
			soma += numero;
			if (contador == 0) {
				maior = numero;
			} else {
				if (numero > maior) {
					maior = numero;
				}
			}
			contador++;
		} while (contador < 5);
		int media = soma/5;
		System.out.println("O maior n�mero � " + maior);
		System.out.println("A m�dia entre os 5 n�mero � " + media);
	}

}
