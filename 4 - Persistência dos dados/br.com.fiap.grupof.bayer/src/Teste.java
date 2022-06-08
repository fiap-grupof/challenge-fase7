import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import br.com.fiap.grupof.bayer.DAO.PessoaDAO;
import br.com.fiap.grupof.bayer.entities.Cidade;
import br.com.fiap.grupof.bayer.entities.Contagio;
import br.com.fiap.grupof.bayer.entities.Doenca;
import br.com.fiap.grupof.bayer.entities.Escolaridade;
import br.com.fiap.grupof.bayer.entities.Localidade;
import br.com.fiap.grupof.bayer.entities.Pessoa;

public class Teste {

	public static void main(String[] args) throws ParseException {
	
		// CIDADE
		Cidade cidade = new Cidade();
		cidade.setId(5270);
		
		// LOCALIDADE
		Localidade localidade = new Localidade();
		
		localidade.setCidade(cidade);
		
		// ESCOLARIDADE
		Escolaridade escolaridade = new Escolaridade();
		escolaridade.setId(2);
		
		// DOENCA
		Doenca doenca = new Doenca();
		doenca.setId(1);
		
		// CONTAGIO
		Contagio contagio = new Contagio();
		contagio.setData((Date) new SimpleDateFormat("dd/MM/yyyy").parse("05/06/2022"));
		contagio.setDoenca(doenca);
		
		// PESSOA
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("MARIA JOSÉ");
		pessoa.setLocalidade(localidade);
		pessoa.setEscolaridade(escolaridade);
		pessoa.setRenda(1250);
		pessoa.setRg("336547890");
		pessoa.setCpf("98765432101");
		pessoa.setDtNasc((Date) new SimpleDateFormat("dd/MM/yyyy").parse("15/02/1999"));

		// TESTE DE INSERT
		PessoaDAO pessoaDAO = new PessoaDAO();
		try {
			pessoaDAO.insert(pessoa);
			System.out.println(pessoa.getNome() + " Cadastrada com sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(pessoa.getNome() + "Erro na query");
		}	
	}
}