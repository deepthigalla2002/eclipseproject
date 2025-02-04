package com.foodapp.dao;

import java.util.ArrayList;

import com.foodapp.model.orderTable;

public interface ordertableDAO {

	int addorder(orderTable o);
	ArrayList<orderTable> getAllorder();
	orderTable getspecificorder(int order_id);
}
