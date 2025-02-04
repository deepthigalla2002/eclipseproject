package com.foodapp.DAOimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.foodapp.dao.menuDAO;
import com.foodapp.model.menu;
import com.foodapp.util.MyConnection;

public class menuDAOImpl implements menuDAO{

	
	
	private static final String ADD_MENU = "insert into menu(menu_id,restaurant_id,price,description)"+"values(?,?,?,?)";
	private static final String GET_ALL="select * from menu";
	private static final String GET_MENU="select * from menu where restaurant_id=?";
	private static final String UPDATE_MENU="update menu set menu_id=?,restaurant_id=?,price=?,description=?";
	private static final String DELETE_MENU="delete * from menu where menu_id=?";
	
	private MyConnection myCon;
	private Connection connection;
	private PreparedStatement pstmt;
	private Statement stmt;
	
	private ResultSet resultset;
	private ArrayList<menu> menulist =new ArrayList<menu>();
	menu menu;
	int status=0;

	public menuDAOImpl() {
		myCon=MyConnection.getMyConnection();
		connection=myCon.connect();
	}

	@Override
	public int addMenu(menu m) 
	{
		try 
		{
			pstmt=connection.prepareStatement(ADD_MENU);
			pstmt.setInt(1, m.getMenu_id());
			pstmt.setInt(2,m.getRestaurant_id());
			pstmt.setInt(3, m.getPrice());
			pstmt.setString(4, m.getDescription());
			
			status=pstmt.executeUpdate();			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return status;
	}

	@Override
	public ArrayList<menu> getAllMenu() {
		
		try 
		{
			stmt=connection.createStatement();
			resultset=stmt.executeQuery(GET_ALL);
			
			menulist=extractMenuFromResultSet(resultset);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return menulist;
	}

	@Override
	public menu getSpecificMenu(int restaurant_id) {
		try 
		{

		pstmt=connection.prepareStatement(GET_MENU);
		pstmt.setInt(1, restaurant_id);
		

		resultset=pstmt.executeQuery();
		menulist=extractMenuFromResultSet(resultset);
		menu=menulist.get(0);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return menu;
	}

	@Override
	public int updateMenu(menu m) 
	{
		try 
		{
		pstmt=connection.prepareStatement(UPDATE_MENU);
		pstmt.setInt(1, m.getMenu_id());
		pstmt.setInt(2,m.getRestaurant_id());
		pstmt.setInt(3, m.getPrice());
		pstmt.setString(4, m.getDescription());
		
		status=pstmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public int deleteMenu(int menu_id) {
		try
		{
			pstmt=connection.prepareStatement(DELETE_MENU);
			pstmt.setInt(1, menu_id);
			
			status=pstmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return status;
	}
	
	ArrayList<menu> extractMenuFromResultSet(ResultSet resultSet)
	{

		try 
		{
			
		
			while(resultset.next())
			{
				
				menulist.add(new menu(resultset.getInt("menu_id"),
				resultset.getInt("restaurant_id"),
				resultset.getString("menuName"),
				resultset.getInt("price"),
				resultset.getString("description")));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return menulist;
		
	}
	
}
