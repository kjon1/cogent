package com.cogent.core;
import java.util.*;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number value of n to check all even numbers less than of:");
		
		int n=sc.nextInt();
		System.out.println("EVEN NUMBER LIST from 0 to " + n + "" + ":");
		
		for (int i=0; i<n; i++)
		{
			if(i%2==0)
			{
				
				System.out.print("" + i + "," + " ");
				
			}
			
		}

	}

}
