package br.com.fiap.grupof.bayer.entities;

public class Sexo {
	
	private int id;
	private String sexo;
	
	public Sexo() {
		super();
	}

	public Sexo(int id, String sexo) {
		this.id = id;
		this.sexo = sexo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}