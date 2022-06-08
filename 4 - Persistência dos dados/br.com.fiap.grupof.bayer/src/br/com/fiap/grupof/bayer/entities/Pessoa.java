package br.com.fiap.grupof.bayer.entities;
import java.util.Date;
import java.util.ArrayList;

public class Pessoa {
	
	//atributos
	private int id;
	private String nome;
	private String rg;
	private String cpf;
	private double renda;
	private Date dtNasc;
	private Escolaridade escolaridade;
	private Localidade localidade;
	private ArrayList<DataVacinacao> vacinas;
	private ArrayList<Contagio> contagio;
	
	//construtores
	public Pessoa() {
		super();
	}

	public Pessoa(int id, String nome, String rg, String cpf, double renda, Date dtNasc, Escolaridade escolaridade,
			Localidade localidade, ArrayList<DataVacinacao> vacinas, ArrayList<Contagio> contagio) {
		super();
		this.id = id;
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.renda = renda;
		this.dtNasc = dtNasc;
		this.escolaridade = escolaridade;
		this.localidade = localidade;
		this.vacinas = vacinas;
		this.contagio = contagio;
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

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public Date getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(Date dtNasc) {
		this.dtNasc = dtNasc;
	}

	public Escolaridade getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(Escolaridade escolaridade) {
		this.escolaridade = escolaridade;
	}

	public Localidade getLocalidade() {
		return localidade;
	}

	public void setLocalidade(Localidade localidade) {
		this.localidade = localidade;
	}

	public ArrayList<DataVacinacao> getVacinas() {
		return vacinas;
	}

	public void setVacinas(ArrayList<DataVacinacao> vacinas) {
		this.vacinas = vacinas;
	}

	public ArrayList<Contagio> getContagio() {
		return contagio;
	}

	public void setContagio(ArrayList<Contagio> contagio) {
		this.contagio = contagio;
	}
	
	
	
	

}
