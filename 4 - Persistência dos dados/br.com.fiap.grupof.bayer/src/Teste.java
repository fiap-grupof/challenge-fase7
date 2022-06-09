import java.sql.SQLException;
import java.text.ParseException;
import br.com.fiap.grupof.bayer.DAO.CasoDAO;
import br.com.fiap.grupof.bayer.DAO.ObitoDAO;
import br.com.fiap.grupof.bayer.entities.Caso;
import br.com.fiap.grupof.bayer.entities.Doenca;
import br.com.fiap.grupof.bayer.entities.Obito;
import br.com.fiap.grupof.bayer.exceptions.ConnectionException;
import br.com.fiap.grupof.bayer.instances.CasosInstance;
import br.com.fiap.grupof.bayer.instances.ObitoInstance;

public class Teste {

	public static void main(String[] args) throws ParseException, ConnectionException, SQLException {
		
		Caso caso = CasosInstance.getCasoInstance();
		Obito obito = ObitoInstance.getObitoInstance();
		

		// INSERIR O CASO DE DENGUE
		CasoDAO casoDAO = new CasoDAO();
		ObitoDAO obitoDAO = new ObitoDAO(); 
		
		try {
			System.out.println("----------- INSERINDO UM CASO DE DOENÇA NO SISTEMA ----------- \n");
			casoDAO.insert(caso);
			System.out.println("1 Caso de "+caso.getDoenca().getNome() + " foi cadastrado com sucesso! \n");
			
			System.out.println("----------- INSERINDO UM CASO DE ÓBITO NO SISTEMA ----------- \n");
			obitoDAO.insert(obito);
			System.out.println("1 óbito de " + obito.getDoenca().getNome() + " foi cadastrado com sucesso! \n");
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("----------- LISTANDO TODOS OS CASOS DE DOENÇAS ----------- \n");
		
		// VERIFICANDO A QUANTIDADE DE CASOS DE DENGUE REGISTRADOS
		System.out.println("Já são "+casoDAO.getDoenca(new Doenca(1, "Dengue", true)) + " casos de Dengue");
		
		// VERIFICANDO A QUANTIDADE DE CASOS DE Malária REGISTRADOS
		System.out.println("Já são "+casoDAO.getDoenca(new Doenca(2, "Malária", true)) + " casos de Malária");
		
		// VERIFICANDO A QUANTIDADE DE CASOS DE Zika REGISTRADOS
		System.out.println("Já são "+casoDAO.getDoenca(new Doenca(3, "Zika", true)) + " casos de Zika \n");
		
		System.out.println("----------- LISTANDO CASOS DE DENGUE POR REGIÃO ----------- \n");
		
		// VERIFICANDO A QUANTIDADE DE CASOS POR REGIÃO DO BRASIL - NORTE
		System.out.println("Já são "+casoDAO.getDadosPorRegiao(1, 1) + " casos de DENGUE na região NORTE");
		
		// VERIFICANDO A QUANTIDADE DE CASOS POR REGIÃO DO BRASIL - NORDESTE
		System.out.println("Já são "+casoDAO.getDadosPorRegiao(2, 1) + " casos de DENGUE na região NORDESTE");
		
		// VERIFICANDO A QUANTIDADE DE CASOS POR REGIÃO DO BRASIL - CENTRO-OESTE
		System.out.println("Já são "+casoDAO.getDadosPorRegiao(3, 1) + " casos de DENGUE na região CENTRO-OESTE");
		
		// VERIFICANDO A QUANTIDADE DE CASOS POR REGIÃO DO BRASIL - SUDESTE
		System.out.println("Já são "+casoDAO.getDadosPorRegiao(4, 1) + " casos de DENGUE na região SUDESTE");
				
		// VERIFICANDO A QUANTIDADE DE CASOS POR REGIÃO DO BRASIL - SUL
		System.out.println("Já são "+casoDAO.getDadosPorRegiao(5, 1) + " casos de DENGUE na região SUL");
	}
}