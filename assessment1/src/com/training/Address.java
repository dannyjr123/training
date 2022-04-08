package com.training;

public class Address {
	private int doorNumber;
	private String streetName;
	private String area;
	private String district;
	private String country;
	private int pincode;
	
	public Address(int doorNumber, String streetName, String area, String district, String country, int pincode) {
		super();
		this.doorNumber = doorNumber;
		this.streetName = streetName;
		this.area = area;
		this.district = district;
		this.country = country;
		this.pincode = pincode;
	}
	public int getDoorNumber() {
		return doorNumber;
	}
	@Override
	public String toString() {
		return "Address [doorNumber=" + doorNumber + ", streetName=" + streetName + ", area=" + area + ", district="
				+ district + ", country=" + country + ", pincode=" + pincode + "]";
	}
	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
}
