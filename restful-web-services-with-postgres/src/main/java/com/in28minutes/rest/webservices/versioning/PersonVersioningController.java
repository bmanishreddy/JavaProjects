package com.in28minutes.rest.webservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {
	
	
	@GetMapping(value = "person/param",params= "version=1")
	public PersonV1 personV1()
	{
		
		return new PersonV1("Bob Charlie");
	}
	
	@GetMapping(value = "person/header",params = "X-API-VerSION=2")
	public PersonV2 personV2()
	{
		
		return new PersonV2(new Name("Bob","Charlie"));
	}

}
