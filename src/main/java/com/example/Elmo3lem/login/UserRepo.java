package com.example.Elmo3lem.login;

 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<UserModel, Integer> {
	
	 UserModel  findByUserName(String userName); 
	 
	 
	 
	 @Query ("select t from UserModel t where t.id = ?1")
	 UserModel  getUserById(Integer id);


}
