package br.com.fiap.grupof.bayer.entities;

public class Estado {
	
	//atributos
	private int id;
	private String nome;
	
	//construtores
	public Estado() {
		super();
	}
	
	public Estado(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	//metodos
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
