package com.assessment.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.entity.User;
import com.assessment.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:56666/")
@RestController
@RequestMapping("api/")
public class UserDao {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("user")
	public List<User> getUsers()
	{
		return this.userRepository.findAll();
	}

}
