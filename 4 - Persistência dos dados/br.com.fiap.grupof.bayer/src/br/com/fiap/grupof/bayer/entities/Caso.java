package br.com.fiap.grupof.bayer.entities;

public class Caso {
	
	//atributos
	private Doenca doenca;

	//construtores
	public Caso(Doenca doenca) {
		super();
		this.doenca = doenca;
	}

	public Caso() {
		super();
	}
	
	//metodos
	public Doenca getDoenca() {
		return doenca;
	}

	public void setDoenca(Doenca doenca) {
		this.doenca = doenca;
	}

	public Regiao quantidadeCasos(Regiao regiao) {
		return regiao;
	}
	
	public Estado quantidadeCasos(Estado estado) {
		return estado;
	}
	
	public Cidade quantidadeCasos(Cidade cidade) {
		return cidade;
	}

}
