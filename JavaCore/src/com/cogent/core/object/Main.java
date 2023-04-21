package com.cogent.core.object;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book(1001, "Gone with the wind", 15, "Margaret mitchell");
		//book1.setAuthor(null);    take book details from scanner//
		System.out.println("BOOK DETAILS:  " );
		System.out.println("ID: " + book1.getBookNo() );
		System.out.println("Name: " + book1.getBookName());
		System.out.println("Author: " + book1.getAuthor()) ;

	}

}
