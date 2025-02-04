package com.tap.manager;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.tap.entity.Author;
import com.tap.entity.Books;

public class HibernateManager {
	
	Session session;
	
	public HibernateManager()
	{
		session=new Configuration().configure().
				addAnnotatedClass(Author.class).
				addAnnotatedClass(Books.class).
				buildSessionFactory().
				openSession();
	}
	
	
	public void add(Author a)
	{
		session.beginTransaction();
		session.persist(a);
		//System.out.println(session);
		session.getTransaction().commit();
	}


	public Author fetch(int i) {
		session.beginTransaction();
		Author a=session.get(Author.class, i);
		return a;
		
	}
}
