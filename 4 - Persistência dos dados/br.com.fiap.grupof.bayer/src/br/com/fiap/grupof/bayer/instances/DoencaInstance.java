package br.com.fiap.grupof.bayer.instances;

import br.com.fiap.grupof.bayer.entities.Doenca;

public class DoencaInstance {
	public static Doenca getDoencaInstance() {
		Doenca doenca = new Doenca(1, "Dengue", true);
		
		return doenca;
	}
}
