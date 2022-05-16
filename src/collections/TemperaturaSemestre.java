package collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TemperaturaSemestre {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double soma = 0d;
		List<Meses> mediaTemperaturas = new ArrayList<>(Arrays.asList());
		for (int contador = 0;contador < 6;contador++) {
			System.out.print("Mês " + (contador+1) + ": ");
			double temperaturaMedia = ler.nextDouble();
			soma += temperaturaMedia;
			mediaTemperaturas.add(new Meses(contador,temperaturaMedia));
		}
		double media = soma/6;
		System.out.println("A média de temperatura do semestre foi de " + media + "°C");
		System.out.println("Meses com a temperatura acima da média:");
		for (Meses mes : mediaTemperaturas) {
			if (mes.temperaturaMedia > media) {
				System.out.println(mes.nome + " - " + mes.temperaturaMedia);
			}
		}
	}
}
