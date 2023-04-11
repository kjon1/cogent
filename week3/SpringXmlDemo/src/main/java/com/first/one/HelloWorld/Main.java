package com.first.one.HelloWorld;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main 
{
    public static void main( String[] args )
    {
        
        
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		Ring r=(Ring)ctx.getBean("ring");
		
		System.out.println(r);
		
    }
}
