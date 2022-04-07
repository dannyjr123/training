package com.training.model1;

public class Hotel {
	private int noOfEmployee;
	private double revenue;
	private String place;
	public Hotel(int noOfEmployee, double revenue, String place) {
		super();
		this.noOfEmployee = noOfEmployee;
		this.revenue = revenue;
		this.place = place;
	}
	public int getNoOfEmployee() {
		return noOfEmployee;
	}
	public void setNoOfEmployee(int noOfEmployee) {
		this.noOfEmployee = noOfEmployee;
	}
	public double getRevenue() {
		return revenue;
	}
	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	
	
}
