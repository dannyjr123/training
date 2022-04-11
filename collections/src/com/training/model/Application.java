package com.training.model;

import java.util.List;

import com.collections.Book;
import com.training.CrudRespository;
import com.training.services.BookService;

public class Application {
	public static void main(String[] args) {
		Book java = new Book(101,"Java","suba",450);
		Book python = new Book(102, "python", "harish", 300);
		Book html = new Book(300, "html", "surya", 400);
		Book maven = new Book(104, "maven", "jagan", 360.0);
		Book dsa = new Book(124, "Data Structure and Algorithm are made Easy", "Narasiman kulathongan", 563);
		
		CrudRespository service=new BookService();
		
		service.add(java);
		service.add(python);
		service.add(html);
		service.add(maven);
		service.add(dsa);
		
		System.out.println("first size"+service.findAll().size());		
		print(service.findAll());
		
		Book java1= new Book(101,"Java","suba",800);
		Book java2= new Book(101,"Java made easy","suba",800);
		Book java3=new Book(103,"Java made easy","suba",800);
		System.out.println("return by id value "+service.findById(124));		
		System.out.println("Removed book from list"+service.remove(dsa));		
		System.out.println("removed size"+service.findAll().size());
		
		
		System.out.println("update 1 ");
		service.update(java1);
		print(service.findAll());
		
		
		
		System.out.println("update 2 ");
		service.update(java2);
		print(service.findAll());
		
		
		System.out.println("new Book 1");
		service.update(java3);
		print(service.findAll());		
		
	}
	
	
	
	public static void print(List<Book> books) {
		for(Book book:books) {
			System.out.println(book);
		}
	}
}
