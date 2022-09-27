package com.example.Elmo3lem.Controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Elmo3lem.Utils.CustomResponce;
import com.example.Elmo3lem.login.LoginDto;
import com.example.Elmo3lem.login.UserModel;
import com.example.Elmo3lem.login.UserRepo;


@RestController 
@RequestMapping("api/user")
public class ApiContoller {
	
	@Autowired
	private UserRepo userRepo ;
	
	@GetMapping(value="/")
	public String getPage()
	{  
		return "Hello Bebo";	
		}
	
	
	@PostMapping(value="/insertUser")  
	public CustomResponce   insertUser(@RequestBody UserModel user ) {
		
		UserModel usermodel =user;
		String password=usermodel.getPassword(); 
		
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(password);
 		usermodel.setPassword(encodedPassword);
		userRepo.save(usermodel); 
		
		return new CustomResponce();
	}
	
	@PostMapping(value="/login")  
	public CustomResponce   userLogin(@RequestBody LoginDto user ) {
		
 		UserModel usermodel =userRepo.findByUserName(user.getUserName() ) ;
		
		
		if(usermodel!=null)
		{
		
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(); 
		boolean isPasswordMatch = passwordEncoder.matches(user.getPassword(), 
				usermodel.getPassword());
		 
		System.out.println("isPasswordMatch ============================================"+isPasswordMatch);
//		userRepo.save(user);
		
		if(isPasswordMatch)
		{
			return new CustomResponce(usermodel);
		}
		else
		{
			new CustomResponce(401,"Wrong Password",null);
		}
		
		}
		else
		{
			new CustomResponce(401,"User Not Found",null);
		}
		
		return new CustomResponce(usermodel);
	}
	
	@PutMapping(value="/updateUser/{userId}")  
	public String   updateTeatchers(@PathVariable Long userId ,@RequestBody UserModel user ) {
		
		UserModel userFinded =userRepo.findById(userId).get();
		
		
		userFinded.setFirestName(user.getFirestName());
		userFinded.setSecondName(user.getSecondName());
		userFinded.setGender(user.getGender());
		userFinded.setBirthDate(user.getBirthDate());
		userFinded.setNationalIdNumber(user.getNationalIdNumber());
		userFinded.setNationality(user.getNationality());
		userFinded.setPassportNumber(user.getPassportNumber());
		userFinded.setUserImage(user.getUserImage());
		userFinded.setMobileNumber1(user.getMobileNumber1());
		userFinded.setMobileNumber2(user.getMobileNumber2());
		userFinded.seteMail(user.geteMail());
		userFinded.setAdress1(user.getAdress1());
		userFinded.setAdress2(user.getAdress2()); 
		userFinded.setSubjectsFkId(user.getSubjectsFkId());
		userFinded.setHireDate(user.getHireDate());
		userFinded.setUserName(user.getUserName());
		userFinded.setPassword(user.getPassword()); 
		userRepo.save(userFinded);
 		return "teatcher Updated ..";
	}
	
	@GetMapping(value="/getUser/{userId}")  
	public UserModel   getUser(@PathVariable Long userId ,@RequestBody UserModel user ) {
		
		UserModel userFinded =userRepo.findById(userId).get(); 
		 
 		return userFinded;
	}
 
}
