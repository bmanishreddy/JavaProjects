package com.in28minutes.rest.webservices.restfulwebservices.user;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;
import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
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
	public Resource<User> retriveUser(@PathVariable int id)
	{
		User user  =  service.findOne(id);
		if(user == null)
		    throw new UserNotFoundException("id -"+ id);
		//"all-users" , Server_Path +"/users"
		Resource<User> resource = new Resource<User>(user);
		ControllerLinkBuilder linkTo = linkTo(methodOn(this.getClass()).retriveAllUsers());
		resource.add(linkTo.withRel("all-users"));
		 return resource;
	}
	
	
	
	//Created
	//input - details of user 
	//output - created and retrun the created uri 
	
	//HATEOAS  Hyper media as an engine of application state 
	
	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@Valid @RequestBody User user)
	{
	 User savedUser = 	service.Save(user);
	 
	 //send back the created user 
	 // also send him the uri of created user 
	URI location=  ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
	 
	 return ResponseEntity.created(location).build();
		
	}
	
	
	
	
	
	
	//Get /users/{id}
		@DeleteMapping("/users/{id}")
		public void deleteUser(@PathVariable int id)
		
		{
			User user  =  service.deleteById(id);
			if(user == null)
			    throw new UserNotFoundException("id -"+ id);
			// return user;
		}
		
		
		
		
		
}