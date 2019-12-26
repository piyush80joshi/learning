package com.pj.persistence.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="BOOK")
public class Book implements Serializable,Comparable<Book> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 819047902918886850L;
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="book_id")
	 long bookId;
	
	 @Column(name="title")
	 String title;
	 
	 @Column(name="price")
	 double price;
	
	 @Column(name="volume")
	 int volume ;
	 
	 @Column(name="publish_date")
	 LocalDate publishDate;
	
	public Book(long bookId, String title, double price, int volume, LocalDate publishDate) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.price = price;
		this.volume = volume;
		this.publishDate = publishDate;
	}
	public Book() {
		super();
	}
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public LocalDate getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", price=" + price + ", volume=" + volume
				+ ", publishDate=" + publishDate + "]";
	}
	/*
	 * @Override public int compareTo(Book b1) {
	 * 
	 * return this.bookId>b1.bookId?1:0; }
	 */
	
	 @Override public int compareTo(Book arg0) { // TODO Auto-generated method
	 return this.bookId>arg0.bookId?1:0; }
	 

}
