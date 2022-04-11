package com.training.utils;

import java.util.Comparator;

import com.collections.Book;

public class BookNameComparator implements Comparator<Book> {
	
	public BookNameComparator() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.getBookName().compareTo(o2.getBookName());		 
	}
}
