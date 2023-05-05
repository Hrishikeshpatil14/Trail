package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class Demo2 {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        Resultset rs= null;
        int flag=0;
       
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
        	st=con.createStatement();
        	flag=st.executeUpdate("ALTER TABLE ");
        }
        catch(SQLException e)
        {
        	
        } catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
        
        
    }
}

          
            
            		
            		
            
      
