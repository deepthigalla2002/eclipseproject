package com.foodapp.DAOimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.foodapp.dao.orderhistoryDAO;
import com.foodapp.model.orderHistory;
import com.foodapp.util.MyConnection;

public class orderhistoryDAOImpl implements orderhistoryDAO
{
	
	private static final String ADD_HISTORY="insert into orderHistory(orderhistory_id,order_id,user_id,order_date,totalamount,status"+"values(?,?,?,?,?,?)";
	private static final String GET_ALLHISTORY="select * from orderHistoy";
	private static final String GET_HISTORY="select * from orderHistory where order_id=?";
	
	private MyConnection myCon;
	private Connection connection;
	private PreparedStatement pstmt;
	private Statement stmt;
	private ResultSet resultset;
	int status =0;
	orderHistory orderhistory;
	private ArrayList<orderHistory> orderhistorylist=new ArrayList<orderHistory>();
	
	
	
	public orderhistoryDAOImpl()
	{
		myCon= MyConnection.getMyConnection();
		connection =myCon.connect();
	}

	@Override
	public int addOrderHistory(orderHistory oh) 
	{

		try
		{
			pstmt=connection.prepareStatement(ADD_HISTORY);
			pstmt.setInt(1, oh.getOrderhistory_id());
			pstmt.setInt(2, oh.getOrder_id());
			pstmt.setInt(3, oh.getUser_id());
			pstmt.setInt(4,oh.getOrder_date());
			pstmt.setFloat(5,oh.getTotalAmount());
			pstmt.setString(6,oh.getStatus());
			
			status=pstmt.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return status;
	}

	@Override
	public ArrayList<orderHistory> getAllOrderHistory() 
	{
		try
		{
			stmt=connection.createStatement();
			resultset=stmt.executeQuery(GET_ALLHISTORY);
			
			orderhistorylist=extractfromresultset(resultset);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return orderhistorylist;
	}

	@Override
	public orderHistory getSpecificOrderHistory(int order_id) 
	{
		try
		{
			pstmt=connection.prepareStatement(GET_HISTORY);
			orderhistorylist=extractfromresultset(resultset);
			orderhistory=orderhistorylist.get(0);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return orderhistory;
		
		
	}
	
	ArrayList<orderHistory> extractfromresultset(ResultSet resultset)
	{
		try
		{
			while(resultset.next())
			{
				orderhistorylist.add(new orderHistory(resultset.getInt("orderHistory_id"),
				resultset.getInt("order_id"),
				resultset.getInt("user_id"),
				resultset.getInt("order_date"),
				resultset.getFloat("totalAmount"),
				resultset.getString("status")));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return orderhistorylist;
	}

}
