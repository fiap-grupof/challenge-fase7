package br.com.fiap.grupof.bayer.entities;

import java.util.Date;

public abstract class Registro {
	
	private int id;
	private Sexo sexo;
	private Date dataNasc;
	private Ensino ensino;
	private Date dataCaso;
	private Local local;
	private Doenca doenca;
	private double renda;
	private Vacina vacina;
	
	
	public Registro() {
		super();
	}

	public Registro(int id, Sexo sexo, Date dataNasc, Ensino ensino, Date dataCaso, Local local, Doenca doenca, double renda, Vacina vacina) {
		this.id = id;
		this.sexo = sexo;
		this.dataNasc = dataNasc;
		this.ensino = ensino;
		this.dataCaso = dataCaso;
		this.local = local;
		this.doenca = doenca;
		this.renda = renda;
		this.vacina = vacina;
	}

	public boolean registrar() {
		return false;
	}
	
	public boolean editar() {
		return false;
	}
	
	public boolean apagar() {
		return false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public Ensino getEnsino() {
		return ensino;
	}

	public void setEnsino(Ensino ensino) {
		this.ensino = ensino;
	}

	public Date getDataCaso() {
		return dataCaso;
	}

	public void setDataCaso(Date dataCaso) {
		this.dataCaso = dataCaso;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public Doenca getDoenca() {
		return doenca;
	}

	public void setDoenca(Doenca doenca) {
		this.doenca = doenca;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public Vacina getVacina() {
		return vacina;
	}

	public void setVacina(Vacina vacina) {
		this.vacina = vacina;
	}
	
}