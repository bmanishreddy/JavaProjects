package learning.test.com.LearningProjectOne;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

//import io.swagger.annotations.ApiModel;

//import io.swagger.annotations.ApiModelProperty;



//@ApiModel(description = "All Details about the model")
@Entity
@Table(name = "`user`")
public class User {
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", currentdate=" + currentdate + "]";
	}
	@Id
	@GeneratedValue
	private Integer id;
	
	@Size(min=2, message="Name should have atleast 2 characters")
	private String name;
	
	@Past
	//@ApiModelProperty(notes= "birth day sould not be in the past ")
	private Date currentdate;
	
	
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
	public Date getCurrentdate() {
		return currentdate;
	}
	public void setCurrentdate(Date currentdate) {
		this.currentdate = currentdate;
	}
	public User(Integer id, String name, Date currentdate) {
		super();
		this.id = id;
		this.name = name;
		this.currentdate = currentdate;
	}
	
	
	public User() {
		super();
		this.id = id;
		this.name = name;
		this.currentdate = currentdate;
	}
	
	

}
