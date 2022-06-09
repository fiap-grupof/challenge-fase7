package br.com.fiap.grupof.bayer.instances;

import java.text.SimpleDateFormat;
import java.util.Date;
import br.com.fiap.grupof.bayer.entities.Caso;
import br.com.fiap.grupof.bayer.entities.Doenca;
import br.com.fiap.grupof.bayer.entities.Ensino;
import br.com.fiap.grupof.bayer.entities.Local;
import br.com.fiap.grupof.bayer.entities.Sexo;

public class CasoInstance {	
	
	public static Caso getCasoInstance(int idDoenca) {
		Caso caso = new Caso();
		
		try {
			Doenca doenca = DoencaInstance.getDoencaInstance(idDoenca);
			// APENAS PARA TESTE ESTAMOS INSTANCIANDO UM CASO DA DOENÇA QUE SERÁ PASSADA PELA ID COM AS SEGUINTES CARACTERISTICAS
			caso.setSexo(new Sexo(2, "Feminino"));
			caso.setDataNasc((Date) new SimpleDateFormat("dd/MM/yyyy").parse("31/08/1999"));
			caso.setEnsino(new Ensino(2));
			caso.setData(new java.util.Date());
			caso.setLocal(new Local(2900));
			caso.setDoenca(doenca);
			caso.setRenda(2500);
			caso.setVacina(null);
			
			return caso;
		} catch (Exception e) {
			e.getMessage();
		}
		
		return caso;
	}
}
