package com.assessment;

import java.util.Scanner;

public interface EmployeeDao {
	
	void createEmployee();
	void updateEmployee();
	void deleteEmployee();
	void readAll();
	void searchEmployee();
	void sortByName();
	Scanner scanner = new Scanner(System.in);

}
