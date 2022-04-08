package com.training.model;

import java.io.IOException;

public class Student {
	private int rollNumber;
	private String firstName;
	private double markScored;
	
	public Student(int rollNumber, String firstName, double markScored){
		super();
		if(markScored<0) {
			
				try {
					throw new RangeCheckException("Enter a valid mark within [0-100]");
				} catch (RangeCheckException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}else {
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.markScored = markScored;
		}
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		
		this.firstName = firstName;
	}	
	
	public double getMarkScored() {
		return markScored;
	}
	
	public void setMarkScored(double markScored)throws Exception{
		if(markScored<0) {
			throw new RangeCheckException("Enter a valid mark within [0-100]");
		}else {
		this.markScored = markScored;
		}
	}
	
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", firstName=" + firstName + ", markScored=" + markScored + "]";
	}	
}