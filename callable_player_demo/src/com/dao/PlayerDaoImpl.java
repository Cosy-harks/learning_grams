package com.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.dbutil.OracleConnection;
import com.to.Player;

public class PlayerDaoImpl implements PlayerDAO {

	@Override
	public Player registerPlayer(Player player) throws Exception {
		try (Connection connection = OracleConnection.getConnection()){
			//Procedure call
			String sql="{call REGISTERPLAYER(?,?,?,?,?,?)}";
			CallableStatement callableStatement = connection.prepareCall(sql);
			//In Parameters
			callableStatement.setString(2, player.getName());
			callableStatement.setDate(3, new java.sql.Date(player.getDob().getTime()));//util date -> sql date
			callableStatement.setString(4, player.getCity());
			callableStatement.setString(5,  player.getGender());
			callableStatement.setString(6, player.getTeam().getTname());
			//Out Parameter
			callableStatement.registerOutParameter(1, java.sql.Types.VARCHAR);
			//Run PL procedure script
			callableStatement.execute();
			//Get Out Parameter after execution
			player.setId(callableStatement.getString(1));
		}catch(ClassNotFoundException | SQLException e) {
			throw new Exception("Internal Error " + e);
		}
		return player;
	}

}
