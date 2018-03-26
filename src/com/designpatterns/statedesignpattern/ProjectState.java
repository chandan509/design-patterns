package com.designpatterns.statedesignpattern;

public class ProjectState implements IProjectState {

	public void doRequirementGathering() throws InvalidStateTransitionException {
		throw new InvalidStateTransitionException("Invalid State exception :"+"Could not call doRequirementGathering in State :"+this.getClass().getName());
		
	}

	public void doDesignAndArchitecture() throws InvalidStateTransitionException {
		throw new InvalidStateTransitionException("Invalid State exception :"+"Could not call doDesignAndArchitecture in State :"+this.getClass().getName());
		
	}

	public void doDevelopment() throws InvalidStateTransitionException {
		throw new InvalidStateTransitionException("Invalid State exception :"+"Could not call doDevelopment in State :"+this.getClass().getName());
		
	}

	public void doTesting() throws InvalidStateTransitionException {
		throw new InvalidStateTransitionException("Invalid State exception :"+"Could not call doTesting in State :"+this.getClass().getName());
		
	}
	
}
