package com.training;

import java.util.Scanner;

import com.training.model.Student;
import com.training.services.ExceptionHandling;
import com.training.services.StudentService;

public class Application {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Student student=new Student(24,"dhanush",-50); 
		 
		StudentService service=new StudentService(student);
		 
		System.out.println(service.printDetails());
		 
		StudentService service2= new StudentService(student);
		 
		try {
		 	//System.out.println(service2.printDetails());
		 	System.out.println(service2.findRank());
		} catch (Exception e) {
		 	//TODO Auto-generated catch block
		 	e.printStackTrace();
		 	System.err.println("Name is not passed");
		}
		*/
		ExceptionHandling handling= new ExceptionHandling();
		 
		handling.usingArrayIndexException(args);
		 
		handling.usingNumberFormatException("5");
		 
		/*try {
		 	student.setMarkScored(35);
		} catch (Exception e) {
		 	// TODO Auto-generated catch block
		 	e.printStackTrace();
		}*/
		 
		//handling.usingFinallyBlock();
		System.out.println(handling.underStandFinallyBlock());
		//Scanner scan = new Scanner(System.in);
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Enter Number");
			int str=scan.nextInt();
			System.out.println(str);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//scan.close();		
	}
}