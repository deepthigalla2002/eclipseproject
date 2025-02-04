package advancejava;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class day1 {

	public static void main(String[] args) {
		
		Connection con=null;
		ResultSet res=null;
		Statement stmt=null;
		
		try 
		{
		con= MyConnect.connect();
		stmt=con.createStatement();
		res=stmt.executeQuery("select * from employee");
		while(res.next()==true)
		{
			System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getInt(4));
		}
		
		}
		catch(ClassNotFoundException |SQLException e)
		{
			e.printStackTrace();
		}
		finally 
		{
			//MyConnect.close();
		}
		
		
		
		
}
}