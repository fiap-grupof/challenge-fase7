package br.com.fiap.grupof.bayer.instances;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.fiap.grupof.bayer.entities.Doenca;
import br.com.fiap.grupof.bayer.entities.Ensino;
import br.com.fiap.grupof.bayer.entities.Local;
import br.com.fiap.grupof.bayer.entities.Obito;
import br.com.fiap.grupof.bayer.entities.Sexo;

public class ObitoInstance {
	public static Obito getObitoInstance(int idDoenca) {
		Doenca doenca = DoencaInstance.getDoencaInstance(idDoenca);
		Obito obito = new Obito();
		
		try {
			// APENAS PARA TESTE ESTAMOS INSTANCIANDO UM CASO DE ÓBITO COM AS SEGUINTES CARACTERISTICAS
			obito.setSexo(new Sexo(2, "Feminino"));
			obito.setDataNasc((Date) new SimpleDateFormat("dd/MM/yyyy").parse("31/08/1999"));
			obito.setEnsino(new Ensino(2));
			obito.setData(new java.util.Date());
			obito.setLocal(new Local(2900));
			obito.setDoenca(doenca);
			obito.setRenda(2500);
			obito.setVacina(null);
		} catch (Exception e) {
			e.getMessage();
		}
		
		return obito;
	}
}