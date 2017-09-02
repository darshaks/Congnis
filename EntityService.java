package com.cognizant.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class EntityService {
	
	Map<String,EntityForRest> entities = new HashMap<String,EntityForRest>();
	
	
	public EntityService(){
		
		
		EntityForRest first =  new EntityForRest();
		first.setName("XYZ");
		first.setCity("Fair Lawn");
		
		entities.put(first.getName(), first);
		
		first =  new EntityForRest();
		first.setName("ABC");
		first.setCity("New Milford");
		
		entities.put(first.getName(), first);
		
		
		
	}

	public EntityForRest getEntity(String name){
		
		return entities.get(name);
	}
	
	public Map <String, EntityForRest> getAll(){
		
		return entities;
	}
}
