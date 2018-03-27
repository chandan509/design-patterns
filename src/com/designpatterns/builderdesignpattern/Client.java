package com.designpatterns.builderdesignpattern;

public class Client {
	public static void main(String[] args) {
		
		Computer c = new Computer.ComputerBuilder("1TB", "16GB")
								.bluetoothEnabled(true)
								.graphicsCardEnabled(false)
								.build();
		
		System.out.println(c);
		System.out.println("===========");
		
		Computer c1 = new Computer.ComputerBuilder("2TB", "8GB")
								.bluetoothEnabled(false)
								.build();
		System.out.println(c1);
	}

}
