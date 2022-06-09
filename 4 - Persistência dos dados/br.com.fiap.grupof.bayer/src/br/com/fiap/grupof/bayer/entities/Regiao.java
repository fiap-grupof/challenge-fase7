package br.com.fiap.grupof.bayer.entities;

public class Regiao {

	private int id;
	private String nome;
	
	public Regiao() {
		super();
	}
	
	public Regiao(int id) {
		this.id = id;		
		// Só como EXEMPLO estamos colocando os nomes por aqui mas serão carregados do banco através de suas ids
		if (id == 1) this.nome = "Norte";
		else if (id == 2) this.nome = "Nordeste";
		else if (id == 3) this.nome = "Centro-Oeste";
		else if (id == 4) this.nome = "Suldeste";
		else if (id == 5) this.nome = "Sul";
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