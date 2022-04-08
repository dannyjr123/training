package com.training;

public class VechicalInsurance extends Insurance {
	private String vechicleModel;
	private int yearOfManufacture;
	
	@Override
	public double calculatePremium() {
		// TODO Auto-generated method stub
		double premium=1000;		
		if(yearOfManufacture<2020 && vechicleModel.equals("car")) {
			premium=2000;			
		}
		return premium;
	}

	public VechicalInsurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getVechicleModel() {
		return vechicleModel;
	}

	public VechicalInsurance(int policyNumber, String policyHolderName, String vechicleModel, int yearOfManufacture) {
		super(policyNumber, policyHolderName);
		this.vechicleModel = vechicleModel;
		this.yearOfManufacture = yearOfManufacture;
	}

	public void setVechicleModel(String vechicleModel) {
		this.vechicleModel = vechicleModel;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}	
}
