package com.cogent.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cogent.demo.bean.Greeting;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(HelloWorldApplication.class, args);
		Greeting greeting = ac.getBean(Greeting.class);
		String message = greeting.hello();
		System.out.println();
		System.out.println(message);
	}

}
