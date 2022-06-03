package br.com.fiap.grupof.bayer.entities;

public class Vacina {
	
	//atributos
	private int id;
	private String nome;
	private String laboratorio;
	private Doenca doenca;
	
	//construtores
	public Vacina() {
		super();
	}
	
	public Vacina(int id, String nome, String laboratorio, Doenca doenca) {
		super();
		this.id = id;
		this.nome = nome;
		this.laboratorio = laboratorio;
		this.doenca = doenca;
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
	
	public String getLaboratorio() {
		return laboratorio;
	}
	
	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}
	
	public Doenca getDoenca() {
		return doenca;
	}
	
	public void setDoenca(Doenca doenca) {
		this.doenca = doenca;
	}
	
	

}
