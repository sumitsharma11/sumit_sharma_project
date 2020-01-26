package com.orlando.taxibooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.orlando.taxibooking.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
  
	@Query("Select u from User u where email=:email and password=:password")
	public User login(@Param("email") String email,@Param("password") String password );
  
	
}
