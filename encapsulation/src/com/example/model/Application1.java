package com.example.model;

public class Application1   {
	
	public static void main(String[] args) {
		
		Student philips = new Student();
		philips.setFirstName("Dhanush");
		philips.setMarkScored(535);
		philips.setRollNumber(53);
		System.out.println("philips:="+philips.getFirstName());
		System.out.println("philips:="+philips.getMarkScored());
		System.out.println("philips:="+philips.getRollNumber());
		
		Student shyam = new Student(25,"dhanush",499,"CSE");
		System.out.println("shyam:="+shyam.getFirstName());
		System.out.println("shyam:="+shyam.getMarkScored());
		System.out.println("shyam:="+shyam.getRollNumber());
		
		Student raj = new Student(42,"raj","CSE");
		System.out.println("raj:="+raj.getFirstName());
		System.out.println("raj:="+raj.getRollNumber());
		System.out.println("raj:="+raj.getBranch());
		System.out.println("raj:="+raj.getMarkScored());		
	}
}
