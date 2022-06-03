package br.com.fiap.grupof.bayer.entities;

public class Doenca {
	//atributos
	private int id;
	private String nome;
	private boolean vacina;
	
	//construtores
	public Doenca() {
		super();
	}
	
	public Doenca(int id, String nome, boolean vacina) {
		super();
		this.id = id;
		this.nome = nome;
		this.vacina = vacina;
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
	
	public boolean isVacina() {
		return vacina;
	}
	
	public void setVacina(boolean vacina) {
		this.vacina = vacina;
	}
	
	public boolean existeVacina(boolean vacina) {
		return vacina;
	}
	
	

}
