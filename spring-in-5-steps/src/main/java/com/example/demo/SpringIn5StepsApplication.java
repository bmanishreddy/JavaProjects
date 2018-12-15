package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {
	
	
	//waht are the beans 
	//what are the dependencies on the beans 
	//where to search for beans 
	

	public static void main(String[] args) {
		
		//BinarySearchImpl binarysearch = new BinarySearchImpl(new QuickSortAlgorithm());
		//System.out.println(result);

		//Sprint application context will manage all the beans 

		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args); 
		
		BinarySearchImpl binarysearch = applicationContext.getBean(BinarySearchImpl.class);
		int result =binarysearch.binarySearch(new int[] {12,4,6,8},3);
		
		System.out.println(result);
		
		
	}

}

