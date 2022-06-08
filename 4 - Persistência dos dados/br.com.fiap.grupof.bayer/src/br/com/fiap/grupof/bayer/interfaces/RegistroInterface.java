package br.com.fiap.grupof.bayer.interfaces;

import br.com.fiap.grupof.bayer.entities.Cidade;
import br.com.fiap.grupof.bayer.entities.Doenca;
import br.com.fiap.grupof.bayer.entities.Ensino;
import br.com.fiap.grupof.bayer.entities.Estado;
import br.com.fiap.grupof.bayer.entities.Pais;
import br.com.fiap.grupof.bayer.entities.Regiao;
import br.com.fiap.grupof.bayer.entities.Sexo;

public interface RegistroInterface {

	public int quantidade(Pais pais);
	public int quantidade(Regiao regiao);
	public int quantidade(Estado estado);
	public int quantidade(Cidade cidade);
	public int quantidade(Sexo sexo);
	public int quantidade(Ensino ensino);
	public int quantidade(Doenca doenca);
	
}