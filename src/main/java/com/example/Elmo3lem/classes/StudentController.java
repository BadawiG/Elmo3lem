package com.example.Elmo3lem.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 import com.example.Elmo3lem.Utils.ApiContoller;
import com.example.Elmo3lem.Utils.CustomResponce;


@RequestMapping("api/Students")
@RestController
public class StudentController extends ApiContoller {
	
	@Autowired
	private StudentClassRepo studentClassRepo ;
	
	
	@GetMapping(value="/getAll")  
	
	public CustomResponce getList(Pageable pageable) {		 
		return new CustomResponce(studentClassRepo.findAll(pageable) );
	}
}
