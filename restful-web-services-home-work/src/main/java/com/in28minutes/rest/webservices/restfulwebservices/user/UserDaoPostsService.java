package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.springframework.context.support.StaticApplicationContext;
import org.springframework.stereotype.Component;


@Component
public class UserDaoPostsService {
	
	
	 private  List<Posts> posts =new ArrayList<>(); 
	
	/* HashMap<Posts> userposts =new HashMap();  
	
	*/
	UserDaoService details = new UserDaoService();
	
	
	

	{

		posts.add(new Posts(1, "abc1"));
		posts.add(new Posts(2, "abc1"));
		posts.add(new Posts(1, "Thsis is post two"));
		
	}

	public Posts GetAllPosts(int userid)
	{
	  
		//List <Posts> mergevalues = new ArrayList<>();
		for(Posts user:posts)
		{
			/*if(user.getPostId() == userid)
			{
				//Posts result = mergevalues.add(user);
				//return  mergevalues;
			
			
			}*/
			
			return user;
			
		}
		
		return null;
	}
	

	
	
	
	
	
	
	

	
	
	

}
