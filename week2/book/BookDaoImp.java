package com.book;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public  class BookDaoImp implements BookDao{
	Scanner sc= new Scanner(System.in);
	

		
		// TODO Auto-generated method stub
		
	
	@Override
	public void updateBook() {
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

	@Override
	public void printBook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createBook(int bookId, Object object, int in2) {
		ArrayList <Integer> books = new ArrayList<>()	;
		int b = sc.nextInt();
		bookId= b;
		books.add(new Integer (bookId));
		
		for (Object object1 : books){
			String s=object.toString();
			int a = Integer.parseInt(s);
			System.out.println(books);
		}
		
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createBook() {
		// TODO Auto-generated method stub
		
	}

	

	/*@Override
	public void createBook() {
		// TODO Auto-generated method stub
		
	}
*/
}
