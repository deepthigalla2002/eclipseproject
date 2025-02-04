package com.foodapp.dao;
import java.util.ArrayList;

import com.foodapp.model.menu;

public interface menuDAO {
	int addMenu(menu m);
	ArrayList<menu> getAllMenu();
	menu getSpecificMenu(int itemId);
	int updateMenu(menu m);
	int deleteMenu(int menu_id);
	
	
	
}
