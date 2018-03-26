package com.designpatterns.observerdesignpattern;

public class Customer implements Observer{
	
	private String customerName;
	private Subject subject;
	

	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public Subject getSubject() {
		return subject;
	}


	public void setSubject(Subject subject) {
		this.subject = subject;
	}


	public void update(String productName) {
		System.out.println("Dear "+customerName+", "+productName+ " is now available");
		
	}

}
