package com.cogent;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Product product[]= new Product[10];	
	//Product product[]=null;//
	Scanner scanner = new Scanner(System.in);
	boolean run= true;
	
	ProductDao dao=new ProductDao();//
	int input=0;
	do{
		System.out.println(" ----------------Options Menu----------------");
		System.out.println();
		System.out.println(" 1: Create Record");
		System.out.println(" 2: Read Record");
		System.out.println(" 3. Update Record");
		System.out.println(" 4. Delete Record");
		System.out.println(" 5. Exit");
		//Scanner scanner = new Scanner(System.in);//
		input= scanner.nextInt();
		if (input <1 || input > 5){
			System.out.println("Oops, that is not a valid entry. Please select "
					+ "an option from 1 to 5. ");
		}
		
		switch(input)
		{
		case 1:
			System.out.println("Product record entry. ");
			//int number= scanner.nextInt();//
			//product = new Product[10];//
			for(int i=0; i<10; i++){
				dao.create(product);}
				break;
				
				case 2:
					
					dao.read(product);
					break;
					
				case 3:
					
					break;
					
				case 4:
					
					break;
					
				case 5:
					 run = false;
					
			}
				
			}
			
		while(run);
	
	}
}
		
		
		


