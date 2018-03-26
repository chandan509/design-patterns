package com.designpatterns.observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject{
	
	private String productName;
	private boolean available = false;
	private List<Observer> list = new ArrayList<Observer>();
	
	public Product(String pName) {
		productName = pName;
	}
	
	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
		if (available) {
			notifyObservers();
		}
	}
	
	public void registerObserver(Observer observer) {
		list.add(observer);		
	}

	public void removeObserver(Observer observer) {
		list.remove(observer);		
	}

	public void notifyObservers() {
		for (Observer observer : list) {			
			observer.update(productName);			
		}				
	}
}
