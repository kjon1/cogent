package com.stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fileRite();
		
	}
		//String b = "c://streams//employee.txt";//
		public static void fileRite(){
		try{
			Scanner sc = new Scanner(System.in);
			FileReader fr = null;
			FileWriter fw = null;

			System.out.println("Enter pathname of file to copy.");
			String b = sc.next();
			fr = new FileReader(b);
			fw = new FileWriter("c://streams//employee-clonex.txt");
			int i2;
			while((i2=fr.read())!= -1){
				fw.write(i2);
			
		}
		
		
			fr.close();
			fw.close();
			
	
			
		}catch(IOException io){
			System.out.println("File path is invalid.");
			fileRite();
				
			}
			
	}
}
		
		
		

	

	


