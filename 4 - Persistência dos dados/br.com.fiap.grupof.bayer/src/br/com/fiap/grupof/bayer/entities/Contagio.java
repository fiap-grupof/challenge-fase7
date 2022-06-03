package br.com.fiap.grupof.bayer.entities;
import java.util.Date;


public class Contagio {

	//atributos
	private Pessoa pessoa;
	private Doenca doenca;
	private boolean letalidade;
	private Date data;
	
	//construtores
	
	public Contagio() {
		super();
	}
	
	public Contagio(Pessoa pessoa, Doenca doenca, boolean letalidade, Date data) {
		super();
		this.pessoa = pessoa;
		this.doenca = doenca;
		this.letalidade = letalidade;
		this.data = data;
	}
	
	//metodos
	public Pessoa getPessoa() {
		return pessoa;
	}
	
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public Doenca getDoenca() {
		return doenca;
	}
	
	public void setDoenca(Doenca doenca) {
		this.doenca = doenca;
	}
	
	public boolean isLetalidade() {
		return letalidade;
	}
	
	public void setLetalidade(boolean letalidade) {
		this.letalidade = letalidade;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public void contagem() {
		return;
	}
	
		
}
