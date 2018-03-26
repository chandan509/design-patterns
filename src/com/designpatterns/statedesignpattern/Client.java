package com.designpatterns.statedesignpattern;

public class Client {
	public static void main(String[] args) throws InvalidStateTransitionException {
		
		Project p = new Project();
		p.doRequirementGathering();
		p.doDesignAndArchitecture();
		p.doDevelopment();
		p.doTesting();
		
		
		System.out.println("==========================");
		
		try{
			p.doDesignAndArchitecture();//throws exception
		}
		catch (InvalidStateTransitionException iste) {
			iste.printStackTrace();
		}
		
		
		p = new Project(new TestingState());
		p.doTesting();
		
	}

}
