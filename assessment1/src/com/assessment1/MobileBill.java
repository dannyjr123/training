package com.assessment1;

import com.training.Address;

public class MobileBill {
	private String customerName;
	private long mobileNumber;
	private String planName;
	private Address address;
	
	public static final String SERVICE_PROVIDER="airtel";
	/*5.  Create a Method findAmount and Use switch case to calculate the amount based on the planName
     If its prepaid   amount is 200 and postpaid its 300
6.  Test the Methods by Calling from the main Method  */
	public MobileBill() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MobileBill(String customerName, long mobileNumber, String planName, Address address) {
		super();
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.planName = planName;
		this.address = address;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public long getMobileNumber() {
		return mobileNumber;
	}
	
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public String getPlanName() {
		return planName;
	}
	
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	
	public Address getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "MobileBill [customerName=" + customerName + ", mobileNumber=" + mobileNumber + ", planName=" + planName
				+ ", address=" + address + "]";
	}

	public void setAddress(Address address) {
		this.address = address;
	}		
	
	public int findAmount() {
		
		switch (getPlanName()) {
		case "postpaid":
				return 200;	
		case "prepaid":
			return 300;
		default:
			return -1;
			
		}
	}
}
