package com.example.Elmo3lem.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Elmo3lem.AcademicYear.AcademicYearModel;
import com.example.Elmo3lem.AcademicYear.AcademicYearRepo;
import com.example.Elmo3lem.Utils.ApiContoller;
import com.example.Elmo3lem.Utils.CustomResponce;


@RestController
@RequestMapping ("api/user")
public class UserController extends ApiContoller {

	@Autowired
	private UserRepo userRepo ;
	@Autowired
	private AcademicYearRepo academicYearRepo ;
	
	
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
		
		if(isPasswordMatch)
		{
			return new CustomResponce(usermodel);
		}
		else
		{
			return new CustomResponce(401,"Wrong Password",null);
		}
		
		}
		else
		{
			return new CustomResponce(401,"User Not Found",null);
		}
		
 	}
	
	@PutMapping(value="/updateUser")  
	public CustomResponce   updateTeatchers( @RequestBody UserModel user ) {
		
		Integer userId=user.getId();
		
		UserModel userFinded =userRepo.getUserById(userId);
		
		if(userFinded!= null)
		{
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
			return new CustomResponce(userRepo);
		} 
		else
		{
			return new CustomResponce(404,"User Not Found");
		}
		 
 	}
	
	@GetMapping(value="/getUser/{userId}")  
	public CustomResponce   getUser(@PathVariable Integer userId  ) {
		
		UserModel userFinded =userRepo.getUserById(userId);   
 		
		if( userFinded !=null)
		{ 

	 		return new CustomResponce( userFinded);
		}
		 
 		return new CustomResponce(404,"User Not Found");
	}
 
	
	@GetMapping(value="/getallacademicyears")  
	public CustomResponce   getAllAcademicYears() {
		
		List<AcademicYearModel> academicYearsModelFinded =academicYearRepo.findAllYears(); 
		 
		return new CustomResponce(academicYearsModelFinded);
	}
}
