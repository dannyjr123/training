package com.training.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.collections.Book;
import com.training.CrudRespository;
import com.training.services.BookService;
import com.training.utils.BookNameComparator;

public class App {
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		
		names.add("ramesh");
		names.add("dhanush");
		names.add("harish");
		names.add("surya");
		names.add("jagan");
		
		System.out.println(names);
		
		
		Collections.sort(names);
		
		
		System.out.println(names);
		
		Book java = new Book(101,"java","suba",450);
		Book python = new Book(102, "python", "harish", 300);
		Book html = new Book(300, "html", "surya", 400);
		Book maven = new Book(104, "maven", "jagan", 360.0);
		Book dsa = new Book(124, "data Structure and Algorithm are made Easy", "Narasiman kulathongan", 563);
		
		CrudRespository service=new BookService();
		
		service.add(java);
		service.add(python);
		service.add(html);
		service.add(maven);
		service.add(dsa);
		
		System.out.println("first size"+service.findAll().size());		
		
		List<Book> list= service.findAll();
		
		Collections.sort(list);
		
		for(Book book:list) {
			System.out.println(book);
		}
		
		Collections.sort(list, new BookNameComparator());
		System.out.println("Sorted Names");
		print(list);
		
	}
	
	public static void print(List<Book> books) {
		for(Book book:books) {
			System.out.println(book);
		}
	}
}
