package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {

    public static void main(String[] args) {

        Connection connection = null;
        Statement st = null;

        try {
           
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");

            
            st = connection.createStatement();

            st.execute("CREATE TABLE employees (id INT, name VARCHAR(50), age INT)");
            System.out.println("Table created successfully.");

            st.execute("ALTER TABLE employees ADD COLUMN salary INT");
            System.out.println("Table altered successfully.");

            st.execute("DROP TABLE employees");
            System.out.println("Table dropped successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
       
        }
    }
}