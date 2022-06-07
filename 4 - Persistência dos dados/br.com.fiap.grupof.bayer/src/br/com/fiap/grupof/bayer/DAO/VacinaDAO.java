package br.com.fiap.grupof.bayer.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import br.com.fiap.grupof.bayer.entities.Vacina;
import br.com.fiap.grupof.bayer.exceptions.ConnectionException;
import br.com.fiap.grupof.bayer.exceptions.DataNotFoundException;
import br.com.fiap.grupof.bayer.interfaces.RegistroDAOInterface;

public class VacinaDAO implements RegistroDAOInterface<Vacina> {

	@Override
	public boolean insert(Vacina registro) throws ConnectionException, DataNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Vacina registro) throws ConnectionException, DataNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Vacina registro) throws ConnectionException, DataNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Vacina findById(int idRegistro) throws ConnectionException, DataNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Vacina> getAll() throws ConnectionException, DataNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
