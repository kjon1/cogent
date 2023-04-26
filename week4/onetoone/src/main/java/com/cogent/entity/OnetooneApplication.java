package com.cogent.entity;

import org.springframework.beans.factory.annotation.Autowired;

import com.cogent.entity.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication


public class OnetooneApplication implements CommandLineRunner{
	
	
	@Autowired
	StudentRepo repository;
	public static void main(String[] args) {
		SpringApplication.run(OnetooneApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setName("Lonka");
		
		Course course =new Course();
		course.setCourseName("choco chemical");
		course.setCourseFee(300);
		
		student.setCourse(course);
		
		repository.save(student);
		System.out.println("student saved.");
	}

}
