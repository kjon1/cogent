package com.stream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.sql.SQLException;
import java.util.Scanner;

public class Roll {

	public static void main(String[] args) throws SQLException{
		FileOutputStream f;
		ObjectOutputStream o;
		Scanner sc= new Scanner(System.in);
		try{
			f= new FileOutputStream("c://streams//student.ser");
			o= new ObjectOutputStream(f);
			Student student= new Student(0, null, 0, null);
			System.out.println("Enter roll number. (Reminder- roll number"
					+ " can only contain numerical values.");
			
			
			while (!sc.hasNextInt()	){
				System.out.println("ROll number can be integers only stupid try again");
				sc.next();
			}
			int rollNo= sc.nextInt();
			student.setRollNo(rollNo);{}
			System.out.println("Enter name.");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
