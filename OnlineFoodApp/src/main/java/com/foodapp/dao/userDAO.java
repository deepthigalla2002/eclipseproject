package com.foodapp.dao;

import java.util.ArrayList;

import com.foodapp.model.user;
public interface userDAO 
{
	int addUser(user u);
	ArrayList<user> getAllUser();
	user getUser(String email);
	int updateUser(user u);
	int deleteUser(String email);
	
}
