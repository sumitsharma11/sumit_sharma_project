package com.orlando.taxibooking.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orlando.taxibooking.dao.UserRepository;
import com.orlando.taxibooking.model.User;
import com.orlando.taxibooking.serviceinterf.IUserService;
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	UserRepository userRepos;
	@Override
	public User addUser(User u) {
		// TODO Auto-generated method stub
		return userRepos.save(u);
	}
	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return userRepos.findAll();
	}



	@Override
	public User login(String email, String password) {
		// TODO Auto-generated method stub
		return userRepos.login(email,password);
	}
	
	

}
