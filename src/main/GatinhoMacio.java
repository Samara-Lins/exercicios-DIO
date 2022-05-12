package main;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

import model.Gato;

public class GatinhoMacio {
	public static boolean simOuNao(String resposta) {
		if (resposta.compareTo("S") == 0 || resposta.compareTo("N") == 0) {
			return true;
		}
		else {return false;}
	}
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String resposta = "";
		LinkedList<Gato> gatinhos = new LinkedList<>(Arrays.asList());
		System.out.print("Encontrou um novo gatinho? [S/N] ");
		resposta = ler.next();
		while (simOuNao(resposta) == false) {
			System.out.println("Encontrou ou não? [S/N]");
			resposta = ler.next();
		}
		while (resposta.contentEquals("S")) {
			System.out.print("Que nome quer dar a ele? ");
			String nome = ler.next();
			System.out.print("Quantos meses ele tem? ");
			int idade = ler.nextInt();
			if (idade >= 12) {
				int idadeAnos = idade / 12;
				System.out.println(idadeAnos + " anos então");
			}
			System.out.print("De que cor ele é? ");
			String cor = ler.next();
			gatinhos.add(new Gato(nome,cor,idade));
			System.out.println("Adicionado a lista de gatinhos! :3");
			System.out.print("Encontrou um novo gatinho? [S/N] ");
			resposta = ler.next();
			while (simOuNao(resposta) == false) {
				System.out.println("Encontrou ou não? [S/N]");
				resposta = ler.next();
			}
		}
		for (Gato gatinho : gatinhos) {
			System.out.print(gatinho.nome + "\t"
					+ gatinho.cor + "\t");
			if (gatinho.idade >= 12) {
				System.out.println(gatinho.idade/12 + " anos");
			} else {System.out.println(gatinho.idade + " meses");}	
		}
		ler.close();
	}
}
