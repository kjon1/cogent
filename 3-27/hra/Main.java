package com.hra;

import java.util.Scanner;

public class Main extends Emp{

	public Main(int empId, String designation, double basic, double hra) {
		// TODO Auto-generated constructor stub
	}
	public static void basicCheck (double basic) throws LowSalException{
		if(basic >500){
			System.out.println("Basic is " + basic);
			
		}
		else
		{
			throw new LowSalException();
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			
			Scanner sc= new Scanner(System.in);
			boolean run = true;
			int input;
			do{
				System.out.println();
				System.out.println("   ---WHAT WOULD YOU LIKE TO DO?----");
				//System.out.println(" ");//
				System.out.println(" 1. ADD EMPLOYEE");
				System.out.println(" 2. VIEW EMPLOYEE DETAILS");
				input = sc.nextInt();
				switch (input){
				case 1:
					System.out.println("Enter employee ID.");
					Emp e = new Emp();
					int empId=  sc.nextInt();
					e.setEmpId(empId);
					System.out.println("Select employee designation.");
					//String designation = sc.next();//
					//e.setDesignation(designation);//
					System.out.println();
					System.out.println("1. Manager");
					System.out.println("2. Officer");
					System.out.println("3. Clerk");
					System.out.println();
					int in = 0;
					in = sc.nextInt();
					switch(in){
					case 1:
						e.setDesignation("Manager");
						e.setHra(.10);
						
						break;
					case 2:
						e.setDesignation("Officer");
						e.setHra(.12);
						
						break;
					case 3:
						e.setDesignation("Clerk");
						e.setHra(.05);
						
						break;
						
						
				}
					System.out.println("Enter BASIC. ");
					double basic = sc.nextDouble();
					if (basic <500){
						System.out.println("Basic must be 500 or more. ");
						System.out.println("Enter Basic.");
						
						
						}else{
							e.setBasic(basic);
							e.setCalcHra(basic * hra);
						
					}
					
					
					
				case 2:
					System.out.println();
					System.out.println("");
					 printDet();
					
				
					
					break;
				default:
					System.out.println("Pick 1 or 2 only.");
				}
				
				
				
			}while (run);

			

		

	}

}
