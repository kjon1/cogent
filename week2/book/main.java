package com.book;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public  class main extends BookDaoImp{
	
	
		
		



	public void updateBook() {
		// TODO Auto-generated method stub
		
	}



	public static void main(String[] args) throws SQLException {
		
		int in=0;
		boolean run = true;
		do{
		System.out.println("  ----BOOK MANAGER MENU----");
		System.out.println();
		System.out.println(" 1. Add book");
		System.out.println(" 2. Update book");
		System.out.println(" 3. Find book");
		System.out.println(" 4. Print all books	");
		System.out.println(" 5. EXIT");
		Scanner sc = new Scanner(System.in);
		in= sc.nextInt();
		switch(in){
		case 1:
			ArrayList <Object> books = new ArrayList<Object>()	;
			System.out.println("enter book id");

			int b = sc.nextInt();
			System.out.println("enter book name");
			String bn= sc.next();
			Book book = new Book(b, bn, b);

		
			book.setBookId(b);
			book.setBookName(bn);
			books.add(new Book (b, bn, b));
			
			//for (Object object1 : books){//
			//	String s=object1.toString();//
			//	int a = Integer.parseInt(s);//
			System.out.println(books.toString() );
				

				
			
			//createBook();//
			
		
		case 2:
			break;
		case 3:
			break;
		case 4:
			
			//printBook();//}
			break;
		case 5:
			System.out.println("Goodbye.");
			run = false;
		}


	}while (run=true);
	}
		
	
		// TODO Auto-generated method stub
		




	public  void createBook(int bookId, String bookName, double bookPrice) {
		// TODO Auto-generated method stub
		
	}



	



	@Override
	public void deleteBook() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void findBook() {
		// TODO Auto-generated method stub
		
	}



	public void printBook() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void createBook(int in, Object object, int in2) {
		// TODO Auto-generated method stub
		
	}



}


	