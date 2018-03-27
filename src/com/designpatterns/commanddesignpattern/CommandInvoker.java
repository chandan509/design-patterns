package com.designpatterns.commanddesignpattern;

public class CommandInvoker implements Command{
	private Command command;
	
	public CommandInvoker(Command command) {
		this.command = command;
	}
	
	@Override
	public void execute() {
		this.command.execute();
		
	}

}
