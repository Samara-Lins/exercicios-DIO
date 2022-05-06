package condicionais_e_fluxo;

import java.util.Scanner;

public class Meses {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o número do mês:");
		int nm = ler.nextInt();
		switch (nm) {
		case 1:
			System.out.println("O mês é janeiro.");
			break;
		case 2:
			System.out.println("O mês é fevereiro.");
			break;
		case 3:
			System.out.println("O mês é março.");
			break;
		case 4:
			System.out.println("O mês é abril.");
			break;
		case 5:
			System.out.println("O mês é maio.");
			System.out.println("Aniversário da Ester :3");
			break;
		case 6:
			System.out.println("O mês é junho.");
			System.out.println("Faço aniversário! :D");
			break;
		case 7:
			System.out.println("O mês é julho.");
			System.out.println("Aniversário da Malu ^w^");
			break;
		case 8:
			System.out.println("O mês é agosto.");
			break;
		case 9:
			System.out.println("O mês é setembro.");
			break;
		case 10:
			System.out.println("O mês é outubro.");
			break;
		case 11:
			System.out.println("O mês é novembro.");
			break;
		case 12:
			System.out.println("O mês é dezembro.");
			System.out.println("Mês dos sagitários...");
			System.out.println("(Nem acredito em signo mas esse povo deve mesmo ser metade cavalo.)");
			break;
		default:
			System.out.println("Esse mês não existe.");
		}
		if (nm == 1 || nm == 7 || nm == 12) {
			System.out.println("Férias!!");
		} else {
			System.out.println("O trabalho enobrece o homem...");
		}
	}
}
