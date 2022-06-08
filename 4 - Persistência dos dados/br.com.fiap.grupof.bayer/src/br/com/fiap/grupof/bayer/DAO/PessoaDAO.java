package br.com.fiap.grupof.bayer.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import br.com.fiap.grupof.bayer.entities.Pessoa;
import br.com.fiap.grupof.bayer.exceptions.ConnectionException;
import br.com.fiap.grupof.bayer.exceptions.DataNotFoundException;
import br.com.fiap.grupof.bayer.interfaces.DAOInterface;

public class PessoaDAO implements DAOInterface<Pessoa> {

	@Override
	public boolean insert(Pessoa registro) throws SQLException {
		try {
			
			String sql = "INSERT INTO T_SM_PESSOA VALUES (SQ_SM_PESSOA.nextval, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement stmt = dao.getConnection().prepareStatement(sql);
			
			stmt.setInt(1, registro.getLocalidade().getCidade().getId());
			stmt.setInt(2, registro.getEscolaridade().getId());
			stmt.setString(3, registro.getNome());
			stmt.setDate(4, new java.sql.Date(registro.getDtNasc().getTime()));
			stmt.setDouble(5, registro.getRenda());
			stmt.setString(6, registro.getRg());
			stmt.setString(7, registro.getCpf());				
			return stmt.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Pessoa registro) throws ConnectionException, DataNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Pessoa registro) throws ConnectionException, DataNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Pessoa findById(int idRegistro) throws ConnectionException, DataNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Pessoa> getAll() throws ConnectionException, DataNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}