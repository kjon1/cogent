package com.first.one.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		Person p = (Person) context.getBean("person");
		System.out.println("Name of this person is : "+ p.getName());
		System.out.println("Age of this person is : "+ p.getAge());
		
		ApplicationContext context2 = new AnnotationConfigApplicationContext(BeanConfig.class);
		Product x = (Product) context.getBean("product");
		System.out.println("Product ID is : "+ x.getpId());
		System.out.println("Product name: "+ x.getpName());
		System.out.println("Product price: " + x.getpPrice());
		

	}

}
