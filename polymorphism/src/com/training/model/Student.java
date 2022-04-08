package com.training.model;

import com.training.ifaces.Conditional;

public class Student implements Conditional {
	private int markScored;
	
	public int getMarkScored() {
		return markScored;
	}

	public void setMarkScored(int markScored) {
		this.markScored = markScored;
	}

	public Student(int markScored) {
		super();
		this.markScored = markScored;
	}

	@Override
	public boolean test(Object object) {
		String strBranch=(String)object;
		
		boolean result=false;
		if(this.markScored>80 && strBranch.equalsIgnoreCase("ece")) {
			result=true;
		}
		return result;
	}

	@Override
	public String toString() {
		return "Student [markScored=" + markScored + "]";
	}

}
