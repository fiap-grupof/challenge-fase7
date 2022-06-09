package br.com.fiap.grupof.bayer.entities;

public class Doenca {
	
	private int id;
	private String nome;
	private boolean vacina;
	

	public Doenca() {
		super();
	}
	
	public Doenca(int id) {
		this.id = id;
		// Só como EXEMPLO estamos colocando os nomes por aqui mas serão carregados do banco através de suas ids
		if (id == 1) this.nome = "Dengue";
		else if (id == 2) this.nome = "Malária";
		else if (id == 3) this.nome = "Zika";
		this.vacina = true;
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