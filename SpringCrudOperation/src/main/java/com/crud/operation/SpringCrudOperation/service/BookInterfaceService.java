package com.crud.operation.SpringCrudOperation.service;

import java.util.List;

import com.crud.operation.SpringCrudOperation.models.Book;

public interface BookInterfaceService {

	public String fetchBook();
	
	public List<Book> updateBook(List<Book> book);
}
