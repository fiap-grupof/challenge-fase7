package br.com.fiap.grupof.bayer.entities;

public class Ensino {
	
	private int id;
	private String nome;
	
	public Ensino() {
		super();
	}
	
	public Ensino(int id) {
		this.id = id;
	}
	
	public Ensino(int id, String nome) {
		this.id = id;
		this.nome = nome;
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

}