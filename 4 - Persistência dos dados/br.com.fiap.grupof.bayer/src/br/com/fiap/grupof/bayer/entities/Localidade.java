package br.com.fiap.grupof.bayer.entities;

public class Localidade {
	
	//atributos
	private Cidade cidade;
	private Regiao regiao;
	private Estado estado;
	private String pais;
	
	//construtores
	public Localidade() {
		super();
	}
	
	public Localidade(Cidade cidade, Regiao regiao, Estado estado, String pais) {
		super();
		this.cidade = cidade;
		this.regiao = regiao;
		this.estado = estado;
		this.pais = pais;
	}
	
	//metodos
	public Cidade getCidade() {
		return cidade;
	}
	
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	public Regiao getRegiao() {
		return regiao;
	}
	
	public void setRegiao(Regiao regiao) {
		this.regiao = regiao;
	}
	
	public Estado getEstado() {
		return estado;
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	

}
