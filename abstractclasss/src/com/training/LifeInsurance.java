package com.training;

public class LifeInsurance extends Insurance{
	private int age;
	
	public LifeInsurance() {
		super();
	}
	
	public LifeInsurance(int policyNumber, String policyHolderName, int age) {
		super(policyNumber, policyHolderName);
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}	

	@Override
	public double calculatePremium() {
		double value=10000;
		
		if(age<50) {
			value=5000;
		}
		return value;
	}

	
}
