package com.tap.main;

import com.tap.entity.Customer;
import com.tap.entity.CustomerDetails;
import com.tap.entity.OrderTable;
import com.tap.manager.HibernateManager;

public class Launch {
	public static void main(String args[])
	{
		HibernateManager hm=new HibernateManager();
		
		CustomerDetails cd=new CustomerDetails(2,"ram@gmail.com",234325856);
		
		Customer c=new Customer(2,"ram");
		c.setCd(cd);
		
		OrderTable o1=new OrderTable("Idly",40);
		OrderTable o2=new OrderTable("Dosa",60);
		OrderTable o3=new OrderTable("Puri",50);
		
		o1.setCustomer(c);
		o2.setCustomer(c);
		o3.setCustomer(c);
		
		hm.saveOrder(o1);
		hm.saveOrder(o2);
		hm.saveOrder(o3);
		
		System.out.println("********************\nDone");
	}
}
