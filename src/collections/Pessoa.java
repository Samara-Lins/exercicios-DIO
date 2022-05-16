package collections;

public class Pessoa {
	 
	private String nome;
	public int pontos;
	
	public Pessoa(String nome, int pontos) {
		this.nome = nome;
		this.pontos = pontos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	public boolean simOuNao(String resposta) {
		if (resposta.contentEquals("S") || resposta.contentEquals("N")) {
			return true;
		} else {return false;}
	}
	
	public void clear(Pessoa pessoa) {
		this.setNome(null);
		this.setPontos(0);
	}
}
