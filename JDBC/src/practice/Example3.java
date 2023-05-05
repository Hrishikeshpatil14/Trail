package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.x.protobuf.MysqlxPrepare.Execute;

public class Example3 {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			
			Statement stm= con.createStatement();
			ResultSet rs=stm.executeQuery("select * from cricket");
			while(rs.next())
			{
				int player_no=rs.getInt(1);
				String player_name=rs.getString(2);
				String country=rs.getString(3);
				
				System.out.println("player_no: "+player_no);
				System.out.println("player_name: "+player_name);
				System.out.println("country: "+country);
				System.out.println("\n");
			}
			
			
			
			
		}
		catch(ClassNotFoundException t)
		{
			System.out.println(t);
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}

}
