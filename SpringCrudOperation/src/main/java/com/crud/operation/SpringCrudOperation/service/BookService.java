package com.crud.operation.SpringCrudOperation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crud.operation.SpringCrudOperation.models.Book;

@Service
public class BookService {
	
	public String fetchBook() {
		return "record added successfully!!";
	}

	public List<Book> updateBook(List<Book> book) {
		Book book1 = new Book();
		book1.setBook_author("D.S Malik");
		book1.setBook_name("Java");
		book.add(book1);
		return book;
	}
}
