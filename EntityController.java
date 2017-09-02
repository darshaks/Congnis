package com.cognizant.test;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;;

@RestController
@RequestMapping("/allentities")
public class EntityController {

	
	@Autowired
	EntityService theService;
	
	@RequestMapping("/findall")
	public Map<String,EntityForRest> getAll(){
		
		return theService.getAll();
	}

	@RequestMapping("{name}")
	public EntityForRest getEntity(@PathVariable("name") String name){
	
		return theService.getEntity(name);
		
	}
}

