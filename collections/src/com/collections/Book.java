package com.collections;

public class Book implements Comparable<Book>{
	private int bookNumber;
	private String bookName;
	private String authour;
	private double price;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(int bookNumber, String bookName, String authour, double price) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.authour = authour;
		this.price = price;
	}
	
	public int getBookNumber() {
		return bookNumber;
	}
	
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getAuthour() {
		return authour;
	}
	
	public void setAuthour(String authour) {
		this.authour = authour;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int compareTo(Book obj) {
		// TODO Auto-generated method stub
		if(this.bookNumber>obj.bookNumber)return 1;
		if(this.bookNumber<obj.bookNumber)return -1;
		return 0;
	}	
	
	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookName=" + bookName + ", authour=" + authour + ", price=" + price
				+ "]";
	}
}
