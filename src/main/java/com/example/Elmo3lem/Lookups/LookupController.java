package com.example.Elmo3lem.Lookups;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Elmo3lem.Utils.ApiContoller;
import com.example.Elmo3lem.Utils.CustomResponce;


@RestController
@RequestMapping("api/Lookups")
public class LookupController extends ApiContoller {
	
	@Autowired
	private LookupsRepo lookupsRepo ;
	
	
	@GetMapping(value="/getList/{lookupId}")  
	public CustomResponce getList(@PathVariable Integer lookupId ,@RequestHeader String lang, Pageable pageable ) {		
		return new CustomResponce(lookupsRepo.findLists(lookupId,lang,pageable));
	}
	
  
	
}
