package com.crud.operation.SpringCrudOperation.models;

public class Book {

	private long bookId;

	private String book_name;
	private String book_author;
	public String getBook_name() {
		return book_name;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", book_name=" + book_name + ", book_author=" + book_author + "]";
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
}
