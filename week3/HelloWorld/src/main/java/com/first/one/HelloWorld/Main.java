package com.first.one.HelloWorld;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main 
{
    public static void main( String[] args )
    {
        
        
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		Employee g=(Employee)ctx.getBean("emp");
		
		System.out.println("Employee number is " + g.getId());
		System.out.println("Employee name is " + g.getName());
    }
}
