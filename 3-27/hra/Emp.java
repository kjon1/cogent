package com.hra;

import java.util.Scanner;

public class Emp {
	 static int empId;
	String empName;
	static String designation;
	static double basic;
	static double hra;
	static double calcHra;
	
	
	
	public Emp() {
		this.empId = empId;
		this.designation = designation;
		this.basic = basic;
		this.hra = hra;
		double calcHra;
	}
	



	
	
		
	public static void printDet(){
		System.out.println(" ------Employee Details-------");
		//System.out.println();//
		System.out.println("Employee ID: " + empId	);
		System.out.println("Designation: " + designation);
		System.out.println("Basic: " + basic);
		//System.out.println("HRA: " + hra + " % " + " x " + basic + " = " + calcHra);//
		System.out.println("HRA: " +  calcHra);
		
		
	}
	public void calculateHRA(){
		
	}
	
	
	
	
	
	
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}







	public static double getHra() {
		return hra;
	}







	public static void setHra(double hra) {
		Emp.hra = hra;
	}







	public double getCalcHra() {
		return calcHra;
	}







	public void setCalcHra(double calcHra) {
		this.calcHra = calcHra;
	}
	
	
	
	

	

}
