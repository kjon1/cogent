package com.first.one.HelloWorld;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main 
{
    public static void main( String[] args )
    {
        
        
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		Person p=(Person)ctx.getBean("person");
		
		System.out.println("person number is " + p.getId());
		System.out.println("persons name is " + p.getName());
		System.out.println("persons age is " + p.getAge());
    }
}
