package com.book;

import java.sql.SQLException;
import java.util.Scanner;

public interface BookDao {
	public void createBook();
	
	public   void updateBook() ;
	public void deleteBook();
	public void findBook();
	public void printBook();

	void createBook(int in, Object object, int in2);
	

	

}