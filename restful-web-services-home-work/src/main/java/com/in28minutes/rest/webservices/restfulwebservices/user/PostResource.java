package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class PostResource {
	
	@Autowired
	private UserDaoPostsService service;
	@Autowired
	private UserResource temp1;
	
	
	@GetMapping("/users/{userid}/posts")
	public List<Object> retrivePosts(@PathVariable int userid)
	{
	
	 User response1 = temp1.retriveUser(userid);
     Posts posts = service.GetAllPosts(userid);
     List<Object> a1 = new ArrayList <Object>();
     a1.add(response1);
     a1.add(posts);
	 return a1;
		
	}

}
