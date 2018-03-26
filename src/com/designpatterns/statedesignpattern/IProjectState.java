package com.designpatterns.statedesignpattern;

public interface IProjectState {
	public void doRequirementGathering() throws InvalidStateTransitionException;
	public void doDesignAndArchitecture() throws InvalidStateTransitionException;
	public void doDevelopment() throws InvalidStateTransitionException;
	public void doTesting() throws InvalidStateTransitionException;
}
