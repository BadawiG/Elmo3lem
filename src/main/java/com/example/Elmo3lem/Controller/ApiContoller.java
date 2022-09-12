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

import com.example.Elmo3lem.Repositories.TeatcherRepo;
import com.example.Elmo3lem.model.TeatcherModel;


@RestController
public class ApiContoller {
	
	@Autowired
	private TeatcherRepo teatcherRepo ;
	
	@GetMapping(value="/")
	public String getPage()
	{  
		return "Hello Spring";	
		}
	
	@GetMapping(value="/teatchers")  
	public List<TeatcherModel>   getTeatchers() {
		
		return teatcherRepo.findAll();
	}
	
	@PostMapping(value="/save")  
	public String   saveTeatchers(@RequestBody TeatcherModel teatcher ) {
		teatcherRepo.save(teatcher);
		return "teatcher Saved ..";
	}

	@PutMapping(value="updateTeatcher/{teatcherId}")  
	public String   updateTeatchers(@PathVariable Long teatcherId ,@RequestBody TeatcherModel teatcher ) {
		
		TeatcherModel teatcherFinded =teatcherRepo.findById(teatcherId).get();
		teatcherFinded.setName(teatcher.getName());
		teatcherRepo.save(teatcherFinded);
 		return "teatcher Updated ..";
	}
	
	
	@DeleteMapping(value="/deleteTeatcher/{teatcherId}")  
	public String   deleteTeatchers(@PathVariable Long teatcherId ) {
		
		TeatcherModel teatcherFinded =teatcherRepo.findById(teatcherId).get();
		teatcherRepo.deleteById(teatcherId);
 		return "teatcher deleted ..";
	}
}
