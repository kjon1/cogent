package com.first.one.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	
	@Bean(name= "person")
	public Person getPerson()
	{
		
		Person p = new Person();
		p.setName("Antony");
		p.setAge(24);
		return p;
	}
	
	@Bean(name="product")
	public Product getProduct()
	{
		Product x = new Product();
		x.setpId(2000);
		x.setpName("Gold ring");
		x.setpPrice(40000);
		return x;
	}
	

}
