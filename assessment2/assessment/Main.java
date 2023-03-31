package com.assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import com.book.Book;

public class Main extends EmployeeDaoImp{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int in=0;
		boolean run = true;
		do{
		System.out.println("  ----Employee Management Menu----");
		System.out.println();
		System.out.println(" 1. Add employee");
		System.out.println(" 2. Update employee");
		System.out.println(" 3. Delete employee");
		System.out.println(" 4. Print employee list	");
		System.out.println(" 5. Search employees");
		System.out.println(" 6. Sort employee by name");
		System.out.println(" 7. Exit");
		Scanner sc = new Scanner(System.in);
		in= sc.nextInt();
		ArrayList <Object> employees = new ArrayList<Object>();

		switch(in){
		case 1:
			System.out.println("How many employees to add?");
			int i;
			int no= sc.nextInt();
			for(i=0; i<no; i++){
				
			
			
			System.out.println("Enter employee number:");

			int b = sc.nextInt();
			System.out.println("Enter employee name:");
			String bn= sc.next();
			System.out.println("Enter employee address: ");
			String add=sc.next();
			
			System.out.println("Enter employee email:");
			String email =sc.next();
			System.out.println("Enter employee salary: ");
			int sal =sc.nextInt();
			

		
			Employee emp = new Employee(b, bn, add, email, sal);
			
			emp.setEmployeeNo(b);
			
			emp.setEmployeeName(bn);
			emp.setEmployeeAddress(add);
			emp.setEmployeeEmail(email);
			emp.setEmployeeSalary(sal);
			employees.add(new Employee(b, bn, add, email, sal));
			}
			
			//	String s=object1.toString();//
			//	int a = Integer.parseInt(s);//
			System.out.println(employees.toString() );
				

				
			
						
		
		case 2:
			System.out.println("Enter employee number of employee to update.");
			String search2 =sc.next();
			
			for(Object element: employees){
				if (((String) element).contains(search2)){
					System.out.println();
					System.out.println("Enter new employee number:");

					int b = sc.nextInt();
					System.out.println("Enter new employee name:");
					String bn= sc.next();
					System.out.println("Enter new employee address: ");
					String add=sc.next();
					
					System.out.println("Enter new employee email:");
					String email =sc.next();
					System.out.println("Enter new employee salary: ");
					int sal =sc.nextInt();
					

					
				}
			}
			break;
		case 3:
			break;
		case 4:
			
			break;
		case 5:
			Employee.showEmployees(employees);
			
			System.out.println("Enter employee number to search.");
			String search =sc.next();
			
			for(Object element: employees){
				if (((String) element).contains(search)){
					System.out.println(element);
				}
			}
			
			System.out.println(employees.toString() );

			//searchEmployee();//
			/*System.out.println("Enter employee number:");
			int no1 =sc.nextInt();
			if(employees.contains(no1)){
				System.out.println(employees);*/
			
			
			break;
		case 6:
			for (Object employee : employees){
			    System.out.println(employee.toString());}
			break;
		case 7:
			System.out.println("Goodbye.");
			run = false;
		}


	}while (run=true);
		
		
	
		// TODO Auto-generated method stub

	

}

}
