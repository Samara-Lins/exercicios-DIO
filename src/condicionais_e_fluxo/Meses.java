package condicionais_e_fluxo;

import java.util.Scanner;

public class Meses {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o n�mero do m�s:");
		int nm = ler.nextInt();
		switch (nm) {
		case 1:
			System.out.println("O m�s � janeiro.");
			break;
		case 2:
			System.out.println("O m�s � fevereiro.");
			break;
		case 3:
			System.out.println("O m�s � mar�o.");
			break;
		case 4:
			System.out.println("O m�s � abril.");
			break;
		case 5:
			System.out.println("O m�s � maio.");
			System.out.println("Anivers�rio da Ester :3");
			break;
		case 6:
			System.out.println("O m�s � junho.");
			System.out.println("Fa�o anivers�rio! :D");
			break;
		case 7:
			System.out.println("O m�s � julho.");
			System.out.println("Anivers�rio da Malu ^w^");
			break;
		case 8:
			System.out.println("O m�s � agosto.");
			break;
		case 9:
			System.out.println("O m�s � setembro.");
			break;
		case 10:
			System.out.println("O m�s � outubro.");
			break;
		case 11:
			System.out.println("O m�s � novembro.");
			break;
		case 12:
			System.out.println("O m�s � dezembro.");
			System.out.println("M�s dos sagit�rios...");
			System.out.println("(Nem acredito em signo mas esse povo deve mesmo ser metade cavalo.)");
			break;
		default:
			System.out.println("Esse m�s n�o existe.");
		}
		if (nm == 1 || nm == 7 || nm == 12) {
			System.out.println("F�rias!!");
		} else {
			System.out.println("O trabalho enobrece o homem...");
		}
	}
}
