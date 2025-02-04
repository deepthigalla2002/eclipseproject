package com.tap.manager;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tap.entity.Customer;
import com.tap.entity.CustomerDetails;
import com.tap.entity.OrderTable;

public class HibernateManager {
	
	Session session=null;
	public HibernateManager()
	{
		session=new Configuration().configure().addAnnotatedClass(Customer.class).addAnnotatedClass(CustomerDetails.class).addAnnotatedClass(OrderTable.class).buildSessionFactory().openSession();
		System.out.println(session);
	}
	
	public void add(Customer c)
	{
		Transaction t=session.beginTransaction();
		session.persist(c);
		t.commit();
		System.out.println("Done");
	}
	
	public Customer getOnId(int id)
	{
		Transaction t=session.beginTransaction();
		Customer c=session.get(Customer.class,id);
		if(c!=null)
		{
			return c;
		}
		return null;
	}

	public void saveOrder(OrderTable o) {
		
		session.beginTransaction();
		session.persist(o);
		session.getTransaction().commit();
	}
}
