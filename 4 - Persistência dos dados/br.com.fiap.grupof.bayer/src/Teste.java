import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import br.com.fiap.grupof.bayer.DAO.CasoDAO;
import br.com.fiap.grupof.bayer.entities.Caso;
import br.com.fiap.grupof.bayer.entities.Doenca;
import br.com.fiap.grupof.bayer.entities.Ensino;
import br.com.fiap.grupof.bayer.entities.Local;
import br.com.fiap.grupof.bayer.entities.Sexo;
import br.com.fiap.grupof.bayer.entities.Vacina;
import br.com.fiap.grupof.bayer.exceptions.ConnectionException;

public class Teste {

	public static void main(String[] args) throws ParseException, ConnectionException, SQLException {
		
		// DOENCA DENGUE
		Doenca doenca = new Doenca(3, "Zyka", true);
		
		// CASO DE DENGUE
		Caso caso = new Caso();
		caso.setSexo(new Sexo(1, "Masculino"));
		caso.setDataNasc((Date) new SimpleDateFormat("dd/MM/yyyy").parse("29/09/1989"));
		caso.setEnsino(new Ensino(3));
		caso.setDataCaso(new java.util.Date());
		caso.setLocal(new Local(5270));
		caso.setDoenca(doenca);
		caso.setRenda(1250);
		caso.setVacina(new Vacina(1));

		// INSERIR O CASO DE DENGUE
		CasoDAO casoDAO = new CasoDAO();
		try {
		
			if (casoDAO.insert(caso)) 
				System.out.println("1 Caso de "+caso.getDoenca().getNome() + " foi cadastrado com sucesso!");
			else 
				System.out.println("Não foi possível registrar o caso!");
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// VERIFICANDO A QUANTIDADE DE CASOS DE DENGUE REGISTRADOS
		System.out.println("Já são "+casoDAO.getDoenca(doenca) + " casos de "+doenca.getNome());
	}
}