package com.nagarro.repository;

import com.nagarro.models.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepo  extends JpaRepository<User, Long>{
	
public User findByEmailAndPassword(String email, String password);
	
	@Query("select u from User u where u.email = :email")
	public User getUserByEmail(@Param("email") String email);

}
