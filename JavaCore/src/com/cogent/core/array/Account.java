package com.cogent.core.array;

public class Account {
	public Account(int accountNo, String accountType, double balance) {
		super();
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.balance = balance;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int accountNo;
	private String accountType;
	private double  balance;
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance>0) {
		this.balance = balance;
		}
		else {
			System.out.println("Balance must be greater than 0.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
