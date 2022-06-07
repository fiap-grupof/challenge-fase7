package br.com.fiap.grupof.bayer.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;
import br.com.fiap.grupof.bayer.DAO.ConnectionManager;
import br.com.fiap.grupof.bayer.exceptions.ConnectionException;
import br.com.fiap.grupof.bayer.exceptions.DataNotFoundException;

public interface RegistroDAOInterface <TipoRegistro> {
	
	ConnectionManager dao = ConnectionManager.getInstance();
	

	/**
	 * 	/**
	 * Insere um novo registro
	 * @param registro é um parâmetro do tipo Registro
	 * @return boolean true or false confirmando se o registro foi inserido
	 * @throws DataNotFoundException Dado não encontrado no banco de dados
	 * @throws ConnectionException Problema com a conexão ao banco de dados
	 * @throws SQLException erro no acesso do banco de dados ou outros erros
	 */
	boolean insert(TipoRegistro registro) throws ConnectionException, DataNotFoundException, SQLException;
	
	/**
	 * Atualiza um registro
	 * @param registro é um parâmetro do tipo Registro
	 * @return boolean true or false confirmando se o registro foi atualizado
	 * @throws DataNotFoundException Dado não encontrado no banco de dados
	 * @throws ConnectionException Problema com a conexão ao banco de dados
	 * @throws SQLException erro no acesso do banco de dados ou outros erros
	 */
	boolean update(TipoRegistro registro) throws ConnectionException, DataNotFoundException, SQLException;
	
	/**
	 * Apaga um registro
	 * @param registro é um parâmetro do tipo Registro
	 * @return boolean true or false confirmando se o registro foi apagado
	 * @throws DataNotFoundException Dado não encontrado no banco de dados
	 * @throws ConnectionException Problema com a conexão ao banco de dados
	 * @throws SQLException erro no acesso do banco de dados ou outros erros
	 */
	boolean delete(TipoRegistro registro) throws ConnectionException, DataNotFoundException, SQLException;
	
	/**
	 * Seleciona um registro através da sua chave primária id
	 * @param idRegistro é um parâmetro do tipo int que deve ser a chave primária do registro
	 * @return um registro do tipo Registro
	 * @throws DataNotFoundException Dado não encontrado no banco de dados
	 * @throws ConnectionException Problema com a conexão ao banco de dados
	 * @throws SQLException erro no acesso do banco de dados ou outros erros
	 */
	TipoRegistro findById(int idRegistro) throws ConnectionException, DataNotFoundException, SQLException;
	
	/**
	 * Seleciona todos os registro do usuário indicado através do objeto Pessoa
	 * @return uma lista do tipo ArrayList Registro contendo todos os registro do usuário
	 * @throws DataNotFoundException Dado não encontrado no banco de dados
	 * @throws ConnectionException Problema com a conexão ao banco de dados
	 * @throws SQLException erro no acesso do banco de dados ou outros erros
	 */
	ArrayList<TipoRegistro> getAll() throws ConnectionException, DataNotFoundException, SQLException;
}