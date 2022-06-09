package br.com.fiap.grupof.bayer.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import br.com.fiap.grupof.bayer.entities.Caso;
import br.com.fiap.grupof.bayer.entities.Doenca;
import br.com.fiap.grupof.bayer.exceptions.ConnectionException;
import br.com.fiap.grupof.bayer.exceptions.DataNotFoundException;
import br.com.fiap.grupof.bayer.interfaces.DAOInterface;

public class CasoDAO implements DAOInterface<Caso> {

	@Override
	public boolean insert(Caso registro) throws ConnectionException, SQLException {
		try {
			
			String sql_semVacina = "INSERT INTO T_SM_CASO VALUES (SQ_SM_CASO.nextval, ?, ?, ?, ?, ?, ?, ?)";
			
			String sql_comVacina = "INSERT ALL \n"
					+ " INTO T_SM_CASO VALUES (SQ_SM_CASO.nextval, ?, ?, ?, ?, ?, ?, ?)\n"
					+ " INTO T_SM_CASO_VACINA VALUES (SQ_SM_CASO_VACINA.nextval, ?, SQ_SM_CASO.nextval)\n"
					+ "SELECT id_caso FROM T_SM_CASO FETCH FIRST 1 ROWS ONLY";
			
			PreparedStatement stmt;
			
		    if (registro.getVacina() != null) {
				stmt = dao.getConnection().prepareStatement(sql_comVacina);
				stmt.setInt(8, registro.getVacina().getId());
		    } else {
				stmt = dao.getConnection().prepareStatement(sql_semVacina);
		    }
			
			stmt.setInt(1, registro.getSexo().getId());
			stmt.setDate(2, new java.sql.Date(registro.getDataNasc().getTime()));			
			stmt.setInt(3, registro.getEnsino().getId());
			stmt.setDate(4, new java.sql.Date(registro.getData().getTime()));	
			stmt.setInt(5, registro.getLocal().getCidade().getId());
			stmt.setInt(6, registro.getDoenca().getId());
			stmt.setDouble(7, registro.getRenda());
				
			return (dao.executeCommand(stmt) > 0);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public int getDoenca(Doenca doenca) throws SQLException {
		try {
			String sql = "SELECT COUNT(*) CASOS FROM T_SM_CASO WHERE T_SM_DOENCA_ID_DOENCA = ?";
			
			PreparedStatement stmt = dao.getConnection().prepareStatement(sql);
			stmt.setInt(1, doenca.getId());	
			ResultSet rows = dao.getData(stmt);
			if (rows.next()) {
				return rows.getInt("CASOS");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int getDadosPorRegiao(int idRegiao, int idDoenca) throws SQLException {
		String sql = "SELECT COUNT(*) CASOS "
				+ "FROM T_SM_CASO C "
				+ "JOIN T_SM_CIDADE CT "
				+ "ON C.T_SM_CIDADE_ID_CIDADE = CT.ID_CIDADE "
				+ "JOIN T_SM_ESTADO E "
				+ "ON CT.T_SM_ESTADO_ID_ESTADO = E.ID_ESTADO "
				+ "JOIN T_SM_REGIAO R "
				+ "ON E.T_SM_REGIAO_ID_REGIAO = R.ID_REGIAO "
				+ "WHERE C.T_SM_DOENCA_ID_DOENCA = ? AND R.ID_REGIAO = ?";
		
		try(PreparedStatement preparedStatement = dao.getConnection().prepareStatement(sql)) {
			preparedStatement.setInt(1, idDoenca);
			preparedStatement.setInt(2, idRegiao);
			
			dao.getData(preparedStatement);
			
			ResultSet resultSet = preparedStatement.getResultSet();
			
			if (resultSet.next()) {
				return resultSet.getInt(1);
			}
		}
		
		return 0;
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