package com.numberBank;
import java.util.*;

public class Number2 extends CalcAverage{
	
	public static void main(String[] args) {
        // write your code here
        int firstNumber = 0;
        int secondNumber = 0;
        String whileLoopConditional = null;
        int menuSelection;
        boolean validInput = false;

        System.out.println("Welcome to Calculator.");
        System.out.println();


        Scanner scanner = new Scanner(System.in);

        //whileLoopConditional = scanner.nextLine();

         do
        while (whileLoopConditional != "x") {
            //try {//
                            
            try {
            	System.out.println("Please enter the first number:");
                firstNumber = scanner.nextInt();
                System.out.println("Please enter the second number:");
                secondNumber = scanner.nextInt();
                if 
                 ( secondNumber < 1)
                    throw new IllegalArgumentException("You are trying to divide by zero");
                //whileLoopConditional = "x";//

            } catch (IllegalArgumentException e) {
                System.out.println("Error: input is not an integer or you are trying to divide by zero you tool.");
                System.out.println();
                scanner.next();
                
            }
            System.out.println();
            System.out.println("First number: " + firstNumber);
            System.out.println("Second number: " + secondNumber);
            System.out.println();
            System.out.println("Please choose operation method.");
            System.out.println("1.  Add");
            System.out.println("2.  Subtract");
            System.out.println("3.  Multiply");
            System.out.println("4.  Divide");
            System.out.println("5.  Get Average");
            
            menuSelection = scanner.nextInt();
            switch (menuSelection) {
                case 1:
                    System.out.println("Result: " + firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                    break;

                case 2:
                    System.out.println("Result: " + firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                    break;

                case 3:
                    System.out.println("Result: " + firstNumber + " x " + secondNumber + " = " + (firstNumber * secondNumber));
                    break;

                case 4:
                    System.out.println("Result: " + firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));

                    System.out.println();
                    break;
                    
                case 5:
                	//avgFirstN();//
                	double result = (firstNumber + secondNumber/2);
            		System.out.println(result);
                	
            }
            System.out.println();

            System.out.println("Press \"ENTER\" to continue.");
            Scanner enterkey = new Scanner(System.in);
            enterkey.nextLine();
            
        }
	
        while (validInput) ;
        
	
        }
	}

