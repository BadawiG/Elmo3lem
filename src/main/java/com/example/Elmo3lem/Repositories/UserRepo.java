package com.example.Elmo3lem.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Elmo3lem.model.UserModel;

public interface UserRepo extends JpaRepository<UserModel, Long> {

}
