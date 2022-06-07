package br.com.fiap.grupof.bayer.DAO;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import br.com.fiap.grupof.bayer.entities.Caso;
import br.com.fiap.grupof.bayer.exceptions.ConnectionException;
import br.com.fiap.grupof.bayer.exceptions.DataNotFoundException;
import br.com.fiap.grupof.bayer.interfaces.RegistroDAOInterface;

public class CasoDAO implements RegistroDAOInterface<Caso> {

	@Override
	public boolean insert(Caso registro) throws ConnectionException, DataNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Caso registro) throws ConnectionException, DataNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Caso registro) throws ConnectionException, DataNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Caso findById(int idRegistro) throws ConnectionException, DataNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Caso> getAll() throws ConnectionException, DataNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	

}
