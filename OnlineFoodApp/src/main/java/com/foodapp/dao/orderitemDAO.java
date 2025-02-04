package com.foodapp.dao;

import java.util.ArrayList;

import com.foodapp.model.orderItem;

public interface orderitemDAO {
	int addOrderItem(orderItem o);
	ArrayList<orderItem> getAllOrderItems();
	orderItem getSpecificOrderItem(int order_id);
	
}
