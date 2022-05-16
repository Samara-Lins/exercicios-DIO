package collections;

import java.util.Scanner;

public class Meses {
	String nome;
	double temperaturaMedia;
	int numeroMes;
	
	public Meses (int mes, double mediaTemperatura) {
		this.numeroMes = mes;
		this.temperaturaMedia = mediaTemperatura;
		setNome(mes);
	}

	public String getNome() {
		return nome;
	} 

	public void setNome(int numeroMes) {
		switch(numeroMes) {
		case 0:
			this.nome = "Janeiro";
			break;
		case 1:
			this.nome = "Fevereiro";
			break;
		case 2:
			this.nome = "Março";
			break;
		case 3:
			this.nome = "Abril";
			break;
		case 4:
			this.nome = "Maio";
			break;
		case 5:
			this.nome = "Junho";
			break;
		default: 
			break;
		}
	}

	public double getTemperaturaMedia() {
		return temperaturaMedia;
	}

	public void setTemperaturaMedia(double temperaturaMedia) {
		this.temperaturaMedia = temperaturaMedia;
	}

	public int getNumeroMes() {
		return numeroMes;
	}

	public void setNumeroMes(int numeroMes) {
		this.numeroMes = numeroMes;
	}
	
	
}
