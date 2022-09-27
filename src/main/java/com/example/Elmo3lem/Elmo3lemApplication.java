package com.example.Elmo3lem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

 @SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class Elmo3lemApplication {

	public static void main(String[] args) {
		SpringApplication.run(Elmo3lemApplication.class, args);
	}

}
