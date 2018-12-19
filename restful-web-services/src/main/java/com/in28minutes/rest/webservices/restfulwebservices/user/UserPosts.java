package com.in28minutes.rest.webservices.restfulwebservices.user;

public class UserPosts extends User {

	

	private int postid;
	private String post;
	
	public UserPosts(int postid, String post) {
		super();
		this.postid = postid;
		this.post = post;
	}
	 
	
	
	public int getPostid() {
		return postid;
	}
	public void setPostid(int postid) {
		this.postid = postid;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	
	
}
