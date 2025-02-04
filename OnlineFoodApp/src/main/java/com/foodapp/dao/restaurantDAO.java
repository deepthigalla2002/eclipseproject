package com.foodapp.dao;

import java.util.ArrayList;
import java.util.List;

import com.foodapp.model.restaurant;


public interface restaurantDAO {
	int addrestaurant(restaurant r);
	ArrayList<restaurant> getAllrestaurants();
	restaurant getrestaurant(int restaurant_id);
	int updaterestaurant(restaurant r);
	int deleterestaurant(int restaurant_id);
	
}
