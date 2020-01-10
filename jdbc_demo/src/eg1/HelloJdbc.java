package eg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloJdbc {

	public static void main(String[] args) {
		
		Connection connection = null;
		
		try {
			//Step 1
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Driver Loaded");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String username = "java";
			String password = "java";
			
			//step 2 - open connection
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Successful");
			
			//step 3 - create a statement
			Statement statement = connection.createStatement();
			String sql = "select id,name,price from product";
			
			//step 4 - Execute
			ResultSet resultSet = statement.executeQuery(sql);
			System.out.println("Query Executed");
			
			//step 5 - process results
			while(resultSet.next()) {
				System.out.print("ID = " + resultSet.getInt("id"));
				System.out.print(" Name = " + resultSet.getString("name"));
				System.out.println(" Price = " + resultSet.getFloat("price"));
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}catch (SQLException e) {
			System.out.println(e);
		}finally {
			try {
				//step 6
				connection.close();
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
		
		
		
	}

}
