package br.com.fiap.grupof.bayer.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;
import br.com.fiap.grupof.bayer.DAO.ConnectionManager;
import br.com.fiap.grupof.bayer.exceptions.AccountNotActiveException;
import br.com.fiap.grupof.bayer.exceptions.ConnectionException;
import br.com.fiap.grupof.bayer.exceptions.DataNotFoundException;

public interface ContaDAOInterface<Tipo> {

	ConnectionManager dao = ConnectionManager.getInstance();
	
	/**
	 * Insere uma nova conta
	 * @return boolean true or false confirmando se a conta foi inserida
	 * @throws DataNotFoundException Dado não encontrado no banco de dados
	 * @throws ConnectionException Problema com a conexão ao banco de dados
	 * @throws SQLException erro no acesso do banco de dados ou outros erros
	 */
	boolean insert() throws ConnectionException, DataNotFoundException, SQLException;
	
	/**
	 * Atualiza os dados de uma conta
	 * @return boolean true or false confirmando se o registro foi atualizado
	 * @throws DataNotFoundException Dado não encontrado no banco de dados
	 * @throws ConnectionException Problema com a conexão ao banco de dados
	 * @throws SQLException erro no acesso do banco de dados ou outros erros
	 */
	boolean update() throws ConnectionException, DataNotFoundException, SQLException;
	
	/**
	 * Apaga uma conta
	 * @return boolean true or false confirmando se a conta foi apagada
	 * @throws DataNotFoundException Dado não encontrado no banco de dados
	 * @throws ConnectionException Problema com a conexão ao banco de dados
	 * @throws SQLException erro no acesso do banco de dados ou outros erros
	 */
	boolean delete() throws ConnectionException, DataNotFoundException, SQLException;
	
	/**
	 * Método para selecionar um usuário do sistema utilizado o email registrado na conta
	 * @param email é um parâmetro do tipo String que deve ser o email da conta
	 * @return uma conta
	 * @throws DataNotFoundException Dado não encontrado no banco de dados
	 * @throws ConnectionException Problema com a conexão ao banco de dados
	 * @throws AccountNotActiveException Conta não encontrada
	 * @throws SQLException erro no acesso do banco de dados ou outros erros
	 */
	Tipo findByEmail(String email) throws ConnectionException, DataNotFoundException, AccountNotActiveException, SQLException;
	
	/**
	 * Método para selecionar um usuário do sistema utilizado o id de conta
	 * @param idConta é um parâmetro do tipo int que deve ser a chave primária da conta
	 * @return uma conta
	 * @throws DataNotFoundException Dado não encontrado no banco de dados
	 * @throws ConnectionException Problema com a conexão ao banco de dados
	 * @throws AccountNotActiveException Conta não encontrada
	 * @throws SQLException erro no acesso do banco de dados ou outros erros
	 */
	Tipo findById(int idConta) throws ConnectionException, DataNotFoundException, AccountNotActiveException, SQLException;

	/**
	 * Seleciona todos as contas
	 * @return uma lista do tipo List contendo todos os registros
	 * @throws DataNotFoundException Dado não encontrado no banco de dados
	 * @throws ConnectionException Problema com a conexão ao banco de dados
	 * @throws SQLException erro no acesso do banco de dados ou outros erros
	 */
	ArrayList<Tipo> getAll() throws ConnectionException, DataNotFoundException, SQLException;
}