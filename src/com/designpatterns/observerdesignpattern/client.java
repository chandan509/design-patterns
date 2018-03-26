package com.designpatterns.observerdesignpattern;

public class client {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setCustomerName("Chandan");
		
		Customer c2 = new Customer();
		c2.setCustomerName("Mahesh");
		
		Product p = new Product("Apple Iphone6S");
		
		
		p.registerObserver(c1);
		p.registerObserver(c2);
		p.setAvailable(true);
		System.out.println("---------After Removing Observer-----------");
		p.removeObserver(c2);
		p.setAvailable(true);
	}

}
