package com.cogent;

import java.util.Scanner;

public class ProductDao {
	
	public void create(Product[] product){
		Scanner scanner = new Scanner(System.in);
		for(Product p:product);
		for(int i=0; i<11; i++){
			
			 product = new Product[10];	
		System.out.println("Enter product ID. ");
		//product[i].setProductId(scanner.nextInt());//
		
		Product p1= new Product();
		p1.setProductId(scanner.nextInt());
		
		
		System.out.println("Enter product name.");
		//product[i].setProductName(scanner.next());//
		System.out.println("Enter product price. ");
		//product[i].setProductPrice(scanner.nextInt());//
		}
		
		
		
			
		}
		
	
	public void read(Product product[]){
		for(Product p:product)
		{
			System.out.println("Product ID - " + p.getProductId());
			System.out.println("Product name - " + p.getProductName());
			System.out.println("Product price - " + p.getProductPrice());
			
		}
			
	}
	public void update(){
		
	}
	public void delete(){
		
	}

}
