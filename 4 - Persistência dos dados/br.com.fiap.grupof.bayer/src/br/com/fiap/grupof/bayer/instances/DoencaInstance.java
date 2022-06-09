package br.com.fiap.grupof.bayer.instances;

import br.com.fiap.grupof.bayer.entities.Doenca;

public class DoencaInstance {
	public static Doenca getDoencaInstance(int idDoenca) {
		Doenca doenca = new Doenca(idDoenca);
		return doenca;
	}
}
