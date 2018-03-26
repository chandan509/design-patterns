package com.designpatterns.factorydesignpattern;

public class Client {
	public static void main(String[] args) {
		
		Computer pc = ComputerFactory.getComputer("PC", "10GB", "1TB", "3GHz");
		Computer server = ComputerFactory.getComputer("Server", "16GB", "10TB", "10GHz");
		
		System.out.println(pc);
		System.out.println(server);
	}

}
