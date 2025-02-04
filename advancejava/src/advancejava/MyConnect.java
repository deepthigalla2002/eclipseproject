package advancejava;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class MyConnect {


		static String url="jdbc:mysql://localhost:3306/jdbc";
		static String username="root";
		static String password="123456789";
		
		static Connection con=null;
		
		static Connection connect() throws ClassNotFoundException, SQLException
		{
				try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver loaded");
				
				con= DriverManager.getConnection(url, username, password);
				System.out.println("Connection established"+con);
				
				}
				catch(ClassNotFoundException | SQLException e)
				{
					e.printStackTrace();
					
				}
				
				return con;
		}
		static void close() throws SQLException 
		{
			con.close();
			
			
		}

}
