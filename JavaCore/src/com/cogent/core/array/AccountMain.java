package com.cogent.core.array;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		
		Account account[] = new Account[3];
		Scanner sc= new Scanner(System.in);
		for(int i=0; i<account.length; i++) {
			Account a1= new Account();
			System.out.println("ENTER ACCOUNT NO: ");
			a1.setAccountNo(sc.nextInt());
			System.out.println("ENTER ACCOUNT TYPE: ");
			a1.setAccountType(sc.next());
			System.out.println("ENTER ACCOUNT BALANCE: ");
			a1.setBalance(sc.nextDouble());
			account[i]=a1;
			
		}
		for (int x=0;x<account.length;x++) {
			System.out.println("account no: " + account[x].getAccountNo());
			System.out.println("account type: " + account[x].getAccountType());
			System.out.println("account balance: " + account[x].getBalance());
		}

	}

}
