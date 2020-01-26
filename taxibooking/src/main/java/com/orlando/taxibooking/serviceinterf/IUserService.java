package com.orlando.taxibooking.serviceinterf;

import java.util.List;

import com.orlando.taxibooking.model.User;

public interface IUserService {
  
	public User addUser(User u);
	public User login(String email,String password);
	public List<User> findAllUser();
	
	
}
