package com.polymorphism.automobile;

public class MarutiCar implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		//System.out.println("Color is RED");
		return "Red";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "i20";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 700000.24;
	}
}
