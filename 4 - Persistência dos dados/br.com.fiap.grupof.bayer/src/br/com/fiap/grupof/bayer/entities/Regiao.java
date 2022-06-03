package br.com.fiap.grupof.bayer.entities;

public class Regiao {

	
	//atributos
	private int id;
	private String nome;
	private double idh;
	
	//construtores
	public Regiao() {
		super();
	}
	
	public Regiao(int id, String nome, double idh) {
		super();
		this.id = id;
		this.nome = nome;
		this.idh = idh;
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
	
	public double getIdh() {
		return idh;
	}
	
	public void setIdh(double idh) {
		this.idh = idh;
	}
	
	
}
