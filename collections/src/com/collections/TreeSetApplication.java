package com.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetApplication {
	
	public static void main(String[] args) {
		Student ram = new Student(101, "dhanush", 80);
		Student shazam = new Student(102, "shazam", 70);
		Student jagan = new Student(102, "shazam", 70);
		Student harish = new Student(007, "harish", 45);
		Student harish1 = new Student(007, "harish", 45);
		
		Set<Student> set= new TreeSet<>();	
		
		set.add(ram);
		set.add(shazam);
		set.add(jagan);
		set.add(harish1);
		set.add(harish);
		
		for(Student value : set) {
			System.out.println(value);
		}
	}
}
