package com.training;

public class HealthInsurance extends Insurance {
	
	private String[] preExistingDisease;
	
	public HealthInsurance(int policyNumber, String policyHolderName, String[] preExistingDisease) {
		super(policyNumber, policyHolderName);
		this.preExistingDisease = preExistingDisease;
	}

	public HealthInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculatePremium() {
		double premium=10000;
		for(String eString:preExistingDisease) {
			if(eString.equalsIgnoreCase("BP")|| eString.equalsIgnoreCase("super")) {
				premium=15000;
			}
		}
		return premium;
	}

	public String[] getPreExistingDisease() {
		return preExistingDisease;
	}

	public void setPreExistingDisease(String[] preExistingDisease) {
		this.preExistingDisease = preExistingDisease;
	}
}
