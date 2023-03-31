package com.assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeDaoImp implements EmployeeDao{
	


	@Override
	public void createEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readAll() {
		// TODO Auto-generated method stub
		
	}
	public  static void print(ArrayList<Employee>employees){
		for(Employee emp: employees){
			System.out.println(emp);
		}
	}

	public void searchEmployee() {
		List<String> employees=Arrays.asList();
		System.out.println("Enter employee number to search: ");
		String search =scanner.next();
		Predicate<String> p=(s)->s.contains(search);
		for(String string:employees){
			if(p.test(string))
			{
				System.out.println(string);
			}
		}
			
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortByName() {
		// TODO Auto-generated method stub
		
	}
	
	

}
