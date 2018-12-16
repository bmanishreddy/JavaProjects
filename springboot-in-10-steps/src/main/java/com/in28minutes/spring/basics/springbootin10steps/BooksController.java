package com.in28minutes.spring.basics.springbootin10steps;

import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

	@GetMapping("/books")
	public List<Book> getAllBooks()
	
	{
		return Arrays.asList(
				new Book(11, "Mastering meashine learning ","manishreddybendhi"));
	}
	
	
}
