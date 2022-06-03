package br.com.fiap.grupof.bayer.entities;
import java.util.Date;

public class DataVacinacao {
	
	//atributos
	private Pessoa pessoa;
	private Vacina vacina;
	private Date data;
	
	//construtoress
	public DataVacinacao() {
		super();
	}
	
	public DataVacinacao(Pessoa pessoa, Vacina vacina, Date data) {
		super();
		this.pessoa = pessoa;
		this.vacina = vacina;
		this.data = data;
	}
	
	//metodos
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Vacina getVacina() {
		return vacina;
	}
	public void setVacina(Vacina vacina) {
		this.vacina = vacina;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	

}
