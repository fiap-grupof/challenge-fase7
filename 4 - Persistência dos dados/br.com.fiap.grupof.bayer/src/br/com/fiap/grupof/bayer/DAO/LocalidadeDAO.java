package br.com.fiap.grupof.bayer.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import br.com.fiap.grupof.bayer.entities.Localidade;
import br.com.fiap.grupof.bayer.exceptions.ConnectionException;
import br.com.fiap.grupof.bayer.exceptions.DataNotFoundException;
import br.com.fiap.grupof.bayer.interfaces.RegistroDAOInterface;

public class LocalidadeDAO implements RegistroDAOInterface<Localidade> {

	@Override
	public boolean insert(Localidade registro) throws ConnectionException, DataNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Localidade registro) throws ConnectionException, DataNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Localidade registro) throws ConnectionException, DataNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Localidade findById(int idRegistro) throws ConnectionException, DataNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Localidade> getAll() throws ConnectionException, DataNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
