package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Investigacao {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		List<Pessoa> inocentes = new ArrayList<>(Arrays.asList());
		List<Pessoa> suspeitos = new ArrayList<>(Arrays.asList());
		List<Pessoa> cumplices = new ArrayList<>(Arrays.asList());
		List<Pessoa> assassino = new ArrayList<>(Arrays.asList());
		for (int contador = 0;contador < 10;contador++) {
			System.out.print("Seu nome: ");
			String nome = ler.next();
			Pessoa pessoa = new Pessoa(nome,0);
			int pontos = 0;
			System.out.printf("Telefonou para a vítima? [S/N] ");
			String resposta1 = ler.next();
			while (pessoa.simOuNao(resposta1) == false) {
				System.out.println("SIM ou NÃO? [S/N] ");
				resposta1 = ler.next();
			}
			if (resposta1.contentEquals("S")) {
				pontos += 1;
			}
			System.out.print("Esteve no local do crime? [S/N] ");
			String resposta2 = ler.next();
			while (pessoa.simOuNao(resposta2) == false) {
				System.out.println("SIM ou NÃO? [S/N] ");
				resposta2 = ler.next();
			}
			if (resposta2.contentEquals("S")) {
				pontos += 1;
			}
			System.out.print("Mora perto da vítima? [S/N] ");
			String resposta3 = ler.next();
			while (pessoa.simOuNao(resposta3) == false) {
				System.out.println("SIM ou NÃO? [S/N] ");
				resposta3 = ler.next();
			}
			if (resposta3.contentEquals("S")) {
				pontos += 1;
			}
			System.out.print("Devia para a vítima? [S/N] ");
			String resposta4 = ler.next();
			while (pessoa.simOuNao(resposta4) == false) {
				System.out.println("SIM ou NÃO? [S/N] ");
				resposta4 = ler.next();
			}
			if (resposta4.contentEquals("S")) {
				pontos += 1;
			}
			System.out.print("Já trabalhou com a vítima? [S/N] ");
			String resposta5 = ler.next();
			while (pessoa.simOuNao(resposta5) == false) {
				System.out.println("SIM ou NÃO? [S/N] ");
				resposta5 = ler.next();
			}
			if (resposta5.contentEquals("S")) {
				pontos += 1;
			}
			if (pontos <= 1) inocentes.add(pessoa);
			else if (pontos == 2) suspeitos.add(pessoa);
			else if (pontos >= 3 && pontos <= 4) cumplices.add(pessoa);
			else if (pontos == 5) assassino.add(pessoa);
		}
		System.out.println("---SUSPEITOS---");
		for (Pessoa suspeito : suspeitos) {
			System.out.println(suspeito.getNome());
		}
		System.out.println("---CÚMPLICES---");
		for (Pessoa cumplice : cumplices) {
			System.out.println(cumplice.getNome());
		}
		System.out.println("O assassino é:");
		for (Pessoa autor : assassino) {
			System.out.println(autor.getNome());
		}
	}
}
