package com.training.model;

import com.training.HealthInsurance;
import com.training.Insurance;
import com.training.LifeInsurance;
import com.training.VechicalInsurance;

public class Application {

	public static void printPremium(Insurance obInsurance) {
		System.out.println("premium ="+obInsurance.calculatePremium());
	}
	
	public static void main(String[] args) {
		VechicalInsurance vechicalInsurance = new VechicalInsurance(1010,"ramesh","car",2019);
		
		printPremium(vechicalInsurance);
		
		LifeInsurance lifeInsurance = new LifeInsurance(1010,"dhanush",60);
		printPremium(lifeInsurance);
		String[] illness= {"bp","suger","ent","diabetics"};
		HealthInsurance healthInsurance = new HealthInsurance(3000,"vicky",illness);
		
		printPremium(healthInsurance);
	}
}
