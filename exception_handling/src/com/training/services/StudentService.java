package com.training.services;

import com.training.model.Student;

public class StudentService {
	
	private Student student;

	public StudentService(Student student) {
		super();
		this.student = student;
	}

	public StudentService() {
		super();
		// TODO Auto-generated constructor stub
	}		
	
	public String printDetails() {
		// TODO Auto-generated method stub
		String result="";
		try {
			//System.out.println("All good");
			result=this.student.getFirstName();	
			//System.out.println();
			
		}catch (NullPointerException e){
			// TODO: handle exception
			System.err.println("404 Not Found!");
		}catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}
	
	public String findRank() throws Exception{
		String grade="A";
		if(this.student.getMarkScored()>90) {
			grade="O";
		}
		return grade;
	}
}