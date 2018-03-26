package com.designpatterns.abstractfactorydesignpattern;

public class Client {
	public static void main(String[] args) {
		Computer pc;
		Computer server;
		
		pc = ComputerFactory.getComputer(new PCFactory("1GB", "1TB", "2.5GHz"));
		server = ComputerFactory.getComputer(new ServerFactory("10GB", "10TB", "3GHz"));
		
		System.out.println(pc);
		System.out.println(server);
	}
}
