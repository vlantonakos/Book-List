package com.example.employeeThymeleaf.Controller;

import java.util.ArrayList;
import java.util.List;

import com.example.employeeThymeleaf.Model.Book;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

	  @Value("${greeting}")
	  private String greeting;
	  
	   @GetMapping("/books")
	    public String getAllBooks(Model model){
	      List<Book> books = new ArrayList<Book>();
	      books.add(new Book(1,"Emma", "Jane Austen"));
	      books.add(new Book(2,"Harry Potter", "JK Rowling"));
	      books.add(new Book(3,"The Partner", "John Grisham"));
	      model.addAttribute("books", books);
	      model.addAttribute("greeting",greeting);
	      return "books";
	    } 
	   
}
