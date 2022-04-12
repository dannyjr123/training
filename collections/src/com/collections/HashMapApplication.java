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
		
		map.put(502, jagan); //null
		
		Student added=map.put(502, harish); //original
		
		if(added!=null){
			map.put(503, added);
		}
		
		System.out.println(map.get(502));
		System.out.println(map.get(503));
		
		for(Map.Entry<Integer, Student> map1 : map.entrySet()) {
			int key=map1.getKey();
			Student value=map1.getValue();
			System.out.println("Key -> "+key +" value -> "+value);
		}		
	}
}
