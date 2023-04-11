package com.first.one.innerBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config3.xml");
		Customer c=(Customer)context.getBean("customer");
		System.out.println(c);

	}

}
