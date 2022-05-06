package loops;
import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int soma = 0, contador = 0, numero, maior = 0;
		do {
			System.out.println("Digite um número:");
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
		System.out.println("O maior número é " + maior);
		System.out.println("A média entre os 5 número é " + media);
	}

}
