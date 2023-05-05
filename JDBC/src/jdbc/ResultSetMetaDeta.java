package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;



public class ResultSetMetaDeta {

	public static void main(String[] args) {
		Connection con = null;
		Statement st=null;
		ResultSet rs=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			}
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}
		
	}

}
