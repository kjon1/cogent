package com.first.one.check;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config2.xml");
		Medicine m=(Medicine)context.getBean("medicine");
		System.out.println(m);


	}

}
