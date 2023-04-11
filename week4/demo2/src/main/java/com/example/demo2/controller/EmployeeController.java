package com.example.demo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class EmployeeController {
	
	@GetMapping("/employee")
	public String display() {
		return "Employee name is Lulu and salary is $50,000";
	}

}
