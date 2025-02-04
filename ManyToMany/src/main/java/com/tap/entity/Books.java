package com.tap.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="books")
public class Books {
	@Id
	@Column(name="book_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int book_id;
	
	
	@Column(name="title")
	private String title;
	
	@ManyToOne
	@JoinColumn(name="author_id")
	private Author author;
	
	
	public Books() {
		super();
	}

	public Books(int book_id, String title) {
		super();
		this.book_id = book_id;
		this.title = title;
	}

	public Books(String title) {
		super();
		this.title = title;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Books [book_id=" + book_id + ", title=" + title + "]";
	}
	
	
	
}
