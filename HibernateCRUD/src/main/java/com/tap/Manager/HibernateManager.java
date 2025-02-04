package com.tap.Manager;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tap.Entity.employee;

public class HibernateManager {
	static Session session=null;
	static
	{
		session=new Configuration().configure().addAnnotatedClass(employee.class).buildSessionFactory().openSession();
		System.out.println(session);
	}


public void add(employee e)
{
	Transaction t=session.beginTransaction();
	session.persist(e);
	t.commit();
}

public employee getUserById(int emp_id)
{
	return session.get(employee.class, emp_id);
}

}