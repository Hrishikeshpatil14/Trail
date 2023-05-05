package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.cj.jdbc.Driver;

public class Example2 {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			
			PreparedStatement psmt=con.prepareStatement("insert into cricket values(?,?,?)");
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			
			while(true)
			{
				System.out.println("Enter the player_no");
				int pno=Integer.parseInt(br.readLine());
				
				System.out.println("Enter the player_name");
				String pname=(br.readLine());
				
				System.out.println("Enter the player country");
				String country=(br.readLine());
				
				psmt.setInt(1, pno);
				psmt.setString(2, pname);
				psmt.setString(3, country);
				
				int count=psmt.executeUpdate();
				if(count>0)
				{
					System.out.println(count+"record inserted");
				}
				else
					System.out.println("no record inserted");
				
					System.out.println("Do you want to add more record");
					String ch=br.readLine();
					if(ch.equalsIgnoreCase("no"))
						break;
					
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
