package com.example.oneotone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToManyApplicationJpa implements CommandLineRunner{
	
	@Autowired
	CollegeRepo repository;

	public static void main(String[] args) {
		SpringApplication.run(OneToManyApplicationJpa.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		College college =new College( "Columbia College", "Private");
		Student student1= new Student("jim kong", "sykolojee");
		Student student2= new Student("slim dong", "biology");
		college.getStudents().add(student1);
		college.getStudents().add(student2);
		
		repository.save(college);
		System.out.println("college and students added.");
		
		
		
		
		
		
	}

}
