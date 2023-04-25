package com.first.one.innerBean2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config5.xml");
		Driver d=(Driver)ctx.getBean("driver");
		Automobile automobile=d.getAutomobile();
		Address address = d.getAddress();
		System.out.println("address city: " + address.getCity());
		System.out.println("address country: " + address.getCountry());
		System.out.println("auto name :" + automobile.getName());
		System.out.println("auto price: " + automobile.getPrice());
		

	}

}
