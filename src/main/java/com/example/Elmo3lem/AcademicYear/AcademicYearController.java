package com.example.Elmo3lem.AcademicYear;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Elmo3lem.Utils.ApiContoller;
import com.example.Elmo3lem.Utils.CustomResponce; 


@RestController 
@RequestMapping("api/AcademicYear")
public class AcademicYearController extends ApiContoller {
	
	@Autowired
	private AcademicYearRepo academicYearRepo ;
	
	
	//---------------------------------------------------------------------------------------------- insert
	@PostMapping(value="/insert")  
	public CustomResponce   insertUser(@RequestBody AcademicYearModel academicYear ) { 
		academicYearRepo.save(academicYear); 
		return new CustomResponce();
	}
	
	//---------------------------------------------------------------------------------------------- update 
	@PutMapping(value="/update/{id}")  
	public CustomResponce   updateAcademicYear(@PathVariable Integer id ,@RequestBody AcademicYearModel academicYearModel ) {
		
		AcademicYearModel academicYearModelFinded =academicYearRepo.findById(id).get();
			
		academicYearModelFinded.setAcademicYearNameAr(academicYearModel.getAcademicYearNameAr());
		academicYearModelFinded.setAcademicYearNameEn(academicYearModel.getAcademicYearNameEn());
		academicYearModelFinded.setAcademicYearStartDate(academicYearModel.getAcademicYearStartDate());
		academicYearModelFinded.setAcademicYearEndDate(academicYearModel.getAcademicYearEndDate());  
		
		academicYearRepo.save(academicYearModelFinded);
		return new CustomResponce();
	}
	
	//---------------------------------------------------------------------------------------------- delete 
	
	@DeleteMapping(value="/deleteAcademicYear/{yearId}")  
	public CustomResponce   deleteAcademicYear(@PathVariable Integer yearId) {
		
		academicYearRepo.deleteById(yearId); 
		 
		return new CustomResponce();
	}
	
	//---------------------------------------------------------------------------------------------- Query 

	@GetMapping(value="/getAcademicYear/{yearId}")  
	public CustomResponce   getAcademicYear(@PathVariable Integer yearId) { 
		 
		return new CustomResponce(academicYearRepo.findById(yearId));
	}
	
	@GetMapping(value="/getallacademicyears")  
	public CustomResponce   getAllAcademicYears() {
		
		List<AcademicYearModel> academicYearsModelFinded =academicYearRepo.findAllYears(); 
		 
		return new CustomResponce(academicYearsModelFinded);
	}
	
	@GetMapping(value="/getallSemestersYear/{yearId}")  
	public CustomResponce   getAllSemestersYear(@PathVariable Integer yearId) {
		
		List<AcademicYearModel> academicYearsModelFinded =academicYearRepo.findAllSemester(yearId); 
		 
		return new CustomResponce(academicYearsModelFinded);
	}

}
