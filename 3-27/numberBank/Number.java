package com.numberBank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Number {
	
	int firstNumber = 0;
	int secondNumber = 0;
	double result = 0.00;
	
	
	public void number(){
		Scanner scanner = new Scanner(System.in);
		/*System.out.println("Enter number 1. ");
		int first = scanner.nextInt();
		System.out.println("Enter number 2. ");
		int second = scanner.nextInt();*/
		boolean validInput = false;
		
		try {
            System.out.println("Please enter the first number:");
            firstNumber = scanner.nextInt();
            if (firstNumber > 0)
                validInput = true;

        } catch (InputMismatchException e) {
            System.out.println("Error: input is not an integer or contains non-integer values. Numerical values only allowed.");
            System.out.println();
            scanner.next();
            
        }
        System.out.println("Please enter the second number:");
        secondNumber = scanner.nextInt();
		}
	public void add(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number 1. ");
		int first = scanner.nextInt();
		System.out.println("Enter number 2. ");
		int second = scanner.nextInt();
		double result = first + second;
		
	}
	public void sub(){
		double result = firstNumber - secondNumber;
		
		
	}
	public void mul(){
		
	}
	public int getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	public int getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}

}
