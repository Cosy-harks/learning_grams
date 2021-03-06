package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dbutil.OracleConnection;
import com.to.Team;

public class TeamDaoImpl implements TeamDAO {
	@Override
	public List<Team> getAllTeamList() throws Exception{
		List<Team> teamList = new ArrayList<>();
		try(Connection connection=OracleConnection.getConnection()){
			String sql = "Select tid,tname from team";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Team team = new Team(resultSet.getInt("tid"), resultSet.getString("tname"));
				teamList.add(team);
			}
		} catch (ClassNotFoundException | SQLException e) {
			throw new Exception("Internal Error Occured");
		}
		return teamList;
	}
}
