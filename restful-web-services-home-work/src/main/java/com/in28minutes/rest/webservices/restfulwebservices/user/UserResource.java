package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {
	
	@Autowired
	private UserDaoService service;
	//retriveAllUsers
	//get / users
	
	@GetMapping("/users")
	public List<User> retriveAllUsers()
	{
		return service.findAll();
		
	}
	
	//Get /users/{id}
	@GetMapping("/users/{id}")
	public User retriveUser(@PathVariable int id)
	{
		User user  =  service.findOne(id);
		if(user == null)
		    throw new UserNotFoundException("id -"+ id);
		 return user;
	}
	
	
	//Created
	//input - details of user 
	//output - created and retrun the created uri 
	
	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@RequestBody User user)
	{
	 User savedUser = 	service.Save(user);
	 
	 //send back the created user 
	 // also send him the uri of created user 
	URI location=  ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
	 
	 return ResponseEntity.created(location).build();
		
	}
	

}
