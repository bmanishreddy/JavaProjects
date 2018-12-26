package learning.test.com.LearningProjectOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;




@PropertySource("classpath:application.properties")
@SpringBootApplication
public class LearningProjectOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningProjectOneApplication.class, args);
	}

}

