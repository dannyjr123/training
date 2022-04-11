package com.training.services;

import java.util.List;
import com.collections.Book;
import com.training.CrudRespository;
import java.util.ArrayList;

public class BookService implements CrudRespository{
	private ArrayList<Book> bookList;	
	
	public BookService() {
		super();
		this.bookList = new ArrayList<Book>();		
	}
	
	@Override
	public boolean add(Book book) {
		// TODO Auto-generated method stub
		return bookList.add(book);
	}
	
	@Override
	public Book findById(int id) {
		for(Book value : this.bookList) {
			if(value.getBookNumber()==id) {
				return value;
			}
		}
		return null;
	}
	
	@Override
	public boolean remove(Book book) {
		return bookList.remove(book);
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub	
		return this.bookList;
	}

	@Override
	public Book update(Book book) {
		// TODO Auto-generated method stub			
		for(Book book1:bookList) {
			if(book1.getBookNumber()==book.getBookNumber()||book1.getPrice()!=book.getPrice() || !(book1.getBookName().equals(book.getBookName())) || !(book1.getAuthour().equals(book.getAuthour()))){					
				book1.setBookNumber(book.getBookNumber());
				book1.setAuthour(book.getAuthour());
				book1.setBookName(book.getBookName());
				book1.setPrice(book.getPrice());
				return book1;
			}
		else{
			add(book);
			}
		}
		return null;
	}
	
	/*public Book update(Book oldBook, Book newBook) {
		if(bookList.contains(oldBook)) {
			int pos = bookList.indexOf(oldBook);
			bookList.set(pos, newBook);
		}
		return null;
	}*/
}
