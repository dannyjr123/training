package com.training;

import java.util.List;
import com.collections.Book;

public interface CrudRespository {
	public boolean add(Book book);
	public Book findById(int id);
	public boolean remove(Book book);
	public List<Book> findAll();
	//public Book update(Book oldBook, Book newBook);
	public Book update(Book book);
}
