package com.crud.operation.SpringCrudOperation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.operation.SpringCrudOperation.models.Book;
import com.crud.operation.SpringCrudOperation.service.BookService;

@RestController
@RequestMapping("/store")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/fetching_book")
	public String fetchingBook() {
		return bookService.fetchBook();
	}
	
	@PostMapping("/inserting_book")
	public List<Book> createBookStore() {
		ArrayList<Book> store1 = new ArrayList<Book>();
		return bookService.updateBook(store1);
	}
	 
}
