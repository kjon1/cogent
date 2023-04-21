package com.cogent.core;
import java.util.*;
import java.util.stream.IntStream;
import java.lang.reflect.Array;

public class Bingo {

	public static void main(String[] args) {
		
		int[] numbers = {1, 5, 13, 18, 21};
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter second number:");
		int num2 = sc.nextInt();
		System.out.println("Your first number was " + num1);
		System.out.println("Your second number was " + num2);
		
		if (IntStream.of(numbers).anyMatch(i -> i == num1) &&
			    IntStream.of(numbers).anyMatch(i -> i == num2)) {
			System.out.println("BINGO!");
		}
		else {
			System.out.println("sorry not bingo");
		}
		
		

	}

}
