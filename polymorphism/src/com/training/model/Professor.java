package com.training.model;

import com.training.ifaces.Conditional;

public class Professor implements Conditional {

	private String qualification;
	
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	
	@Override
	public boolean test(Object object) {
		String value=(String)object;
		boolean result=false;
		
		if(value.toLowerCase().equals("chennai")) {
			result=true;
		}		
		return result;
	}

	@Override
	public String toString() {
		return "Professor [qualification=" + qualification + "]";
	}

	public Professor(String qualification) {
		super();
		this.qualification = qualification;
	}

}
