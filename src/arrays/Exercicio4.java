package arrays;

public class Exercicio4 {
	public static void main(String[] args) {
		double matriz[][] = new double[4][4];
		double maior = 0.0, menor = 0.0;
		for (int linha = 0;linha < 4;linha++) {
			for (int coluna = 0;coluna < 4;coluna++) {
				matriz[linha][coluna] = Math.floor(Math.random() * 8)+1;
			}
		}
		for (int l = 0;l < 4;l++) {
			for (int c = 0;c < 4;c++) {
				System.out.print("["+matriz[l][c]+"]" + "\t");
				if (l == 0 && c == 0) {
					maior = matriz[l][c];
					menor = matriz[l][c];
				} else {
					if (matriz[l][c] > maior) {
						maior = matriz[l][c];
					}
					if (matriz[l][c] < menor) {
						menor = matriz[l][c];
					}
				}
			}
			System.out.println();
		}
		System.out.println("O maior número da matriz é "+maior);
		System.out.println("O menor número da matriz é "+menor);
	}
}
