package com.designpatterns.statedesignpattern;

public class Project extends ProjectState{
	private ProjectState projectState;
	
	public Project() {
		projectState = new RequirementGatheringState();
	}
	
	public Project(ProjectState projectState) {
		this.projectState = projectState;
	}

	public ProjectState getProjectState() {
		return projectState;
	}

	public void setProjectState(ProjectState projectState) {
		this.projectState = projectState;
	}

	public void doRequirementGathering() throws InvalidStateTransitionException {
		projectState.doRequirementGathering();
		if (projectState instanceof RequirementGatheringState) {
			setProjectState(new DesignAndArchitectureState());
		}
		
	}

	public void doDesignAndArchitecture() throws InvalidStateTransitionException {
		projectState.doDesignAndArchitecture();
		if (projectState instanceof DesignAndArchitectureState) {
			setProjectState(new DevelopmentState());
		}
		
	}

	public void doDevelopment() throws InvalidStateTransitionException {
		projectState.doDevelopment();
		if (projectState instanceof DevelopmentState) {
			setProjectState(new TestingState());
		}
		
	}

	public void doTesting() throws InvalidStateTransitionException {
		projectState.doTesting();
		
	}
	
	
	

}
