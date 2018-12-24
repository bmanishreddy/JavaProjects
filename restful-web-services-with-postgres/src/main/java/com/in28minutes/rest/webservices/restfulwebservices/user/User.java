package com.in28minutes.rest.webservices.restfulwebservices.user;



import java.util.Date;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.h2.util.IntIntHashMap;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



@ApiModel(description = "All Details about the model")
@Entity
public class User {
	
	@Id
	@GeneratedValue
	
	private Integer id;
	
	@Size(min=2, message="Name should have atleast 2 characters")
	private String name ;
	
	@Past
	@ApiModelProperty(notes= "birth day sould not be in the past ")
	private Date birthdate;
	
	@OneToMany(mappedBy = "user")
	private List<Posts> post ;
	
	protected User()
	{
		
	}
	
	public User(Integer id, String name, Date birsthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthdate = birsthDate;
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
	
	
	
	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public List<Posts> getPost() {
		return post;
	}

	public void setPost(List<Posts> post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birsthDate=" + birthdate + "]";
	}
	
	

	

}
