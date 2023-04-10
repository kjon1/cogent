package com.first.one.HelloWorld;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main 
{
    public static void main( String[] args )
    {
        
        
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		Client c=(Client)ctx.getBean("client");
		
		System.out.println("Client orders are : " + c.getOrders());
		
    }
}
