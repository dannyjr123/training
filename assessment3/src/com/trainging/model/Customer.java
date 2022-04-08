package com.trainging.model;

import com.trainging.assessment3.InvalidEmailException;

public class Customer {
	private int customerId;
	private String customerName;
	private long phoneNumber;
	private String email;
	
	public Customer(int customerId, String customerName, long phoneNumber, String email) {
		super();
		if(checkMail(email)) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		}else {
			try {
				throw new InvalidEmailException("Not a valid Mail Address");
			} catch (InvalidEmailException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws InvalidEmailException {
		if(checkMail(email)) {
		this.email = email;
		}else {
			throw new InvalidEmailException("Not Correct mail");
		}
	}	
	
	private boolean checkMail(String mail) {
		if(mail.endsWith(".com")||mail.endsWith(".org")||mail.endsWith(".in")){
			if(mail.contains("@"))
			return true;
		}
		return false;
	}
}
