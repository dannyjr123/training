package com.training.model;

import com.training.ifaces.Conditional;

public class Principal implements Conditional{
	private String typeOfCollege;

	
	public Principal(String typeOfCollege) {
		super();
		this.typeOfCollege = typeOfCollege;
	}


	public String getTypeOfCollege() {
		return typeOfCollege;
	}


	public void setTypeOfCollege(String typeOfCollege) {
		this.typeOfCollege = typeOfCollege;
	}


	@Override
	public boolean test(Object object) {
		String value=(String)object;
		boolean result =false;
		if(value.toLowerCase().equals("avadi")){
			result=true;
		}
		
		return result;
	}


	@Override
	public String toString() {
		return "Principal [typeOfCollege=" + typeOfCollege + "]";
	}
	
	
}
