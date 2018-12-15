package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

//When we have two compeonts of the same type to run one we exclusively specify to use one using the @primary annotation 

@Primary
public class QuickSortAlgorithm implements SortAlgorithm {
	
	public int [] sort(int[] numbers)
	
	{
		//Logic for bubble sort 
		
		
		
		return numbers;
	}

}
