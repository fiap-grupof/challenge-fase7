package br.com.fiap.grupof.bayer.DAO;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import br.com.fiap.grupof.bayer.entities.Cidade;
import br.com.fiap.grupof.bayer.exceptions.ConnectionException;
import br.com.fiap.grupof.bayer.exceptions.DataNotFoundException;
import br.com.fiap.grupof.bayer.interfaces.RegistroDAOInterface;

public class CidadeDAO implements RegistroDAOInterface<Cidade> {

	@Override
	public boolean insert(Cidade registro) throws ConnectionException, DataNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Cidade registro) throws ConnectionException, DataNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Cidade registro) throws ConnectionException, DataNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Cidade findById(int idRegistro) throws ConnectionException, DataNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Cidade> getAll() throws ConnectionException, DataNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
