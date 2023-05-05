package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DDL_Demo {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		try {
			 con= DriverManager.getConnection("");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
