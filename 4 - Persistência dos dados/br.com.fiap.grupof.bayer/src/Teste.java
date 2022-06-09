import java.sql.SQLException;
import java.text.ParseException;
import br.com.fiap.grupof.bayer.DAO.CasoDAO;
import br.com.fiap.grupof.bayer.entities.Caso;
import br.com.fiap.grupof.bayer.entities.Doenca;
import br.com.fiap.grupof.bayer.entities.Regiao;
import br.com.fiap.grupof.bayer.exceptions.ConnectionException;
import br.com.fiap.grupof.bayer.instances.CasoInstance;

public class Teste {

	public static void main(String[] args) throws ParseException, ConnectionException, SQLException {
		
		// INSTANCIANDO AS DOENÇAS
		Doenca dengue = new Doenca(1);
		Doenca malaria = new Doenca(2);
		Doenca zika = new Doenca(3);
		
		// INSTANCIANDO UM CASO DE DENGUE E REGISTRANDO NO BANCO
		System.out.println("\n ----------- INSERINDO UM CASO DE DOENÇA NO SISTEMA ----------- \n");

		Caso caso = CasoInstance.getCasoInstance(zika);
		CasoDAO casoDAO = new CasoDAO();
		if (casoDAO.insert(caso))
			System.out.println("1 Caso de "+caso.getDoenca().getNome() + " foi cadastrado com sucesso! \n");
		
		System.out.println("----------- LISTANDO O TOTAL DE CASOS DAS DOENÇAS ----------- \n");
		
		// VERIFICANDO A QUANTIDADE DE CASOS DAS DOENÇAS DENGUE, MALÁRIA E ZIKA REGISTRADOS
		System.out.println(casoDAO.getCasosDoenca(dengue) + " casos de "+dengue.getNome());
		System.out.println(casoDAO.getCasosDoenca(malaria) + " casos de "+malaria.getNome());		
		System.out.println(casoDAO.getCasosDoenca(zika) + " casos de "+zika.getNome()+" \n");
				
		// VERIFICANDO A QUANTIDADE DE CASOS POR REGIÃO DO BRASIL
		for (int j = 1; j <= 3; j++) {
			Doenca doenca = new Doenca(j);
			System.out.println("----------- LISTANDO CASOS DE "+doenca.getNome()+" POR REGIÃO ----------- \n");
			for (int i = 1; i <= 5; i++) {
				Regiao regiao = new Regiao(i);
				System.out.println(casoDAO.getDadosPorRegiao(regiao.getId(), doenca.getId()) + 
						" casos de "+doenca.getNome().toUpperCase()+" na região "+regiao.getNome().toUpperCase());
			}
			System.out.println("\n");
		}
	}
}