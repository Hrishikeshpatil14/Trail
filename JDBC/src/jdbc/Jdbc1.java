package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc1 {

	public static void main(String[] args) {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		if(con!=null) {
			System.out.println(con);
			System.out.println("Connection Established Sucessfull");
		}
	}

}
