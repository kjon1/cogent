package com.cogent.core;
import java.util.*;


public class StringMethods {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text string to test: ");

		String testString = sc.next();
		int stringLength = testString.length();	
		System.out.println(" You entered : " + testString.toUpperCase());
		System.out.println("LENGTH OF YOUR TEXT STRING IS : " + stringLength );
		
		
		String reversedStr = "";

		for (int i = 0; i < testString.length(); i++) {
		  reversedStr = testString.charAt(i) + reversedStr;
		}

		System.out.print("Reversed string: "+ reversedStr + " - ");
		if (testString.equals(reversedStr)) {
			System.out.println("This text is a palindrome.");
		}else {
			System.out.println("This text is not a palindrome.");
		}
		
		
	}

	
	
}
