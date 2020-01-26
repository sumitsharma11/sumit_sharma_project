package com.orlando.taxibooking.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.orlando.taxibooking.model.Authentication;
import com.orlando.taxibooking.model.User;
import com.orlando.taxibooking.serviceimpl.UserServiceImpl;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
public class UserRestController {
	@Autowired
	UserServiceImpl userService;
	@GetMapping("/status")
	public String testApi() {
		return "Hello application is running";
	}
	
	
	@PostMapping("/register")
	public User addUser(@RequestBody User u)
	{
		return userService.addUser(u);
		
	}
	
	@GetMapping("/users")
	public List<User> findAllUser() 
	{
		return userService.findAllUser();
		
	}
	
    
	@PostMapping("/login")
	public User login(@RequestBody Authentication auth)
	{
		String email=auth.getEmail();
		String password=auth.getPassword();
		return userService.login(email, password) ;
	}
	

}           
