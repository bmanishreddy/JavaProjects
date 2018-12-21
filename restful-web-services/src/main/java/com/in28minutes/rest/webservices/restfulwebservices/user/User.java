package com.in28minutes.rest.webservices.restfulwebservices.user;



import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.h2.util.IntIntHashMap;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



@ApiModel(description = "All Details about the model")
public class User {
	
	
	private Integer id;
	
	@Size(min=2, message="Name should have atleast 2 characters")
	private String name ;
	
	@Past
	@ApiModelProperty(notes= "birth day sould not be in the past ")
	private Date birsthDate;
	
	
	
	
	protected User()
	{
		
	}
	
	public User(Integer id, String name, Date birsthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birsthDate = birsthDate;
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
		return birsthDate;
	}
	public void setBirsthDate(Date birsthDate) {
		this.birsthDate = birsthDate;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birsthDate=" + birsthDate + "]";
	}
	
	

	

}
