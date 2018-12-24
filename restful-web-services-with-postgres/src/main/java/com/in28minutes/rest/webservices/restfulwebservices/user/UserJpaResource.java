package com.in28minutes.rest.webservices.restfulwebservices.user;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;
import java.net.URI;
import java.util.List;
import java.util.Optional;

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
public class UserJpaResource {
 
	//retriveAllUsers
	//get / users
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	PostRepository postRepository;
	
	
	@GetMapping("/jpa/users")
	public List<User> retriveAllUsers()
	{
		return (List<User>) userRepository.findAll();
		
	}
	
	//Get /users/{id}
	@GetMapping("/jpa/users/{id}")
	public Resource<User> retriveUser(@PathVariable int id)
	{
		Optional<User> user  =  userRepository.findById(id);
		if(!user.isPresent())
		    throw new UserNotFoundException("id -"+ id);
		//"all-users" , Server_Path +"/users"
		Resource<User> resource = new Resource<User>(user.get());
		ControllerLinkBuilder linkTo = linkTo(methodOn(this.getClass()).retriveAllUsers());
		resource.add(linkTo.withRel("all-users"));
		 return resource;
	}
	
	
	
	//Created
	//input - details of user 
	//output - created and retrun the created uri 
	
	//HATEOAS  Hyper media as an engine of application state 
	
	@PostMapping("/jpa/users")
	public ResponseEntity<Object> createUser(@Valid @RequestBody User user)
	{
	 User savedUser = 	userRepository.save(user);
	 
	 //send back the created user 
	 // also send him the uri of created user 
	URI location=  ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
	 
	 return ResponseEntity.created(location).build();
		
	}
	
	
	
	
	
	
	
	//Get /users/{id}
		@DeleteMapping("/jpa/users/{id}")
		public void deleteUser(@PathVariable int id)
		
		{
			userRepository.deleteById(id);
			
		}
		
		
		
		@GetMapping("/jpa/users/{id}/posts")
		public List<Posts> retriveAllUsers(@PathVariable int id)
		{
			Optional<User> userOptional = userRepository.findById(id);
			
			
			if(!userOptional.isPresent())
			{
				
				throw new UserNotFoundException("id ="+id);
			}
			
			
			
			
			return userOptional.get().getPost();
			
			
			
			
		}

		
		
		@PostMapping("/jpa/users/{id}/posts")
		public ResponseEntity<Object> createPost(@PathVariable int id, @RequestBody Posts post) {
			
			Optional<User> userOptional = userRepository.findById(id);
			
			if(!userOptional.isPresent()) {
				throw new UserNotFoundException("id-" + id);
			}

			User user = userOptional.get();
			
			post.setUser(user);
			
			postRepository.save(post);
			
			URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(post.getId())
					.toUri();

			return ResponseEntity.created(location).build();

		}

	}
		
		
		
		
