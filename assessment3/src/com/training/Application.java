package com.training;

import com.trainging.model.Customer;

public class Application {
	public static void main(String[] args) {
		Customer customer = new Customer(232, "Dhanush", 2424252525L, "danushgamil.com");
		
		System.out.println(customer.getEmail());
	}
}
