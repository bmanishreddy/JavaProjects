package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class HelloWorldController {
	
	
	//get 
	//uri //hello world 
	//method hellow world 
	@GetMapping(path = "/hellow-world")
	public String helloWorld() 
	
	{
		
		return "hellow world ";
		
	}
	
	
	//hello-world-bean
	@GetMapping(path = "/hellow-world-bean")
	public HelloWorldBean HelloWorldBean() 
	
	{
		
		return new HelloWorldBean("Hellow World ");
		
	}
	
	
	
	

	//hello-world-bean//path variable 
	@GetMapping(path = "/hellow-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) 
	
	{
		
		return new HelloWorldBean(String.format("Hellow World, %s",name));
		
	}

}
