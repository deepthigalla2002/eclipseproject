package advancejava;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class cred {

	public static void main(String[] args) {
		
		int empid=0;
		String empname=null;
		String role=null;
		float salary=0;
		
		String url="jdbc:mysql://localhost:3306/jdbc";
		String username="root";
		String password="123456789";
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,password);
		
		Statement stmt=con.createStatement();
		ResultSet res=stmt.executeQuery("select * from employee");
		
		PreparedStatement pstmt =con.prepareStatement("insert into employee(empid,empname,role,salary)"+"values(?,?,?,?)");
		pstmt.setInt(1,5);
		pstmt.setString(2, "sneha");
		pstmt.setString(3, "tester");
		pstmt.setFloat(4, 50000);
		
		pstmt.executeUpdate();
		while(res.next()==true) {
		System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getInt(4));
		}
		
		
	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
