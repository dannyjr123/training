package com.training;

public class Application {	
	
	public static void main(String[] args) {
		Greeting a = new Greeting();
		System.out.println(a.get());
		System.out.println(Greeting.getInfo());
		//System.out.print("Hello World!");
	}
}
