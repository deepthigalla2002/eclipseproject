package com.foodapp.DAOimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.foodapp.dao.orderitemDAO;
import com.foodapp.model.orderItem;
import com.foodapp.util.MyConnection;

public class orderitemDAOImpl implements orderitemDAO
{


	private static final String ADD_ORDERITEM ="insert into orderitem(orderitem_id,order_id,menu_id,quantity,subtotal"+"values(?,?,?,?,?)";
	private static final String GET_ALLORDERITEMS="select * from orderItem";
	private static final String GET_ORDERITEM="select * from orderItem where order_id=?";
	
	private MyConnection myCon;
	private Connection connection;
	private PreparedStatement pstmt;
	private Statement stmt;
	private ResultSet resultset;
	private int status;
	orderItem orderitem;
	private ArrayList<orderItem> orderlist=new ArrayList<orderItem>();
	
	
	public orderitemDAOImpl() {
		myCon= MyConnection.getMyConnection();
		connection =myCon.connect();
	}

	@Override
	public int addOrderItem(orderItem o) 
	{
		try 
		{
			pstmt=connection.prepareStatement(ADD_ORDERITEM);
			pstmt.setInt(1, o.getOrderitem_id());
			pstmt.setInt(2, o.getOrder_id());
			pstmt.setInt(3, o.getMenu_id());
			pstmt.setInt(4, o.getQuantity());
			pstmt.setFloat(5, o.getSubtotal());
			
			status =pstmt.executeUpdate();

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public ArrayList<orderItem> getAllOrderItems()
	{
		try 
		{
			stmt=connection.createStatement();
			resultset=stmt.executeQuery(GET_ALLORDERITEMS);
			
			orderlist=extractfromresultset(resultset);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return orderlist;
	}

	@Override
	public orderItem getSpecificOrderItem(int order_id) 
	{
		try
		{
			pstmt=connection.prepareStatement(GET_ORDERITEM);
			pstmt.setInt(1, order_id);
			
			resultset=pstmt.executeQuery();
			orderlist=extractfromresultset(resultset);
			orderitem=orderlist.get(0);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return orderitem;
		
	}

	ArrayList<orderItem> extractfromresultset(ResultSet resultset)
	{
		try
		{
			while(resultset.next())
			{
				orderlist.add(new orderItem(resultset.getInt("orderitem_id"),
				resultset.getInt("order_id"),
				resultset.getInt("menu_id"),
				resultset.getInt("quantity"),
				resultset.getFloat("subtotal")));

			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return orderlist;
	}

}
