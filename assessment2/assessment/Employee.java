package com.assessment;

import java.util.ArrayList;

public class Employee {
	
	public Employee(int employeeNo, String employeeName,
			String employeeAddress, String employeeEmail, int employeeSalary) {
		super();
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeeEmail = employeeEmail;
		this.employeeSalary = employeeSalary;
	}
	int employeeNo;
	String employeeName;
	String employeeAddress;
	String employeeEmail;
	int employeeSalary;
	
	
	public int getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "EMPLOYEE DETAILS: {" + "\n" + "Employee number = " + employeeNo + " ," 
		+ "Employee name= " + employeeName + " Employee Address: "  + employeeAddress + 
		" Employee"
				+ " email: " + employeeEmail + " Employee Salary " + " $" +employeeSalary
				+ "\n" ;
		}
	public static void showEmployees(ArrayList<Object> employees) {
		// TODO Auto-generated method stub
		System.out.println(employees);
		
	};
	}
	
	


