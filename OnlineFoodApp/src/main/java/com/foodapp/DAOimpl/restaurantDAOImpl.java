package com.foodapp.DAOimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.foodapp.dao.restaurantDAO;
import com.foodapp.model.restaurant;
import com.foodapp.util.MyConnection;

public class restaurantDAOImpl implements restaurantDAO {
		private MyConnection myCon;
		private Connection connection;
		private PreparedStatement pstmt;
		private Statement stmt;
		private ResultSet resultSet;
		private ArrayList<restaurant> restaurantlist =new ArrayList<restaurant>();
		
		
		private static final String ADD_RESTAURANT ="insert into restaurant(restaurant_id,name,cuisinetype,deliverytime,address,adminuser_id,rating)"+"values(?,?,?,?,?,?,?)";
		private static final String SELECT_ALL="select * from restaurant";
		private static final String SELECT_ON_ID="select * from restaurant where restaurant_id=?";
		private static final String UPDATE_ON_ID="update restaurant set restaurant_id=?,name=?,cuisinetype=?,deliverytime=?,address=?,adminuser_id=?,rating=? where restaurant_id=?";
		private static final String DELETE_ON_ID="delete * from restaurant where restaurant_id=?";
		int status =0;
		restaurant restaurant;
		
		
		public restaurantDAOImpl() {
			myCon= MyConnection.getMyConnection();
			connection =myCon.connect();
		}

		@Override
		public int addrestaurant(restaurant r) {
			try
			{
				pstmt=connection.prepareStatement(ADD_RESTAURANT);
				pstmt.setInt(1, r.getRestaurant_id());
				pstmt.setString(2,r.getName());
				pstmt.setString(3,r.getCuisinetype());
				pstmt.setInt(4, r.getDeliverytime());
				pstmt.setString(5,r.getAddress());
				pstmt.setInt(6, r.getAdminuser_id());
				pstmt.setFloat(7, r.getRating());
				
				status=pstmt.executeUpdate();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return status;
		}

		@Override
		public ArrayList<restaurant> getAllrestaurants() {
			
			try
			{
				stmt=connection.createStatement();
				resultSet = stmt.executeQuery(SELECT_ALL);
				restaurantlist=extractrestaurantFromResultSet(resultSet);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return restaurantlist;
		}

		@Override
		public restaurant getrestaurant(int restaurant_id) {
			
			try
			{
				pstmt =connection.prepareStatement(SELECT_ON_ID);
				pstmt.setInt(1, restaurant_id);	
				
				resultSet = pstmt.executeQuery();
				restaurantlist =extractrestaurantFromResultSet(resultSet);
				restaurant=restaurantlist.get(0);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return restaurant;
		}

		@Override
		public int updaterestaurant(restaurant r) {
			
			try
			{
				pstmt=connection.prepareStatement(UPDATE_ON_ID);
				pstmt.setInt(1, r.getRestaurant_id());
				pstmt.setString(2,r.getName());
				pstmt.setString(3,r.getCuisinetype());
				pstmt.setInt(4, r.getDeliverytime());
				pstmt.setString(5,r.getAddress());
				pstmt.setInt(6, r.getAdminuser_id());
				pstmt.setFloat(7, r.getRating());
				
				status=pstmt.executeUpdate();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return status;
		}

		@Override
		public int deleterestaurant(int restaurant_id) {
			
			try
			{
				pstmt=connection.prepareStatement(DELETE_ON_ID);
				pstmt.setInt(1, restaurant_id);
		
				status=pstmt.executeUpdate();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return status;
		}
		
		ArrayList<restaurant> extractrestaurantFromResultSet(ResultSet resultSet)
		{

			try 
			{
			
				while(resultSet.next())
				{
					restaurantlist.add(new restaurant(resultSet.getInt("restaurant_id"),
					resultSet.getString("name"),
					resultSet.getString("cuisinetype"),
					resultSet.getInt("deliverytime"),
					resultSet.getString("address"),
					resultSet.getInt("adminuser_id"),
					resultSet.getFloat("rating")));
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return restaurantlist;
			
		}
		
		

}
