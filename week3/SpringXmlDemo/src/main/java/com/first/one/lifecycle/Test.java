package com.first.one.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/first/one/lifecycle/config.xml");
		Soldier s=(Soldier) ctx.getBean("soldier");
		System.out.println(s);
		

	}

}
