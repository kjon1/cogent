package com.first.one.lifecycle;

public class Soldier {
	private int number;
	
	private String role;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
		System.out.println("Hi ");
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
		System.out.println("role setting in progress now");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Soldier details= [ number = " + number + " Role = " + role + "]";
	}
	
	public void init()
	{
		System.out.println("HI now init");
	}
	public void destroy()
	{
		System.out.println("inside destroy method.");//this msg wont display unless showshuthook is invoked//
	}
	
	
	
	
	

}
