package com.in28minutes.rest.webservices.restfulwebservices.user;



import java.util.Date;

import org.h2.util.IntIntHashMap;

public class User {
	
	
	private Integer id;
	private String name ;
	private Date birthdate;
	//private Posts post ;
	
	
/*	
	public Posts getPost() {
		return post;
	}


	public void setPost(Posts post) {
		this.post = post;
	}*/


	protected User()
	{
		
	}
	

	protected User(Integer id)
	{
		super();
		this.id = id;
		//this.name = name;
	}
	
	public User(Integer id, String name, Date birthdate) {
		super();
		this.id = id;
		this.name = name;
		this.birthdate = birthdate;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirsthDate() {
		return birthdate;
	}
	public void setBirsthDate(Date birsthDate) {
		this.birthdate = birsthDate;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birsthDate=" + birthdate + "]";
	}
	
	

	

}
