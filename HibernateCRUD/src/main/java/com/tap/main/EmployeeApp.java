package com.tap.main;

import com.tap.Entity.employee;
import com.tap.Manager.HibernateManager;

public class EmployeeApp {
	public static void main(String args[])
	{
		employee e=new employee(1,"Rahul","IT",40000);
		
		HibernateManager hm=new HibernateManager();
		
		//hm.add(e);
		employee e1=hm.getUserById(2);
		System.out.println(e1);
	}
}
