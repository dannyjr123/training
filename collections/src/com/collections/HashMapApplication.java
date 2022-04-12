package com.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapApplication {
	
	public static void main(String[] args) {
		
		Student ram = new Student(101, "dhanush", 80);
		Student shazam = new Student(102, "shazam", 70);
		Student jagan = new Student(106, "jagan", 76);
		Student harish = new Student(007, "harish", 45);
			
		Map<Integer,Student> map = new HashMap<>();
		
		map.put(500, ram);
		map.put(501, shazam);
		
		System.out.println(map.put(502, jagan));

		System.out.println(map.put(502, harish));
		
		System.out.println(map.get(502));
		
//		for(Map.Entry<Integer, Student> map1 : map.entrySet()) {
//			int key=map1.getKey();
//			Student value=map1.getValue();
//			System.out.println("Key -> "+key +" value -> "+value);
//		}
	}
}
