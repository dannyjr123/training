package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap2 {
	public static void main(String[] args) {
		
		
		Student ram = new Student(101, "dhanush", 80);
		Student shazam = new Student(102, "shazam", 70);
		Student jagan = new Student(106, "jagan", 76);
		//Student harish = new Student(007, "harish", 45);
		
		Map<Integer,Student> map = new HashMap<>();
		
		map.put(900, ram);
		map.put(901, shazam);
		map.put(902, jagan);
		
		Set<Integer> keys=map.keySet();
		
		for(Integer key : keys) {
			System.out.println("Getting value using key \n"+map.get(key));
		}
		System.out.println();
		Collection<Student> list = map.values();

		for(Student student:list) {
			System.out.println("Getting value using value \n"+student);
		}
		System.out.println();
		Set<Map.Entry<Integer, Student>> list1= map.entrySet();
		
		System.out.println("Getting Both key and value ");
		for(Map.Entry<Integer, Student> eachValue : list1) {
	
			System.out.println(eachValue.getKey());
			System.out.println(eachValue.getValue());
		}
		
	}
}
