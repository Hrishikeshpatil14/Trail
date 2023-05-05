package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Execute;

public class Eaxmple1 {

	public static void main(String[] args) {
		
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root","root");
		Statement stm=con.createStatement();
		stm.executeUpdate("create table cricket(player_no int, player_name varchar(122), country varchar(122))");
		
		System.out.println("Table created sucessfully");
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
