package br.com.fiap.grupof.bayer.entities;

import br.com.fiap.grupof.bayer.interfaces.RegistroInterface;

public class Obito extends Registro implements RegistroInterface {

	@Override
	public int quantidade(Pais pais) {
		return 0;
	}

	@Override
	public int quantidade(Regiao regiao) {
		return 0;
	}

	@Override
	public int quantidade(Estado estado) {
		return 0;
	}

	@Override
	public int quantidade(Cidade cidade) {
		return 0;
	}

	@Override
	public int quantidade(Sexo sexo) {
		return 0;
	}

	@Override
	public int quantidade(Ensino ensino) {
		return 0;
	}

	@Override
	public int quantidade(Doenca doenca) {
		return 0;
	}

}