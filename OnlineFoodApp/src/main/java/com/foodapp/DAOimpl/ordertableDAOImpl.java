package com.foodapp.DAOimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.foodapp.dao.ordertableDAO;
import com.foodapp.model.orderTable;
import com.foodapp.util.MyConnection;

public class ordertableDAOImpl implements ordertableDAO {

	private static final String ADD_ORDER="insert into orderTable(order_id,restaurant_id,user_id,totalAmount,status,paymentmode,orderdate)"+"values=?,?,?,?,?,?,?";
	private static final String GET_ALLORDER="select * from ordertable";
	private static final String GET_ORDER="select * from ordertable where order_id=?";
	
	private MyConnection myCon;
	private PreparedStatement pstmt;
	private Connection connection;
	orderTable order;

	private int status;
	private Statement stmt;
	private ResultSet resultset;
	private ArrayList<orderTable> orderlist=new ArrayList<orderTable>();

	public ordertableDAOImpl() {
		
			myCon=MyConnection.getMyConnection();
			connection=myCon.connect();
	}

	@Override
	public int addorder(orderTable o) {
		try
		{
		pstmt=connection.prepareStatement(ADD_ORDER);
		pstmt.setInt(1, o.getOrder_id());
		pstmt.setInt(2, o.getRestaurant_id());
		pstmt.setInt(3, o.getUser_id());
		pstmt.setFloat(4, o.getTotalAmount());
		pstmt.setString(5, o.getStatus());
		pstmt.setString(6, o.getPaymentmode());
		pstmt.setInt(2, o.getOrderdate());
		
		status=pstmt.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return status;
	}

	@Override
	public ArrayList<orderTable> getAllorder() {
		try 
		{
		stmt=connection.createStatement();
		resultset=stmt.executeQuery(GET_ALLORDER);
		
		orderlist=extractOrderFromResultSet(resultset);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return orderlist;
	}

	@Override
	public orderTable getspecificorder(int order_id) {
		try {
			pstmt=connection.prepareStatement(GET_ORDER);
			pstmt.setInt(1, order_id);
			
			resultset=pstmt.executeQuery();
			orderlist=extractOrderFromResultSet(resultset);
			order=orderlist.get(0);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return order;
		
	}
	
	ArrayList<orderTable> extractOrderFromResultSet(ResultSet resultset)
	{
		try
		{
			while(resultset.next())
			{
			orderlist.add(new orderTable(resultset.getInt("order_id"),
			resultset.getInt("Restaurant_id"),
			resultset.getInt("user_id"),
			resultset.getFloat("totalAmount"),
			resultset.getString("status"),
			resultset.getString("paymentmode"),
			resultset.getInt("orderdate")));
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return orderlist;
	}

}
