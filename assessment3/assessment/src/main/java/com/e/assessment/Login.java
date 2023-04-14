package com.e.assessment;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Scanner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import com.e.assessment.entity.User;
import com.e.assessment.repo.UserRepository;

import jakarta.annotation.PostConstruct;


@SpringBootApplication
public class Login {


	@Autowired
	UserRepository repository;
	 @PostConstruct
	    public void initUsers() {
	        List<User> users = Stream.of(
	                new User(100, "user", "password", "user")
	                
	        ).collect(Collectors.toList());
	     repository.saveAll(users);
	    }
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

		SpringApplication.run(Login.class, args);
	}

}
