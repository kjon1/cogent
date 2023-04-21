package com.cogent.core.object;

public class Book {
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookNo, String bookName, int bookPrice, String author) {
		super();
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.author = author;
	}
	
	private int bookNo;
	private String bookName;
	private int bookPrice;
	private String author;
	
	
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
