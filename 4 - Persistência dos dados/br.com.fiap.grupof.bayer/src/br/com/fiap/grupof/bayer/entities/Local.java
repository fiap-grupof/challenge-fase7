package br.com.fiap.grupof.bayer.entities;

public class Local {
	
	private Cidade cidade;
	private Regiao regiao;
	private Estado estado;
	private Pais pais;
	
	public Local() {
		super();
	}
	
	public Local(Cidade cidade, Regiao regiao, Estado estado, Pais pais) {
		this.cidade = cidade;
		this.regiao = regiao;
		this.estado = estado;
		this.pais = pais;
	}
	
	public Local(int idCidade) {
		this.cidade = new Cidade();
		this.cidade.setId(idCidade);
	}
	
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
	
	public Pais getPais() {
		return pais;
	}
	
	public void setPais(Pais pais) {
		this.pais = pais;
	}

}