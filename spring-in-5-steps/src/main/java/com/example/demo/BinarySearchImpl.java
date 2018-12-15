package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


//we are telling spring that it is a bean 
@Component
public class BinarySearchImpl {
	
	
	//To specify the dependancy we use autowired tag in the following we are specifing that 
	//binary search is dependent on sot algorithm 
	@Autowired
	private SortAlgorithm sortAlgorithm;
	

	
	 
	//we are removing the constructor to show the setter injection 
	//Iam commentign the constructor 
	/*
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}
	*/


	
	//to demonstrate the auto wiring concept  without setets and getters we are commenting them 
	/*
	
	public SortAlgorithm getSortAlgorithm() {
		return sortAlgorithm;
	}




	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}
*/



	public int binarySearch(int[] numbers, int numberToSearchFor)
	
	{
		
	//BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
	int[] sortedNumbers =  sortAlgorithm.sort(numbers);
	System.out.println(sortAlgorithm);
 	 //implementing sorting logic 
		
	//bubble sort algorithm
		
    // quick sort algorithm 
		
	//sorting an array
	//search the array
	//return the result 
	
	return 3;
	
	}
}
