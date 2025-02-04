package com.tap.launch;

import java.util.ArrayList;

import com.tap.entity.Author;
import com.tap.entity.Books;
import com.tap.manager.HibernateManager;

public class Launch {

	public static void main(String[] args) {
//		Author a=new Author("Dennis Rich");
//		
//		Books b1=new Books("c Zero To  Hero");
//		Books b2=new Books("c Zero BootCamp");
//		Books b3=new Books("c MasterClass");
//
//		ArrayList<Books> book=new ArrayList<Books>();
//		
//		book.add(b1);
//		book.add(b2);
//		book.add(b3);
//		
//		b1.setAuthor(a);
//		b2.setAuthor(a);
//		b3.setAuthor(a);
//		
//		a.setBooks(book);
//		
//		HibernateManager hm=new HibernateManager();
//		hm.add(a);
//		System.out.println("Data added");
		
		HibernateManager hm=new HibernateManager();
		Author a=hm.fetch(2);
		
		System.out.println(a.getName()+"    "+a.getBooks());
	}

}
