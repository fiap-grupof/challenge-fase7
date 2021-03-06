package br.com.fiap.grupof.bayer.entities;

public class Cidade {
	
	private int id;
	private String nome;
	private int agentes;
	
	public Cidade() {
		super();
	}

	public Cidade(int id, String nome, int agentes) {
		this.id = id;
		this.nome = nome;
		this.agentes = agentes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAgentes() {
		return agentes;
	}

	public void setAgentes(int agentes) {
		this.agentes = agentes;
	}
	
}