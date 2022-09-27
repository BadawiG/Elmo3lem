package com.example.Elmo3lem.login;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserModel, Long> {
	
	 UserModel  findByUserName(String userName); 

}
