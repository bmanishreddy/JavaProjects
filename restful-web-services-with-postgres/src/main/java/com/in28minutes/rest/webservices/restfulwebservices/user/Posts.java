package com.in28minutes.rest.webservices.restfulwebservices.user;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Posts {

	@Id
	@GeneratedValue
	private Integer id;
	private String description;
	
	public  Posts() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnore
	private User user;
	public Integer getId() {
		return id;
	}	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Posts(Integer id, String description, User user) {
		super();
		this.id = id;
		this.description = description;
		this.user = user;
	}
	
}
