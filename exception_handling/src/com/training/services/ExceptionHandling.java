package com.training.services;

import com.training.model.RangeCheckException;

public class ExceptionHandling {
	public void usingArrayIndexException(String[] args) {	
		try {
			System.out.println(args[1]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.err.println("Method requires three values to be passed");
			e.printStackTrace();
		}
	}

	public void usingNumberFormatException(String value) {
		
		int age=0;
		try {
			 age = Integer.parseInt(value);
			// System.out.println(age);			 
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.err.println("Give a valid input");
		}		
	}
	
	public void usingFinallyBlock() {
		
		int denominator=0;
		
		try {
			System.err.println(4/denominator);
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Denominator Should not be Zero");
		}finally {
			System.out.println("Inside Finally==");
		}
		
		System.out.println("Thanks ,bye,bye");
	}
	
	public String underStandFinallyBlock() {
		
		int denominator=0;
		
		try {
			System.out.println(4/denominator);
			
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.err.println("Denominator Should not be Zero");
			//return "Welcome";
			try {
				throw new RangeCheckException("Not Functionable");
			} catch (RangeCheckException e1) {
				// TODO Auto-generated catch block
				return "404 Error";
			}
		}finally {
			System.out.println("Inside Finally==");
			
		}
		
		System.out.println("bye,bye");
		
		return "thanks";
	}
}