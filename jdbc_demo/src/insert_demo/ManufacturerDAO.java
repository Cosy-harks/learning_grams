package insert_demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dbutil.OracleConnection;

public class ManufacturerDAO {
	
	public int registerManufacture(Manufacturer manufacturer) throws Exception {
		int c = 0;
		try(Connection connection = OracleConnection.getConnection()){
			
			//dynamic vals get ?   //classNotFound exception - misspelling in sql
			String sql = "insert into manufacturer(mid,mname) values(?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, manufacturer.getMid());
			preparedStatement.setString(2, manufacturer.getMname());
			
			c = preparedStatement.executeUpdate();
			System.out.println("Updated");
			
			connection.close();
			System.out.println("Closed Connection");
			
		} catch (ClassNotFoundException | SQLException e) {
			throw new Exception("Internal error occured");
		}
		return c;
	}
}
