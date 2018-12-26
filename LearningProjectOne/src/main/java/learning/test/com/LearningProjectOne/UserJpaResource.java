package learning.test.com.LearningProjectOne;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

public class UserJpaResource {
	
	@Autowired
	private UserRepository userrepository;
	
	@PostMapping("/create/user/new")
	public ResponseEntity<Object> CreateUser(@Valid @RequestBody User user)
	{
		
		User saveNewUser = userrepository.save(user);
		 
		 //send back the created user 
		 // also send him the uri of created user 
		URI location=  ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(saveNewUser.getId()).toUri();
		 
		 return ResponseEntity.created(location).build();
		
	}

}
