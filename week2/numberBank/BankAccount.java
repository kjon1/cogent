package com.numberBank;

import java.util.Scanner;

public class BankAccount {
	
	public BankAccount(int accNo, String custName, String accType, float balance) {
		this.accNo = accNo;
		this.custName = custName;
		this.accType = accType;
		this.balance = balance;
	}
	public static void main(String[] args) {
		System.out.println("Enter deposit amount.");
		deposit();
		
		
	}
	static int accNo;
	String	 custName;
	static String  accType;
	static float balance= 5000;
	float amt;
	static Scanner sc= new Scanner(System.in);
	
	
	public void negativeCheck(float deposit)throws NegativeAmount{
		if(deposit<5){
			throw new NegativeAmount();
			
		}
	}
	
	static void deposit() {
		System.out.println("How much would you like to deposit today? ");
		float deposit = sc.nextFloat();
		BankAccount ba= new BankAccount(accNo, accType, accType, deposit);
		float n = deposit + balance;

		try{
			ba.negativeCheck(deposit);
		}catch(NegativeAmount na){
			System.out.println("Miniumum deposit is $5.00");
			
		}
		ba.balance=n;
		System.out.println("New balance is " + n );
		
		}
	
	static void withdraw() throws Exception{
		System.out.println("Enter amount you wish to withdraw.");
		float amt= sc.nextFloat();
		float pb = balance -amt;
		if (pb<1000 || amt<0){
			throw InsufficientFunds();
				
			}
		else{
			balance = pb;
		};
		}
		
		
	
	private static Exception InsufficientFunds() {
		System.out.println("Invalid transaction.");
		// TODO Auto-generated method stub
		return null;
	}
	void getBalance(float amt){	
		System.out.println(" Balance is " + balance);
	

}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
}