package com.foodapp.DAOimpl;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.foodapp.dao.userDAO;
import com.foodapp.model.user;
import com.foodapp.util.MyConnection;

public class userDAOImpl implements userDAO {
	
	private MyConnection myCon;
	private Connection connection;
	private PreparedStatement pstmt;
	private Statement stmt;
	private ResultSet resultSet;
	private ArrayList<user> userlist =new ArrayList<user>();
	user user;
	
	private static final String ADD_USER ="insert into user(username,email,phonenumber,password,address)"+"values(?,?,?,?,?)";
	private static final String SELECT_ALL="select * from 'user'";
	private static final String SELECT_ON_EMAIL="select * from user where email=?";
	private static final String UPDATE_ON_EMAIL="update user set username=?,phonenumber=?,password=?,address=? where email=?";
	private static final String DELETE_ON_EMAIL="delete * from 'user' where email=?";
	int status =0;
	
	
	public userDAOImpl() {
		myCon= MyConnection.getMyConnection();
		connection =myCon.connect();
	}

	@Override
	public int addUser(user u) {
		
		try {
			pstmt=connection.prepareStatement(ADD_USER);
			pstmt.setString(1, u.getUsername());
			pstmt.setString(2, u.getEmail());
			pstmt.setString(3, u.getPhonenumber());
			pstmt.setString(4, u.getPassword());
			pstmt.setString(5, u.getAddress());
			
			status =pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public ArrayList<user> getAllUser() {
		 try
		 {
				stmt=connection.createStatement();
				resultSet = stmt.executeQuery(SELECT_ALL);
				userlist=extractUserFromResultSet(resultSet);
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		return userlist;
	}

	@Override
	public user getUser(String email) {
		
		try 
		{
			pstmt =connection.prepareStatement(SELECT_ON_EMAIL);
			pstmt.setString(1, email);	
			
			resultSet = pstmt.executeQuery();
			userlist =extractUserFromResultSet(resultSet);
			user=userlist.get(0);
			
						
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public int updateUser(user u) {
		
		try 
		{
			pstmt=connection.prepareStatement(UPDATE_ON_EMAIL);
			pstmt.setString(1, u.getUsername());
			pstmt.setString(2, u.getPhonenumber());
			pstmt.setString(3, u.getPassword());
			pstmt.setString(4, u.getAddress());
			pstmt.setString(5, u.getEmail());
			
			status=pstmt.executeUpdate();
			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public int deleteUser(String email) {
		try {
			pstmt=connection.prepareStatement(DELETE_ON_EMAIL);
			pstmt.setString(1, email);
			
			status=pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	
	
	
	ArrayList<user> extractUserFromResultSet(ResultSet resultSet)
	{

		try 
		{
		
			while(resultSet.next())
			{
				userlist.add(new user(resultSet.getInt("user_id"),
				resultSet.getString("username"),
				resultSet.getString("email"),
				resultSet.getString("phonenumber"),
				resultSet.getString("password"),
				resultSet.getString("address")));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return userlist;
		
	}
}
