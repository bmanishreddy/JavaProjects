package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.sql.Date;

public class Posts{
	
	
	private int postid ;
	private String post;
	//private Posts post;
	public Posts(int postid, String post) {
		
		
		
	 
		this.postid = postid;
		this.post = post;
	}
	
	
	public Posts(int postid) {
		
		
		
		 
		this.postid = postid;
		
	}
	
	
	
	public Posts(String post) {
		
		
		
		 
		this.post = post;
	}
	
	
	
	public int getPostId() {
		return postid;
	}
	public void setPostId(int postid) {
		this.postid = postid;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}

}
