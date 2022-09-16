package com.example.Elmo3lem.Controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Elmo3lem.Repositories.UserRepo;
import com.example.Elmo3lem.model.UserModel;


@RestController
public class ApiContoller {
	
	@Autowired
	private UserRepo userRepo ;
	
	@GetMapping(value="/")
	public String getPage()
	{  
		return "Hello Bebo";	
		}
	
	
	@PostMapping(value="/insertUser")  
	public String   insertUser(@RequestBody UserModel user ) {
		userRepo.save(user);
		return "teatcher Saved ..";
	}
	
	@PutMapping(value="updateUser/{userId}")  
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
	
	@GetMapping(value="getUser/{userId}")  
	public UserModel   getUser(@PathVariable Long userId ,@RequestBody UserModel user ) {
		
		UserModel userFinded =userRepo.findById(userId).get(); 
		 
 		return userFinded;
	}
	
	
	
//	@GetMapping(value="/getAllUsers")  
//	public List<TeatcherModel>   getTeatchers() {
//		
//		return teatcherRepo.findAll();
//	}
//	
//	@PostMapping(value="/save")  
//	public String   saveTeatchers(@RequestBody TeatcherModel teatcher ) {
//		teatcherRepo.save(teatcher);
//		return "teatcher Saved ..";
//	}
//

//	
//	
//	@DeleteMapping(value="/deleteTeatcher/{teatcherId}")  
//	public String   deleteTeatchers(@PathVariable Long teatcherId ) {
//		
//		TeatcherModel teatcherFinded =teatcherRepo.findById(teatcherId).get();
//		teatcherRepo.deleteById(teatcherId);
// 		return "teatcher deleted ..";
//	}
}
