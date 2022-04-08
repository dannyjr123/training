package com.example;
import com.example.model.*;

public class Application {
	public static void main(String[] args) {
		Student ram = new Student(42,"Dhanush",75,"cse");
		/**public method able to aCCESSS*/	
		//ram.setRollNumber(46);
		/**default method unable to access
		because student class is in com.example.model package
		and application is in com.example package*/
		//ram.setFirstName("Ram");
		
		/**unable to access becaUSE application is not in subclass of student*/
		//ram.setMarkScored(498);
		
		/**unable to access because the method is private in student class*/
		//ram.setBranch("CSE");
		
		//System.out.println("FirstName: "+ram.getFirstName());
		//System.out.println("MarkScored: "+ram.getMarkScored());
		//System.out.println("RollNumber: "+ram.getRollNumber());
		//System.out.println("Branch: "+ram.getBranch());
		
	}
}
