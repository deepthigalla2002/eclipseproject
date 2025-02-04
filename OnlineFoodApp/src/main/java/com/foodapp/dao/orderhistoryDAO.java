package com.foodapp.dao;

import java.util.ArrayList;

import com.foodapp.model.orderHistory;

public interface orderhistoryDAO {
	int addOrderHistory(orderHistory oh);
	ArrayList<orderHistory> getAllOrderHistory();
	orderHistory getSpecificOrderHistory(int order_id);
}