package br.com.fiap.grupof.bayer.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import br.com.fiap.grupof.bayer.entities.Obito;
import br.com.fiap.grupof.bayer.exceptions.ConnectionException;
import br.com.fiap.grupof.bayer.exceptions.DataNotFoundException;
import br.com.fiap.grupof.bayer.interfaces.DAOInterface;

public class ObitoDAO implements DAOInterface<Obito> {

	@Override
	public boolean insert(Obito registro) throws ConnectionException, SQLException {
		try {
			
			String sql = "INSERT INTO T_SM_OBITO VALUES (SQ_SM_OBITO.nextval, ?, ?, ?, ?, ?, ?, ?)";
			
			PreparedStatement stmt = dao.getConnection().prepareStatement(sql);
			stmt.setInt(1, registro.getSexo().getId());
			stmt.setDate(2, new java.sql.Date(registro.getDataNasc().getTime()));			
			stmt.setInt(3, registro.getEnsino().getId());
			stmt.setDate(4, new java.sql.Date(registro.getDataCaso().getTime()));	
			stmt.setInt(5, registro.getLocal().getCidade().getId());
			stmt.setInt(6, registro.getDoenca().getId());
			stmt.setDouble(7, registro.getRenda());
				
			return stmt.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Obito registro) throws ConnectionException, DataNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Obito registro) throws ConnectionException, DataNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Obito findById(int idRegistro) throws ConnectionException, DataNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Obito> getAll() throws ConnectionException, DataNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
