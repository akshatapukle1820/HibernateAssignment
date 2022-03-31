package com.crud;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="book_hibernate")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int book_id;
	private String book_name;
	private String book_author;
	private double book_price;

	public Book() {
	}

	public Book(String book_name, String book_author, double book_price) {
		this.book_name = book_name;
		this.book_author = book_author;
		this.book_price = book_price;
	}

	public Book(int book_id, String book_name, String book_author, double book_price) {
		this.book_id = book_id;
		this.book_name = book_name;
		this.book_author = book_author;
		this.book_price = book_price;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getBook_author() {
		return book_author;
	}

	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}

	public double getBook_price() {
		return book_price;
	}

	public void setBook_price(double book_price) {
		this.book_price = book_price;
	}
	
	@Override
	public String toString() {
		return "Book [id= "+book_id+", Name = "+book_name+", author = "+book_author+", price = "+book_price+" ]";
	}

}
